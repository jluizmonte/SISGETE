package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoQuintaModel {

    private int idFrequenciaTratamentoQuinta;
    private int paciente;
    private String setorPaciente;
    private int magnetizador;
    private String recomendacoesEspirituais;
    private String frequenciaQuinta;

    /**
     * Construtor
     */
    public FrequenciaTratamentoQuintaModel() {
    }

    public int getIdFrequenciaTratamentoQuinta() {
        return idFrequenciaTratamentoQuinta;
    }

    public void setIdFrequenciaTratamentoQuinta(int idFrequenciaTratamentoQuinta) {
        this.idFrequenciaTratamentoQuinta = idFrequenciaTratamentoQuinta;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public String getSetorPaciente() {
        return setorPaciente;
    }

    public void setSetorPaciente(String setorPaciente) {
        this.setorPaciente = setorPaciente;
    }

    public int getMagnetizador() {
        return magnetizador;
    }

    public void setMagnetizador(int magnetizador) {
        this.magnetizador = magnetizador;
    }

    public String getRecomendacoesEspirituais() {
        return recomendacoesEspirituais;
    }

    public void setRecomendacoesEspirituais(String recomendacoesEspirituais) {
        this.recomendacoesEspirituais = recomendacoesEspirituais;
    }

    public String getFrequenciaQuinta() {
        return frequenciaQuinta;
    }

    public void setFrequenciaQuinta(String frequenciaQuinta) {
        this.frequenciaQuinta = frequenciaQuinta;
    }

    @Override
    public String toString() {
        return "FrequenciaTratamentoQuintaModel{" + "idFrequenciaTratamentoQuinta=" + idFrequenciaTratamentoQuinta + ", paciente=" + paciente + ", setorPaciente=" + setorPaciente + ", magnetizador=" + magnetizador + ", recomendacoesEspirituais=" + recomendacoesEspirituais + ", frequenciaQuinta=" + frequenciaQuinta + '}';
    }

}
