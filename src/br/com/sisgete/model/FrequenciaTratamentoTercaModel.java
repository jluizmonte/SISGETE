package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoTercaModel {

    private int idFrequenciaTratamentoTerca;
    private int paciente;
    private String frequenciaTerca;

    /**
     * Construtor
     */
    public FrequenciaTratamentoTercaModel() {
    }

    /**
     * seta o valor de idFrequenciaTratamentoTerca
     *
     * @param pIdFrequenciaTratamentoTerca
     */
    public void setIdFrequenciaTratamentoTerca(int pIdFrequenciaTratamentoTerca) {
        this.idFrequenciaTratamentoTerca = pIdFrequenciaTratamentoTerca;
    }

    /**
     * return pk_idFrequenciaTratamentoTerca
     *
     * @return
     */
    public int getIdFrequenciaTratamentoTerca() {
        return this.idFrequenciaTratamentoTerca;
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
     * seta o valor de frequenciaTerca
     *
     * @param pFrequenciaTerca
     */
    public void setFrequenciaTerca(String pFrequenciaTerca) {
        this.frequenciaTerca = pFrequenciaTerca;
    }

    /**
     * return frequenciaTerca
     *
     * @return
     */
    public String getFrequenciaTerca() {
        return this.frequenciaTerca;
    }

    @Override
    public String toString() {
        return "ModelFrequenciaTratamentoTerca {" + "::idFrequenciaTratamentoTerca = " + this.idFrequenciaTratamentoTerca + "::paciente = " + this.paciente + "::frequenciaTerca = " + this.frequenciaTerca + "}";
    }
}
