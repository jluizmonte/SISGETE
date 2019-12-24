package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class AtendenteFraternoModel {

    private int idAtendenteFraterno;
    private String nome;
    private String senha;
    private String usuario;

    /**
     * Construtor
     */
    public AtendenteFraternoModel() {
    }

    @Override
    public String toString() {
        return "AtendenteFraternoModel{" + "idAtendenteFraterno=" + idAtendenteFraterno + ", nome=" + nome + ", senha=" + senha + ", usuario=" + usuario + '}';
    }

    public int getIdAtendenteFraterno() {
        return idAtendenteFraterno;
    }

    public void setIdAtendenteFraterno(int idAtendenteFraterno) {
        this.idAtendenteFraterno = idAtendenteFraterno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
