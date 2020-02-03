package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class AtendenteFraternoModel {

    private int idAtendenteFraterno;
    private String nome;

    /**
     * Construtor
     */
    public AtendenteFraternoModel() {
    }

    /**
     * seta o valor de idAtendenteFraterno
     *
     * @param pIdAtendenteFraterno
     */
    public void setIdAtendenteFraterno(int pIdAtendenteFraterno) {
        this.idAtendenteFraterno = pIdAtendenteFraterno;
    }

    /**
     * return pk_idAtendenteFraterno
     */
    public int getIdAtendenteFraterno() {
        return this.idAtendenteFraterno;
    }

    /**
     * seta o valor de nome
     *
     * @param pNome
     */
    public void setNome(String pNome) {
        this.nome = pNome;
    }

    /**
     * return nome
     */
    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "ModelAtendenteFraterno {" + "::idAtendenteFraterno = " + this.idAtendenteFraterno + "::nome = " + this.nome + "}";
    }
}
