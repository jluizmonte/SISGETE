package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class ResponsavelFichaModel {

    private int idResponsavelFicha;
    private String nome;
    private String sobrenome;

    /**
     * Construtor
     */
    public ResponsavelFichaModel() {
    }

    /**
     * seta o valor de idResponsavelFicha
     *
     * @param pIdResponsavelFicha
     */
    public void setIdResponsavelFicha(int pIdResponsavelFicha) {
        this.idResponsavelFicha = pIdResponsavelFicha;
    }

    /**
     * return pk_idResponsavelFicha
     *
     * @return
     */
    public int getIdResponsavelFicha() {
        return this.idResponsavelFicha;
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
        return "ModelresponsavelFicha {" + "::idResponsavelFicha = " + this.idResponsavelFicha + "::nome = " + this.nome + "::sobrenome = " + this.sobrenome + "}";
    }
}
