package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.PacienteDAO;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class PacienteController {

    PacienteDAO medicamentoTratamentoDAO = new PacienteDAO();

    /**
     * grava MedicamentoTratamento
     *
     * @param pMedicamentoTratamentoModel return int
     * @param pQuadroPsicofisicoModel
     * @return
     */
    public int salvarMedicamentoTratamentoController(PacienteModel pMedicamentoTratamentoModel) {
        return this.medicamentoTratamentoDAO.salvarMedicamentoTratamentoDAO(pMedicamentoTratamentoModel);
    }

    /**
     * recupera MedicamentoTratamento
     *
     * @param pIdMedicamentoTratamento
     * @return PacienteModel
     */
    public PacienteModel getMedicamentoTratamentoController(int pIdMedicamentoTratamento) {
        return this.medicamentoTratamentoDAO.getMedicamentoTratamentoDAO(pIdMedicamentoTratamento);
    }

    /**
     * recupera uma lista deMedicamentoTratamento
     *
     * @return ArrayList
     */
    public ArrayList<PacienteModel> getListaMedicamentoTratamentoController() {
        return this.medicamentoTratamentoDAO.getListaMedicamentoTratamentoDAO();
    }

    /**
     * atualiza MedicamentoTratamento
     *
     * @param pMedicamentoTratamentoModel return boolean
     * @return
     */
    public boolean atualizarMedicamentoTratamentoController(PacienteModel pMedicamentoTratamentoModel) {
        return this.medicamentoTratamentoDAO.atualizarMedicamentoTratamentoDAO(pMedicamentoTratamentoModel);
    }

    /**
     * exclui MedicamentoTratamento
     *
     * @param pIdMedicamentoTratamento
     * @return boolean
     */
    public boolean excluirMedicamentoTratamentoController(int pIdMedicamentoTratamento) {
        return this.medicamentoTratamentoDAO.excluirMedicamentoTratamentoDAO(pIdMedicamentoTratamento);
    }

}
