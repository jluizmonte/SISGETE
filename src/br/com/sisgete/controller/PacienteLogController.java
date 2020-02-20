package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.PacienteLogDAO;
import br.com.sisgete.model.PacienteLogModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class PacienteLogController {

    PacienteLogDAO pacienteLogDAO = new PacienteLogDAO();

    public int insertPacienteLog(PacienteLogModel pacienteLogModel) {
        return this.pacienteLogDAO.insertPacienteLog(pacienteLogModel);
    }

    public ArrayList<PacienteLogModel> getListaPacienteLogController() {
        return this.pacienteLogDAO.getListaPacienteLogDAO();
    }

    public ArrayList<PacienteLogModel> getListaPacienteAtendimentoLogDAO() {
        return this.pacienteLogDAO.getListaPacienteAtendimentoLogDAO();
    }

    public int getQtdePacienteAtendimento() {
        return this.pacienteLogDAO.getQtdePacienteAtendimento();
    }

    public int getQtdePacienteConsulta() {
        return this.pacienteLogDAO.getQtdePacienteConsulta();
    }
}
