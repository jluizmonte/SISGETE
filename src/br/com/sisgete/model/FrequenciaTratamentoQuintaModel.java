package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoQuintaModel {

    private int idFrequenciaTratamentoQuinta;
    private int idPaciente;
    private int idMagnetizador;
    private String frequenciaQuinta;
    private String recomendacoesEspirituais;

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
     *
     * @return
     */
    public int getIdFrequenciaTratamentoQuinta() {
        return this.idFrequenciaTratamentoQuinta;
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
        return "ModelFrequenciaTratamentoQuinta {" + "::idFrequenciaTratamentoQuinta = " + this.idFrequenciaTratamentoQuinta + "::idPaciente = " + this.idPaciente + "::idMagnetizador = " + this.idMagnetizador + "::frequenciaQuinta = " + this.frequenciaQuinta + "::recomendacoesEspirituais = " + this.recomendacoesEspirituais + "}";
    }
}
