package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoDomingoModel {

    private int idFrequenciaTratamentoDomingo;
    private int paciente;
    private int magnetizador;
    private String recomendacoesEspirituais;
    private String frequenciaDomingo;

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
     */
    public int getIdFrequenciaTratamentoDomingo() {
        return this.idFrequenciaTratamentoDomingo;
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
     * seta o valor de magnetizador
     *
     * @param pMagnetizador
     */
    public void setMagnetizador(int pMagnetizador) {
        this.magnetizador = pMagnetizador;
    }

    /**
     * return fk_magnetizador
     */
    public int getMagnetizador() {
        return this.magnetizador;
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
     */
    public String getFrequenciaDomingo() {
        return this.frequenciaDomingo;
    }

    @Override
    public String toString() {
        return "FrequenciaTratamentoDomingoModel{" + "idFrequenciaTratamentoDomingo=" + idFrequenciaTratamentoDomingo + ", paciente=" + paciente + ", magnetizador=" + magnetizador + ", recomendacoesEspirituais=" + recomendacoesEspirituais + ", frequenciaDomingo=" + frequenciaDomingo + '}';
    }

}
