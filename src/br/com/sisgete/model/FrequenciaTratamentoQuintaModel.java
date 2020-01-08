package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoQuintaModel {

    private int idFrequenciaTratamentoQuinta;
    private int paciente;
    private int setorPaciente;
    private int statusTratamento;
    private int magnetizador;
    private String recomendacoesEspirituais;
    private String frequenciaQuinta;

    /**
     * Construtor
     */
    public FrequenciaTratamentoQuintaModel() {
    }

    /**
     * seta o valor de idFrequenciaTratamentoQuinta
     *
     * @param pIdFrequenciaTratamentoQuinta
     */
    public void setIdFrequenciaTratamentoQuinta(int pIdFrequenciaTratamentoQuinta) {
        this.idFrequenciaTratamentoQuinta = pIdFrequenciaTratamentoQuinta;
    }

    /**
     * return pk_idFrequenciaTratamentoQuinta
     */
    public int getIdFrequenciaTratamentoQuinta() {
        return this.idFrequenciaTratamentoQuinta;
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
     * seta o valor de setorPaciente
     *
     * @param pSetorPaciente
     */
    public void setSetorPaciente(int pSetorPaciente) {
        this.setorPaciente = pSetorPaciente;
    }

    /**
     * return fk_setorPaciente
     */
    public int getSetorPaciente() {
        return this.setorPaciente;
    }

    /**
     * seta o valor de statusTratamento
     *
     * @param pStatusTratamento
     */
    public void setStatusTratamento(int pStatusTratamento) {
        this.statusTratamento = pStatusTratamento;
    }

    /**
     * return fk_statusTratamento
     */
    public int getStatusTratamento() {
        return this.statusTratamento;
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
     * seta o valor de frequenciaQuinta
     *
     * @param pFrequenciaQuinta
     */
    public void setFrequenciaQuinta(String pFrequenciaQuinta) {
        this.frequenciaQuinta = pFrequenciaQuinta;
    }

    /**
     * return frequenciaQuinta
     */
    public String getFrequenciaQuinta() {
        return this.frequenciaQuinta;
    }

    @Override
    public String toString() {
        return "ModelFrequenciaTratamentoQuinta {" + "::idFrequenciaTratamentoQuinta = " + this.idFrequenciaTratamentoQuinta + "::paciente = " + this.paciente + "::setorPaciente = " + this.setorPaciente + "::statusTratamento = " + this.statusTratamento + "::magnetizador = " + this.magnetizador + "::recomendacoesEspirituais = " + this.recomendacoesEspirituais + "::frequenciaQuinta = " + this.frequenciaQuinta + "}";
    }
}
