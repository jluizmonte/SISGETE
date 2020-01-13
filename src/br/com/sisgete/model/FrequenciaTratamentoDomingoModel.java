package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoDomingoModel {

    private int idQuadroPsicofisicoDomingo;
    private int idPaciente;
    private int idMagnetizador;
    private int idAuxiliar;
    private String setorPaciente;
    private String recomendacoesEspirituais;
    private String frequenciaDomingo;

    /**
     * Construtor
     */
    public FrequenciaTratamentoDomingoModel() {
    }

    /**
     * seta o valor de idQuadroPsicofisicoDomingo
     *
     * @param pIdQuadroPsicofisicoDomingo
     */
    public void setIdQuadroPsicofisicoDomingo(int pIdQuadroPsicofisicoDomingo) {
        this.idQuadroPsicofisicoDomingo = pIdQuadroPsicofisicoDomingo;
    }

    /**
     * return pk_idQuadroPsicofisicoDomingo
     *
     * @return
     */
    public int getIdQuadroPsicofisicoDomingo() {
        return this.idQuadroPsicofisicoDomingo;
    }

    /**
     * seta o valor de idPaciente
     *
     * @param pPaciente
     */
    public void setIdPaciente(int pPaciente) {
        this.idPaciente = pPaciente;
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
     * @param pMagnetizador
     */
    public void setIdMagnetizador(int pMagnetizador) {
        this.idMagnetizador = pMagnetizador;
    }

    /**
     * return fk_fkMagnetizador
     *
     * @return
     */
    public int getIdMagnetizador() {
        return this.idMagnetizador;
    }

    /**
     * seta o valor de idAuxiliar
     *
     * @param pAuxiliar
     */
    public void setIdAuxiliar(int pAuxiliar) {
        this.idAuxiliar = pAuxiliar;
    }

    /**
     * return fk_fkAuxiliar
     *
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
     * seta o valor de frequenciaDomingo
     *
     * @param pFrequenciaDomingo
     */
    public void setFrequenciaDomingo(String pFrequenciaDomingo) {
        this.frequenciaDomingo = pFrequenciaDomingo;
    }

    /**
     * return frequenciaDomingo
     *
     * @return
     */
    public String getFrequenciaDomingo() {
        return this.frequenciaDomingo;
    }

    @Override
    public String toString() {
        return "ModelFrequenciaTratamentoDomingo {" + "::idQuadroPsicofisicoDomingo = " + this.idQuadroPsicofisicoDomingo + "::fkPaciente = " + this.idPaciente + "::fkMagnetizador = " + this.idMagnetizador + "::fkAuxiliar = " + this.idAuxiliar + "::setorPaciente = " + this.setorPaciente + "::recomendacoesEspirituais = " + this.recomendacoesEspirituais + "::frequenciaDomingo = " + this.frequenciaDomingo + "}";
    }
}
