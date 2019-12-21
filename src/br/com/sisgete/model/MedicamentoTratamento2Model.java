package br.com.sisgete.model;
/**
*
* @author luiz
*/
public class MedicamentoTratamento2Model {

    private int idMedicamentoTratamento2;
    private int paciente;
    private String alergias;
    private String alergiasTipo;
    private String alergiasPeriodo;
    private String alergiasObs;
    private String hernia;
    private String herniaTipo;
    private String herniaPeriodo;
    private String herniaObs;
    private String doencaEstomago;
    private String doencaEstomagoTipo;
    private String doencaEstomagoPeriodo;
    private String doencaEstomagoObs;
    private String doencaOssos;
    private String doencaOssosTipo;
    private String doencaOssosPeriodo;
    private String doencaOssosObs;
    private String doencaPulmoes;
    private String doencaPulmoesTipo;
    private String doencaPulmoesPeriodo;
    private String doencaPulmoesObs;
    private String doentaAutoimune;
    private String doentaAutoimuneTipo;
    private String doentaAutoimunePeriodo;
    private String doentaAutoimuneObs;
    private String cancer;
    private String cancerTipo;
    private String cancerPeriodo;
    private String cancerObs;
    private String feridasTumores;
    private String feridasTumoresTipo;
    private String feridasTumoresPeriodo;
    private String feridasTumoresObs;

    /**
    * Construtor
    */
    public MedicamentoTratamento2Model(){}

    /**
    * seta o valor de idMedicamentoTratamento2
    * @param pIdMedicamentoTratamento2
    */
    public void setIdMedicamentoTratamento2(int pIdMedicamentoTratamento2){
        this.idMedicamentoTratamento2 = pIdMedicamentoTratamento2;
    }
    /**
    * return pk_idMedicamentoTratamento2
    */
    public int getIdMedicamentoTratamento2(){
        return this.idMedicamentoTratamento2;
    }

    /**
    * seta o valor de paciente
    * @param pPaciente
    */
    public void setPaciente(int pPaciente){
        this.paciente = pPaciente;
    }
    /**
    * return fk_paciente
    */
    public int getPaciente(){
        return this.paciente;
    }

    /**
    * seta o valor de alergias
    * @param pAlergias
    */
    public void setAlergias(String pAlergias){
        this.alergias = pAlergias;
    }
    /**
    * return alergias
    */
    public String getAlergias(){
        return this.alergias;
    }

    /**
    * seta o valor de alergiasTipo
    * @param pAlergiasTipo
    */
    public void setAlergiasTipo(String pAlergiasTipo){
        this.alergiasTipo = pAlergiasTipo;
    }
    /**
    * return alergiasTipo
    */
    public String getAlergiasTipo(){
        return this.alergiasTipo;
    }

    /**
    * seta o valor de alergiasPeriodo
    * @param pAlergiasPeriodo
    */
    public void setAlergiasPeriodo(String pAlergiasPeriodo){
        this.alergiasPeriodo = pAlergiasPeriodo;
    }
    /**
    * return alergiasPeriodo
    */
    public String getAlergiasPeriodo(){
        return this.alergiasPeriodo;
    }

    /**
    * seta o valor de alergiasObs
    * @param pAlergiasObs
    */
    public void setAlergiasObs(String pAlergiasObs){
        this.alergiasObs = pAlergiasObs;
    }
    /**
    * return alergiasObs
    */
    public String getAlergiasObs(){
        return this.alergiasObs;
    }

    /**
    * seta o valor de hernia
    * @param pHernia
    */
    public void setHernia(String pHernia){
        this.hernia = pHernia;
    }
    /**
    * return hernia
    */
    public String getHernia(){
        return this.hernia;
    }

    /**
    * seta o valor de herniaTipo
    * @param pHerniaTipo
    */
    public void setHerniaTipo(String pHerniaTipo){
        this.herniaTipo = pHerniaTipo;
    }
    /**
    * return herniaTipo
    */
    public String getHerniaTipo(){
        return this.herniaTipo;
    }

