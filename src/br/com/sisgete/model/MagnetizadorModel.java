package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class MagnetizadorModel {

    private int idMagnetizador;
    private String nomeMagnetizador;
    private String auxiliarMagnetizador;

    /**
     * Construtor
     */
    public MagnetizadorModel() {
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
     * return pk_idMagnetizador
     */
    public int getIdMagnetizador() {
        return this.idMagnetizador;
    }

    /**
     * seta o valor de nomeMagnetizador
     *
     * @param pNomeMagnetizador
     */
    public void setNomeMagnetizador(String pNomeMagnetizador) {
        this.nomeMagnetizador = pNomeMagnetizador;
    }

    /**
     * return nomeMagnetizador
     */
    public String getNomeMagnetizador() {
        return this.nomeMagnetizador;
    }

    /**
     * seta o valor de auxiliarMagnetizador
     *
     * @param pAuxiliarMagnetizador
     */
    public void setAuxiliarMagnetizador(String pAuxiliarMagnetizador) {
        this.auxiliarMagnetizador = pAuxiliarMagnetizador;
    }

    /**
     * return auxiliarMagnetizador
     */
    public String getAuxiliarMagnetizador() {
        return this.auxiliarMagnetizador;
    }

    @Override
    public String toString() {
        return "ModelMagnetizador {" + "::idMagnetizador = " + this.idMagnetizador + "::nomeMagnetizador = " + this.nomeMagnetizador + "::auxiliarMagnetizador = " + this.auxiliarMagnetizador + "}";
    }
}
