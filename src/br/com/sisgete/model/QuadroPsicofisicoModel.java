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
    private String sintomas;
    private String intensidadeSintomas;

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
     */
    public String getObservacoes() {
        return this.observacoes;
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
     */
    public String getIntensidadeSintomas() {
        return this.intensidadeSintomas;
    }

    @Override
    public String toString() {
        return "QuadroPsicofisicoModel{" + "idQuadroPsicofisico=" + idQuadroPsicofisico + ", atendente=" + atendente + ", paciente=" + paciente + ", observacoes=" + observacoes + ", sintomas=" + sintomas + ", intensidadeSintomas=" + intensidadeSintomas + '}';
    }

}