    /**
    * seta o valor de herniaPeriodo
    * @param pHerniaPeriodo
    */
    public void setHerniaPeriodo(String pHerniaPeriodo){
        this.herniaPeriodo = pHerniaPeriodo;
    }
    /**
    * return herniaPeriodo
    */
    public String getHerniaPeriodo(){
        return this.herniaPeriodo;
    }

    /**
    * seta o valor de herniaObs
    * @param pHerniaObs
    */
    public void setHerniaObs(String pHerniaObs){
        this.herniaObs = pHerniaObs;
    }
    /**
    * return herniaObs
    */
    public String getHerniaObs(){
        return this.herniaObs;
    }

    /**
    * seta o valor de doencaEstomago
    * @param pDoencaEstomago
    */
    public void setDoencaEstomago(String pDoencaEstomago){
        this.doencaEstomago = pDoencaEstomago;
    }
    /**
    * return doencaEstomago
    */
    public String getDoencaEstomago(){
        return this.doencaEstomago;
    }

    /**
    * seta o valor de doencaEstomagoTipo
    * @param pDoencaEstomagoTipo
    */
    public void setDoencaEstomagoTipo(String pDoencaEstomagoTipo){
        this.doencaEstomagoTipo = pDoencaEstomagoTipo;
    }
    /**
    * return doencaEstomagoTipo
    */
    public String getDoencaEstomagoTipo(){
        return this.doencaEstomagoTipo;
    }

    /**
    * seta o valor de doencaEstomagoPeriodo
    * @param pDoencaEstomagoPeriodo
    */
    public void setDoencaEstomagoPeriodo(String pDoencaEstomagoPeriodo){
        this.doencaEstomagoPeriodo = pDoencaEstomagoPeriodo;
    }
    /**
    * return doencaEstomagoPeriodo
    */
    public String getDoencaEstomagoPeriodo(){
        return this.doencaEstomagoPeriodo;
    }

    /**
    * seta o valor de doencaEstomagoObs
    * @param pDoencaEstomagoObs
    */
    public void setDoencaEstomagoObs(String pDoencaEstomagoObs){
        this.doencaEstomagoObs = pDoencaEstomagoObs;
    }
    /**
    * return doencaEstomagoObs
    */
    public String getDoencaEstomagoObs(){
        return this.doencaEstomagoObs;
    }

    /**
    * seta o valor de doencaOssos
    * @param pDoencaOssos
    */
    public void setDoencaOssos(String pDoencaOssos){
        this.doencaOssos = pDoencaOssos;
    }
    /**
    * return doencaOssos
    */
    public String getDoencaOssos(){
        return this.doencaOssos;
    }

    /**
    * seta o valor de doencaOssosTipo
    * @param pDoencaOssosTipo
    */
    public void setDoencaOssosTipo(String pDoencaOssosTipo){
        this.doencaOssosTipo = pDoencaOssosTipo;
    }
    /**
    * return doencaOssosTipo
    */
    public String getDoencaOssosTipo(){
        return this.doencaOssosTipo;
    }

    /**
    * seta o valor de doencaOssosPeriodo
    * @param pDoencaOssosPeriodo
    */
    public void setDoencaOssosPeriodo(String pDoencaOssosPeriodo){
        this.doencaOssosPeriodo = pDoencaOssosPeriodo;
    }
    /**
    * return doencaOssosPeriodo
    */
    public String getDoencaOssosPeriodo(){
        return this.doencaOssosPeriodo;
    }

    /**
    * seta o valor de doencaOssosObs
    * @param pDoencaOssosObs
    */
    public void setDoencaOssosObs(String pDoencaOssosObs){
        this.doencaOssosObs = pDoencaOssosObs;
    }
    /**
    * return doencaOssosObs
    */
    public String getDoencaOssosObs(){
        return this.doencaOssosObs;
    }

    /**
    * seta o valor de doencaPulmoes
    * @param pDoencaPulmoes
    */
    public void setDoencaPulmoes(String pDoencaPulmoes){
        this.doencaPulmoes = pDoencaPulmoes;
    }
    /**
    * return doencaPulmoes
    */
    public String getDoencaPulmoes(){
        return this.doencaPulmoes;
    }

