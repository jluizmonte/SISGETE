package br.com.sisgete.connection;

import br.com.sisgete.util.LogModel;
import br.com.sisgete.util.ObterInfoSistema;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class PacienteLogDB {

    ObterInfoSistema info = new ObterInfoSistema();
    static String diretorioUsuario;
    static String diretorioPadrao = System.getProperty("user.home");
    private final String nomeSistema = System.getProperty("os.name");
    File sisgeteDB;
    File pacienteLogDB;
    ResultSet resultSet;
    String url;
    Connection conn;
    Statement stmt;
    PreparedStatement preparedStatement;
    String atendimentoDB = "Atendimento" + LogModel.nowDateTime + ".db";

    public void pacienteLogDB() throws ClassNotFoundException, IOException {
        Class.forName("org.sqlite.JDBC");
        if (nomeSistema.equals("Linux")) {
            diretorioUsuario = diretorioPadrao + "/.sisgete/registro/";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + atendimentoDB);
            pacienteLogDB = new File(diretorioUsuario + atendimentoDB);
        } else {
            diretorioUsuario = diretorioPadrao + "\\sisgete\\registro\\";
            this.setUrl("jdbc:sqlite:" + atendimentoDB);
            pacienteLogDB = new File(diretorioUsuario + atendimentoDB);
        }

        File diretorio = new File(diretorioUsuario);
        if (!diretorio.exists()) {
            try {
                diretorio.mkdir();
                pacienteLogDB.createNewFile();
            } catch (IOException e) {
                System.out.println("Erro: " + e);
            }
        }
    }

    public void pacienteTableDB() {

        if (nomeSistema.equals("Linux")) {
            diretorioUsuario = diretorioPadrao + "/.sisgete/registro/";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + atendimentoDB);
            pacienteLogDB = new File(diretorioUsuario + atendimentoDB);
        } else {
            diretorioUsuario = diretorioPadrao + "\\sisgete\\registro\\";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + atendimentoDB);
        }

        String tbl_paciente = "CREATE TABLE \"tbl_paciente\" (\n"
                + "	\"pk_id_paciente\"	INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	\"paciente\"	TEXT NOT NULL,\n"
                + "	\"setor\"	TEXT,\n"
                + "                \"tipo\" TEXT NOT NULL \n"
                + ");";

        try (Connection conn = DriverManager.getConnection(this.getUrl()); Statement stmt = conn.createStatement()) {
            stmt.execute(tbl_paciente);
            stmt.close();
        } catch (SQLException e) {
            // System.out.println(e.getMessage());
        }
    }

    public Connection connect() {

        if (info.getNomeSistema().equals("Linux")) {
            diretorioUsuario = diretorioPadrao + "/.sisgete/registro/";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + atendimentoDB);

        } else {
            diretorioUsuario = diretorioPadrao + "\\sisgete\\registro\\";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + atendimentoDB);
        }
        this.setConn(null);
        try {
            this.setConn(DriverManager.getConnection(this.getUrl()));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return this.getConn();
    }

    public boolean executeSQL(String pSQL) throws SQLException {
        this.setConn(DriverManager.getConnection(this.getUrl()));
        this.setStmt(this.getConn().createStatement());
        try {
            this.setResultSet(this.getStmt().executeQuery(pSQL));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean executeUpdateDeleSQL(String pSQL) throws SQLException {
        this.setConn(DriverManager.getConnection(this.getUrl()));
        this.setStmt(this.getConn().createStatement());
        try {
            this.setPreparedStatement(this.getConn().prepareStatement(pSQL));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean closeConection() {
        try {
            if ((this.getResultSet() != null) && (this.stmt != null)) {
                this.getResultSet().close();
                this.stmt.close();
            }
            this.getConn().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }
}
