package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class PacienteLogModel {

    private int idPacienteLog;
    private String pacienteLog;
    private String setorPacienteLog;
    private String tipoPacienteLog;

    public int getIdPacienteLog() {
        return idPacienteLog;
    }

    public void setIdPacienteLog(int idPacienteLog) {
        this.idPacienteLog = idPacienteLog;
    }

    public String getPacienteLog() {
        return pacienteLog;
    }

    public void setPacienteLog(String pacienteLog) {
        this.pacienteLog = pacienteLog;
    }

    public String getSetorPacienteLog() {
        return setorPacienteLog;
    }

    public void setSetorPacienteLog(String setorPacienteLog) {
        this.setorPacienteLog = setorPacienteLog;
    }

    public String getTipoPacienteLog() {
        return tipoPacienteLog;
    }

    public void setTipoPacienteLog(String tipoPacienteLog) {
        this.tipoPacienteLog = tipoPacienteLog;
    }

    @Override
    public String toString() {
        return "PacienteLogModel{" + "idPacienteLog=" + idPacienteLog + ", pacienteLog=" + pacienteLog + ", setorPacienteLog=" + setorPacienteLog + ", tipoPacienteLog=" + tipoPacienteLog + '}';
    }

}