    /**
    * seta o valor de doencaPulmoesTipo
    * @param pDoencaPulmoesTipo
    */
    public void setDoencaPulmoesTipo(String pDoencaPulmoesTipo){
        this.doencaPulmoesTipo = pDoencaPulmoesTipo;
    }
    /**
    * return doencaPulmoesTipo
    */
    public String getDoencaPulmoesTipo(){
        return this.doencaPulmoesTipo;
    }

    /**
    * seta o valor de doencaPulmoesPeriodo
    * @param pDoencaPulmoesPeriodo
    */
    public void setDoencaPulmoesPeriodo(String pDoencaPulmoesPeriodo){
        this.doencaPulmoesPeriodo = pDoencaPulmoesPeriodo;
    }
    /**
    * return doencaPulmoesPeriodo
    */
    public String getDoencaPulmoesPeriodo(){
        return this.doencaPulmoesPeriodo;
    }

    /**
    * seta o valor de doencaPulmoesObs
    * @param pDoencaPulmoesObs
    */
    public void setDoencaPulmoesObs(String pDoencaPulmoesObs){
        this.doencaPulmoesObs = pDoencaPulmoesObs;
    }
    /**
    * return doencaPulmoesObs
    */
    public String getDoencaPulmoesObs(){
        return this.doencaPulmoesObs;
    }

    /**
    * seta o valor de doentaAutoimune
    * @param pDoentaAutoimune
    */
    public void setDoentaAutoimune(String pDoentaAutoimune){
        this.doentaAutoimune = pDoentaAutoimune;
    }
    /**
    * return doentaAutoimune
    */
    public String getDoentaAutoimune(){
        return this.doentaAutoimune;
    }

    /**
    * seta o valor de doentaAutoimuneTipo
    * @param pDoentaAutoimuneTipo
    */
    public void setDoentaAutoimuneTipo(String pDoentaAutoimuneTipo){
        this.doentaAutoimuneTipo = pDoentaAutoimuneTipo;
    }
    /**
    * return doentaAutoimuneTipo
    */
    public String getDoentaAutoimuneTipo(){
        return this.doentaAutoimuneTipo;
    }

    /**
    * seta o valor de doentaAutoimunePeriodo
    * @param pDoentaAutoimunePeriodo
    */
    public void setDoentaAutoimunePeriodo(String pDoentaAutoimunePeriodo){
        this.doentaAutoimunePeriodo = pDoentaAutoimunePeriodo;
    }
    /**
    * return doentaAutoimunePeriodo
    */
    public String getDoentaAutoimunePeriodo(){
        return this.doentaAutoimunePeriodo;
    }

    /**
    * seta o valor de doentaAutoimuneObs
    * @param pDoentaAutoimuneObs
    */
    public void setDoentaAutoimuneObs(String pDoentaAutoimuneObs){
        this.doentaAutoimuneObs = pDoentaAutoimuneObs;
    }
    /**
    * return doentaAutoimuneObs
    */
    public String getDoentaAutoimuneObs(){
        return this.doentaAutoimuneObs;
    }

    /**
    * seta o valor de cancer
    * @param pCancer
    */
    public void setCancer(String pCancer){
        this.cancer = pCancer;
    }
    /**
    * return cancer
    */
    public String getCancer(){
        return this.cancer;
    }

    /**
    * seta o valor de cancerTipo
    * @param pCancerTipo
    */
    public void setCancerTipo(String pCancerTipo){
        this.cancerTipo = pCancerTipo;
    }
    /**
    * return cancerTipo
    */
    public String getCancerTipo(){
        return this.cancerTipo;
    }

    /**
    * seta o valor de cancerPeriodo
    * @param pCancerPeriodo
    */
    public void setCancerPeriodo(String pCancerPeriodo){
        this.cancerPeriodo = pCancerPeriodo;
    }
    /**
    * return cancerPeriodo
    */
    public String getCancerPeriodo(){
        return this.cancerPeriodo;
    }

