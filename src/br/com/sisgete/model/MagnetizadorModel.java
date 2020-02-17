package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class MagnetizadorModel {

    private int idMagnetizador;
    private String nomeMagnetizador;
    private String statusMagnetizador;

    /**
     * Construtor
     */
    public MagnetizadorModel() {
    }

    public int getIdMagnetizador() {
        return idMagnetizador;
    }

    public void setIdMagnetizador(int idMagnetizador) {
        this.idMagnetizador = idMagnetizador;
    }

    public String getNomeMagnetizador() {
        return nomeMagnetizador;
    }

    public void setNomeMagnetizador(String nomeMagnetizador) {
        this.nomeMagnetizador = nomeMagnetizador;
    }

    public String getStatusMagnetizador() {
        return statusMagnetizador;
    }

    public void setStatusMagnetizador(String statusMagnetizador) {
        this.statusMagnetizador = statusMagnetizador;
    }

    @Override
    public String toString() {
        return "MagnetizadorModel{" + "idMagnetizador=" + idMagnetizador + ", nomeMagnetizador=" + nomeMagnetizador + ", statusMagnetizador=" + statusMagnetizador + '}';
    }

}
