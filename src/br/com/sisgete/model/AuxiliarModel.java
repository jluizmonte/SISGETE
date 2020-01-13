package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class AuxiliarModel {

    private int idAuxiliar;
    private String nomeAuxiliar;

    /**
     * Construtor
     */
    public AuxiliarModel() {
    }

    /**
     * seta o valor de idAuxiliar
     *
     * @param pIdAuxiliar
     */
    public void setIdAuxiliar(int pIdAuxiliar) {
        this.idAuxiliar = pIdAuxiliar;
    }

    /**
     * return pk_idAuxiliar
     */
    public int getIdAuxiliar() {
        return this.idAuxiliar;
    }

    /**
     * seta o valor de nomeAuxiliar
     *
     * @param pNomeAuxiliar
     */
    public void setNomeAuxiliar(String pNomeAuxiliar) {
        this.nomeAuxiliar = pNomeAuxiliar;
    }

    /**
     * return nomeAuxiliar
     */
    public String getNomeAuxiliar() {
        return this.nomeAuxiliar;
    }

    @Override
    public String toString() {
        return "ModelAuxiliar {" + "::idAuxiliar = " + this.idAuxiliar + "::nomeAuxiliar = " + this.nomeAuxiliar + "}";
    }
}
