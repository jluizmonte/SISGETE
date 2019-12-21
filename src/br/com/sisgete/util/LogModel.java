package br.com.sisgete.util;

public class LogModel {

    public static String logText; // valores atribuidos quando chamados nos catch
    public static String logClass;// valores atribuidos quando chamados nos catch
    public static String logDate = new GetDateUtil().getDate();// data no formato dd-MM_HH:mm
    public String logDateNow = new GetDateUtil().getDateNow(); // data no formato dd/MM/yy HH:mm:ss
    public static String logDateOnly = new GetDateUtil().getDateOnly();// data no formato dd_MM
    public static String logTimeOnly = new GetDateUtil().getTimeOnly();// data no formato HH:mm
    public static String dateTimeNow = new GetDateUtil().getDateNow(); // data no formato dd/MM/yyyy HH:mm:ss
    public static String dateTime = new GetDateUtil().getDateTime(); //data no formato dd/MM/yyyy
    //               public static String logUser = SessaoUsuarioModel.nomeUsuario; // nome do usuário logado na sessão
//	public static String logLibrary = new TemaService().getNomeBiblioteca().getNomeLivraria(); // nome da instituição
//	public static String userSystemFile = new FolderLocal().userSystemFile(); // cria os arquivos de LOGS
//	public static String userDirectory = new FolderLocal().userDirectory();// retorna o nome da pasta de LOGS
//	public static String userChangeLog = new FolderLocal().userChangeLog();// cria o changelog
//	public static String userSystemDirectory = new FolderLocal().userSystemDirectory(); // cria a pasta de LOGS vazia
}
