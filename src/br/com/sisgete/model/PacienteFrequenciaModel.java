package br.com.sisgete.model;

import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class PacienteFrequenciaModel {

    private PacienteModel pacienteModel;
    private FrequenciaTratamentoDomingoModel tratamentoDomingoModel;
    ArrayList<PacienteFrequenciaModel> listaFrequenciaModels = new ArrayList<>();

    public PacienteModel getPacienteModel() {
        return pacienteModel;
    }

    public void setPacienteModel(PacienteModel pacienteModel) {
        this.pacienteModel = pacienteModel;
    }

    public FrequenciaTratamentoDomingoModel getTratamentoDomingoModel() {
        return tratamentoDomingoModel;
    }

    public void setTratamentoDomingoModel(FrequenciaTratamentoDomingoModel tratamentoDomingoModel) {
        this.tratamentoDomingoModel = tratamentoDomingoModel;
    }

    public ArrayList<PacienteFrequenciaModel> getListaFrequenciaModels() {
        return listaFrequenciaModels;
    }

    public void setListaFrequenciaModels(ArrayList<PacienteFrequenciaModel> listaFrequenciaModels) {
        this.listaFrequenciaModels = listaFrequenciaModels;
    }

    @Override
    public String toString() {
        return "PacienteFrequenciaModel{" + "pacienteModel=" + pacienteModel + ", tratamentoDomingoModel=" + tratamentoDomingoModel + ", listaFrequenciaModels=" + listaFrequenciaModels + '}';
    }

}
