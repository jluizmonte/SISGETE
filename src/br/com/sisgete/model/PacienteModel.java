package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class PacienteModel {

    private int idPaciente;
    private String pacienteReincidente;
    private String dataNascimento;
    private String statusTratamento;
    private String modoDesobsessao;
    private String acompanhamentoPaciente;
    private String rua;
    private int numCasa;
    private String bairro;
    private String cidade;
    private int idade;
    private String conhecimentoEspiritaPrevio;
    private String fonteConhecimentoEspirita;
    private String objetivoTratamento;
    private String nome;
    private String setor;
    private String telefone;
    private String email;

    /**
     * Construtor
     */
    public PacienteModel() {
    }

    /**
     * seta o valor de idPaciente
     *
     * @param pIdPaciente
     */
    public void setIdPaciente(int pIdPaciente) {
        this.idPaciente = pIdPaciente;
    }

    /**
     * return pk_idPaciente
     *
     * @return
     */
    public int getIdPaciente() {
        return this.idPaciente;
    }

    /**
     * seta o valor de pacienteReincidente
     *
     * @param pPacienteReincidente
     */
    public void setPacienteReincidente(String pPacienteReincidente) {
        this.pacienteReincidente = pPacienteReincidente;
    }

    /**
     * return pacienteReincidente
     *
     * @return
     */
    public String getPacienteReincidente() {
        return this.pacienteReincidente;
    }

    /**
     * seta o valor de dataNascimento
     *
     * @param pDataNascimento
     */
    public void setDataNascimento(String pDataNascimento) {
        this.dataNascimento = pDataNascimento;
    }

    /**
     * return dataNascimento
     *
     * @return
     */
    public String getDataNascimento() {
        return this.dataNascimento;
    }

    /**
     * seta o valor de statusTratamento
     *
     * @param pStatusTratamento
     */
    public void setStatusTratamento(String pStatusTratamento) {
        this.statusTratamento = pStatusTratamento;
    }

    /**
     * return statusTratamento
     *
     * @return
     */
    public String getStatusTratamento() {
        return this.statusTratamento;
    }

    /**
     * seta o valor de modoDesobsessao
     *
     * @param pModoDesobsessao
     */
    public void setModoDesobsessao(String pModoDesobsessao) {
        this.modoDesobsessao = pModoDesobsessao;
    }

    /**
     * return modoDesobsessao
     *
     * @return
     */
    public String getModoDesobsessao() {
        return this.modoDesobsessao;
    }

    /**
     * seta o valor de acompanhamentoPaciente
     *
     * @param pAcompanhamentoPaciente
     */
    public void setAcompanhamentoPaciente(String pAcompanhamentoPaciente) {
        this.acompanhamentoPaciente = pAcompanhamentoPaciente;
    }

    /**
     * return acompanhamentoPaciente
     *
     * @return
     */
    public String getAcompanhamentoPaciente() {
        return this.acompanhamentoPaciente;
    }

    /**
     * seta o valor de rua
     *
     * @param pRua
     */
    public void setRua(String pRua) {
        this.rua = pRua;
    }

    /**
     * return rua
     *
     * @return
     */
    public String getRua() {
        return this.rua;
    }

    /**
     * seta o valor de numCasa
     *
     * @param pNumCasa
     */
    public void setNumCasa(int pNumCasa) {
        this.numCasa = pNumCasa;
    }

    /**
     * return numCasa
     *
     * @return
     */
    public int getNumCasa() {
        return this.numCasa;
    }

    /**
     * seta o valor de bairro
     *
     * @param pBairro
     */
    public void setBairro(String pBairro) {
        this.bairro = pBairro;
    }

    /**
     * return bairro
     *
     * @return
     */
    public String getBairro() {
        return this.bairro;
    }

    /**
     * seta o valor de cidade
     *
     * @param pCidade
     */
    public void setCidade(String pCidade) {
        this.cidade = pCidade;
    }

    /**
     * return cidade
     *
     * @return
     */
    public String getCidade() {
        return this.cidade;
    }

    /**
     * seta o valor de idade
     *
     * @param pIdade
     */
    public void setIdade(int pIdade) {
        this.idade = pIdade;
    }

    /**
     * return idade
     *
     * @return
     */
    public int getIdade() {
        return this.idade;
    }

    /**
     * seta o valor de conhecimentoEspiritaPrevio
     *
     * @param pConhecimentoEspiritaPrevio
     */
    public void setConhecimentoEspiritaPrevio(String pConhecimentoEspiritaPrevio) {
        this.conhecimentoEspiritaPrevio = pConhecimentoEspiritaPrevio;
    }

    /**
     * return conhecimentoEspiritaPrevio
     *
     * @return
     */
    public String getConhecimentoEspiritaPrevio() {
        return this.conhecimentoEspiritaPrevio;
    }

    /**
     * seta o valor de fonteConhecimentoEspirita
     *
     * @param pFonteConhecimentoEspirita
     */
    public void setFonteConhecimentoEspirita(String pFonteConhecimentoEspirita) {
        this.fonteConhecimentoEspirita = pFonteConhecimentoEspirita;
    }

    /**
     * return fonteConhecimentoEspirita
     *
     * @return
     */
    public String getFonteConhecimentoEspirita() {
        return this.fonteConhecimentoEspirita;
    }

    /**
     * seta o valor de objetivoTratamento
     *
     * @param pObjetivoTratamento
     */
    public void setObjetivoTratamento(String pObjetivoTratamento) {
        this.objetivoTratamento = pObjetivoTratamento;
    }

    /**
     * return objetivoTratamento
     *
     * @return
     */
    public String getObjetivoTratamento() {
        return this.objetivoTratamento;
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
     * seta o valor de setor
     *
     * @param pSetor
     */
    public void setSetor(String pSetor) {
        this.setor = pSetor;
    }

    /**
     * return setor
     *
     * @return
     */
    public String getSetor() {
        return this.setor;
    }

    /**
     * seta o valor de telefone
     *
     * @param pTelefone
     */
    public void setTelefone(String pTelefone) {
        this.telefone = pTelefone;
    }

    /**
     * return telefone
     *
     * @return
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * seta o valor de email
     *
     * @param pEmail
     */
    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

    /**
     * return email
     *
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "PacienteModel{" + "idPaciente=" + idPaciente + ", pacienteReincidente=" + pacienteReincidente + ", dataNascimento=" + dataNascimento + ", statusTratamento=" + statusTratamento + ", modoDesobsessao=" + modoDesobsessao + ", acompanhamentoPaciente=" + acompanhamentoPaciente + ", rua=" + rua + ", numCasa=" + numCasa + ", bairro=" + bairro + ", cidade=" + cidade + ", idade=" + idade + ", conhecimentoEspiritaPrevio=" + conhecimentoEspiritaPrevio + ", fonteConhecimentoEspirita=" + fonteConhecimentoEspirita + ", objetivoTratamento=" + objetivoTratamento + ", nome=" + nome + ", setor=" + setor + ", telefone=" + telefone + ", email=" + email + '}';
    }

}
