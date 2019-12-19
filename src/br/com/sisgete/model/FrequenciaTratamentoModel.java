package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoModel {

    private int idFrequencia;
    private int paciente;
    private int responsavelFicha;
    private String frequenciaDomingo;
    private String frequenciaQuinta;
    private String recomendacoesEspirituais;

    /**
     * Construtor
     */
    public FrequenciaTratamentoModel() {
    }

    /**
     * seta o valor de idFrequencia
     *
     * @param pIdFrequencia
     */
    public void setIdFrequencia(int pIdFrequencia) {
        this.idFrequencia = pIdFrequencia;
    }

    /**
     * return pk_idFrequencia
     *
     * @return
     */
    public int getIdFrequencia() {
        return this.idFrequencia;
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
     * seta o valor de responsavelFicha
     *
     * @param pResponsavelFicha
     */
    public void setResponsavelFicha(int pResponsavelFicha) {
        this.responsavelFicha = pResponsavelFicha;
    }

    /**
     * return fk_responsavelFicha
     *
     * @return
     */
    public int getResponsavelFicha() {
        return this.responsavelFicha;
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
        return "ModelfrequenciaTratamento {" + "::idFrequencia = " + this.idFrequencia + "::paciente = " + this.paciente + "::responsavelFicha = " + this.responsavelFicha + "::frequenciaDomingo = " + this.frequenciaDomingo + "::frequenciaQuinta = " + this.frequenciaQuinta + "::recomendacoesEspirituais = " + this.recomendacoesEspirituais + "}";
    }
}
