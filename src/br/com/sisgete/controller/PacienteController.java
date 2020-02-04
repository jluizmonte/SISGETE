package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.PacienteDAO;
import br.com.sisgete.model.PacienteModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class PacienteController {

    PacienteDAO pacienteDAO = new PacienteDAO();

    /**
     * grava Paciente
     *
     * @param pPacienteModel return int
     * @return
     */
    public int salvarPacienteController(PacienteModel pPacienteModel) {
        return this.pacienteDAO.salvarPacienteDAO(pPacienteModel);
    }

    /**
     * recupera Paciente
     *
     * @param pIdPaciente
     * @return PacienteModel
     */
    public PacienteModel getPacienteController(int pIdPaciente) {
        return this.pacienteDAO.getPacienteDAO(pIdPaciente);
    }

    /**
     *
     * @param pPaciente
     * @return
     */
    public PacienteModel getPaciente(String pPaciente) {
        return this.pacienteDAO.getPacienteDAO(pPaciente);
    }

    /**
     * recupera uma lista de Paciente
     *
     * @return ArrayList
     */
    public ArrayList<PacienteModel> getListaPacienteController() {
        return this.pacienteDAO.getListaPacienteDAO();
    }

    /**
     * recupera uma lista de Pacientes ativos
     *
     * @return ArrayList
     */
    public ArrayList<PacienteModel> getListaPacienteAtivoController() {
        return this.pacienteDAO.getListaPacienteAtivoDAO();
    }

    /**
     * atualiza Paciente
     *
     * @param pPacienteModel return boolean
     * @return
     */
    public boolean atualizarPacienteController(PacienteModel pPacienteModel) {
        return this.pacienteDAO.atualizarPacienteDAO(pPacienteModel);
    }

    /**
     * exclui Paciente
     *
     * @param pIdPaciente
     * @return boolean
     */
    public boolean excluirPacienteController(int pIdPaciente) {
        return this.pacienteDAO.excluirPacienteDAO(pIdPaciente);
    }

}
