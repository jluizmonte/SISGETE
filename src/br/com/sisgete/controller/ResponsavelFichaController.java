package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.ResponsavelFichaDAO;
import br.com.sisgete.model.ResponsavelFichaModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class ResponsavelFichaController {

    private ResponsavelFichaDAO responsavelFichaDAO = new ResponsavelFichaDAO();

    /**
     * grava responsavelFicha
     *
     * @param pResponsavelFichaModel return int
     */
    public int salvarresponsavelFichaController(ResponsavelFichaModel pResponsavelFichaModel) {
        return this.responsavelFichaDAO.salvarresponsavelFichaDAO(pResponsavelFichaModel);
    }

    /**
     * recupera responsavelFicha
     *
     * @param pIdResponsavelFicha return ResponsavelFichaModel
     */
    public ResponsavelFichaModel getresponsavelFichaController(int pIdResponsavelFicha) {
        return this.responsavelFichaDAO.getresponsavelFichaDAO(pIdResponsavelFicha);
    }

    /**
     * recupera uma lista deresponsavelFicha
     *
     * @param pIdResponsavelFicha return ArrayList
     */
    public ArrayList<ResponsavelFichaModel> getListaresponsavelFichaController() {
        return this.responsavelFichaDAO.getListaresponsavelFichaDAO();
    }

    /**
     * atualiza responsavelFicha
     *
     * @param pResponsavelFichaModel return boolean
     */
    public boolean atualizarresponsavelFichaController(ResponsavelFichaModel pResponsavelFichaModel) {
        return this.responsavelFichaDAO.atualizarresponsavelFichaDAO(pResponsavelFichaModel);
    }

    /**
     * exclui responsavelFicha
     *
     * @param pIdResponsavelFicha return boolean
     */
    public boolean excluirresponsavelFichaController(int pIdResponsavelFicha) {
        return this.responsavelFichaDAO.excluirresponsavelFichaDAO(pIdResponsavelFicha);
    }
}
