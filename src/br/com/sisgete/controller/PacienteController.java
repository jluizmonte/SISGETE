package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.PacienteDAO;
import br.com.sisgete.model.PacienteModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class PacienteController {

    private PacienteDAO pacienteDAO = new PacienteDAO();

    /**
     * grava paciente
     *
     * @param pPacienteModel return int
     */
    public int salvarpacienteController(PacienteModel pPacienteModel) {
        return this.pacienteDAO.salvarpacienteDAO(pPacienteModel);
    }

    /**
     * recupera paciente
     *
     * @param pIdPaciente return PacienteModel
     */
    public PacienteModel getpacienteController(int pIdPaciente) {
        return this.pacienteDAO.getpacienteDAO(pIdPaciente);
    }

    /**
     * recupera uma lista depaciente
     *
     * @param pIdPaciente return ArrayList
     */
    public ArrayList<PacienteModel> getListapacienteController() {
        return this.pacienteDAO.getListapacienteDAO();
    }

    /**
     * atualiza paciente
     *
     * @param pPacienteModel return boolean
     */
    public boolean atualizarpacienteController(PacienteModel pPacienteModel) {
        return this.pacienteDAO.atualizarpacienteDAO(pPacienteModel);
    }

    /**
     * exclui paciente
     *
     * @param pIdPaciente return boolean
     */
    public boolean excluirpacienteController(int pIdPaciente) {
        return this.pacienteDAO.excluirpacienteDAO(pIdPaciente);
    }
}
