package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.QuadroPsicofisicoDAO;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class QuadroPsicofisicoController {

    private QuadroPsicofisicoDAO quadroPsicofisicoDAO = new QuadroPsicofisicoDAO();

    /**
     * grava quadroPsicofisico
     *
     * @param pQuadroPsicofisicoModel return int
     */
    public int salvarquadroPsicofisicoController(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        return this.quadroPsicofisicoDAO.salvarquadroPsicofisicoDAO(pQuadroPsicofisicoModel);
    }

    /**
     * recupera quadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return QuadroPsicofisicoModel
     */
    public QuadroPsicofisicoModel getquadroPsicofisicoController(int pIdQuadroPsicofisico) {
        return this.quadroPsicofisicoDAO.getquadroPsicofisicoDAO(pIdQuadroPsicofisico);
    }

    /**
     * recupera uma lista dequadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return ArrayList
     */
    public ArrayList<QuadroPsicofisicoModel> getListaquadroPsicofisicoController() {
        return this.quadroPsicofisicoDAO.getListaquadroPsicofisicoDAO();
    }

    /**
     * atualiza quadroPsicofisico
     *
     * @param pQuadroPsicofisicoModel return boolean
     */
    public boolean atualizarquadroPsicofisicoController(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        return this.quadroPsicofisicoDAO.atualizarquadroPsicofisicoDAO(pQuadroPsicofisicoModel);
    }

    /**
     * exclui quadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return boolean
     */
    public boolean excluirquadroPsicofisicoController(int pIdQuadroPsicofisico) {
        return this.quadroPsicofisicoDAO.excluirquadroPsicofisicoDAO(pIdQuadroPsicofisico);
    }
}
