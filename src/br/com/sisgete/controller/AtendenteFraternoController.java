package br.com.sisgete.controller;

import br.com.sisgete.model.AtendenteFraternoModel;
import br.com.sisgete.model.DAO.AtendenteFraternoDAO;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class AtendenteFraternoController {

    private AtendenteFraternoDAO daoAtendenteFraterno = new AtendenteFraternoDAO();

    /**
     * grava AtendenteFraterno
     *
     * @param pAtendenteFraternoModel return int
     * @return
     */
    public int salvarAtendenteFraternoController(AtendenteFraternoModel pAtendenteFraternoModel) {
        return this.daoAtendenteFraterno.salvarAtendenteFraternoDAO(pAtendenteFraternoModel);
    }

    /**
     * recupera AtendenteFraterno
     *
     * @param pIdAtendenteFraterno
     * @return AtendenteFraternoModel
     */
    public AtendenteFraternoModel getAtendenteFraternoController(int pIdAtendenteFraterno) {
        return this.daoAtendenteFraterno.getAtendenteFraternoDAO(pIdAtendenteFraterno);
    }

    /**
     * recupera uma lista deAtendenteFraterno
     *
     * @param pIdAtendenteFraterno
     * @return ArrayList
     */
    public ArrayList<AtendenteFraternoModel> getListaAtendenteFraternoController() {
        return this.daoAtendenteFraterno.getListaAtendenteFraternoDAO();
    }

    /**
     * atualiza AtendenteFraterno
     *
     * @param pAtendenteFraternoModel
     * @return boolean
     */
    public boolean atualizarAtendenteFraternoController(AtendenteFraternoModel pAtendenteFraternoModel) {
        return this.daoAtendenteFraterno.atualizarAtendenteFraternoDAO(pAtendenteFraternoModel);
    }

    /**
     * exclui AtendenteFraterno
     *
     * @param pIdAtendenteFraterno
     * @return boolean
     */
    public boolean excluirAtendenteFraternoController(int pIdAtendenteFraterno) {
        return this.daoAtendenteFraterno.excluirAtendenteFraternoDAO(pIdAtendenteFraterno);
    }
}
