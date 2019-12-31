package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.MedicamentoTratamentoModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class MedicamentoTratamentoDAO extends SisgeteConnectionMySql {

    /**
     * grava MedicamentoTratamento
     *
     * @param modelMedicamentoTratamento return int
     * @return
     */
    public int salvarMedicamentoTratamentoDAO(MedicamentoTratamentoModel modelMedicamentoTratamento) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_medicamento_tratamento ("
                    + "pk_id_medicamento_tratamento,"
                    + "fk_paciente,"
                    + "remedio_controlado,"
                    + "remedio_controlado_tipo,"
                    + "remedio_controlado_periodo,"
                    + "remedio_controlado_obs,"
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
                    + "fumo_obs,"
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
                    + "doenca_autoimune,"
                    + "doenca_autoimune_tipo,"
                    + "doenca_autoimune_periodo,"
                    + "doenca_autoimune_obs,"
                    + "cancer,"
                    + "cancer_tipo,"
                    + "cancer_periodo,"
                    + "cancer_obs,"
                    + "feridas_tumores,"
                    + "feridas_tumores_tipo,"
                    + "feridas_tumores_periodo,"
                    + "feridas_tumores_obs"
                    + ") VALUES ("
                    + "'" + modelMedicamentoTratamento.getIdMedicamentoTratamento() + "',"
                    + "'" + modelMedicamentoTratamento.getIdPaciente() + "',"
                    + "'" + modelMedicamentoTratamento.getRemedio() + "',"
                    + "'" + modelMedicamentoTratamento.getRemedioTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getRemedioPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getRemedioObs() + "',"
                    + "'" + modelMedicamentoTratamento.getDengue() + "',"
                    + "'" + modelMedicamentoTratamento.getDengueTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getDenguePeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getDengueObs() + "',"
                    + "'" + modelMedicamentoTratamento.getHepatite() + "',"
                    + "'" + modelMedicamentoTratamento.getHepatiteTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getHepatitePeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getHepatiteObs() + "',"
                    + "'" + modelMedicamentoTratamento.getHipertensao() + "',"
                    + "'" + modelMedicamentoTratamento.getHipertensaoTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getHipertensaoPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getHipertensaoObs() + "',"
                    + "'" + modelMedicamentoTratamento.getDiabetes() + "',"
                    + "'" + modelMedicamentoTratamento.getDiabetesTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getDiabetesPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getDiabetesObs() + "',"
                    + "'" + modelMedicamentoTratamento.getUsoParacetamol() + "',"
                    + "'" + modelMedicamentoTratamento.getUsoParacetamolTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getUsoParacetamolPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getUsoParacetamolObs() + "',"
                    + "'" + modelMedicamentoTratamento.getAlcool() + "',"
                    + "'" + modelMedicamentoTratamento.getAlcoolTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getAlcoolPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getAlcoolObs() + "',"
                    + "'" + modelMedicamentoTratamento.getFumo() + "',"
                    + "'" + modelMedicamentoTratamento.getFumoTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getFumoPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getFumoObs() + "',"
                    + "'" + modelMedicamentoTratamento.getAlergias() + "',"
                    + "'" + modelMedicamentoTratamento.getAlergiasTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getAlergiasPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getAlergiasObs() + "',"
                    + "'" + modelMedicamentoTratamento.getHernia() + "',"
                    + "'" + modelMedicamentoTratamento.getHerniaTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getHerniaPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getHerniaObs() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaEstomago() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaEstomagoTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaEstomagoPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaEstomagoObs() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaOssos() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaOssosTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaOssosPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaOssosObs() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaPulmoes() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaPulmoesTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaPulmoesPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaPulmoesObs() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaAutoimune() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaAutoimuneTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaAutoimunePeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getDoencaAutoimuneObs() + "',"
                    + "'" + modelMedicamentoTratamento.getCancer() + "',"
                    + "'" + modelMedicamentoTratamento.getCancerTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getCancerPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getCancerObs() + "',"
                    + "'" + modelMedicamentoTratamento.getFeridasTumores() + "',"
                    + "'" + modelMedicamentoTratamento.getFeridasTumoresTipo() + "',"
                    + "'" + modelMedicamentoTratamento.getFeridasTumoresPeriodo() + "',"
                    + "'" + modelMedicamentoTratamento.getFeridasTumoresObs() + "'"
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
     * recupera MedicamentoTratamento
     *
     * @param pIdMedicamentoTratamento return MedicamentoTratamentoModel
     * @return
     */
    public MedicamentoTratamentoModel getMedicamentoTratamentoDAO(int pIdMedicamentoTratamento) {
        MedicamentoTratamentoModel modelMedicamentoTratamento = new MedicamentoTratamentoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT  * FROM tbl_medicamento_tratamento WHERE pk_id_medicamento_tratamento = '"
                    + pIdMedicamentoTratamento + "'" + ";"
            );

            while (this.getResultSet().next()) {
                modelMedicamentoTratamento.setIdMedicamentoTratamento(this.getResultSet().getInt(1));
                modelMedicamentoTratamento.setIdPaciente(this.getResultSet().getInt(2));
                modelMedicamentoTratamento.setRemedio(this.getResultSet().getString(3));
                modelMedicamentoTratamento.setRemedioTipo(this.getResultSet().getString(4));
                modelMedicamentoTratamento.setRemedioPeriodo(this.getResultSet().getString(5));
                modelMedicamentoTratamento.setRemedioObs(this.getResultSet().getString(6));
                modelMedicamentoTratamento.setDengue(this.getResultSet().getString(7));
                modelMedicamentoTratamento.setDengueTipo(this.getResultSet().getString(8));
                modelMedicamentoTratamento.setDenguePeriodo(this.getResultSet().getString(9));
                modelMedicamentoTratamento.setDengueObs(this.getResultSet().getString(10));
                modelMedicamentoTratamento.setHepatite(this.getResultSet().getString(11));
                modelMedicamentoTratamento.setHepatiteTipo(this.getResultSet().getString(12));
                modelMedicamentoTratamento.setHepatitePeriodo(this.getResultSet().getString(13));
                modelMedicamentoTratamento.setHepatiteObs(this.getResultSet().getString(14));
                modelMedicamentoTratamento.setHipertensao(this.getResultSet().getString(15));
                modelMedicamentoTratamento.setHipertensaoTipo(this.getResultSet().getString(16));
                modelMedicamentoTratamento.setHipertensaoPeriodo(this.getResultSet().getString(17));
                modelMedicamentoTratamento.setHipertensaoObs(this.getResultSet().getString(18));
                modelMedicamentoTratamento.setDiabetes(this.getResultSet().getString(19));
                modelMedicamentoTratamento.setDiabetesTipo(this.getResultSet().getString(20));
                modelMedicamentoTratamento.setDiabetesPeriodo(this.getResultSet().getString(21));
                modelMedicamentoTratamento.setDiabetesObs(this.getResultSet().getString(22));
                modelMedicamentoTratamento.setUsoParacetamol(this.getResultSet().getString(23));
                modelMedicamentoTratamento.setUsoParacetamolTipo(this.getResultSet().getString(24));
                modelMedicamentoTratamento.setUsoParacetamolPeriodo(this.getResultSet().getString(25));
                modelMedicamentoTratamento.setUsoParacetamolObs(this.getResultSet().getString(26));
                modelMedicamentoTratamento.setAlcool(this.getResultSet().getString(27));
                modelMedicamentoTratamento.setAlcoolTipo(this.getResultSet().getString(28));
                modelMedicamentoTratamento.setAlcoolPeriodo(this.getResultSet().getString(29));
                modelMedicamentoTratamento.setAlcoolObs(this.getResultSet().getString(30));
                modelMedicamentoTratamento.setFumo(this.getResultSet().getString(31));
                modelMedicamentoTratamento.setFumoTipo(this.getResultSet().getString(32));
                modelMedicamentoTratamento.setFumoPeriodo(this.getResultSet().getString(33));
                modelMedicamentoTratamento.setFumoObs(this.getResultSet().getString(34));
                modelMedicamentoTratamento.setAlergias(this.getResultSet().getString(35));
                modelMedicamentoTratamento.setAlergiasTipo(this.getResultSet().getString(36));
                modelMedicamentoTratamento.setAlergiasPeriodo(this.getResultSet().getString(37));
                modelMedicamentoTratamento.setAlergiasObs(this.getResultSet().getString(38));
                modelMedicamentoTratamento.setHernia(this.getResultSet().getString(39));
                modelMedicamentoTratamento.setHerniaTipo(this.getResultSet().getString(40));
                modelMedicamentoTratamento.setHerniaPeriodo(this.getResultSet().getString(41));
                modelMedicamentoTratamento.setHerniaObs(this.getResultSet().getString(42));
                modelMedicamentoTratamento.setDoencaEstomago(this.getResultSet().getString(43));
                modelMedicamentoTratamento.setDoencaEstomagoTipo(this.getResultSet().getString(44));
                modelMedicamentoTratamento.setDoencaEstomagoPeriodo(this.getResultSet().getString(45));
                modelMedicamentoTratamento.setDoencaEstomagoObs(this.getResultSet().getString(46));
                modelMedicamentoTratamento.setDoencaOssos(this.getResultSet().getString(47));
                modelMedicamentoTratamento.setDoencaOssosTipo(this.getResultSet().getString(48));
                modelMedicamentoTratamento.setDoencaOssosPeriodo(this.getResultSet().getString(49));
                modelMedicamentoTratamento.setDoencaOssosObs(this.getResultSet().getString(50));
                modelMedicamentoTratamento.setDoencaPulmoes(this.getResultSet().getString(51));
                modelMedicamentoTratamento.setDoencaPulmoesTipo(this.getResultSet().getString(52));
                modelMedicamentoTratamento.setDoencaPulmoesPeriodo(this.getResultSet().getString(53));
                modelMedicamentoTratamento.setDoencaPulmoesObs(this.getResultSet().getString(54));
                modelMedicamentoTratamento.setDoencaAutoimune(this.getResultSet().getString(55));
                modelMedicamentoTratamento.setDoencaAutoimuneTipo(this.getResultSet().getString(56));
                modelMedicamentoTratamento.setDoencaAutoimunePeriodo(this.getResultSet().getString(57));
                modelMedicamentoTratamento.setDoencaAutoimuneObs(this.getResultSet().getString(58));
                modelMedicamentoTratamento.setCancer(this.getResultSet().getString(59));
                modelMedicamentoTratamento.setCancerTipo(this.getResultSet().getString(60));
                modelMedicamentoTratamento.setCancerPeriodo(this.getResultSet().getString(61));
                modelMedicamentoTratamento.setCancerObs(this.getResultSet().getString(62));
                modelMedicamentoTratamento.setFeridasTumores(this.getResultSet().getString(63));
                modelMedicamentoTratamento.setFeridasTumoresTipo(this.getResultSet().getString(64));
                modelMedicamentoTratamento.setFeridasTumoresPeriodo(this.getResultSet().getString(65));
                modelMedicamentoTratamento.setFeridasTumoresObs(this.getResultSet().getString(66));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelMedicamentoTratamento;
    }

    /**
     * recupera uma lista de MedicamentoTratamento return ArrayList
     *
     * @return
     */
    public ArrayList<MedicamentoTratamentoModel> getListaMedicamentoTratamentoDAO() {
        ArrayList<MedicamentoTratamentoModel> listamodelMedicamentoTratamento = new ArrayList();
        MedicamentoTratamentoModel modelMedicamentoTratamento = new MedicamentoTratamentoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_medicamento_tratamento"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMedicamentoTratamento = new MedicamentoTratamentoModel();
                modelMedicamentoTratamento.setIdMedicamentoTratamento(this.getResultSet().getInt(1));
                modelMedicamentoTratamento.setIdPaciente(this.getResultSet().getInt(2));
                modelMedicamentoTratamento.setRemedio(this.getResultSet().getString(3));
                modelMedicamentoTratamento.setRemedioTipo(this.getResultSet().getString(4));
                modelMedicamentoTratamento.setRemedioPeriodo(this.getResultSet().getString(5));
                modelMedicamentoTratamento.setRemedioObs(this.getResultSet().getString(6));
                modelMedicamentoTratamento.setDengue(this.getResultSet().getString(7));
                modelMedicamentoTratamento.setDengueTipo(this.getResultSet().getString(8));
                modelMedicamentoTratamento.setDenguePeriodo(this.getResultSet().getString(9));
                modelMedicamentoTratamento.setDengueObs(this.getResultSet().getString(10));
                modelMedicamentoTratamento.setHepatite(this.getResultSet().getString(11));
                modelMedicamentoTratamento.setHepatiteTipo(this.getResultSet().getString(12));
                modelMedicamentoTratamento.setHepatitePeriodo(this.getResultSet().getString(13));
                modelMedicamentoTratamento.setHepatiteObs(this.getResultSet().getString(14));
                modelMedicamentoTratamento.setHipertensao(this.getResultSet().getString(15));
                modelMedicamentoTratamento.setHipertensaoTipo(this.getResultSet().getString(16));
                modelMedicamentoTratamento.setHipertensaoPeriodo(this.getResultSet().getString(17));
                modelMedicamentoTratamento.setHipertensaoObs(this.getResultSet().getString(18));
                modelMedicamentoTratamento.setDiabetes(this.getResultSet().getString(19));
                modelMedicamentoTratamento.setDiabetesTipo(this.getResultSet().getString(20));
                modelMedicamentoTratamento.setDiabetesPeriodo(this.getResultSet().getString(21));
                modelMedicamentoTratamento.setDiabetesObs(this.getResultSet().getString(22));
                modelMedicamentoTratamento.setUsoParacetamol(this.getResultSet().getString(23));
                modelMedicamentoTratamento.setUsoParacetamolTipo(this.getResultSet().getString(24));
                modelMedicamentoTratamento.setUsoParacetamolPeriodo(this.getResultSet().getString(25));
                modelMedicamentoTratamento.setUsoParacetamolObs(this.getResultSet().getString(26));
                modelMedicamentoTratamento.setAlcool(this.getResultSet().getString(27));
                modelMedicamentoTratamento.setAlcoolTipo(this.getResultSet().getString(28));
                modelMedicamentoTratamento.setAlcoolPeriodo(this.getResultSet().getString(29));
                modelMedicamentoTratamento.setAlcoolObs(this.getResultSet().getString(30));
                modelMedicamentoTratamento.setFumo(this.getResultSet().getString(31));
                modelMedicamentoTratamento.setFumoTipo(this.getResultSet().getString(32));
                modelMedicamentoTratamento.setFumoPeriodo(this.getResultSet().getString(33));
                modelMedicamentoTratamento.setFumoObs(this.getResultSet().getString(34));
                modelMedicamentoTratamento.setAlergias(this.getResultSet().getString(35));
                modelMedicamentoTratamento.setAlergiasTipo(this.getResultSet().getString(36));
                modelMedicamentoTratamento.setAlergiasPeriodo(this.getResultSet().getString(37));
                modelMedicamentoTratamento.setAlergiasObs(this.getResultSet().getString(38));
                modelMedicamentoTratamento.setHernia(this.getResultSet().getString(39));
                modelMedicamentoTratamento.setHerniaTipo(this.getResultSet().getString(40));
                modelMedicamentoTratamento.setHerniaPeriodo(this.getResultSet().getString(41));
                modelMedicamentoTratamento.setHerniaObs(this.getResultSet().getString(42));
                modelMedicamentoTratamento.setDoencaEstomago(this.getResultSet().getString(43));
                modelMedicamentoTratamento.setDoencaEstomagoTipo(this.getResultSet().getString(44));
                modelMedicamentoTratamento.setDoencaEstomagoPeriodo(this.getResultSet().getString(45));
                modelMedicamentoTratamento.setDoencaEstomagoObs(this.getResultSet().getString(46));
                modelMedicamentoTratamento.setDoencaOssos(this.getResultSet().getString(47));
                modelMedicamentoTratamento.setDoencaOssosTipo(this.getResultSet().getString(48));
                modelMedicamentoTratamento.setDoencaOssosPeriodo(this.getResultSet().getString(49));
                modelMedicamentoTratamento.setDoencaOssosObs(this.getResultSet().getString(50));
                modelMedicamentoTratamento.setDoencaPulmoes(this.getResultSet().getString(51));
                modelMedicamentoTratamento.setDoencaPulmoesTipo(this.getResultSet().getString(52));
                modelMedicamentoTratamento.setDoencaPulmoesPeriodo(this.getResultSet().getString(53));
                modelMedicamentoTratamento.setDoencaPulmoesObs(this.getResultSet().getString(54));
                modelMedicamentoTratamento.setDoencaAutoimune(this.getResultSet().getString(55));
                modelMedicamentoTratamento.setDoencaAutoimuneTipo(this.getResultSet().getString(56));
                modelMedicamentoTratamento.setDoencaAutoimunePeriodo(this.getResultSet().getString(57));
                modelMedicamentoTratamento.setDoencaAutoimuneObs(this.getResultSet().getString(58));
                modelMedicamentoTratamento.setCancer(this.getResultSet().getString(59));
                modelMedicamentoTratamento.setCancerTipo(this.getResultSet().getString(60));
                modelMedicamentoTratamento.setCancerPeriodo(this.getResultSet().getString(61));
                modelMedicamentoTratamento.setCancerObs(this.getResultSet().getString(62));
                modelMedicamentoTratamento.setFeridasTumores(this.getResultSet().getString(63));
                modelMedicamentoTratamento.setFeridasTumoresTipo(this.getResultSet().getString(64));
                modelMedicamentoTratamento.setFeridasTumoresPeriodo(this.getResultSet().getString(65));
                modelMedicamentoTratamento.setFeridasTumoresObs(this.getResultSet().getString(66));
                listamodelMedicamentoTratamento.add(modelMedicamentoTratamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelMedicamentoTratamento;
    }

    /**
     * atualiza MedicamentoTratamento1
     *
     * @param modelMedicamentoTratamento return boolean
     * @return
     */
    public boolean atualizarMedicamentoTratamentoDAO(MedicamentoTratamentoModel modelMedicamentoTratamento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_medicamento_tratamento SET "
                    + "pk_id_medicamento_tratamento = '" + modelMedicamentoTratamento.getIdMedicamentoTratamento() + "',"
                    + "fk_paciente = '" + modelMedicamentoTratamento.getIdPaciente() + "',"
                    + "remedio_controlado = '" + modelMedicamentoTratamento.getRemedio() + "',"
                    + "remedio_controlado_tipo = '" + modelMedicamentoTratamento.getRemedioTipo() + "',"
                    + "remedio_controlado_periodo = '" + modelMedicamentoTratamento.getRemedioPeriodo() + "',"
                    + "remedio_controlado_obs = '" + modelMedicamentoTratamento.getRemedioObs() + "',"
                    + "dengue = '" + modelMedicamentoTratamento.getDengue() + "',"
                    + "dengue_tipo = '" + modelMedicamentoTratamento.getDengueTipo() + "',"
                    + "dengue_periodo = '" + modelMedicamentoTratamento.getDenguePeriodo() + "',"
                    + "dengue_obs = '" + modelMedicamentoTratamento.getDengueObs() + "',"
                    + "hepatite = '" + modelMedicamentoTratamento.getHepatite() + "',"
                    + "hepatite_tipo = '" + modelMedicamentoTratamento.getHepatiteTipo() + "',"
                    + "hepatite_periodo = '" + modelMedicamentoTratamento.getHepatitePeriodo() + "',"
                    + "hepatite_obs = '" + modelMedicamentoTratamento.getHepatiteObs() + "',"
                    + "hipertensao = '" + modelMedicamentoTratamento.getHipertensao() + "',"
                    + "hipertensao_tipo = '" + modelMedicamentoTratamento.getHipertensaoTipo() + "',"
                    + "hipertensao_periodo = '" + modelMedicamentoTratamento.getHipertensaoPeriodo() + "',"
                    + "hipertensao_obs = '" + modelMedicamentoTratamento.getHipertensaoObs() + "',"
                    + "diabetes = '" + modelMedicamentoTratamento.getDiabetes() + "',"
                    + "diabetes_tipo = '" + modelMedicamentoTratamento.getDiabetesTipo() + "',"
                    + "diabetes_periodo = '" + modelMedicamentoTratamento.getDiabetesPeriodo() + "',"
                    + "diabetes_obs = '" + modelMedicamentoTratamento.getDiabetesObs() + "',"
                    + "uso_paracetamol = '" + modelMedicamentoTratamento.getUsoParacetamol() + "',"
                    + "uso_paracetamol_tipo = '" + modelMedicamentoTratamento.getUsoParacetamolTipo() + "',"
                    + "uso_paracetamol_periodo = '" + modelMedicamentoTratamento.getUsoParacetamolPeriodo() + "',"
                    + "uso_paracetamol_obs = '" + modelMedicamentoTratamento.getUsoParacetamolObs() + "',"
                    + "alcool = '" + modelMedicamentoTratamento.getAlcool() + "',"
                    + "alcool_tipo = '" + modelMedicamentoTratamento.getAlcoolTipo() + "',"
                    + "alcool_periodo = '" + modelMedicamentoTratamento.getAlcoolPeriodo() + "',"
                    + "alcool_obs = '" + modelMedicamentoTratamento.getAlcoolObs() + "',"
                    + "fumo = '" + modelMedicamentoTratamento.getFumo() + "',"
                    + "fumo_tipo = '" + modelMedicamentoTratamento.getFumoTipo() + "',"
                    + "fumo_periodo = '" + modelMedicamentoTratamento.getFumoPeriodo() + "',"
                    + "fumo_obs = '" + modelMedicamentoTratamento.getFumoObs() + "',"
                    + "alergias = '" + modelMedicamentoTratamento.getAlergias() + "',"
                    + "alergias_tipo = '" + modelMedicamentoTratamento.getAlergiasTipo() + "',"
                    + "alergias_periodo = '" + modelMedicamentoTratamento.getAlergiasPeriodo() + "',"
                    + "alergias_obs = '" + modelMedicamentoTratamento.getAlergiasObs() + "',"
                    + "hernia = '" + modelMedicamentoTratamento.getHernia() + "',"
                    + "hernia_tipo = '" + modelMedicamentoTratamento.getHerniaTipo() + "',"
                    + "hernia_periodo = '" + modelMedicamentoTratamento.getHerniaPeriodo() + "',"
                    + "hernia_obs = '" + modelMedicamentoTratamento.getHerniaObs() + "',"
                    + "doenca_estomago = '" + modelMedicamentoTratamento.getDoencaEstomago() + "',"
                    + "doenca_estomago_tipo = '" + modelMedicamentoTratamento.getDoencaEstomagoTipo() + "',"
                    + "doenca_estomago_periodo = '" + modelMedicamentoTratamento.getDoencaEstomagoPeriodo() + "',"
                    + "doenca_estomago_obs = '" + modelMedicamentoTratamento.getDoencaEstomagoObs() + "',"
                    + "doenca_ossos = '" + modelMedicamentoTratamento.getDoencaOssos() + "',"
                    + "doenca_ossos_tipo = '" + modelMedicamentoTratamento.getDoencaOssosTipo() + "',"
                    + "doenca_ossos_periodo = '" + modelMedicamentoTratamento.getDoencaOssosPeriodo() + "',"
                    + "doenca_ossos_obs = '" + modelMedicamentoTratamento.getDoencaOssosObs() + "',"
                    + "doenca_pulmoes = '" + modelMedicamentoTratamento.getDoencaPulmoes() + "',"
                    + "doenca_pulmoes_tipo = '" + modelMedicamentoTratamento.getDoencaPulmoesTipo() + "',"
                    + "doenca_pulmoes_periodo = '" + modelMedicamentoTratamento.getDoencaPulmoesPeriodo() + "',"
                    + "doenca_pulmoes_obs = '" + modelMedicamentoTratamento.getDoencaPulmoesObs() + "',"
                    + "doenca_autoimune = '" + modelMedicamentoTratamento.getDoencaAutoimune() + "',"
                    + "doenca_autoimune_tipo = '" + modelMedicamentoTratamento.getDoencaAutoimuneTipo() + "',"
                    + "doenca_autoimune_periodo = '" + modelMedicamentoTratamento.getDoencaAutoimunePeriodo() + "',"
                    + "doenca_autoimune_obs = '" + modelMedicamentoTratamento.getDoencaAutoimuneObs() + "',"
                    + "cancer = '" + modelMedicamentoTratamento.getCancer() + "',"
                    + "cancer_tipo = '" + modelMedicamentoTratamento.getCancerTipo() + "',"
                    + "cancer_periodo = '" + modelMedicamentoTratamento.getCancerPeriodo() + "',"
                    + "cancer_obs = '" + modelMedicamentoTratamento.getCancerObs() + "',"
                    + "feridas_tumores = '" + modelMedicamentoTratamento.getFeridasTumores() + "',"
                    + "feridas_tumores_tipo = '" + modelMedicamentoTratamento.getFeridasTumoresTipo() + "',"
                    + "feridas_tumores_periodo = '" + modelMedicamentoTratamento.getFeridasTumoresPeriodo() + "',"
                    + "feridas_tumores_obs = '" + modelMedicamentoTratamento.getFeridasTumoresObs() + "'"
                    + " WHERE "
                    + "pk_id_medicamento_tratamento = '" + modelMedicamentoTratamento.getIdMedicamentoTratamento() + "'"
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
     * @param pIdMedicamentoTratamento return boolean
     * @return
     */
    public boolean excluirMedicamentoTratamentoDAO(int pIdMedicamentoTratamento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_medicamento_tratamento "
                    + " WHERE "
                    + "pk_id_medicamento_tratamento = '" + pIdMedicamentoTratamento + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean createJoinTable() {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELIMITER"
                    + "CREATE PROCEDURE insert_into_twoTables(`pk_id_paciente` bigint(20) UNSIGNED NOT NULL,\n"
                    + "  `paciente_reincidente` varchar(5) DEFAULT NULL,\n"
                    + "  `data_nascimento` varchar(10) DEFAULT NULL,\n"
                    + "  `status_tratamento` varchar(45) DEFAULT NULL,\n"
                    + "  `modo_desobsessao` varchar(45) DEFAULT NULL COMMENT 'se a desobsessão for indicada, definir se é presencial ou a distância',\n"
                    + "  `acompanhamento_paciente` varchar(45) DEFAULT NULL COMMENT 'acompanhamento (observação) para liberar o paciente ou indicar continuação do tratamento\\n',\n"
                    + "  `rua` varchar(45) DEFAULT NULL,\n"
                    + "  `num_casa` int(11) DEFAULT NULL,\n"
                    + "  `bairro` varchar(45) DEFAULT NULL,\n"
                    + "  `cidade` varchar(45) DEFAULT NULL,\n"
                    + "  `idade` int(11) DEFAULT NULL,\n"
                    + "  `conhecimento_espirita_previo` varchar(5) DEFAULT NULL,\n"
                    + "  `fonte_conhecimento_previo` varchar(45) DEFAULT NULL,\n"
                    + "  `objetivo_tratamento` varchar(45) DEFAULT NULL,\n"
                    + "  `nome` varchar(45) DEFAULT NULL,\n"
                    + "  `sobrenome` varchar(45) DEFAULT NULL,\n"
                    + "  `setor` varchar(5) DEFAULT NULL,\n"
                    + "  `telefone` varchar(15) DEFAULT NULL,\n"
                    + "  `email` varchar(45),`pk_id_medicamento_tratamento` bigint(20) UNSIGNED NOT NULL,\n"
                    + "  `fk_paciente` bigint(20) UNSIGNED NOT NULL,\n"
                    + "  `remedio_controlado` varchar(50) NOT NULL,\n"
                    + "  `remedio_controlado_tipo` varchar(50) NOT NULL,\n"
                    + "  `remedio_controlado_periodo` varchar(50) NOT NULL,\n"
                    + "  `remedio_controlado_obs` varchar(50) NOT NULL,\n"
                    + "  `dengue` varchar(50) NOT NULL,\n"
                    + "  `dengue_tipo` varchar(50) NOT NULL,\n"
                    + "  `dengue_periodo` varchar(50) NOT NULL,\n"
                    + "  `dengue_obs` varchar(50) NOT NULL,\n"
                    + "  `hepatite` varchar(50) NOT NULL,\n"
                    + "  `hepatite_tipo` varchar(50) NOT NULL,\n"
                    + "  `hepatite_periodo` varchar(50) NOT NULL,\n"
                    + "  `hepatite_obs` varchar(50) NOT NULL,\n"
                    + "  `hipertensao` varchar(50) NOT NULL,\n"
                    + "  `hipertensao_tipo` varchar(50) NOT NULL,\n"
                    + "  `hipertensao_periodo` varchar(50) NOT NULL,\n"
                    + "  `hipertensao_obs` varchar(50) NOT NULL,\n"
                    + "  `diabetes` varchar(50) NOT NULL,\n"
                    + "  `diabetes_tipo` varchar(50) NOT NULL,\n"
                    + "  `diabetes_periodo` varchar(50) NOT NULL,\n"
                    + "  `diabetes_obs` varchar(50) NOT NULL,\n"
                    + "  `uso_paracetamol` varchar(50) NOT NULL,\n"
                    + "  `uso_paracetamol_tipo` varchar(50) NOT NULL,\n"
                    + "  `uso_paracetamol_periodo` varchar(50) NOT NULL,\n"
                    + "  `uso_paracetamol_obs` varchar(50) NOT NULL,\n"
                    + "  `alcool` varchar(50) NOT NULL,\n"
                    + "  `alcool_tipo` varchar(50) NOT NULL,\n"
                    + "  `alcool_periodo` varchar(50) NOT NULL,\n"
                    + "  `alcool_obs` varchar(50) NOT NULL,\n"
                    + "  `fumo` varchar(50) NOT NULL,\n"
                    + "  `fumo_tipo` varchar(50) NOT NULL,\n"
                    + "  `fumo_periodo` varchar(50) NOT NULL,\n"
                    + "  `fumo_obs` varchar(50) NOT NULL,\n"
                    + "  `alergias` varchar(50) NOT NULL,\n"
                    + "  `alergias_tipo` varchar(50) NOT NULL,\n"
                    + "  `alergias_periodo` varchar(50) NOT NULL,\n"
                    + "  `alergias_obs` varchar(50) NOT NULL,\n"
                    + "  `hernia` varchar(50) NOT NULL,\n"
                    + "  `hernia_tipo` varchar(50) NOT NULL,\n"
                    + "  `hernia_periodo` varchar(50) NOT NULL,\n"
                    + "  `hernia_obs` varchar(50) NOT NULL,\n"
                    + "  `doenca_estomago` varchar(50) NOT NULL,\n"
                    + "  `doenca_estomago_tipo` varchar(50) NOT NULL,\n"
                    + "  `doenca_estomago_periodo` varchar(50) NOT NULL,\n"
                    + "  `doenca_estomago_obs` varchar(50) NOT NULL,\n"
                    + "  `doenca_ossos` varchar(50) NOT NULL,\n"
                    + "  `doenca_ossos_tipo` varchar(50) NOT NULL,\n"
                    + "  `doenca_ossos_periodo` varchar(50) NOT NULL,\n"
                    + "  `doenca_ossos_obs` varchar(50) NOT NULL,\n"
                    + "  `doenca_autoimune` varchar(50) NOT NULL,\n"
                    + "  `doenca_autoimune_tipo` varchar(50) NOT NULL,\n"
                    + "  `doenca_autoimune_periodo` varchar(50) NOT NULL,\n"
                    + "  `doenca_autoimune_obs` varchar(50) NOT NULL,\n"
                    + "  `cancer` varchar(50) NOT NULL,\n"
                    + "  `cancer_tipo` varchar(50) NOT NULL,\n"
                    + "  `cancer_periodo` varchar(50) NOT NULL,\n"
                    + "  `cancer_obs` varchar(50) NOT NULL,\n"
                    + "  `feridas_tumores` varchar(50) NOT NULL,\n"
                    + "  `feridas_tumores_tipo` varchar(50) NOT NULL,\n"
                    + "  `feridas_tumores_periodo` varchar(50) NOT NULL,\n"
                    + "  `feridas_tumores_obs` varchar(50) NOT NULL,\n"
                    + "  `doenca_pulmoes` varchar(50) NOT NULL,\n"
                    + "  `doenca_pulmoes_tipo` varchar(50) NOT NULL,\n"
                    + "  `doenca_pulmoes_periodo` varchar(50) NOT NULL,\n"
                    + "  `doenca_pulmoes_obs` varchar(50) NOT NULL)\n"
                    + "      BEGIN\n"
                    + "         INSERT INTO tbl_paciente(pk_id_paciente,paciente_reincidente,data_nascimento,status_tratamento,modo_desobsessao,acompanhamento_paciente,rua,num_casa,bairro,cidade,idade,conhecimento_espirita_previo,fonte_conhecimento_espirita,objetivo_tratamento,nome,setor,telefone,email) VALUES(name);\n"
                    + "         INSERT INTO tbl_medicamento_tratamento(pk_id_medicamento_tratamento,fk_paciente,remedio_controlado,remedio_controlado_tipo,remedio_controlado_periodo,remedio_controlado_obs,dengue,dengue_tipo,dengue_periodo,dengue_obs,hepatite,hepatite_tipo,hepatite_periodo,hepatite_obs,hipertensao,hipertensao_tipo,hipertensao_periodo,hipertensao_obs,diabetes,diabetes_tipo,diabetes_periodo,diabetes_obs,uso_paracetamol,uso_paracetamol_tipo,uso_paracetamol_periodo,uso_paracetamol_obs,alcool,alcool_tipo,alcool_periodo,alcool_obs,fumo,fumo_tipo,fumo_periodo,fumo_obs,alergias,alergias_tipo,alergias_periodo,alergias_obs,hernia,hernia_tipo,hernia_periodo,hernia_obs,doenca_estomago,doenca_estomago_tipo,doenca_estomago_periodo,doenca_estomago_obs,doenca_ossos,doenca_ossos_tipo,doenca_ossos_periodo,doenca_ossos_obs,doenca_pulmoes,doenca_pulmoes_tipo,doenca_pulmoes_periodo,doenca_pulmoes_obs,doenca_autoimune,doenca_autoimune_tipo,doenca_autoimune_periodo,doenca_autoimune_obs,cancer,cancer_tipo,cancer_periodo,cancer_obs,feridas_tumores,feridas_tumores_tipo,feridas_tumores_periodo,feridas_tumores_obs) VALUES(name,age);\n"
                    + "      END"
                    + "DELIMITER ;"
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
