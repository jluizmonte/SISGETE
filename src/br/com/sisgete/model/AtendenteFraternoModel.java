package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class AtendenteFraternoModel {

    private int idAtendenteFraterno;
    private String nome;
    private String sobrenome;

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
     *
     * @return
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
     *
     * @return
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * seta o valor de sobrenome
     *
     * @param pSobrenome
     */
    public void setSobrenome(String pSobrenome) {
        this.sobrenome = pSobrenome;
    }

    /**
     * return sobrenome
     *
     * @return
     */
    public String getSobrenome() {
        return this.sobrenome;
    }

    @Override
    public String toString() {
        return "ModelatendenteFraterno {" + "::idAtendenteFraterno = " + this.idAtendenteFraterno + "::nome = " + this.nome + "::sobrenome = " + this.sobrenome + "}";
    }
}
