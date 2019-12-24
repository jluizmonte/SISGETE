package br.com.sisgete.controller;

import br.com.sisgete.model.AtendenteFraternoModel;
import br.com.sisgete.model.DAO.AtendenteFraternoDAO;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class AtendenteFraternoController {

    AtendenteFraternoDAO atendenteFraternoDAO = new AtendenteFraternoDAO();

    /**
     * grava atendenteFraterno
     *
     * @param pAtendenteFraternoModel return int
     * @return
     */
    public int salvaratendenteFraternoController(AtendenteFraternoModel pAtendenteFraternoModel) {
        return this.atendenteFraternoDAO.salvarAtendenteFraternoDAO(pAtendenteFraternoModel);
    }

    /**
     * recupera atendenteFraterno
     *
     * @param pIdAtendenteFraterno retur
     * @return n AtendenteFraternoModel
     */
    public AtendenteFraternoModel getAtendenteFraternoController(int pIdAtendenteFraterno) {
        return this.atendenteFraternoDAO.getAtendenteFraternoDAO(pIdAtendenteFraterno);
    }

    public AtendenteFraternoModel getAtendenteFraternoController(String pAtendente) {
        return this.atendenteFraternoDAO.getAtendenteFraternoDAO(pAtendente);
    }

    /**
     * recupera uma lista deatendenteFraterno
     *
     * @return
     */
    public ArrayList<AtendenteFraternoModel> getListaatendenteFraternoController() {
        return this.atendenteFraternoDAO.getListaAtendenteFraternoDAO();
    }

    /**
     * atualiza atendenteFraterno
     *
     * @param pAtendenteFraternoModel return boolean
     * @return
     */
    public boolean atualizaratendenteFraternoController(AtendenteFraternoModel pAtendenteFraternoModel) {
        return this.atendenteFraternoDAO.atualizarAtendenteFraternoDAO(pAtendenteFraternoModel);
    }

    /**
     * exclui atendenteFraterno
     *
     * @param pIdAtendenteFraterno return boolean
     * @return
     */
    public boolean excluiratendenteFraternoController(int pIdAtendenteFraterno) {
        return this.atendenteFraternoDAO.excluirAtendenteFraternoDAO(pIdAtendenteFraterno);
    }

    public boolean getValidarAtendimentoController(AtendenteFraternoModel atendenteFraternoModel) {
        return this.atendenteFraternoDAO.getValidarAtendenteDAO(atendenteFraternoModel);
    }
}