    /**
    * seta o valor de cancerObs
    * @param pCancerObs
    */
    public void setCancerObs(String pCancerObs){
        this.cancerObs = pCancerObs;
    }
    /**
    * return cancerObs
    */
    public String getCancerObs(){
        return this.cancerObs;
    }

    /**
    * seta o valor de feridasTumores
    * @param pFeridasTumores
    */
    public void setFeridasTumores(String pFeridasTumores){
        this.feridasTumores = pFeridasTumores;
    }
    /**
    * return feridasTumores
    */
    public String getFeridasTumores(){
        return this.feridasTumores;
    }

    /**
    * seta o valor de feridasTumoresTipo
    * @param pFeridasTumoresTipo
    */
    public void setFeridasTumoresTipo(String pFeridasTumoresTipo){
        this.feridasTumoresTipo = pFeridasTumoresTipo;
    }
    /**
    * return feridasTumoresTipo
    */
    public String getFeridasTumoresTipo(){
        return this.feridasTumoresTipo;
    }

    /**
    * seta o valor de feridasTumoresPeriodo
    * @param pFeridasTumoresPeriodo
    */
    public void setFeridasTumoresPeriodo(String pFeridasTumoresPeriodo){
        this.feridasTumoresPeriodo = pFeridasTumoresPeriodo;
    }
    /**
    * return feridasTumoresPeriodo
    */
    public String getFeridasTumoresPeriodo(){
        return this.feridasTumoresPeriodo;
    }

    /**
    * seta o valor de feridasTumoresObs
    * @param pFeridasTumoresObs
    */
    public void setFeridasTumoresObs(String pFeridasTumoresObs){
        this.feridasTumoresObs = pFeridasTumoresObs;
    }
    /**
    * return feridasTumoresObs
    */
    public String getFeridasTumoresObs(){
        return this.feridasTumoresObs;
    }

    @Override
    public String toString(){
        return "ModelMedicamentoTratamento2 {" + "::idMedicamentoTratamento2 = " + this.idMedicamentoTratamento2 + "::paciente = " + this.paciente + "::alergias = " + this.alergias + "::alergiasTipo = " + this.alergiasTipo + "::alergiasPeriodo = " + this.alergiasPeriodo + "::alergiasObs = " + this.alergiasObs + "::hernia = " + this.hernia + "::herniaTipo = " + this.herniaTipo + "::herniaPeriodo = " + this.herniaPeriodo + "::herniaObs = " + this.herniaObs + "::doencaEstomago = " + this.doencaEstomago + "::doencaEstomagoTipo = " + this.doencaEstomagoTipo + "::doencaEstomagoPeriodo = " + this.doencaEstomagoPeriodo + "::doencaEstomagoObs = " + this.doencaEstomagoObs + "::doencaOssos = " + this.doencaOssos + "::doencaOssosTipo = " + this.doencaOssosTipo + "::doencaOssosPeriodo = " + this.doencaOssosPeriodo + "::doencaOssosObs = " + this.doencaOssosObs + "::doencaPulmoes = " + this.doencaPulmoes + "::doencaPulmoesTipo = " + this.doencaPulmoesTipo + "::doencaPulmoesPeriodo = " + this.doencaPulmoesPeriodo + "::doencaPulmoesObs = " + this.doencaPulmoesObs + "::doentaAutoimune = " + this.doentaAutoimune + "::doentaAutoimuneTipo = " + this.doentaAutoimuneTipo + "::doentaAutoimunePeriodo = " + this.doentaAutoimunePeriodo + "::doentaAutoimuneObs = " + this.doentaAutoimuneObs + "::cancer = " + this.cancer + "::cancerTipo = " + this.cancerTipo + "::cancerPeriodo = " + this.cancerPeriodo + "::cancerObs = " + this.cancerObs + "::feridasTumores = " + this.feridasTumores + "::feridasTumoresTipo = " + this.feridasTumoresTipo + "::feridasTumoresPeriodo = " + this.feridasTumoresPeriodo + "::feridasTumoresObs = " + this.feridasTumoresObs +  "}";
    }
}