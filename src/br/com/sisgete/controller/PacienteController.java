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
     * salva um novo paciente
     *
     * @param pPacienteModel return int
     * @return
     */
    public int salvarPacienteController(PacienteModel pPacienteModel) {
        return this.pacienteDAO.salvarPacienteDAO(pPacienteModel);
    }

    /**
     * recupera um paciente pelo código
     *
     * @param pIdPaciente
     * @return PacienteModel
     */
    public PacienteModel getPacienteController(int pIdPaciente) {
        return this.pacienteDAO.getPacienteDAO(pIdPaciente);
    }

    /**
     * recupera um paciente pelo nome
     *
     * @param pPaciente
     * @return
     */
    public PacienteModel getPaciente(String pPaciente) {
        return this.pacienteDAO.getPacienteDAO(pPaciente);
    }

    /**
     * recupera um arrayList com todos os pacientes
     *
     * @return ArrayList
     */
    public ArrayList<PacienteModel> getListaPacienteController() {
        return this.pacienteDAO.getListaPacienteDAO();
    }

    /**
     * recupera um arrayList com os pacientes com fichas ativas
     *
     * @return ArrayList
     */
    public ArrayList<PacienteModel> getListaPacienteAtivoController() {
        return this.pacienteDAO.getListaPacienteAtivoDAO();
    }

    /**
     * recupera um arrayList com os pacientes liberados
     *
     * @return
     */
    public ArrayList<PacienteModel> getListaPacienteLiberadoDAO() {
        return this.pacienteDAO.getListaPacienteLiberadoDAO();
    }

    /**
     * recupera um arrayList com os pacientes com fichas ativas
     *
     * @return
     */
    public ArrayList<PacienteModel> getListaPacienteInativoDAO() {
        return this.pacienteDAO.getListaPacienteInativoDAO();
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
