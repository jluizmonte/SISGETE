package br.com.sisgete.connection;

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

public class SisgeteConnectionSqLite {

    ObterInfoSistema info = new ObterInfoSistema();
    static String diretorioUsuario;
    static String diretorioPadrao = System.getProperty("user.home");
    private final String nomeSistema = System.getProperty("os.name");
    File sisgeteDB;
    ResultSet resultSet;
    String url;
    Connection conn;
    Statement stmt;
    PreparedStatement preparedStatement;

    public void sisgeteDB() throws IOException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        if (nomeSistema.equals("Linux")) {
            diretorioUsuario = diretorioPadrao + "/.sisgete";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + "/sisgete.db");
            sisgeteDB = new File(diretorioUsuario + "/sisgete.db");
        } else {
            diretorioUsuario = diretorioPadrao + "\\sisgete";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + "\\sisgete.db");
            sisgeteDB = new File(diretorioUsuario + "\\sisgete.db");
        }

        File diretorio = new File(diretorioUsuario);
        if (!diretorio.exists()) {
            try {
                diretorio.mkdir();
                sisgeteDB.createNewFile();
            } catch (IOException e) {
                System.out.println("Erro: " + e);
            }
        }
    }

    public void sisgeteTableDB() {

        if (nomeSistema.equals("Linux")) {
            diretorioUsuario = diretorioPadrao + "/.sisgete";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + "/sisgete.db");

        } else {
            diretorioUsuario = diretorioPadrao + "\\sisgete";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + "\\sisgete.db");
        }

        // criação das tabelas
        String tema = "CREATE TABLE \"tbl_tema\" (\n"
                + "	\"pk_id_tema\"	INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "	\"tema_nome\"	TEXT NOT NULL\n"
                + ");";

        // inserção de dados nas tabelas
        String insert_tema = "INSERT INTO tbl_tema VALUES (1,'javax.swing.plaf.nimbus.NimbusLookAndFeel');";

        try (Connection conn = DriverManager.getConnection(this.getUrl()); Statement stmt = conn.createStatement()) {
            // create a new table

            stmt.execute(tema);
            /**/
            PreparedStatement pstmt = conn.prepareStatement(insert_tema);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // System.out.println(e.getMessage());
        }
    }

    public Connection connect() {

        if (info.getNomeSistema().equals("Linux")) {
            diretorioUsuario = diretorioPadrao + "/.sisgete";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + "/sisgete.db");

        } else {
            diretorioUsuario = diretorioPadrao + "\\sisgete";
            this.setUrl("jdbc:sqlite:" + diretorioUsuario + "\\sisgete.db");
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
