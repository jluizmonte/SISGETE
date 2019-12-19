package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.FrequenciaTratamentoDAO;
import br.com.sisgete.model.FrequenciaTratamentoModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoController {

    private FrequenciaTratamentoDAO frequenciaTratamentoDAO = new FrequenciaTratamentoDAO();

    /**
     * grava frequenciaTratamento
     *
     * @param pFrequenciaTratamentoModel return int
     */
    public int salvarfrequenciaTratamentoController(FrequenciaTratamentoModel pFrequenciaTratamentoModel) {
        return this.frequenciaTratamentoDAO.salvarfrequenciaTratamentoDAO(pFrequenciaTratamentoModel);
    }

    /**
     * recupera frequenciaTratamento
     *
     * @param pIdFrequencia return FrequenciaTratamentoModel
     */
    public FrequenciaTratamentoModel getfrequenciaTratamentoController(int pIdFrequencia) {
        return this.frequenciaTratamentoDAO.getfrequenciaTratamentoDAO(pIdFrequencia);
    }

    /**
     * recupera uma lista defrequenciaTratamento
     *
     * @param pIdFrequencia return ArrayList
     */
    public ArrayList<FrequenciaTratamentoModel> getListafrequenciaTratamentoController() {
        return this.frequenciaTratamentoDAO.getListafrequenciaTratamentoDAO();
    }

    /**
     * atualiza frequenciaTratamento
     *
     * @param pFrequenciaTratamentoModel return boolean
     */
    public boolean atualizarfrequenciaTratamentoController(FrequenciaTratamentoModel pFrequenciaTratamentoModel) {
        return this.frequenciaTratamentoDAO.atualizarfrequenciaTratamentoDAO(pFrequenciaTratamentoModel);
    }

    /**
     * exclui frequenciaTratamento
     *
     * @param pIdFrequencia return boolean
     */
    public boolean excluirfrequenciaTratamentoController(int pIdFrequencia) {
        return this.frequenciaTratamentoDAO.excluirfrequenciaTratamentoDAO(pIdFrequencia);
    }
}
