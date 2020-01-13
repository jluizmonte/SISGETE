package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoQuintaModel {

    private int idQuadroPsicofisicoQuinta;
    private int idPaciente;
    private int idMagnetizador;
    private int idAuxiliar;
    private String setorPaciente;
    private String recomendacoesEspirituais;
    private String frequenciaQuinta;

    /**
     * Construtor
     */
    public FrequenciaTratamentoQuintaModel() {
    }

    /**
     * seta o valor de idQuadroPsicofisicoQuinta
     *
     * @param pIdQuadroPsicofisicoQuinta
     */
    public void setIdQuadroPsicofisicoQuinta(int pIdQuadroPsicofisicoQuinta) {
        this.idQuadroPsicofisicoQuinta = pIdQuadroPsicofisicoQuinta;
    }

    /**
     * return pk_idQuadroPsicofisicoQuinta
     *
     * @return
     */
    public int getIdQuadroPsicofisicoQuinta() {
        return this.idQuadroPsicofisicoQuinta;
    }

    /**
     * seta o valor de idPaciente
     *
     * @param pFkPaciente
     */
    public void setIdPaciente(int pFkPaciente) {
        this.idPaciente = pFkPaciente;
    }

    /**
     * return fk_fkPaciente
     *
     * @return
     */
    public int getIdPaciente() {
        return this.idPaciente;
    }

    /**
     * seta o valor de idMagnetizador
     *
     * @param pFkMagnetizador
     */
    public void setIdMagnetizador(int pFkMagnetizador) {
        this.idMagnetizador = pFkMagnetizador;
    }

    /**
     * @return
     */
    public int getIdMagnetizador() {
        return this.idMagnetizador;
    }

    /**
     * seta o valor de idAuxiliar
     *
     * @param pFkAuxiliar
     */
    public void setIdAuxiliar(int pFkAuxiliar) {
        this.idAuxiliar = pFkAuxiliar;
    }

    /**
     * @return
     */
    public int getIdAuxiliar() {
        return this.idAuxiliar;
    }

    /**
     * seta o valor de setorPaciente
     *
     * @param pSetorPaciente
     */
    public void setSetorPaciente(String pSetorPaciente) {
        this.setorPaciente = pSetorPaciente;
    }

    /**
     * return setorPaciente
     *
     * @return
     */
    public String getSetorPaciente() {
        return this.setorPaciente;
    }

    /**
     * seta o valor de recomendacoesEspirituais
     *
     * @param pRecomendacoesEspirituais
     */
    public void setRecomendacoesEspirituais(String pRecomendacoesEspirituais) {
        this.recomendacoesEspirituais = pRecomendacoesEspirituais;
    }

    /**
     * return recomendacoesEspirituais
     *
     * @return
     */
    public String getRecomendacoesEspirituais() {
        return this.recomendacoesEspirituais;
    }

    /**
     * seta o valor de frequenciaQuinta
     *
     * @param pFrequenciaQuinta
     */
    public void setFrequenciaQuinta(String pFrequenciaQuinta) {
        this.frequenciaQuinta = pFrequenciaQuinta;
    }

    /**
     * return frequenciaQuinta
     *
     * @return
     */
    public String getFrequenciaQuinta() {
        return this.frequenciaQuinta;
    }

    @Override
    public String toString() {
        return "ModelFrequenciaTratamentoQuinta {" + "::idQuadroPsicofisicoQuinta = " + this.idQuadroPsicofisicoQuinta + "::fkPaciente = " + this.idPaciente + "::fkMagnetizador = " + this.idMagnetizador + "::fkAuxiliar = " + this.idAuxiliar + "::setorPaciente = " + this.setorPaciente + "::recomendacoesEspirituais = " + this.recomendacoesEspirituais + "::frequenciaQuinta = " + this.frequenciaQuinta + "}";
    }
}
