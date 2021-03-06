package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.PacienteLogDB;
import br.com.sisgete.model.PacienteLogModel;
import br.com.sisgete.util.LogCatch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class PacienteLogDAO extends PacienteLogDB {

    /**
     *
     * @param pacienteLogModel
     * @return
     */
    public int insertPacienteLog(PacienteLogModel pacienteLogModel) {
        try {
            String sql = "INSERT INTO tbl_paciente (paciente, setor,tipo) VALUES (?,?,?)";
            PreparedStatement preparedStatement = this.connect().prepareStatement(sql);
            preparedStatement.setString(1, pacienteLogModel.getPacienteLog());
            preparedStatement.setString(2, pacienteLogModel.getSetorPacienteLog());
            preparedStatement.setString(3, pacienteLogModel.getTipoPacienteLog());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            new LogCatch().writeLog("Erro ao inserir paciente: " + e, this.getClass().toString());
            return 0;
        } finally {
            this.closeConection();
        }
        return 0;
    }

    /**
     * recupera uma lista de paciente aptos a consulta return ArrayList
     *
     * @return
     */
    public ArrayList<PacienteLogModel> getListaPacienteLogDAO() {
        ArrayList<PacienteLogModel> listamodelPacienteLogModel = new ArrayList();
        PacienteLogModel pacienteLogModel = new PacienteLogModel();

        try {

            String sql = "SELECT * FROM tbl_paciente WHERE tipo='CONSULTA'";
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                pacienteLogModel = new PacienteLogModel();
                pacienteLogModel.setIdPacienteLog(rs.getInt("pk_id_paciente"));
                pacienteLogModel.setPacienteLog(rs.getString("paciente"));
                pacienteLogModel.setSetorPacienteLog(rs.getString("setor"));
                pacienteLogModel.setTipoPacienteLog(rs.getString("tipo"));
                listamodelPacienteLogModel.add(pacienteLogModel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeConection();
        }
        return listamodelPacienteLogModel;
    }

    /**
     * recupera uma lista de paciente aptos a tratamento return ArrayList
     *
     * @return
     */
    public ArrayList<PacienteLogModel> getListaPacienteAtendimentoLogDAO() {
        ArrayList<PacienteLogModel> listamodelPacienteLogModel = new ArrayList();
        PacienteLogModel pacienteLogModel = new PacienteLogModel();

        try {

            String sql = "SELECT * FROM tbl_paciente WHERE tipo='ATENDIMENTO'";
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                pacienteLogModel = new PacienteLogModel();
                pacienteLogModel.setIdPacienteLog(rs.getInt("pk_id_paciente"));
                pacienteLogModel.setPacienteLog(rs.getString("paciente"));
                pacienteLogModel.setSetorPacienteLog(rs.getString("setor"));
                pacienteLogModel.setTipoPacienteLog(rs.getString("tipo"));
                listamodelPacienteLogModel.add(pacienteLogModel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeConection();
        }
        return listamodelPacienteLogModel;
    }

    public int getQtdePacienteAtendimento() {
        int quantidadeTotal = 0;
        try {
            String sql = "SELECT count (*) AS total FROM tbl_paciente WHERE tipo='ATENDIMENTO'";
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            quantidadeTotal = rs.getInt("total");
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.closeConection();
        }
        return quantidadeTotal;
    }

    public int getQtdePacienteConsulta() {
        int quantidadeTotal = 0;
        try {
            String sql = "SELECT count (*) AS total FROM tbl_paciente WHERE tipo='CONSULTA'";
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            quantidadeTotal = rs.getInt("total");
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.closeConection();
        }
        return quantidadeTotal;
    }
}
