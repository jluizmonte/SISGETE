package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.PacienteModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class PacienteDAO extends SisgeteConnectionMySql {

    /**
     * grava Paciente
     *
     * @param modelPaciente return int
     * @return
     */
    public int salvarPacienteDAO(PacienteModel modelPaciente) {
        try {
            this.conectar();
            return this.insertSQL(
                    " INSERT INTO tbl_paciente ("
                    + "pk_id_paciente,"
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
                    + "feridas_tumores_obs,"
                    + "paciente_reincidente,"
                    + "data_nascimento,"
                    + "status_tratamento,"
                    + "status_ficha,"
                    + "modo_desobsessao,"
                    + "data_atendimento,"
                    + "atendente,"
                    + "acompanhamento_paciente,"
                    + "rua,"
                    + "num_casa,"
                    + "bairro,"
                    + "cidade,"
                    + "idade,"
                    + "conhecimento_espirita_previo,"
                    + "fonte_conhecimento_espirita,"
                    + "objetivo_tratamento,"
                    + "nome,"
                    + "setor,"
                    + "telefone,"
                    + "email"
                    + ") VALUES ("
                    + "'" + modelPaciente.getIdPaciente() + "',"
                    + "'" + modelPaciente.getRemedio() + "',"
                    + "'" + modelPaciente.getRemedioTipo() + "',"
                    + "'" + modelPaciente.getRemedioPeriodo() + "',"
                    + "'" + modelPaciente.getRemedioObs() + "',"
                    + "'" + modelPaciente.getDengue() + "',"
                    + "'" + modelPaciente.getDengueTipo() + "',"
                    + "'" + modelPaciente.getDenguePeriodo() + "',"
                    + "'" + modelPaciente.getDengueObs() + "',"
                    + "'" + modelPaciente.getHepatite() + "',"
                    + "'" + modelPaciente.getHepatiteTipo() + "',"
                    + "'" + modelPaciente.getHepatitePeriodo() + "',"
                    + "'" + modelPaciente.getHepatiteObs() + "',"
                    + "'" + modelPaciente.getHipertensao() + "',"
                    + "'" + modelPaciente.getHipertensaoTipo() + "',"
                    + "'" + modelPaciente.getHipertensaoPeriodo() + "',"
                    + "'" + modelPaciente.getHipertensaoObs() + "',"
                    + "'" + modelPaciente.getDiabetes() + "',"
                    + "'" + modelPaciente.getDiabetesTipo() + "',"
                    + "'" + modelPaciente.getDiabetesPeriodo() + "',"
                    + "'" + modelPaciente.getDiabetesObs() + "',"
                    + "'" + modelPaciente.getUsoParacetamol() + "',"
                    + "'" + modelPaciente.getUsoParacetamolTipo() + "',"
                    + "'" + modelPaciente.getUsoParacetamolPeriodo() + "',"
                    + "'" + modelPaciente.getUsoParacetamolObs() + "',"
                    + "'" + modelPaciente.getAlcool() + "',"
                    + "'" + modelPaciente.getAlcoolTipo() + "',"
                    + "'" + modelPaciente.getAlcoolPeriodo() + "',"
                    + "'" + modelPaciente.getAlcoolObs() + "',"
                    + "'" + modelPaciente.getFumo() + "',"
                    + "'" + modelPaciente.getFumoTipo() + "',"
                    + "'" + modelPaciente.getFumoPeriodo() + "',"
                    + "'" + modelPaciente.getFumoObs() + "',"
                    + "'" + modelPaciente.getAlergias() + "',"
                    + "'" + modelPaciente.getAlergiasTipo() + "',"
                    + "'" + modelPaciente.getAlergiasPeriodo() + "',"
                    + "'" + modelPaciente.getAlergiasObs() + "',"
                    + "'" + modelPaciente.getHernia() + "',"
                    + "'" + modelPaciente.getHerniaTipo() + "',"
                    + "'" + modelPaciente.getHerniaPeriodo() + "',"
                    + "'" + modelPaciente.getHerniaObs() + "',"
                    + "'" + modelPaciente.getDoencaEstomago() + "',"
                    + "'" + modelPaciente.getDoencaEstomagoTipo() + "',"
                    + "'" + modelPaciente.getDoencaEstomagoPeriodo() + "',"
                    + "'" + modelPaciente.getDoencaEstomagoObs() + "',"
                    + "'" + modelPaciente.getDoencaOssos() + "',"
                    + "'" + modelPaciente.getDoencaOssosTipo() + "',"
                    + "'" + modelPaciente.getDoencaOssosPeriodo() + "',"
                    + "'" + modelPaciente.getDoencaOssosObs() + "',"
                    + "'" + modelPaciente.getDoencaPulmoes() + "',"
                    + "'" + modelPaciente.getDoencaPulmoesTipo() + "',"
                    + "'" + modelPaciente.getDoencaPulmoesPeriodo() + "',"
                    + "'" + modelPaciente.getDoencaPulmoesObs() + "',"
                    + "'" + modelPaciente.getDoencaAutoimune() + "',"
                    + "'" + modelPaciente.getDoencaAutoimuneTipo() + "',"
                    + "'" + modelPaciente.getDoencaAutoimunePeriodo() + "',"
                    + "'" + modelPaciente.getDoencaAutoimuneObs() + "',"
                    + "'" + modelPaciente.getCancer() + "',"
                    + "'" + modelPaciente.getCancerTipo() + "',"
                    + "'" + modelPaciente.getCancerPeriodo() + "',"
                    + "'" + modelPaciente.getCancerObs() + "',"
                    + "'" + modelPaciente.getFeridasTumores() + "',"
                    + "'" + modelPaciente.getFeridasTumoresTipo() + "',"
                    + "'" + modelPaciente.getFeridasTumoresPeriodo() + "',"
                    + "'" + modelPaciente.getFeridasTumoresObs() + "',"
                    + "'" + modelPaciente.getPacienteReincidente() + "',"
                    + "'" + modelPaciente.getDataNascimento() + "',"
                    + "'" + modelPaciente.getStatusTratamento() + "',"
                    + "'" + modelPaciente.getStatusFicha() + "',"
                    + "'" + modelPaciente.getModoDesobsessao() + "',"
                    + "'" + modelPaciente.getDataAtendimento() + "',"
                    + "'" + modelPaciente.getAtendente() + "',"
                    + "'" + modelPaciente.getAcompanhamentoPaciente() + "',"
                    + "'" + modelPaciente.getRua() + "',"
                    + "'" + modelPaciente.getNumCasa() + "',"
                    + "'" + modelPaciente.getBairro() + "',"
                    + "'" + modelPaciente.getCidade() + "',"
                    + "'" + modelPaciente.getIdade() + "',"
                    + "'" + modelPaciente.getConhecimentoEspiritaPrevio() + "',"
                    + "'" + modelPaciente.getFonteConhecimentoEspirita() + "',"
                    + "'" + modelPaciente.getObjetivoTratamento() + "',"
                    + "'" + modelPaciente.getNome() + "',"
                    + "'" + modelPaciente.getSetor() + "',"
                    + "'" + modelPaciente.getTelefone() + "',"
                    + "'" + modelPaciente.getEmail() + "'"
                    + ");"
            );
        } catch (Exception e) {
            System.out.print(e);
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Paciente
     *
     * @param pIdPaciente return PacienteModel
     * @return
     */
    public PacienteModel getPacienteDAO(int pIdPaciente) {
        PacienteModel modelPaciente = new PacienteModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT  * FROM tbl_paciente WHERE pk_id_paciente = '"
                    + pIdPaciente + "'" + ";"
            );

            while (this.getResultSet().next()) {
                modelPaciente.setIdPaciente(this.getResultSet().getInt(1));
                modelPaciente.setRemedio(this.getResultSet().getString(2));
                modelPaciente.setRemedioTipo(this.getResultSet().getString(3));
                modelPaciente.setRemedioPeriodo(this.getResultSet().getString(4));
                modelPaciente.setRemedioObs(this.getResultSet().getString(5));
                modelPaciente.setDengue(this.getResultSet().getString(6));
                modelPaciente.setDengueTipo(this.getResultSet().getString(7));
                modelPaciente.setDenguePeriodo(this.getResultSet().getString(8));
                modelPaciente.setDengueObs(this.getResultSet().getString(9));
                modelPaciente.setHepatite(this.getResultSet().getString(10));
                modelPaciente.setHepatiteTipo(this.getResultSet().getString(11));
                modelPaciente.setHepatitePeriodo(this.getResultSet().getString(12));
                modelPaciente.setHepatiteObs(this.getResultSet().getString(13));
                modelPaciente.setHipertensao(this.getResultSet().getString(14));
                modelPaciente.setHipertensaoTipo(this.getResultSet().getString(15));
                modelPaciente.setHipertensaoPeriodo(this.getResultSet().getString(16));
                modelPaciente.setHipertensaoObs(this.getResultSet().getString(17));
                modelPaciente.setDiabetes(this.getResultSet().getString(18));
                modelPaciente.setDiabetesTipo(this.getResultSet().getString(19));
                modelPaciente.setDiabetesPeriodo(this.getResultSet().getString(20));
                modelPaciente.setDiabetesObs(this.getResultSet().getString(21));
                modelPaciente.setUsoParacetamol(this.getResultSet().getString(22));
                modelPaciente.setUsoParacetamolTipo(this.getResultSet().getString(23));
                modelPaciente.setUsoParacetamolPeriodo(this.getResultSet().getString(24));
                modelPaciente.setUsoParacetamolObs(this.getResultSet().getString(25));
                modelPaciente.setAlcool(this.getResultSet().getString(26));
                modelPaciente.setAlcoolTipo(this.getResultSet().getString(27));
                modelPaciente.setAlcoolPeriodo(this.getResultSet().getString(28));
                modelPaciente.setAlcoolObs(this.getResultSet().getString(29));
                modelPaciente.setFumo(this.getResultSet().getString(30));
                modelPaciente.setFumoTipo(this.getResultSet().getString(31));
                modelPaciente.setFumoPeriodo(this.getResultSet().getString(32));
                modelPaciente.setFumoObs(this.getResultSet().getString(33));
                modelPaciente.setAlergias(this.getResultSet().getString(34));
                modelPaciente.setAlergiasTipo(this.getResultSet().getString(35));
                modelPaciente.setAlergiasPeriodo(this.getResultSet().getString(36));
                modelPaciente.setAlergiasObs(this.getResultSet().getString(37));
                modelPaciente.setHernia(this.getResultSet().getString(38));
                modelPaciente.setHerniaTipo(this.getResultSet().getString(39));
                modelPaciente.setHerniaPeriodo(this.getResultSet().getString(40));
                modelPaciente.setHerniaObs(this.getResultSet().getString(41));
                modelPaciente.setDoencaEstomago(this.getResultSet().getString(42));
                modelPaciente.setDoencaEstomagoTipo(this.getResultSet().getString(43));
                modelPaciente.setDoencaEstomagoPeriodo(this.getResultSet().getString(44));
                modelPaciente.setDoencaEstomagoObs(this.getResultSet().getString(45));
                modelPaciente.setDoencaOssos(this.getResultSet().getString(46));
                modelPaciente.setDoencaOssosTipo(this.getResultSet().getString(47));
                modelPaciente.setDoencaOssosPeriodo(this.getResultSet().getString(48));
                modelPaciente.setDoencaOssosObs(this.getResultSet().getString(49));
                modelPaciente.setDoencaPulmoes(this.getResultSet().getString(50));
                modelPaciente.setDoencaPulmoesTipo(this.getResultSet().getString(51));
                modelPaciente.setDoencaPulmoesPeriodo(this.getResultSet().getString(52));
                modelPaciente.setDoencaPulmoesObs(this.getResultSet().getString(53));
                modelPaciente.setDoencaAutoimune(this.getResultSet().getString(54));
                modelPaciente.setDoencaAutoimuneTipo(this.getResultSet().getString(55));
                modelPaciente.setDoencaAutoimunePeriodo(this.getResultSet().getString(56));
                modelPaciente.setDoencaAutoimuneObs(this.getResultSet().getString(57));
                modelPaciente.setCancer(this.getResultSet().getString(58));
                modelPaciente.setCancerTipo(this.getResultSet().getString(59));
                modelPaciente.setCancerPeriodo(this.getResultSet().getString(60));
                modelPaciente.setCancerObs(this.getResultSet().getString(61));
                modelPaciente.setFeridasTumores(this.getResultSet().getString(62));
                modelPaciente.setFeridasTumoresTipo(this.getResultSet().getString(63));
                modelPaciente.setFeridasTumoresPeriodo(this.getResultSet().getString(64));
                modelPaciente.setFeridasTumoresObs(this.getResultSet().getString(65));
                modelPaciente.setPacienteReincidente(this.getResultSet().getString(66));
                modelPaciente.setDataNascimento(this.getResultSet().getString(67));
                modelPaciente.setStatusTratamento(this.getResultSet().getString(68));
                modelPaciente.setStatusFicha(this.getResultSet().getString(69));
                modelPaciente.setModoDesobsessao(this.getResultSet().getString(70));
                modelPaciente.setDataAtendimento(this.getResultSet().getString(71));
                modelPaciente.setAtendente(this.getResultSet().getString(72));
                modelPaciente.setAcompanhamentoPaciente(this.getResultSet().getString(73));
                modelPaciente.setRua(this.getResultSet().getString(74));
                modelPaciente.setNumCasa(this.getResultSet().getInt(75));
                modelPaciente.setBairro(this.getResultSet().getString(76));
                modelPaciente.setCidade(this.getResultSet().getString(77));
                modelPaciente.setIdade(this.getResultSet().getInt(78));
                modelPaciente.setConhecimentoEspiritaPrevio(this.getResultSet().getString(79));
                modelPaciente.setFonteConhecimentoEspirita(this.getResultSet().getString(80));
                modelPaciente.setObjetivoTratamento(this.getResultSet().getString(81));
                modelPaciente.setNome(this.getResultSet().getString(82));
                modelPaciente.setSetor(this.getResultSet().getString(83));
                modelPaciente.setTelefone(this.getResultSet().getString(84));
                modelPaciente.setEmail(this.getResultSet().getString(85));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelPaciente;
    }

    /**
     * recupera Paciente
     *
     * @param pPaciente return PacienteModel
     * @return
     */
    public PacienteModel getPacienteDAO(String pPaciente) {
        PacienteModel modelPaciente = new PacienteModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT  * FROM tbl_paciente WHERE nome = '"
                    + pPaciente + "'" + ";"
            );

            while (this.getResultSet().next()) {
                modelPaciente.setIdPaciente(this.getResultSet().getInt(1));
                modelPaciente.setRemedio(this.getResultSet().getString(2));
                modelPaciente.setRemedioTipo(this.getResultSet().getString(3));
                modelPaciente.setRemedioPeriodo(this.getResultSet().getString(4));
                modelPaciente.setRemedioObs(this.getResultSet().getString(5));
                modelPaciente.setDengue(this.getResultSet().getString(6));
                modelPaciente.setDengueTipo(this.getResultSet().getString(7));
                modelPaciente.setDenguePeriodo(this.getResultSet().getString(8));
                modelPaciente.setDengueObs(this.getResultSet().getString(9));
                modelPaciente.setHepatite(this.getResultSet().getString(10));
                modelPaciente.setHepatiteTipo(this.getResultSet().getString(11));
                modelPaciente.setHepatitePeriodo(this.getResultSet().getString(12));
                modelPaciente.setHepatiteObs(this.getResultSet().getString(13));
                modelPaciente.setHipertensao(this.getResultSet().getString(14));
                modelPaciente.setHipertensaoTipo(this.getResultSet().getString(15));
                modelPaciente.setHipertensaoPeriodo(this.getResultSet().getString(16));
                modelPaciente.setHipertensaoObs(this.getResultSet().getString(17));
                modelPaciente.setDiabetes(this.getResultSet().getString(18));
                modelPaciente.setDiabetesTipo(this.getResultSet().getString(19));
                modelPaciente.setDiabetesPeriodo(this.getResultSet().getString(20));
                modelPaciente.setDiabetesObs(this.getResultSet().getString(21));
                modelPaciente.setUsoParacetamol(this.getResultSet().getString(22));
                modelPaciente.setUsoParacetamolTipo(this.getResultSet().getString(23));
                modelPaciente.setUsoParacetamolPeriodo(this.getResultSet().getString(24));
                modelPaciente.setUsoParacetamolObs(this.getResultSet().getString(25));
                modelPaciente.setAlcool(this.getResultSet().getString(26));
                modelPaciente.setAlcoolTipo(this.getResultSet().getString(27));
                modelPaciente.setAlcoolPeriodo(this.getResultSet().getString(28));
                modelPaciente.setAlcoolObs(this.getResultSet().getString(29));
                modelPaciente.setFumo(this.getResultSet().getString(30));
                modelPaciente.setFumoTipo(this.getResultSet().getString(31));
                modelPaciente.setFumoPeriodo(this.getResultSet().getString(32));
                modelPaciente.setFumoObs(this.getResultSet().getString(33));
                modelPaciente.setAlergias(this.getResultSet().getString(34));
                modelPaciente.setAlergiasTipo(this.getResultSet().getString(35));
                modelPaciente.setAlergiasPeriodo(this.getResultSet().getString(36));
                modelPaciente.setAlergiasObs(this.getResultSet().getString(37));
                modelPaciente.setHernia(this.getResultSet().getString(38));
                modelPaciente.setHerniaTipo(this.getResultSet().getString(39));
                modelPaciente.setHerniaPeriodo(this.getResultSet().getString(40));
                modelPaciente.setHerniaObs(this.getResultSet().getString(41));
                modelPaciente.setDoencaEstomago(this.getResultSet().getString(42));
                modelPaciente.setDoencaEstomagoTipo(this.getResultSet().getString(43));
                modelPaciente.setDoencaEstomagoPeriodo(this.getResultSet().getString(44));
                modelPaciente.setDoencaEstomagoObs(this.getResultSet().getString(45));
                modelPaciente.setDoencaOssos(this.getResultSet().getString(46));
                modelPaciente.setDoencaOssosTipo(this.getResultSet().getString(47));
                modelPaciente.setDoencaOssosPeriodo(this.getResultSet().getString(48));
                modelPaciente.setDoencaOssosObs(this.getResultSet().getString(49));
                modelPaciente.setDoencaPulmoes(this.getResultSet().getString(50));
                modelPaciente.setDoencaPulmoesTipo(this.getResultSet().getString(51));
                modelPaciente.setDoencaPulmoesPeriodo(this.getResultSet().getString(52));
                modelPaciente.setDoencaPulmoesObs(this.getResultSet().getString(53));
                modelPaciente.setDoencaAutoimune(this.getResultSet().getString(54));
                modelPaciente.setDoencaAutoimuneTipo(this.getResultSet().getString(55));
                modelPaciente.setDoencaAutoimunePeriodo(this.getResultSet().getString(56));
                modelPaciente.setDoencaAutoimuneObs(this.getResultSet().getString(57));
                modelPaciente.setCancer(this.getResultSet().getString(58));
                modelPaciente.setCancerTipo(this.getResultSet().getString(59));
                modelPaciente.setCancerPeriodo(this.getResultSet().getString(60));
                modelPaciente.setCancerObs(this.getResultSet().getString(61));
                modelPaciente.setFeridasTumores(this.getResultSet().getString(62));
                modelPaciente.setFeridasTumoresTipo(this.getResultSet().getString(63));
                modelPaciente.setFeridasTumoresPeriodo(this.getResultSet().getString(64));
                modelPaciente.setFeridasTumoresObs(this.getResultSet().getString(65));
                modelPaciente.setPacienteReincidente(this.getResultSet().getString(66));
                modelPaciente.setDataNascimento(this.getResultSet().getString(67));
                modelPaciente.setStatusTratamento(this.getResultSet().getString(68));
                modelPaciente.setStatusFicha(this.getResultSet().getString(69));
                modelPaciente.setModoDesobsessao(this.getResultSet().getString(70));
                modelPaciente.setDataAtendimento(this.getResultSet().getString(71));
                modelPaciente.setAtendente(this.getResultSet().getString(72));
                modelPaciente.setAcompanhamentoPaciente(this.getResultSet().getString(73));
                modelPaciente.setRua(this.getResultSet().getString(74));
                modelPaciente.setNumCasa(this.getResultSet().getInt(75));
                modelPaciente.setBairro(this.getResultSet().getString(76));
                modelPaciente.setCidade(this.getResultSet().getString(77));
                modelPaciente.setIdade(this.getResultSet().getInt(78));
                modelPaciente.setConhecimentoEspiritaPrevio(this.getResultSet().getString(79));
                modelPaciente.setFonteConhecimentoEspirita(this.getResultSet().getString(80));
                modelPaciente.setObjetivoTratamento(this.getResultSet().getString(81));
                modelPaciente.setNome(this.getResultSet().getString(82));
                modelPaciente.setSetor(this.getResultSet().getString(83));
                modelPaciente.setTelefone(this.getResultSet().getString(84));
                modelPaciente.setEmail(this.getResultSet().getString(85));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelPaciente;
    }

    /**
     * recupera uma lista de Paciente return ArrayList
     *
     * @return
     */
    public ArrayList<PacienteModel> getListaPacienteDAO() {
        ArrayList<PacienteModel> listamodelPaciente = new ArrayList();
        PacienteModel modelPaciente = new PacienteModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_paciente;"
            );

            while (this.getResultSet().next()) {
                modelPaciente = new PacienteModel();
                modelPaciente.setIdPaciente(this.getResultSet().getInt(1));
                modelPaciente.setRemedio(this.getResultSet().getString(2));
                modelPaciente.setRemedioTipo(this.getResultSet().getString(3));
                modelPaciente.setRemedioPeriodo(this.getResultSet().getString(4));
                modelPaciente.setRemedioObs(this.getResultSet().getString(5));
                modelPaciente.setDengue(this.getResultSet().getString(6));
                modelPaciente.setDengueTipo(this.getResultSet().getString(7));
                modelPaciente.setDenguePeriodo(this.getResultSet().getString(8));
                modelPaciente.setDengueObs(this.getResultSet().getString(9));
                modelPaciente.setHepatite(this.getResultSet().getString(10));
                modelPaciente.setHepatiteTipo(this.getResultSet().getString(11));
                modelPaciente.setHepatitePeriodo(this.getResultSet().getString(12));
                modelPaciente.setHepatiteObs(this.getResultSet().getString(13));
                modelPaciente.setHipertensao(this.getResultSet().getString(14));
                modelPaciente.setHipertensaoTipo(this.getResultSet().getString(15));
                modelPaciente.setHipertensaoPeriodo(this.getResultSet().getString(16));
                modelPaciente.setHipertensaoObs(this.getResultSet().getString(17));
                modelPaciente.setDiabetes(this.getResultSet().getString(18));
                modelPaciente.setDiabetesTipo(this.getResultSet().getString(19));
                modelPaciente.setDiabetesPeriodo(this.getResultSet().getString(20));
                modelPaciente.setDiabetesObs(this.getResultSet().getString(21));
                modelPaciente.setUsoParacetamol(this.getResultSet().getString(22));
                modelPaciente.setUsoParacetamolTipo(this.getResultSet().getString(23));
                modelPaciente.setUsoParacetamolPeriodo(this.getResultSet().getString(24));
                modelPaciente.setUsoParacetamolObs(this.getResultSet().getString(25));
                modelPaciente.setAlcool(this.getResultSet().getString(26));
                modelPaciente.setAlcoolTipo(this.getResultSet().getString(27));
                modelPaciente.setAlcoolPeriodo(this.getResultSet().getString(28));
                modelPaciente.setAlcoolObs(this.getResultSet().getString(29));
                modelPaciente.setFumo(this.getResultSet().getString(30));
                modelPaciente.setFumoTipo(this.getResultSet().getString(31));
                modelPaciente.setFumoPeriodo(this.getResultSet().getString(32));
                modelPaciente.setFumoObs(this.getResultSet().getString(33));
                modelPaciente.setAlergias(this.getResultSet().getString(34));
                modelPaciente.setAlergiasTipo(this.getResultSet().getString(35));
                modelPaciente.setAlergiasPeriodo(this.getResultSet().getString(36));
                modelPaciente.setAlergiasObs(this.getResultSet().getString(37));
                modelPaciente.setHernia(this.getResultSet().getString(38));
                modelPaciente.setHerniaTipo(this.getResultSet().getString(39));
                modelPaciente.setHerniaPeriodo(this.getResultSet().getString(40));
                modelPaciente.setHerniaObs(this.getResultSet().getString(41));
                modelPaciente.setDoencaEstomago(this.getResultSet().getString(42));
                modelPaciente.setDoencaEstomagoTipo(this.getResultSet().getString(43));
                modelPaciente.setDoencaEstomagoPeriodo(this.getResultSet().getString(44));
                modelPaciente.setDoencaEstomagoObs(this.getResultSet().getString(45));
                modelPaciente.setDoencaOssos(this.getResultSet().getString(46));
                modelPaciente.setDoencaOssosTipo(this.getResultSet().getString(47));
                modelPaciente.setDoencaOssosPeriodo(this.getResultSet().getString(48));
                modelPaciente.setDoencaOssosObs(this.getResultSet().getString(49));
                modelPaciente.setDoencaPulmoes(this.getResultSet().getString(50));
                modelPaciente.setDoencaPulmoesTipo(this.getResultSet().getString(51));
                modelPaciente.setDoencaPulmoesPeriodo(this.getResultSet().getString(52));
                modelPaciente.setDoencaPulmoesObs(this.getResultSet().getString(53));
                modelPaciente.setDoencaAutoimune(this.getResultSet().getString(54));
                modelPaciente.setDoencaAutoimuneTipo(this.getResultSet().getString(55));
                modelPaciente.setDoencaAutoimunePeriodo(this.getResultSet().getString(56));
                modelPaciente.setDoencaAutoimuneObs(this.getResultSet().getString(57));
                modelPaciente.setCancer(this.getResultSet().getString(58));
                modelPaciente.setCancerTipo(this.getResultSet().getString(59));
                modelPaciente.setCancerPeriodo(this.getResultSet().getString(60));
                modelPaciente.setCancerObs(this.getResultSet().getString(61));
                modelPaciente.setFeridasTumores(this.getResultSet().getString(62));
                modelPaciente.setFeridasTumoresTipo(this.getResultSet().getString(63));
                modelPaciente.setFeridasTumoresPeriodo(this.getResultSet().getString(64));
                modelPaciente.setFeridasTumoresObs(this.getResultSet().getString(65));
                modelPaciente.setPacienteReincidente(this.getResultSet().getString(66));
                modelPaciente.setDataNascimento(this.getResultSet().getString(67));
                modelPaciente.setStatusTratamento(this.getResultSet().getString(68));
                modelPaciente.setStatusFicha(this.getResultSet().getString(69));
                modelPaciente.setModoDesobsessao(this.getResultSet().getString(70));
                modelPaciente.setDataAtendimento(this.getResultSet().getString(71));
                modelPaciente.setAtendente(this.getResultSet().getString(72));
                modelPaciente.setAcompanhamentoPaciente(this.getResultSet().getString(73));
                modelPaciente.setRua(this.getResultSet().getString(74));
                modelPaciente.setNumCasa(this.getResultSet().getInt(75));
                modelPaciente.setBairro(this.getResultSet().getString(76));
                modelPaciente.setCidade(this.getResultSet().getString(77));
                modelPaciente.setIdade(this.getResultSet().getInt(78));
                modelPaciente.setConhecimentoEspiritaPrevio(this.getResultSet().getString(79));
                modelPaciente.setFonteConhecimentoEspirita(this.getResultSet().getString(80));
                modelPaciente.setObjetivoTratamento(this.getResultSet().getString(81));
                modelPaciente.setNome(this.getResultSet().getString(82));
                modelPaciente.setSetor(this.getResultSet().getString(83));
                modelPaciente.setTelefone(this.getResultSet().getString(84));
                modelPaciente.setEmail(this.getResultSet().getString(85));
                listamodelPaciente.add(modelPaciente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelPaciente;
    }

    /**
     * atualiza Paciente1
     *
     * @param modelPaciente return boolean
     * @return
     */
    public boolean atualizarPacienteDAO(PacienteModel modelPaciente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_paciente SET "
                    + "pk_id_paciente = '" + modelPaciente.getIdPaciente() + "',"
                    + "remedio_controlado = '" + modelPaciente.getRemedio() + "',"
                    + "remedio_controlado_tipo = '" + modelPaciente.getRemedioTipo() + "',"
                    + "remedio_controlado_periodo = '" + modelPaciente.getRemedioPeriodo() + "',"
                    + "remedio_controlado_obs = '" + modelPaciente.getRemedioObs() + "',"
                    + "dengue = '" + modelPaciente.getDengue() + "',"
                    + "dengue_tipo = '" + modelPaciente.getDengueTipo() + "',"
                    + "dengue_periodo = '" + modelPaciente.getDenguePeriodo() + "',"
                    + "dengue_obs = '" + modelPaciente.getDengueObs() + "',"
                    + "hepatite = '" + modelPaciente.getHepatite() + "',"
                    + "hepatite_tipo = '" + modelPaciente.getHepatiteTipo() + "',"
                    + "hepatite_periodo = '" + modelPaciente.getHepatitePeriodo() + "',"
                    + "hepatite_obs = '" + modelPaciente.getHepatiteObs() + "',"
                    + "hipertensao = '" + modelPaciente.getHipertensao() + "',"
                    + "hipertensao_tipo = '" + modelPaciente.getHipertensaoTipo() + "',"
                    + "hipertensao_periodo = '" + modelPaciente.getHipertensaoPeriodo() + "',"
                    + "hipertensao_obs = '" + modelPaciente.getHipertensaoObs() + "',"
                    + "diabetes = '" + modelPaciente.getDiabetes() + "',"
                    + "diabetes_tipo = '" + modelPaciente.getDiabetesTipo() + "',"
                    + "diabetes_periodo = '" + modelPaciente.getDiabetesPeriodo() + "',"
                    + "diabetes_obs = '" + modelPaciente.getDiabetesObs() + "',"
                    + "uso_paracetamol = '" + modelPaciente.getUsoParacetamol() + "',"
                    + "uso_paracetamol_tipo = '" + modelPaciente.getUsoParacetamolTipo() + "',"
                    + "uso_paracetamol_periodo = '" + modelPaciente.getUsoParacetamolPeriodo() + "',"
                    + "uso_paracetamol_obs = '" + modelPaciente.getUsoParacetamolObs() + "',"
                    + "alcool = '" + modelPaciente.getAlcool() + "',"
                    + "alcool_tipo = '" + modelPaciente.getAlcoolTipo() + "',"
                    + "alcool_periodo = '" + modelPaciente.getAlcoolPeriodo() + "',"
                    + "alcool_obs = '" + modelPaciente.getAlcoolObs() + "',"
                    + "fumo = '" + modelPaciente.getFumo() + "',"
                    + "fumo_tipo = '" + modelPaciente.getFumoTipo() + "',"
                    + "fumo_periodo = '" + modelPaciente.getFumoPeriodo() + "',"
                    + "fumo_obs = '" + modelPaciente.getFumoObs() + "',"
                    + "alergias = '" + modelPaciente.getAlergias() + "',"
                    + "alergias_tipo = '" + modelPaciente.getAlergiasTipo() + "',"
                    + "alergias_periodo = '" + modelPaciente.getAlergiasPeriodo() + "',"
                    + "alergias_obs = '" + modelPaciente.getAlergiasObs() + "',"
                    + "hernia = '" + modelPaciente.getHernia() + "',"
                    + "hernia_tipo = '" + modelPaciente.getHerniaTipo() + "',"
                    + "hernia_periodo = '" + modelPaciente.getHerniaPeriodo() + "',"
                    + "hernia_obs = '" + modelPaciente.getHerniaObs() + "',"
                    + "doenca_estomago = '" + modelPaciente.getDoencaEstomago() + "',"
                    + "doenca_estomago_tipo = '" + modelPaciente.getDoencaEstomagoTipo() + "',"
                    + "doenca_estomago_periodo = '" + modelPaciente.getDoencaEstomagoPeriodo() + "',"
                    + "doenca_estomago_obs = '" + modelPaciente.getDoencaEstomagoObs() + "',"
                    + "doenca_ossos = '" + modelPaciente.getDoencaOssos() + "',"
                    + "doenca_ossos_tipo = '" + modelPaciente.getDoencaOssosTipo() + "',"
                    + "doenca_ossos_periodo = '" + modelPaciente.getDoencaOssosPeriodo() + "',"
                    + "doenca_ossos_obs = '" + modelPaciente.getDoencaOssosObs() + "',"
                    + "doenca_pulmoes = '" + modelPaciente.getDoencaPulmoes() + "',"
                    + "doenca_pulmoes_tipo = '" + modelPaciente.getDoencaPulmoesTipo() + "',"
                    + "doenca_pulmoes_periodo = '" + modelPaciente.getDoencaPulmoesPeriodo() + "',"
                    + "doenca_pulmoes_obs = '" + modelPaciente.getDoencaPulmoesObs() + "',"
                    + "doenca_autoimune = '" + modelPaciente.getDoencaAutoimune() + "',"
                    + "doenca_autoimune_tipo = '" + modelPaciente.getDoencaAutoimuneTipo() + "',"
                    + "doenca_autoimune_periodo = '" + modelPaciente.getDoencaAutoimunePeriodo() + "',"
                    + "doenca_autoimune_obs = '" + modelPaciente.getDoencaAutoimuneObs() + "',"
                    + "cancer = '" + modelPaciente.getCancer() + "',"
                    + "cancer_tipo = '" + modelPaciente.getCancerTipo() + "',"
                    + "cancer_periodo = '" + modelPaciente.getCancerPeriodo() + "',"
                    + "cancer_obs = '" + modelPaciente.getCancerObs() + "',"
                    + "feridas_tumores = '" + modelPaciente.getFeridasTumores() + "',"
                    + "feridas_tumores_tipo = '" + modelPaciente.getFeridasTumoresTipo() + "',"
                    + "feridas_tumores_periodo = '" + modelPaciente.getFeridasTumoresPeriodo() + "',"
                    + "feridas_tumores_obs = '" + modelPaciente.getFeridasTumoresObs() + "',"
                    + "paciente_reincidente = '" + modelPaciente.getPacienteReincidente() + "',"
                    + "data_nascimento = '" + modelPaciente.getDataNascimento() + "',"
                    + "status_tratamento = '" + modelPaciente.getStatusTratamento() + "',"
                    + "status_ficha ='" + modelPaciente.getStatusFicha() + "',"
                    + "modo_desobsessao = '" + modelPaciente.getModoDesobsessao() + "',"
                    + "data_atendimento ='" + modelPaciente.getDataAtendimento() + "',"
                    + "atendente ='" + modelPaciente.getAtendente() + "',"
                    + "acompanhamento_paciente = '" + modelPaciente.getAcompanhamentoPaciente() + "',"
                    + "rua = '" + modelPaciente.getRua() + "',"
                    + "num_casa = '" + modelPaciente.getNumCasa() + "',"
                    + "bairro = '" + modelPaciente.getBairro() + "',"
                    + "cidade = '" + modelPaciente.getCidade() + "',"
                    + "idade = '" + modelPaciente.getIdade() + "',"
                    + "conhecimento_espirita_previo = '" + modelPaciente.getConhecimentoEspiritaPrevio() + "',"
                    + "fonte_conhecimento_espirita = '" + modelPaciente.getFonteConhecimentoEspirita() + "',"
                    + "objetivo_tratamento = '" + modelPaciente.getObjetivoTratamento() + "',"
                    + "nome = '" + modelPaciente.getNome() + "',"
                    + "setor = '" + modelPaciente.getSetor() + "',"
                    + "telefone = '" + modelPaciente.getTelefone() + "',"
                    + "email = '" + modelPaciente.getEmail() + "'"
                    + " WHERE "
                    + "pk_id_paciente = '" + modelPaciente.getIdPaciente() + "'"
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
     * exclui Paciente1
     *
     * @param pIdPaciente return boolean
     * @return
     */
    public boolean excluirPacienteDAO(int pIdPaciente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_paciente "
                    + " WHERE "
                    + "pk_id_paciente = '" + pIdPaciente + "'"
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
