package br.com.sisgete.util;

import br.com.sisgete.util.alerts.ErrorAlert;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luiz
 */
public class Control {

    private final File archivo = new File("archivo.tmp");
    private final int segundos = 20;

    public Control() {
    }

    public boolean comprobar() {
        if (archivo.exists()) {
            long time = read();
            long res = lastTime(time);
            if (res < segundos) {
                ErrorAlert er = new ErrorAlert(null, true);
                ErrorAlert.titulo.setText("Atenção!!");
                ErrorAlert.msj.setText("O Sistema já está em execução!");
                ErrorAlert.msj1.setText("");
                closeProgram();
                er.setVisible(true);
                return false;
            } else {
                programa_tarea();
                return true;
            }
        } else {
            createTMP();
            programa_tarea();
            return true;
        }
    }

    private long read() {
        String linea = "0";
        BufferedReader fr;

        try {
            fr = new BufferedReader(new FileReader(archivo));
            while (fr.ready()) {
                linea = fr.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Long.parseLong(linea);
    }

    private long lastTime(long tiempoActual) {
        Date date = new Date();
        long tiempoTMP = date.getTime();
        long tiempo = tiempoTMP - tiempoActual;
        tiempo = tiempo / 1000;
        return tiempo;
    }

    private void programa_tarea() {
        ScheduledExecutorService sc = Executors.newSingleThreadScheduledExecutor();
        sc.scheduleAtFixedRate(() -> {
            createTMP();
        }, 1000, segundos * 1000, TimeUnit.MILLISECONDS);
    }

    private void createTMP() {
        Date fecha = new Date();

        try {
            try (BufferedWriter wr = new BufferedWriter(new FileWriter(archivo))) {
                wr.write(String.valueOf(fecha.getTime()));
            }
        } catch (IOException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeProgram() {
        if (archivo.exists()) {
            archivo.delete();
        }
        System.exit(0);
    }
}
