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

    public void createFolder() {
        File diretorio = new File(LogModel.userSystemDirectory);
        if (!diretorio.exists()) {
            try {
                diretorio.mkdirs();
            } catch (Exception e) {
                LogModel.logClass = this.getClass().getName();
                new LogCatch().writeLog(String.valueOf(e));
            }
        }
    }

    /**
     * criacao do arquivo de createFile
     */
    public void createFile() {

        logCat = new File(LogModel.userSystemFile);
        try {
            logCat.createNewFile();
        } catch (IOException e) {
            LogModel.logClass = this.getClass().getName();
            new LogCatch().writeLog(String.valueOf(e));
        }
    }

    /**
     * criacao do log
     *
     * @param log
     */
    public void writeLog(String log) {
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
                bufferedWriter.newLine();
                bufferedWriter.write("---------------------------------------------");
                bufferedWriter.newLine();
                bufferedWriter.write("usuário: " + SessaoModel.nomeUsuario);
                bufferedWriter.newLine();
                bufferedWriter.write("Classe geradora do log: " + getClass().toString());
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
                bufferedWriter.write("LOG DE ERROS DO SISTEMA SISGETE");
                bufferedWriter.newLine();
                bufferedWriter.write("Instituição: FECMA");
                bufferedWriter.newLine();
                bufferedWriter.write("Data criação arquivo de log: " + new LogModel().logDateNow);
                bufferedWriter.newLine();
                bufferedWriter.write("Sistema operacional: " + new ObterInfoSistema().getNomeSistema());
                bufferedWriter.newLine();
                bufferedWriter.write("Licenciado para: " + new ObterInfoSistema().getNomeUsuario());
                bufferedWriter.newLine();
                bufferedWriter.write("<<<<< LOGCATCH >>>>>\n");
                bufferedWriter.newLine();
                bufferedWriter.write(new LogModel().logDateNow + ": " + "sistema instalado com sucesso!\n");
                bufferedWriter.newLine();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao criar arquivo de LOG\n" + " Informe ao desenvolvedor o ocorrido", "Erro Critico",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void readLogs() {
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
