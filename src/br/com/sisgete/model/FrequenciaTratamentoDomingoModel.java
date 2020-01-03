package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoDomingoModel {

    private int idFrequenciaTratamentoDomingo;
    private int idPaciente;
    private int idMagnetizador;
    private String frequenciaDomingo;
    private String recomendacoesEspirituais;

    /**
     * Construtor
     */
    public FrequenciaTratamentoDomingoModel() {
    }

    /**
     * seta o valor de idFrequenciaTratamentoDomingo
     *
     * @param pIdFrequenciaTratamentoDomingo
     */
    public void setIdFrequenciaTratamentoDomingo(int pIdFrequenciaTratamentoDomingo) {
        this.idFrequenciaTratamentoDomingo = pIdFrequenciaTratamentoDomingo;
    }

    /**
     * return pk_idFrequenciaTratamentoDomingo
     *
     * @return
     */
    public int getIdFrequenciaTratamentoDomingo() {
        return this.idFrequenciaTratamentoDomingo;
    }

    /**
     * seta o valor de idPaciente
     *
     * @param pIdPaciente
     */
    public void setIdPaciente(int pIdPaciente) {
        this.idPaciente = pIdPaciente;
    }

    /**
     * return fk_idPaciente
     *
     * @return
     */
    public int getIdPaciente() {
        return this.idPaciente;
    }

    /**
     * seta o valor de idMagnetizador
     *
     * @param pIdMagnetizador
     */
    public void setIdMagnetizador(int pIdMagnetizador) {
        this.idMagnetizador = pIdMagnetizador;
    }

    /**
     * return fk_idMagnetizador
     *
     * @return
     */
    public int getIdMagnetizador() {
        return this.idMagnetizador;
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

    @Override
    public String toString() {
        return "ModelFrequenciaTratamentoDomingo {" + "::idFrequenciaTratamentoDomingo = " + this.idFrequenciaTratamentoDomingo + "::idPaciente = " + this.idPaciente + "::idMagnetizador = " + this.idMagnetizador + "::frequenciaDomingo = " + this.frequenciaDomingo + "::recomendacoesEspirituais = " + this.recomendacoesEspirituais + "}";
    }
}
