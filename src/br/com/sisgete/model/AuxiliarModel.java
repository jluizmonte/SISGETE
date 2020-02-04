package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class AuxiliarModel {

    private int idAuxiliar;
    private String nomeAuxiliar;
    private String statusAuxiliar;

    /**
     * Construtor
     */
    public AuxiliarModel() {
    }

    public int getIdAuxiliar() {
        return idAuxiliar;
    }

    public void setIdAuxiliar(int idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    public String getNomeAuxiliar() {
        return nomeAuxiliar;
    }

    public void setNomeAuxiliar(String nomeAuxiliar) {
        this.nomeAuxiliar = nomeAuxiliar;
    }

    public String getStatusAuxiliar() {
        return statusAuxiliar;
    }

    public void setStatusAuxiliar(String statusAuxiliar) {
        this.statusAuxiliar = statusAuxiliar;
    }

    @Override
    public String toString() {
        return "AuxiliarModel{" + "idAuxiliar=" + idAuxiliar + ", nomeAuxiliar=" + nomeAuxiliar + ", statusAuxiliar=" + statusAuxiliar + '}';
    }

}
