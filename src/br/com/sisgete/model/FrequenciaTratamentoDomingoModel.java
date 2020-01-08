package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoDomingoModel {

    private int idFrequenciaTratamentoDomingo;
    private int paciente;
    private int magnetizador;
    private String setorPaciente;
    private String recomendacoesEspirituais;
    private String frequenciaDomingo;

    /**
     * Construtor
     */
    public FrequenciaTratamentoDomingoModel() {
    }

    public int getIdFrequenciaTratamentoDomingo() {
        return idFrequenciaTratamentoDomingo;
    }

    public void setIdFrequenciaTratamentoDomingo(int idFrequenciaTratamentoDomingo) {
        this.idFrequenciaTratamentoDomingo = idFrequenciaTratamentoDomingo;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public int getMagnetizador() {
        return magnetizador;
    }

    public void setMagnetizador(int magnetizador) {
        this.magnetizador = magnetizador;
    }

    public String getSetorPaciente() {
        return setorPaciente;
    }

    public void setSetorPaciente(String setorPaciente) {
        this.setorPaciente = setorPaciente;
    }

    public String getRecomendacoesEspirituais() {
        return recomendacoesEspirituais;
    }

    public void setRecomendacoesEspirituais(String recomendacoesEspirituais) {
        this.recomendacoesEspirituais = recomendacoesEspirituais;
    }

    public String getFrequenciaDomingo() {
        return frequenciaDomingo;
    }

    public void setFrequenciaDomingo(String frequenciaDomingo) {
        this.frequenciaDomingo = frequenciaDomingo;
    }

    @Override
    public String toString() {
        return "FrequenciaTratamentoDomingoModel{" + "idFrequenciaTratamentoDomingo=" + idFrequenciaTratamentoDomingo + ", paciente=" + paciente + ", magnetizador=" + magnetizador + ", setorPaciente=" + setorPaciente + ", recomendacoesEspirituais=" + recomendacoesEspirituais + ", frequenciaDomingo=" + frequenciaDomingo + '}';
    }

}
