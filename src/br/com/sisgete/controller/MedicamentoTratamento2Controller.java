package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.MedicamentoTratamento2DAO;
import br.com.sisgete.model.MedicamentoTratamento2Model;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class MedicamentoTratamento2Controller {

    private MedicamentoTratamento2DAO daoMedicamentoTratamento2 = new MedicamentoTratamento2DAO();

    /**
     * grava MedicamentoTratamento2
     *
     * @param pMedicamentoTratamento2Model return int
     */
    public int salvarMedicamentoTratamento2Controller(MedicamentoTratamento2Model pMedicamentoTratamento2Model) {
        return this.daoMedicamentoTratamento2.salvarMedicamentoTratamento2DAO(pMedicamentoTratamento2Model);
    }

    /**
     * recupera MedicamentoTratamento2
     *
     * @param pIdMedicamentoTratamento2 return MedicamentoTratamento2Model
     */
    public MedicamentoTratamento2Model getMedicamentoTratamento2Controller(int pIdMedicamentoTratamento2) {
        return this.daoMedicamentoTratamento2.getMedicamentoTratamento2DAO(pIdMedicamentoTratamento2);
    }

    /**
     * recupera uma lista deMedicamentoTratamento2
     *
     * @param pIdMedicamentoTratamento2 return ArrayList
     */
    public ArrayList<MedicamentoTratamento2Model> getListaMedicamentoTratamento2Controller() {
        return this.daoMedicamentoTratamento2.getListaMedicamentoTratamento2DAO();
    }

    /**
     * atualiza MedicamentoTratamento2
     *
     * @param pMedicamentoTratamento2Model return boolean
     */
    public boolean atualizarMedicamentoTratamento2Controller(MedicamentoTratamento2Model pMedicamentoTratamento2Model) {
        return this.daoMedicamentoTratamento2.atualizarMedicamentoTratamento2DAO(pMedicamentoTratamento2Model);
    }

    /**
     * exclui MedicamentoTratamento2
     *
     * @param pIdMedicamentoTratamento2 return boolean
     */
    public boolean excluirMedicamentoTratamento2Controller(int pIdMedicamentoTratamento2) {
        return this.daoMedicamentoTratamento2.excluirMedicamentoTratamento2DAO(pIdMedicamentoTratamento2);
    }
}
