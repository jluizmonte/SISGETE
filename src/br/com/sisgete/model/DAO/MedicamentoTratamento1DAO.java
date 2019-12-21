package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.MedicamentoTratamento1Model;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class MedicamentoTratamento1DAO extends SisgeteConnectionMySql {

    /**
     * grava MedicamentoTratamento1
     *
     * @param pMedicamentoTratamento1Model return int
     * @return
     */
    public int salvarMedicamentoTratamento1DAO(MedicamentoTratamento1Model pMedicamentoTratamento1Model) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_medicamento_tratamento_1 ("
                    + "pk_id_medicamento_tratamento_1,"
                    + "fk_paciente,"
                    + "remedio,"
                    + "remedio_tipo,"
                    + "remedio_periodo,"
                    + "remedio_obs,"
                    + "dengue,"
                    + "dengue_tipo,"
                    + "dengue_periodo,"
                    + "dengue_obs,"
                    + "hepatite,"
                    + "hepatite_tipo,"
                    + "hepatite_periodo,"
                    + "hepatite_obs,"
                    + "hipertensao,"
                    + "hipertensao_tipo,"
                    + "hipertensao_periodo,"
                    + "hipertensao_obs,"
                    + "diabetes,"
                    + "diabetes_tipo,"
                    + "diabetes_periodo,"
                    + "diabetes_obs,"
                    + "uso_paracetamol,"
                    + "uso_paracetamol_tipo,"
                    + "uso_paracetamol_periodo,"
                    + "uso_paracetamol_obs,"
                    + "alcool,"
                    + "alcool_tipo,"
                    + "alcool_periodo,"
                    + "alcool_obs,"
                    + "fumo,"
                    + "fumo_tipo,"
                    + "fumo_periodo,"
                    + "fumo_obs"
                    + ") VALUES ("
                    + "'" + pMedicamentoTratamento1Model.getIdMedicamentoTratamento1() + "',"
                    + "'" + pMedicamentoTratamento1Model.getPaciente() + "',"
                    + "'" + pMedicamentoTratamento1Model.getRemedio() + "',"
                    + "'" + pMedicamentoTratamento1Model.getRemedioTipo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getRemedioPeriodo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getRemedioObs() + "',"
                    + "'" + pMedicamentoTratamento1Model.getDengue() + "',"
                    + "'" + pMedicamentoTratamento1Model.getDengueTipo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getDenguePeriodo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getDengueObs() + "',"
                    + "'" + pMedicamentoTratamento1Model.getHepatite() + "',"
                    + "'" + pMedicamentoTratamento1Model.getHepatiteTipo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getHepatitePeriodo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getHepatiteObs() + "',"
                    + "'" + pMedicamentoTratamento1Model.getHipertensao() + "',"
                    + "'" + pMedicamentoTratamento1Model.getHipertensaoTipo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getHipertensaoPeriodo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getHipertensaoObs() + "',"
                    + "'" + pMedicamentoTratamento1Model.getDiabetes() + "',"
                    + "'" + pMedicamentoTratamento1Model.getDiabetesTipo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getDiabetesPeriodo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getDiabetesObs() + "',"
                    + "'" + pMedicamentoTratamento1Model.getUsoParacetamol() + "',"
                    + "'" + pMedicamentoTratamento1Model.getUsoParacetamolTipo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getUsoParacetamolPeriodo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getUsoParacetamolObs() + "',"
                    + "'" + pMedicamentoTratamento1Model.getAlcool() + "',"
                    + "'" + pMedicamentoTratamento1Model.getAlcoolTipo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getAlcoolPeriodo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getAlcoolObs() + "',"
                    + "'" + pMedicamentoTratamento1Model.getFumo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getFumoTipo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getFumoPeriodo() + "',"
                    + "'" + pMedicamentoTratamento1Model.getFumoObs() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera MedicamentoTratamento1
     *
     * @param pIdMedicamentoTratamento1 return MedicamentoTratamento1Model
     */
    public MedicamentoTratamento1Model getMedicamentoTratamento1DAO(int pIdMedicamentoTratamento1) {
        MedicamentoTratamento1Model modelMedicamentoTratamento1 = new MedicamentoTratamento1Model();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_medicamento_tratamento_1,"
                    + "fk_paciente,"
                    + "remedio,"
                    + "remedio_tipo,"
                    + "remedio_periodo,"
                    + "remedio_obs,"
                    + "dengue,"
                    + "dengue_tipo,"
                    + "dengue_periodo,"
                    + "dengue_obs,"
                    + "hepatite,"
                    + "hepatite_tipo,"
                    + "hepatite_periodo,"
                    + "hepatite_obs,"
                    + "hipertensao,"
                    + "hipertensao_tipo,"
                    + "hipertensao_periodo,"
                    + "hipertensao_obs,"
                    + "diabetes,"
                    + "diabetes_tipo,"
                    + "diabetes_periodo,"
                    + "diabetes_obs,"
                    + "uso_paracetamol,"
                    + "uso_paracetamol_tipo,"
                    + "uso_paracetamol_periodo,"
                    + "uso_paracetamol_obs,"
                    + "alcool,"
                    + "alcool_tipo,"
                    + "alcool_periodo,"
                    + "alcool_obs,"
                    + "fumo,"
                    + "fumo_tipo,"
                    + "fumo_periodo,"
                    + "fumo_obs"
                    + " FROM"
                    + " tbl_medicamento_tratamento_1"
                    + " WHERE"
                    + " pk_id_medicamento_tratamento_1 = '" + pIdMedicamentoTratamento1 + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMedicamentoTratamento1.setIdMedicamentoTratamento1(this.getResultSet().getInt(1));
                modelMedicamentoTratamento1.setPaciente(this.getResultSet().getInt(2));
                modelMedicamentoTratamento1.setRemedio(this.getResultSet().getString(3));
                modelMedicamentoTratamento1.setRemedioTipo(this.getResultSet().getString(4));
                modelMedicamentoTratamento1.setRemedioPeriodo(this.getResultSet().getString(5));
                modelMedicamentoTratamento1.setRemedioObs(this.getResultSet().getString(6));
                modelMedicamentoTratamento1.setDengue(this.getResultSet().getString(7));
                modelMedicamentoTratamento1.setDengueTipo(this.getResultSet().getString(8));
                modelMedicamentoTratamento1.setDenguePeriodo(this.getResultSet().getString(9));
                modelMedicamentoTratamento1.setDengueObs(this.getResultSet().getString(10));
                modelMedicamentoTratamento1.setHepatite(this.getResultSet().getString(11));
                modelMedicamentoTratamento1.setHepatiteTipo(this.getResultSet().getString(12));
                modelMedicamentoTratamento1.setHepatitePeriodo(this.getResultSet().getString(13));
                modelMedicamentoTratamento1.setHepatiteObs(this.getResultSet().getString(14));
                modelMedicamentoTratamento1.setHipertensao(this.getResultSet().getString(15));
                modelMedicamentoTratamento1.setHipertensaoTipo(this.getResultSet().getString(16));
                modelMedicamentoTratamento1.setHipertensaoPeriodo(this.getResultSet().getString(17));
                modelMedicamentoTratamento1.setHipertensaoObs(this.getResultSet().getString(18));
                modelMedicamentoTratamento1.setDiabetes(this.getResultSet().getString(19));
                modelMedicamentoTratamento1.setDiabetesTipo(this.getResultSet().getString(20));
                modelMedicamentoTratamento1.setDiabetesPeriodo(this.getResultSet().getString(21));
                modelMedicamentoTratamento1.setDiabetesObs(this.getResultSet().getString(22));
                modelMedicamentoTratamento1.setUsoParacetamol(this.getResultSet().getString(23));
                modelMedicamentoTratamento1.setUsoParacetamolTipo(this.getResultSet().getString(24));
                modelMedicamentoTratamento1.setUsoParacetamolPeriodo(this.getResultSet().getString(25));
                modelMedicamentoTratamento1.setUsoParacetamolObs(this.getResultSet().getString(26));
                modelMedicamentoTratamento1.setAlcool(this.getResultSet().getString(27));
                modelMedicamentoTratamento1.setAlcoolTipo(this.getResultSet().getString(28));
                modelMedicamentoTratamento1.setAlcoolPeriodo(this.getResultSet().getString(29));
                modelMedicamentoTratamento1.setAlcoolObs(this.getResultSet().getString(30));
                modelMedicamentoTratamento1.setFumo(this.getResultSet().getString(31));
                modelMedicamentoTratamento1.setFumoTipo(this.getResultSet().getString(32));
                modelMedicamentoTratamento1.setFumoPeriodo(this.getResultSet().getString(33));
                modelMedicamentoTratamento1.setFumoObs(this.getResultSet().getString(34));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelMedicamentoTratamento1;
    }

    /**
     * recupera uma lista de MedicamentoTratamento1 return ArrayList
     *
     * @return
     */
    public ArrayList<MedicamentoTratamento1Model> getListaMedicamentoTratamento1DAO() {
        ArrayList<MedicamentoTratamento1Model> listamodelMedicamentoTratamento1 = new ArrayList();
        MedicamentoTratamento1Model modelMedicamentoTratamento1 = new MedicamentoTratamento1Model();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_medicamento_tratamento_1,"
                    + "fk_paciente,"
                    + "remedio,"
                    + "remedio_tipo,"
                    + "remedio_periodo,"
                    + "remedio_obs,"
                    + "dengue,"
                    + "dengue_tipo,"
                    + "dengue_periodo,"
                    + "dengue_obs,"
                    + "hepatite,"
                    + "hepatite_tipo,"
                    + "hepatite_periodo,"
                    + "hepatite_obs,"
                    + "hipertensao,"
                    + "hipertensao_tipo,"
                    + "hipertensao_periodo,"
                    + "hipertensao_obs,"
                    + "diabetes,"
                    + "diabetes_tipo,"
                    + "diabetes_periodo,"
                    + "diabetes_obs,"
                    + "uso_paracetamol,"
                    + "uso_paracetamol_tipo,"
                    + "uso_paracetamol_periodo,"
                    + "uso_paracetamol_obs,"
                    + "alcool,"
                    + "alcool_tipo,"
                    + "alcool_periodo,"
                    + "alcool_obs,"
                    + "fumo,"
                    + "fumo_tipo,"
                    + "fumo_periodo,"
                    + "fumo_obs"
                    + " FROM"
                    + " tbl_medicamento_tratamento_1"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMedicamentoTratamento1 = new MedicamentoTratamento1Model();
                modelMedicamentoTratamento1.setIdMedicamentoTratamento1(this.getResultSet().getInt(1));
                modelMedicamentoTratamento1.setPaciente(this.getResultSet().getInt(2));
                modelMedicamentoTratamento1.setRemedio(this.getResultSet().getString(3));
                modelMedicamentoTratamento1.setRemedioTipo(this.getResultSet().getString(4));
                modelMedicamentoTratamento1.setRemedioPeriodo(this.getResultSet().getString(5));
                modelMedicamentoTratamento1.setRemedioObs(this.getResultSet().getString(6));
                modelMedicamentoTratamento1.setDengue(this.getResultSet().getString(7));
                modelMedicamentoTratamento1.setDengueTipo(this.getResultSet().getString(8));
                modelMedicamentoTratamento1.setDenguePeriodo(this.getResultSet().getString(9));
                modelMedicamentoTratamento1.setDengueObs(this.getResultSet().getString(10));
                modelMedicamentoTratamento1.setHepatite(this.getResultSet().getString(11));
                modelMedicamentoTratamento1.setHepatiteTipo(this.getResultSet().getString(12));
                modelMedicamentoTratamento1.setHepatitePeriodo(this.getResultSet().getString(13));
                modelMedicamentoTratamento1.setHepatiteObs(this.getResultSet().getString(14));
                modelMedicamentoTratamento1.setHipertensao(this.getResultSet().getString(15));
                modelMedicamentoTratamento1.setHipertensaoTipo(this.getResultSet().getString(16));
                modelMedicamentoTratamento1.setHipertensaoPeriodo(this.getResultSet().getString(17));
                modelMedicamentoTratamento1.setHipertensaoObs(this.getResultSet().getString(18));
                modelMedicamentoTratamento1.setDiabetes(this.getResultSet().getString(19));
                modelMedicamentoTratamento1.setDiabetesTipo(this.getResultSet().getString(20));
                modelMedicamentoTratamento1.setDiabetesPeriodo(this.getResultSet().getString(21));
                modelMedicamentoTratamento1.setDiabetesObs(this.getResultSet().getString(22));
                modelMedicamentoTratamento1.setUsoParacetamol(this.getResultSet().getString(23));
                modelMedicamentoTratamento1.setUsoParacetamolTipo(this.getResultSet().getString(24));
                modelMedicamentoTratamento1.setUsoParacetamolPeriodo(this.getResultSet().getString(25));
                modelMedicamentoTratamento1.setUsoParacetamolObs(this.getResultSet().getString(26));
                modelMedicamentoTratamento1.setAlcool(this.getResultSet().getString(27));
                modelMedicamentoTratamento1.setAlcoolTipo(this.getResultSet().getString(28));
                modelMedicamentoTratamento1.setAlcoolPeriodo(this.getResultSet().getString(29));
                modelMedicamentoTratamento1.setAlcoolObs(this.getResultSet().getString(30));
                modelMedicamentoTratamento1.setFumo(this.getResultSet().getString(31));
                modelMedicamentoTratamento1.setFumoTipo(this.getResultSet().getString(32));
                modelMedicamentoTratamento1.setFumoPeriodo(this.getResultSet().getString(33));
                modelMedicamentoTratamento1.setFumoObs(this.getResultSet().getString(34));
                listamodelMedicamentoTratamento1.add(modelMedicamentoTratamento1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelMedicamentoTratamento1;
    }

    /**
     * atualiza MedicamentoTratamento1
     *
     * @param pMedicamentoTratamento1Model return boolean
     * @return
     */
    public boolean atualizarMedicamentoTratamento1DAO(MedicamentoTratamento1Model pMedicamentoTratamento1Model) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_medicamento_tratamento_1 SET "
                    + "pk_id_medicamento_tratamento_1 = '" + pMedicamentoTratamento1Model.getIdMedicamentoTratamento1() + "',"
                    + "fk_paciente = '" + pMedicamentoTratamento1Model.getPaciente() + "',"
                    + "remedio = '" + pMedicamentoTratamento1Model.getRemedio() + "',"
                    + "remedio_tipo = '" + pMedicamentoTratamento1Model.getRemedioTipo() + "',"
                    + "remedio_periodo = '" + pMedicamentoTratamento1Model.getRemedioPeriodo() + "',"
                    + "remedio_obs = '" + pMedicamentoTratamento1Model.getRemedioObs() + "',"
                    + "dengue = '" + pMedicamentoTratamento1Model.getDengue() + "',"
                    + "dengue_tipo = '" + pMedicamentoTratamento1Model.getDengueTipo() + "',"
                    + "dengue_periodo = '" + pMedicamentoTratamento1Model.getDenguePeriodo() + "',"
                    + "dengue_obs = '" + pMedicamentoTratamento1Model.getDengueObs() + "',"
                    + "hepatite = '" + pMedicamentoTratamento1Model.getHepatite() + "',"
                    + "hepatite_tipo = '" + pMedicamentoTratamento1Model.getHepatiteTipo() + "',"
                    + "hepatite_periodo = '" + pMedicamentoTratamento1Model.getHepatitePeriodo() + "',"
                    + "hepatite_obs = '" + pMedicamentoTratamento1Model.getHepatiteObs() + "',"
                    + "hipertensao = '" + pMedicamentoTratamento1Model.getHipertensao() + "',"
                    + "hipertensao_tipo = '" + pMedicamentoTratamento1Model.getHipertensaoTipo() + "',"
                    + "hipertensao_periodo = '" + pMedicamentoTratamento1Model.getHipertensaoPeriodo() + "',"
                    + "hipertensao_obs = '" + pMedicamentoTratamento1Model.getHipertensaoObs() + "',"
                    + "diabetes = '" + pMedicamentoTratamento1Model.getDiabetes() + "',"
                    + "diabetes_tipo = '" + pMedicamentoTratamento1Model.getDiabetesTipo() + "',"
                    + "diabetes_periodo = '" + pMedicamentoTratamento1Model.getDiabetesPeriodo() + "',"
                    + "diabetes_obs = '" + pMedicamentoTratamento1Model.getDiabetesObs() + "',"
                    + "uso_paracetamol = '" + pMedicamentoTratamento1Model.getUsoParacetamol() + "',"
                    + "uso_paracetamol_tipo = '" + pMedicamentoTratamento1Model.getUsoParacetamolTipo() + "',"
                    + "uso_paracetamol_periodo = '" + pMedicamentoTratamento1Model.getUsoParacetamolPeriodo() + "',"
                    + "uso_paracetamol_obs = '" + pMedicamentoTratamento1Model.getUsoParacetamolObs() + "',"
                    + "alcool = '" + pMedicamentoTratamento1Model.getAlcool() + "',"
                    + "alcool_tipo = '" + pMedicamentoTratamento1Model.getAlcoolTipo() + "',"
                    + "alcool_periodo = '" + pMedicamentoTratamento1Model.getAlcoolPeriodo() + "',"
                    + "alcool_obs = '" + pMedicamentoTratamento1Model.getAlcoolObs() + "',"
                    + "fumo = '" + pMedicamentoTratamento1Model.getFumo() + "',"
                    + "fumo_tipo = '" + pMedicamentoTratamento1Model.getFumoTipo() + "',"
                    + "fumo_periodo = '" + pMedicamentoTratamento1Model.getFumoPeriodo() + "',"
                    + "fumo_obs = '" + pMedicamentoTratamento1Model.getFumoObs() + "'"
                    + " WHERE "
                    + "pk_id_medicamento_tratamento_1 = '" + pMedicamentoTratamento1Model.getIdMedicamentoTratamento1() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui MedicamentoTratamento1
     *
     * @param pIdMedicamentoTratamento1 return boolean
     * @return
     */
    public boolean excluirMedicamentoTratamento1DAO(int pIdMedicamentoTratamento1) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_medicamento_tratamento_1 "
                    + " WHERE "
                    + "pk_id_medicamento_tratamento_1 = '" + pIdMedicamentoTratamento1 + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
