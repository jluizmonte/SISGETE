package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class QuadroPsicofisicoModel {

    private int idQuadroPsicofisico;
    private int atendente;
    private int paciente;
    private String observacoes;
    private String dataAtendimento;
    private String sintomas;
    private String intensidadeSintomas;
    private String tipoTratamento;
    private String periodoTratamento;
    private String observacoesTratamento;
    private String tipoMedicamento;
    private String periodoMedicamento;
    private String observacoesMedicamento;

    /**
     * Construtor
     */
    public QuadroPsicofisicoModel() {
    }

    /**
     * seta o valor de idQuadroPsicofisico
     *
     * @param pIdQuadroPsicofisico
     */
    public void setIdQuadroPsicofisico(int pIdQuadroPsicofisico) {
        this.idQuadroPsicofisico = pIdQuadroPsicofisico;
    }

    /**
     * return pk_idQuadroPsicofisico
     *
     * @return
     */
    public int getIdQuadroPsicofisico() {
        return this.idQuadroPsicofisico;
    }

    /**
     * seta o valor de atendente
     *
     * @param pAtendente
     */
    public void setAtendente(int pAtendente) {
        this.atendente = pAtendente;
    }

    /**
     * return fk_atendente
     *
     * @return
     */
    public int getAtendente() {
        return this.atendente;
    }

    /**
     * seta o valor de paciente
     *
     * @param pPaciente
     */
    public void setPaciente(int pPaciente) {
        this.paciente = pPaciente;
    }

    /**
     * return fk_paciente
     *
     * @return
     */
    public int getPaciente() {
        return this.paciente;
    }

    /**
     * seta o valor de observacoes
     *
     * @param pObservacoes
     */
    public void setObservacoes(String pObservacoes) {
        this.observacoes = pObservacoes;
    }

    /**
     * return observacoes
     *
     * @return
     */
    public String getObservacoes() {
        return this.observacoes;
    }

    /**
     * seta o valor de dataAtendimento
     *
     * @param pDataAtendimento
     */
    public void setDataAtendimento(String pDataAtendimento) {
        this.dataAtendimento = pDataAtendimento;
    }

    /**
     * return dataAtendimento
     *
     * @return
     */
    public String getDataAtendimento() {
        return this.dataAtendimento;
    }

    /**
     * seta o valor de sintomas
     *
     * @param pSintomas
     */
    public void setSintomas(String pSintomas) {
        this.sintomas = pSintomas;
    }

    /**
     * return sintomas
     *
     * @return
     */
    public String getSintomas() {
        return this.sintomas;
    }

    /**
     * seta o valor de intensidadeSintomas
     *
     * @param pIntensidadeSintomas
     */
    public void setIntensidadeSintomas(String pIntensidadeSintomas) {
        this.intensidadeSintomas = pIntensidadeSintomas;
    }

    /**
     * return intensidadeSintomas
     *
     * @return
     */
    public String getIntensidadeSintomas() {
        return this.intensidadeSintomas;
    }

    /**
     * seta o valor de tipoTratamento
     *
     * @param pTipoTratamento
     */
    public void setTipoTratamento(String pTipoTratamento) {
        this.tipoTratamento = pTipoTratamento;
    }

    /**
     * return tipoTratamento
     *
     * @return
     */
    public String getTipoTratamento() {
        return this.tipoTratamento;
    }

    /**
     * seta o valor de periodoTratamento
     *
     * @param pPeriodoTratamento
     */
    public void setPeriodoTratamento(String pPeriodoTratamento) {
        this.periodoTratamento = pPeriodoTratamento;
    }

    /**
     * return periodoTratamento
     *
     * @return
     */
    public String getPeriodoTratamento() {
        return this.periodoTratamento;
    }

    /**
     * seta o valor de observacoesTratamento
     *
     * @param pObservacoesTratamento
     */
    public void setObservacoesTratamento(String pObservacoesTratamento) {
        this.observacoesTratamento = pObservacoesTratamento;
    }

    /**
     * return observacoesTratamento
     *
     * @return
     */
    public String getObservacoesTratamento() {
        return this.observacoesTratamento;
    }

    /**
     * seta o valor de tipoMedicamento
     *
     * @param pTipoMedicamento
     */
    public void setTipoMedicamento(String pTipoMedicamento) {
        this.tipoMedicamento = pTipoMedicamento;
    }

    /**
     * return tipoMedicamento
     *
     * @return
     */
    public String getTipoMedicamento() {
        return this.tipoMedicamento;
    }

    /**
     * seta o valor de periodoMedicamento
     *
     * @param pPeriodoMedicamento
     */
    public void setPeriodoMedicamento(String pPeriodoMedicamento) {
        this.periodoMedicamento = pPeriodoMedicamento;
    }

    /**
     * return periodoMedicamento
     *
     * @return
     */
    public String getPeriodoMedicamento() {
        return this.periodoMedicamento;
    }

    /**
     * seta o valor de observacoesMedicamento
     *
     * @param pObservacoesMedicamento
     */
    public void setObservacoesMedicamento(String pObservacoesMedicamento) {
        this.observacoesMedicamento = pObservacoesMedicamento;
    }

    /**
     * return observacoesMedicamento
     *
     * @return
     */
    public String getObservacoesMedicamento() {
        return this.observacoesMedicamento;
    }

    @Override
    public String toString() {
        return "ModelquadroPsicofisico {" + "::idQuadroPsicofisico = " + this.idQuadroPsicofisico + "::atendente = " + this.atendente + "::paciente = " + this.paciente + "::observacoes = " + this.observacoes + "::dataAtendimento = " + this.dataAtendimento + "::sintomas = " + this.sintomas + "::intensidadeSintomas = " + this.intensidadeSintomas + "::tipoTratamento = " + this.tipoTratamento + "::periodoTratamento = " + this.periodoTratamento + "::observacoesTratamento = " + this.observacoesTratamento + "::tipoMedicamento = " + this.tipoMedicamento + "::periodoMedicamento = " + this.periodoMedicamento + "::observacoesMedicamento = " + this.observacoesMedicamento + "}";
    }
}
