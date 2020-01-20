package br.com.sisgete.util;

import br.com.sisgete.model.SessaoModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class LogCatch {

    File logCat;

    public void criarPastaLogs() {
        File diretorio = new File(LogModel.userSystemDirectory);
        if (!diretorio.exists()) {
            try {
                diretorio.mkdirs();
            } catch (Exception e) {
                LogModel.logClass = this.getClass().getName();
                new LogCatch().writeFile(String.valueOf(e));
            }
        }
    }

    public void criarPastaListaPaciente() {
        File diretorio = new File(LogModel.diretorioPacienteDiario);
        if (!diretorio.exists()) {
            try {
                diretorio.mkdirs();
            } catch (Exception e) {
                LogModel.logClass = this.getClass().getName();
                new LogCatch().writeFile(String.valueOf(e));
            }
        }
    }

    /**
     * criacao do arquivo de Log
     */
    public void Log() {

        logCat = new File(LogModel.userSystemFile);
        try {
            logCat.createNewFile();
        } catch (IOException e) {
            LogModel.logClass = this.getClass().getName();
            new LogCatch().writeFile(String.valueOf(e));
        }
    }

    /**
     * criacao lista de paciente consultados por dia
     *
     * @throws java.io.IOException
     */
    public void pacienteLog() throws IOException {
        logCat = new File(LogModel.pacienteLog);
        try {
            if (!logCat.exists()) {
                logCat.createNewFile();
            }
        } catch (IOException e) {
            LogModel.logClass = this.getClass().getName();
            new LogCatch().writeFile(String.valueOf(e));
        }
    }

    /**
     * criacao do log
     *
     * @param log
     */
    public void writeFile(String log) {
        logCat = new File(LogModel.userSystemFile);
        try {
            if (("".equals(log)) || (log == null)) {
                log = "Sem mais registros!";
                LogModel.logClass = getClass().toString();
            }

            if (SessaoModel.nomeUsuario == null) {
                SessaoModel.nomeUsuario = "Usuário não logado";
            }
            FileWriter fileWriter = new FileWriter(logCat, true);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("---------------------------------------------");
                bufferedWriter.newLine();
                bufferedWriter.write("usuário: " + SessaoModel.nomeUsuario);
                bufferedWriter.newLine();
                bufferedWriter.write("Classe geradora do log: " + LogModel.logClass);
                bufferedWriter.newLine();
                bufferedWriter.write(new LogModel().logDateNow + ": " + log + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao criar arquivo de LOG\n" + " Informe ao desenvolvedor o ocorrido", "Erro Critico",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    public void firstWriteFile() {
        logCat = new File(LogModel.userSystemFile);
        try {
            FileWriter fileWriter = new FileWriter(logCat);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("LOGS SISGETE");
                bufferedWriter.newLine();
                bufferedWriter.write("Instituição: FECMA");
                bufferedWriter.newLine();
                bufferedWriter.write("Data criação arquivo de log: " + new LogModel().logDateNow);
                bufferedWriter.newLine();
                bufferedWriter.write("Sistema operacional: " + new ObterInfoSistema().getNomeSistema());
                bufferedWriter.newLine();
                bufferedWriter.write("Licenciado para: " + new ObterInfoSistema().getNomeUsuario());
                bufferedWriter.newLine();
                bufferedWriter.write("<<<<< LOGCAT >>>>>\n");
                bufferedWriter.write("\n");
                bufferedWriter.write(new LogModel().logDateNow + ": " + "sistema instalado com sucesso!\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao criar arquivo de LOG\n" + " Informe ao desenvolvedor o ocorrido", "Erro Critico",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void listaPaciente(String paciente) {
        logCat = new File(LogModel.pacienteLog);
        try {
            FileWriter fileWriter = new FileWriter(logCat);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                bufferedWriter.write("<<<<< CONTAGEM PACIENTES E CONSULTAS >>>>>\n");
                bufferedWriter.newLine();
                bufferedWriter.write(paciente + "\n");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao criar arquivo de LOG\n" + " Informe ao desenvolvedor o ocorrido", "Erro Critico",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    public void readNameLogs() {
        File folder = new File(LogModel.userSystemDirectory);
        File[] listOfFiles = folder.listFiles();

        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                System.out.println("File " + listOfFile.getName());
                listOfFile.getName();
            }
        }
    }

}
