package br.com.sisgete.util;

public class FolderLocal {

    public static String diretorioPadrao = System.getProperty("user.home");
    private final String nomeSistema = System.getProperty("os.name");
    public static String userDirectory;
    String logCat;
    String changeLog;

    /**
     * retorna o nome da pasta adicionada da barra necessária utilizada somente
     * para visualizar os logs
     *
     * @return
     */
    public String userDirectory() {
        if (nomeSistema.equals("Linux")) {
            userDirectory = diretorioPadrao + "/.sisgete/logs/";
        } else {
            userDirectory = diretorioPadrao + "\\sisgete\\logs\\";
        }
        return userDirectory;
    }

    /**
     * retorna o nome da pasta adicionada da barra necessária utilizada somente
     * para visualizar os logs
     *
     * @return
     */
    public String diretorioPacienteDiario() {
        if (nomeSistema.equals("Linux")) {
            userDirectory = diretorioPadrao + "/.sisgete/registro/";
        } else {
            userDirectory = diretorioPadrao + "\\sisgete\\registro\\";
        }
        return userDirectory;
    }

    /**
     * criacao de logs diarios para pacientes em atendimento num
     * domingo/terça/quinta
     *
     * @return
     */
    public String pacienteLog() {
        if (nomeSistema.equals("Linux")) {
            userDirectory = diretorioPadrao + "/.sisgete/registro/";
            logCat = userDirectory + "Atendimento" + LogModel.nowDateTime + ".sisg";
        } else {
            userDirectory = diretorioPadrao + "\\sisgete\\registro\\";
            String uri = userDirectory + "Atendimento" + LogModel.nowDateTime + ".sisg";
            logCat = uri;
        }
        return logCat;
    }

    /**
     * cria a pasta de LOGS vazia
     *
     * @return
     */
    public String userSystemDirectory() {
        if (nomeSistema.equals("Linux")) {
            userDirectory = diretorioPadrao + "/.sisgete/logs";
        } else {
            userDirectory = diretorioPadrao + "\\sisgete\\logs";
        }
        return userDirectory;
    }

    /**
     * cria os arquivos de LOGS
     *
     * @return
     */
    public String userSystemFile() {
        if (nomeSistema.equals("Linux")) {
            userDirectory = diretorioPadrao + "/.sisgete/logs/";
            logCat = userDirectory + "log.sisg";
        } else {
            userDirectory = diretorioPadrao + "\\sisgete\\logs\\";
            String uri = userDirectory + "log.sisg";
            logCat = uri;
        }
        return logCat;
    }

    public String userChangeLog() {
        if (nomeSistema.equals("Linux")) {
            userDirectory = diretorioPadrao + "/.sisgete/logs/";
            changeLog = userDirectory + "changelog.txt";
        } else {
            userDirectory = diretorioPadrao + "\\sisgete\\logs\\";
            changeLog = userDirectory + "changelog.txt";
        }
        return changeLog;
    }
}
