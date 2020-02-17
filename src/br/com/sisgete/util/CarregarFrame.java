package br.com.sisgete.util;

import br.com.sisgete.view.FirstSplashView;
import java.io.IOException;

public class CarregarFrame {

    public void setFrameTime() throws ClassNotFoundException, IOException {
        LogCatch logCatch = new LogCatch();

        logCatch.createFolder();
        logCatch.createFile();
        logCatch.firstWriteFile();

        FirstSplashView firstSplash = new FirstSplashView();
        firstSplash.setVisible(true);

        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(80);
            } catch (InterruptedException ex) {
                ex.getLocalizedMessage();
                LogModel.logClass = this.getClass().getName();
                logCatch.writeLog(String.valueOf(ex));
            }
            firstSplash.loadingnum.setText(Integer.toString(i) + "%");
            firstSplash.loadingbar.setValue(i);
            firstSplash.loadingbar.setForeground(new java.awt.Color(127, 205, 205));
            switch (i) {
                case 10:
                    firstSplash.process.setText("Criando diretórios");
                    break;
                case 20:
                    firstSplash.process.setText("Criando arquivos necessários");
                    break;
                case 30:
                    firstSplash.process.setText("Realizando configurações permanentes");
                    break;
                case 50:
                    firstSplash.process.setText("Arquivos e diretórios criados");
                    break;
                case 70:
                    firstSplash.process.setText("Aguarde a inicialização do sistema!");
                    break;
                case 90:
                    firstSplash.process.setText("Iniciando sistema com novas configurações!");
                    break;
            }
            if (i == 100) {
                firstSplash.dispose();
            }
        }
    }
}
