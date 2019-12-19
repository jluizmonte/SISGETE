package br.com.sisgete.controller;

import br.com.sisgete.model.AtendenteFraternoModel;
import br.com.sisgete.model.DAO.AtendenteFraternoDAO;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class AtendenteFraternoController {

    private AtendenteFraternoDAO atendenteFraternoDAO = new AtendenteFraternoDAO();

    /**
     * grava atendenteFraterno
     *
     * @param pAtendenteFraternoModel return int
     */
    public int salvaratendenteFraternoController(AtendenteFraternoModel pAtendenteFraternoModel) {
        return this.atendenteFraternoDAO.salvaratendenteFraternoDAO(pAtendenteFraternoModel);
    }

    /**
     * recupera atendenteFraterno
     *
     * @param pIdAtendenteFraterno return AtendenteFraternoModel
     */
    public AtendenteFraternoModel getatendenteFraternoController(int pIdAtendenteFraterno) {
        return this.atendenteFraternoDAO.getatendenteFraternoDAO(pIdAtendenteFraterno);
    }

    /**
     * recupera uma lista deatendenteFraterno
     *
     * @param pIdAtendenteFraterno return ArrayList
     */
    public ArrayList<AtendenteFraternoModel> getListaatendenteFraternoController() {
        return this.atendenteFraternoDAO.getListaatendenteFraternoDAO();
    }

    /**
     * atualiza atendenteFraterno
     *
     * @param pAtendenteFraternoModel return boolean
     */
    public boolean atualizaratendenteFraternoController(AtendenteFraternoModel pAtendenteFraternoModel) {
        return this.atendenteFraternoDAO.atualizaratendenteFraternoDAO(pAtendenteFraternoModel);
    }

    /**
     * exclui atendenteFraterno
     *
     * @param pIdAtendenteFraterno return boolean
     */
    public boolean excluiratendenteFraternoController(int pIdAtendenteFraterno) {
        return this.atendenteFraternoDAO.excluiratendenteFraternoDAO(pIdAtendenteFraterno);
    }
}
