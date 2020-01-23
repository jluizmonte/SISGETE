package br.com.sisgete.model;

/**
 *
 * @author luiz
 */
public class PacienteLogModel {

    private int idPacienteLog;
    private String pacienteLog;
    private String setorPacienteLog;

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

    @Override
    public String toString() {
        return "PacienteLogModel{" + "idPacienteLog=" + idPacienteLog + ", pacienteLog=" + pacienteLog + ", setorPaceinteLog=" + setorPacienteLog + '}';
    }

}
