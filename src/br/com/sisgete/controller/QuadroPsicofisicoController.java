package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.QuadroPsicofisicoDAO;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class QuadroPsicofisicoController {

    private QuadroPsicofisicoDAO daoQuadroPsicofisico = new QuadroPsicofisicoDAO();

    /**
     * grava QuadroPsicofisico
     *
     * @param pQuadroPsicofisicoModel return int
     */
    public int salvarQuadroPsicofisicoController(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        return this.daoQuadroPsicofisico.salvarQuadroPsicofisicoDAO(pQuadroPsicofisicoModel);
    }

    /**
     * recupera QuadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return QuadroPsicofisicoModel
     */
    public QuadroPsicofisicoModel getQuadroPsicofisicoController(int pIdQuadroPsicofisico) {
        return this.daoQuadroPsicofisico.getQuadroPsicofisicoDAO(pIdQuadroPsicofisico);
    }

    /**
     * recupera uma lista deQuadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return ArrayList
     */
    public ArrayList<QuadroPsicofisicoModel> getListaQuadroPsicofisicoController() {
        return this.daoQuadroPsicofisico.getListaQuadroPsicofisicoDAO();
    }

    /**
     * atualiza QuadroPsicofisico
     *
     * @param pQuadroPsicofisicoModel return boolean
     */
    public boolean atualizarQuadroPsicofisicoController(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        return this.daoQuadroPsicofisico.atualizarQuadroPsicofisicoDAO(pQuadroPsicofisicoModel);
    }

    /**
     * exclui QuadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return boolean
     */
    public boolean excluirQuadroPsicofisicoController(int pIdQuadroPsicofisico) {
        return this.daoQuadroPsicofisico.excluirQuadroPsicofisicoDAO(pIdQuadroPsicofisico);
    }
}
