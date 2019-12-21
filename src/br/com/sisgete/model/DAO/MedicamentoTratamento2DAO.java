package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.MedicamentoTratamento2Model;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class MedicamentoTratamento2DAO extends SisgeteConnectionMySql {

    /**
     * grava MedicamentoTratamento2
     *
     * @param pMedicamentoTratamento2Model return int
     * @return
     */
    public int salvarMedicamentoTratamento2DAO(MedicamentoTratamento2Model pMedicamentoTratamento2Model) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_medicamento_tratamento_2 ("
                    + "pk_id_medicamento_tratamento_2,"
                    + "fk_paciente,"
                    + "alergias,"
                    + "alergias_tipo,"
                    + "alergias_periodo,"
                    + "alergias_obs,"
                    + "hernia,"
                    + "hernia_tipo,"
                    + "hernia_periodo,"
                    + "hernia_obs,"
                    + "doenca_estomago,"
                    + "doenca_estomago_tipo,"
                    + "doenca_estomago_periodo,"
                    + "doenca_estomago_obs,"
                    + "doenca_ossos,"
                    + "doenca_ossos_tipo,"
                    + "doenca_ossos_periodo,"
                    + "doenca_ossos_obs,"
                    + "doenca_pulmoes,"
                    + "doenca_pulmoes_tipo,"
                    + "doenca_pulmoes_periodo,"
                    + "doenca_pulmoes_obs,"
                    + "doenta_autoimune,"
                    + "doenta_autoimune_tipo,"
                    + "doenta_autoimune_periodo,"
                    + "doenta_autoimune_obs,"
                    + "cancer,"
                    + "cancer_tipo,"
                    + "cancer_periodo,"
                    + "cancer_obs,"
                    + "feridas_tumores,"
                    + "feridas_tumores_tipo,"
                    + "feridas_tumores_periodo,"
                    + "feridas_tumores_obs"
                    + ") VALUES ("
                    + "'" + pMedicamentoTratamento2Model.getIdMedicamentoTratamento2() + "',"
                    + "'" + pMedicamentoTratamento2Model.getPaciente() + "',"
                    + "'" + pMedicamentoTratamento2Model.getAlergias() + "',"
                    + "'" + pMedicamentoTratamento2Model.getAlergiasTipo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getAlergiasPeriodo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getAlergiasObs() + "',"
                    + "'" + pMedicamentoTratamento2Model.getHernia() + "',"
                    + "'" + pMedicamentoTratamento2Model.getHerniaTipo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getHerniaPeriodo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getHerniaObs() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaEstomago() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaEstomagoTipo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaEstomagoPeriodo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaEstomagoObs() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaOssos() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaOssosTipo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaOssosPeriodo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaOssosObs() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaPulmoes() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaPulmoesTipo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaPulmoesPeriodo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoencaPulmoesObs() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoentaAutoimune() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoentaAutoimuneTipo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoentaAutoimunePeriodo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getDoentaAutoimuneObs() + "',"
                    + "'" + pMedicamentoTratamento2Model.getCancer() + "',"
                    + "'" + pMedicamentoTratamento2Model.getCancerTipo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getCancerPeriodo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getCancerObs() + "',"
                    + "'" + pMedicamentoTratamento2Model.getFeridasTumores() + "',"
                    + "'" + pMedicamentoTratamento2Model.getFeridasTumoresTipo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getFeridasTumoresPeriodo() + "',"
                    + "'" + pMedicamentoTratamento2Model.getFeridasTumoresObs() + "'"
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
     * recupera MedicamentoTratamento2
     *
     * @param pIdMedicamentoTratamento2 return MedicamentoTratamento2Model
     * @return
     */
    public MedicamentoTratamento2Model getMedicamentoTratamento2DAO(int pIdMedicamentoTratamento2) {
        MedicamentoTratamento2Model modelMedicamentoTratamento2 = new MedicamentoTratamento2Model();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_medicamento_tratamento_2,"
                    + "fk_paciente,"
                    + "alergias,"
                    + "alergias_tipo,"
                    + "alergias_periodo,"
                    + "alergias_obs,"
                    + "hernia,"
                    + "hernia_tipo,"
                    + "hernia_periodo,"
                    + "hernia_obs,"
                    + "doenca_estomago,"
                    + "doenca_estomago_tipo,"
                    + "doenca_estomago_periodo,"
                    + "doenca_estomago_obs,"
                    + "doenca_ossos,"
                    + "doenca_ossos_tipo,"
                    + "doenca_ossos_periodo,"
                    + "doenca_ossos_obs,"
                    + "doenca_pulmoes,"
                    + "doenca_pulmoes_tipo,"
                    + "doenca_pulmoes_periodo,"
                    + "doenca_pulmoes_obs,"
                    + "doenta_autoimune,"
                    + "doenta_autoimune_tipo,"
                    + "doenta_autoimune_periodo,"
                    + "doenta_autoimune_obs,"
                    + "cancer,"
                    + "cancer_tipo,"
                    + "cancer_periodo,"
                    + "cancer_obs,"
                    + "feridas_tumores,"
                    + "feridas_tumores_tipo,"
                    + "feridas_tumores_periodo,"
                    + "feridas_tumores_obs"
                    + " FROM"
                    + " tbl_medicamento_tratamento_2"
                    + " WHERE"
                    + " pk_id_medicamento_tratamento_2 = '" + pIdMedicamentoTratamento2 + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMedicamentoTratamento2.setIdMedicamentoTratamento2(this.getResultSet().getInt(1));
                modelMedicamentoTratamento2.setPaciente(this.getResultSet().getInt(2));
                modelMedicamentoTratamento2.setAlergias(this.getResultSet().getString(3));
                modelMedicamentoTratamento2.setAlergiasTipo(this.getResultSet().getString(4));
                modelMedicamentoTratamento2.setAlergiasPeriodo(this.getResultSet().getString(5));
                modelMedicamentoTratamento2.setAlergiasObs(this.getResultSet().getString(6));
                modelMedicamentoTratamento2.setHernia(this.getResultSet().getString(7));
                modelMedicamentoTratamento2.setHerniaTipo(this.getResultSet().getString(8));
                modelMedicamentoTratamento2.setHerniaPeriodo(this.getResultSet().getString(9));
                modelMedicamentoTratamento2.setHerniaObs(this.getResultSet().getString(10));
                modelMedicamentoTratamento2.setDoencaEstomago(this.getResultSet().getString(11));
                modelMedicamentoTratamento2.setDoencaEstomagoTipo(this.getResultSet().getString(12));
                modelMedicamentoTratamento2.setDoencaEstomagoPeriodo(this.getResultSet().getString(13));
                modelMedicamentoTratamento2.setDoencaEstomagoObs(this.getResultSet().getString(14));
                modelMedicamentoTratamento2.setDoencaOssos(this.getResultSet().getString(15));
                modelMedicamentoTratamento2.setDoencaOssosTipo(this.getResultSet().getString(16));
                modelMedicamentoTratamento2.setDoencaOssosPeriodo(this.getResultSet().getString(17));
                modelMedicamentoTratamento2.setDoencaOssosObs(this.getResultSet().getString(18));
                modelMedicamentoTratamento2.setDoencaPulmoes(this.getResultSet().getString(19));
                modelMedicamentoTratamento2.setDoencaPulmoesTipo(this.getResultSet().getString(20));
                modelMedicamentoTratamento2.setDoencaPulmoesPeriodo(this.getResultSet().getString(21));
                modelMedicamentoTratamento2.setDoencaPulmoesObs(this.getResultSet().getString(22));
                modelMedicamentoTratamento2.setDoentaAutoimune(this.getResultSet().getString(23));
                modelMedicamentoTratamento2.setDoentaAutoimuneTipo(this.getResultSet().getString(24));
                modelMedicamentoTratamento2.setDoentaAutoimunePeriodo(this.getResultSet().getString(25));
                modelMedicamentoTratamento2.setDoentaAutoimuneObs(this.getResultSet().getString(26));
                modelMedicamentoTratamento2.setCancer(this.getResultSet().getString(27));
                modelMedicamentoTratamento2.setCancerTipo(this.getResultSet().getString(28));
                modelMedicamentoTratamento2.setCancerPeriodo(this.getResultSet().getString(29));
                modelMedicamentoTratamento2.setCancerObs(this.getResultSet().getString(30));
                modelMedicamentoTratamento2.setFeridasTumores(this.getResultSet().getString(31));
                modelMedicamentoTratamento2.setFeridasTumoresTipo(this.getResultSet().getString(32));
                modelMedicamentoTratamento2.setFeridasTumoresPeriodo(this.getResultSet().getString(33));
                modelMedicamentoTratamento2.setFeridasTumoresObs(this.getResultSet().getString(34));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelMedicamentoTratamento2;
    }

    /**
     * recupera uma lista de MedicamentoTratamento2 return ArrayList
     *
     * @return
     */
    public ArrayList<MedicamentoTratamento2Model> getListaMedicamentoTratamento2DAO() {
        ArrayList<MedicamentoTratamento2Model> listamodelMedicamentoTratamento2 = new ArrayList();
        MedicamentoTratamento2Model modelMedicamentoTratamento2 = new MedicamentoTratamento2Model();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_medicamento_tratamento_2,"
                    + "fk_paciente,"
                    + "alergias,"
                    + "alergias_tipo,"
                    + "alergias_periodo,"
                    + "alergias_obs,"
                    + "hernia,"
                    + "hernia_tipo,"
                    + "hernia_periodo,"
                    + "hernia_obs,"
                    + "doenca_estomago,"
                    + "doenca_estomago_tipo,"
                    + "doenca_estomago_periodo,"
                    + "doenca_estomago_obs,"
                    + "doenca_ossos,"
                    + "doenca_ossos_tipo,"
                    + "doenca_ossos_periodo,"
                    + "doenca_ossos_obs,"
                    + "doenca_pulmoes,"
                    + "doenca_pulmoes_tipo,"
                    + "doenca_pulmoes_periodo,"
                    + "doenca_pulmoes_obs,"
                    + "doenta_autoimune,"
                    + "doenta_autoimune_tipo,"
                    + "doenta_autoimune_periodo,"
                    + "doenta_autoimune_obs,"
                    + "cancer,"
                    + "cancer_tipo,"
                    + "cancer_periodo,"
                    + "cancer_obs,"
                    + "feridas_tumores,"
                    + "feridas_tumores_tipo,"
                    + "feridas_tumores_periodo,"
                    + "feridas_tumores_obs"
                    + " FROM"
                    + " tbl_medicamento_tratamento_2"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMedicamentoTratamento2 = new MedicamentoTratamento2Model();
                modelMedicamentoTratamento2.setIdMedicamentoTratamento2(this.getResultSet().getInt(1));
                modelMedicamentoTratamento2.setPaciente(this.getResultSet().getInt(2));
                modelMedicamentoTratamento2.setAlergias(this.getResultSet().getString(3));
                modelMedicamentoTratamento2.setAlergiasTipo(this.getResultSet().getString(4));
                modelMedicamentoTratamento2.setAlergiasPeriodo(this.getResultSet().getString(5));
                modelMedicamentoTratamento2.setAlergiasObs(this.getResultSet().getString(6));
                modelMedicamentoTratamento2.setHernia(this.getResultSet().getString(7));
                modelMedicamentoTratamento2.setHerniaTipo(this.getResultSet().getString(8));
                modelMedicamentoTratamento2.setHerniaPeriodo(this.getResultSet().getString(9));
                modelMedicamentoTratamento2.setHerniaObs(this.getResultSet().getString(10));
                modelMedicamentoTratamento2.setDoencaEstomago(this.getResultSet().getString(11));
                modelMedicamentoTratamento2.setDoencaEstomagoTipo(this.getResultSet().getString(12));
                modelMedicamentoTratamento2.setDoencaEstomagoPeriodo(this.getResultSet().getString(13));
                modelMedicamentoTratamento2.setDoencaEstomagoObs(this.getResultSet().getString(14));
                modelMedicamentoTratamento2.setDoencaOssos(this.getResultSet().getString(15));
                modelMedicamentoTratamento2.setDoencaOssosTipo(this.getResultSet().getString(16));
                modelMedicamentoTratamento2.setDoencaOssosPeriodo(this.getResultSet().getString(17));
                modelMedicamentoTratamento2.setDoencaOssosObs(this.getResultSet().getString(18));
                modelMedicamentoTratamento2.setDoencaPulmoes(this.getResultSet().getString(19));
                modelMedicamentoTratamento2.setDoencaPulmoesTipo(this.getResultSet().getString(20));
                modelMedicamentoTratamento2.setDoencaPulmoesPeriodo(this.getResultSet().getString(21));
                modelMedicamentoTratamento2.setDoencaPulmoesObs(this.getResultSet().getString(22));
                modelMedicamentoTratamento2.setDoentaAutoimune(this.getResultSet().getString(23));
                modelMedicamentoTratamento2.setDoentaAutoimuneTipo(this.getResultSet().getString(24));
                modelMedicamentoTratamento2.setDoentaAutoimunePeriodo(this.getResultSet().getString(25));
                modelMedicamentoTratamento2.setDoentaAutoimuneObs(this.getResultSet().getString(26));
                modelMedicamentoTratamento2.setCancer(this.getResultSet().getString(27));
                modelMedicamentoTratamento2.setCancerTipo(this.getResultSet().getString(28));
                modelMedicamentoTratamento2.setCancerPeriodo(this.getResultSet().getString(29));
                modelMedicamentoTratamento2.setCancerObs(this.getResultSet().getString(30));
                modelMedicamentoTratamento2.setFeridasTumores(this.getResultSet().getString(31));
                modelMedicamentoTratamento2.setFeridasTumoresTipo(this.getResultSet().getString(32));
                modelMedicamentoTratamento2.setFeridasTumoresPeriodo(this.getResultSet().getString(33));
                modelMedicamentoTratamento2.setFeridasTumoresObs(this.getResultSet().getString(34));
                listamodelMedicamentoTratamento2.add(modelMedicamentoTratamento2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelMedicamentoTratamento2;
    }

    /**
     * atualiza MedicamentoTratamento2
     *
     * @param pMedicamentoTratamento2Model return boolean
     * @return
     */
    public boolean atualizarMedicamentoTratamento2DAO(MedicamentoTratamento2Model pMedicamentoTratamento2Model) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_medicamento_tratamento_2 SET "
                    + "pk_id_medicamento_tratamento_2 = '" + pMedicamentoTratamento2Model.getIdMedicamentoTratamento2() + "',"
                    + "fk_paciente = '" + pMedicamentoTratamento2Model.getPaciente() + "',"
                    + "alergias = '" + pMedicamentoTratamento2Model.getAlergias() + "',"
                    + "alergias_tipo = '" + pMedicamentoTratamento2Model.getAlergiasTipo() + "',"
                    + "alergias_periodo = '" + pMedicamentoTratamento2Model.getAlergiasPeriodo() + "',"
                    + "alergias_obs = '" + pMedicamentoTratamento2Model.getAlergiasObs() + "',"
                    + "hernia = '" + pMedicamentoTratamento2Model.getHernia() + "',"
                    + "hernia_tipo = '" + pMedicamentoTratamento2Model.getHerniaTipo() + "',"
                    + "hernia_periodo = '" + pMedicamentoTratamento2Model.getHerniaPeriodo() + "',"
                    + "hernia_obs = '" + pMedicamentoTratamento2Model.getHerniaObs() + "',"
                    + "doenca_estomago = '" + pMedicamentoTratamento2Model.getDoencaEstomago() + "',"
                    + "doenca_estomago_tipo = '" + pMedicamentoTratamento2Model.getDoencaEstomagoTipo() + "',"
                    + "doenca_estomago_periodo = '" + pMedicamentoTratamento2Model.getDoencaEstomagoPeriodo() + "',"
                    + "doenca_estomago_obs = '" + pMedicamentoTratamento2Model.getDoencaEstomagoObs() + "',"
                    + "doenca_ossos = '" + pMedicamentoTratamento2Model.getDoencaOssos() + "',"
                    + "doenca_ossos_tipo = '" + pMedicamentoTratamento2Model.getDoencaOssosTipo() + "',"
                    + "doenca_ossos_periodo = '" + pMedicamentoTratamento2Model.getDoencaOssosPeriodo() + "',"
                    + "doenca_ossos_obs = '" + pMedicamentoTratamento2Model.getDoencaOssosObs() + "',"
                    + "doenca_pulmoes = '" + pMedicamentoTratamento2Model.getDoencaPulmoes() + "',"
                    + "doenca_pulmoes_tipo = '" + pMedicamentoTratamento2Model.getDoencaPulmoesTipo() + "',"
                    + "doenca_pulmoes_periodo = '" + pMedicamentoTratamento2Model.getDoencaPulmoesPeriodo() + "',"
                    + "doenca_pulmoes_obs = '" + pMedicamentoTratamento2Model.getDoencaPulmoesObs() + "',"
                    + "doenta_autoimune = '" + pMedicamentoTratamento2Model.getDoentaAutoimune() + "',"
                    + "doenta_autoimune_tipo = '" + pMedicamentoTratamento2Model.getDoentaAutoimuneTipo() + "',"
                    + "doenta_autoimune_periodo = '" + pMedicamentoTratamento2Model.getDoentaAutoimunePeriodo() + "',"
                    + "doenta_autoimune_obs = '" + pMedicamentoTratamento2Model.getDoentaAutoimuneObs() + "',"
                    + "cancer = '" + pMedicamentoTratamento2Model.getCancer() + "',"
                    + "cancer_tipo = '" + pMedicamentoTratamento2Model.getCancerTipo() + "',"
                    + "cancer_periodo = '" + pMedicamentoTratamento2Model.getCancerPeriodo() + "',"
                    + "cancer_obs = '" + pMedicamentoTratamento2Model.getCancerObs() + "',"
                    + "feridas_tumores = '" + pMedicamentoTratamento2Model.getFeridasTumores() + "',"
                    + "feridas_tumores_tipo = '" + pMedicamentoTratamento2Model.getFeridasTumoresTipo() + "',"
                    + "feridas_tumores_periodo = '" + pMedicamentoTratamento2Model.getFeridasTumoresPeriodo() + "',"
                    + "feridas_tumores_obs = '" + pMedicamentoTratamento2Model.getFeridasTumoresObs() + "'"
                    + " WHERE "
                    + "pk_id_medicamento_tratamento_2 = '" + pMedicamentoTratamento2Model.getIdMedicamentoTratamento2() + "'"
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
     * exclui MedicamentoTratamento2
     *
     * @param pIdMedicamentoTratamento2 return boolean
     * @return
     */
    public boolean excluirMedicamentoTratamento2DAO(int pIdMedicamentoTratamento2) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_medicamento_tratamento_2 "
                    + " WHERE "
                    + "pk_id_medicamento_tratamento_2 = '" + pIdMedicamentoTratamento2 + "'"
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
