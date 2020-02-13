package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class UsuarioModel {

    private int idUsuario;
    private String nome;
    private String usuario;
    private String senha;
    private String nivelAcesso;

    /**
     * Construtor
     */
    public UsuarioModel() {
    }

    /**
     * seta o valor de idUsuario
     *
     * @param pIdUsuario
     */
    public void setIdUsuario(int pIdUsuario) {
        this.idUsuario = pIdUsuario;
    }

    /**
     * return pk_idUsuario
     *
     * @return
     */
    public int getIdUsuario() {
        return this.idUsuario;
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
     * @return
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * seta o valor de usuario
     *
     * @param pUsuario
     */
    public void setUsuario(String pUsuario) {
        this.usuario = pUsuario;
    }

    /**
     * @return usuario
     */
    public String getUsuario() {
        return this.usuario;
    }

    /**
     * seta o valor de senha
     *
     * @param pSenha
     */
    public void setSenha(String pSenha) {
        this.senha = pSenha;
    }

    /**
     * @return senha
     */
    public String getSenha() {
        return this.senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" + "idUsuario=" + idUsuario + ", nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + ", nivelAcesso=" + nivelAcesso + '}';
    }

}
