package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.MedicamentoTratamentoDAO;
import br.com.sisgete.model.MedicamentoTratamentoModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class MedicamentoTratamentoController {

    MedicamentoTratamentoDAO medicamentoTratamentoDAO = new MedicamentoTratamentoDAO();

    /**
     * grava MedicamentoTratamento
     *
     * @param pMedicamentoTratamentoModel return int
     * @return
     */
    public int salvarMedicamentoTratamentoController(MedicamentoTratamentoModel pMedicamentoTratamentoModel) {
        return this.medicamentoTratamentoDAO.salvarMedicamentoTratamentoDAO(pMedicamentoTratamentoModel);
    }

    /**
     * recupera MedicamentoTratamento
     *
     * @param pIdMedicamentoTratamento
     * @return MedicamentoTratamentoModel
     */
    public MedicamentoTratamentoModel getMedicamentoTratamentoController(int pIdMedicamentoTratamento) {
        return this.medicamentoTratamentoDAO.getMedicamentoTratamentoDAO(pIdMedicamentoTratamento);
    }

    /**
     * recupera uma lista deMedicamentoTratamento
     *
     * @return ArrayList
     */
    public ArrayList<MedicamentoTratamentoModel> getListaMedicamentoTratamentoController() {
        return this.medicamentoTratamentoDAO.getListaMedicamentoTratamentoDAO();
    }

    /**
     * atualiza MedicamentoTratamento
     *
     * @param pMedicamentoTratamentoModel return boolean
     * @return
     */
    public boolean atualizarMedicamentoTratamentoController(MedicamentoTratamentoModel pMedicamentoTratamentoModel) {
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
