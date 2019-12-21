package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.MedicamentoTratamento1DAO;
import br.com.sisgete.model.MedicamentoTratamento1Model;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class MedicamentoTratamento1Controller {

    private MedicamentoTratamento1DAO daoMedicamentoTratamento1 = new MedicamentoTratamento1DAO();

    /**
     * grava MedicamentoTratamento1
     *
     * @param pMedicamentoTratamento1Model return int
     */
    public int salvarMedicamentoTratamento1Controller(MedicamentoTratamento1Model pMedicamentoTratamento1Model) {
        return this.daoMedicamentoTratamento1.salvarMedicamentoTratamento1DAO(pMedicamentoTratamento1Model);
    }

    /**
     * recupera MedicamentoTratamento1
     *
     * @param pIdMedicamentoTratamento1 return MedicamentoTratamento1Model
     */
    public MedicamentoTratamento1Model getMedicamentoTratamento1Controller(int pIdMedicamentoTratamento1) {
        return this.daoMedicamentoTratamento1.getMedicamentoTratamento1DAO(pIdMedicamentoTratamento1);
    }

    /**
     * recupera uma lista deMedicamentoTratamento1
     *
     * @param pIdMedicamentoTratamento1 return ArrayList
     */
    public ArrayList<MedicamentoTratamento1Model> getListaMedicamentoTratamento1Controller() {
        return this.daoMedicamentoTratamento1.getListaMedicamentoTratamento1DAO();
    }

    /**
     * atualiza MedicamentoTratamento1
     *
     * @param pMedicamentoTratamento1Model return boolean
     */
    public boolean atualizarMedicamentoTratamento1Controller(MedicamentoTratamento1Model pMedicamentoTratamento1Model) {
        return this.daoMedicamentoTratamento1.atualizarMedicamentoTratamento1DAO(pMedicamentoTratamento1Model);
    }

    /**
     * exclui MedicamentoTratamento1
     *
     * @param pIdMedicamentoTratamento1 return boolean
     */
    public boolean excluirMedicamentoTratamento1Controller(int pIdMedicamentoTratamento1) {
        return this.daoMedicamentoTratamento1.excluirMedicamentoTratamento1DAO(pIdMedicamentoTratamento1);
    }
}
