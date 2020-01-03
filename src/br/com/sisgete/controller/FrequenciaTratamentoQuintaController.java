package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.FrequenciaTratamentoQuintaDAO;
import br.com.sisgete.model.FrequenciaTratamentoQuintaModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoQuintaController {

    private FrequenciaTratamentoQuintaDAO daoFrequenciaTratamentoQuinta = new FrequenciaTratamentoQuintaDAO();

    /**
     * grava FrequenciaTratamentoQuinta
     *
     * @param pFrequenciaTratamentoQuintaModel return int
     * @return
     */
    public int salvarFrequenciaTratamentoQuintaController(FrequenciaTratamentoQuintaModel pFrequenciaTratamentoQuintaModel) {
        return this.daoFrequenciaTratamentoQuinta.salvarFrequenciaTratamentoQuintaDAO(pFrequenciaTratamentoQuintaModel);
    }

    /**
     * recupera FrequenciaTratamentoQuinta
     *
     * @param pIdFrequenciaTratamentoQuinta return
     * FrequenciaTratamentoQuintaModel
     * @return
     */
    public FrequenciaTratamentoQuintaModel getFrequenciaTratamentoQuintaController(int pIdFrequenciaTratamentoQuinta) {
        return this.daoFrequenciaTratamentoQuinta.getFrequenciaTratamentoQuintaDAO(pIdFrequenciaTratamentoQuinta);
    }

    /**
     * recupera uma lista deFrequenciaTratamentoQuinta
     *
     * @return
     */
    public ArrayList<FrequenciaTratamentoQuintaModel> getListaFrequenciaTratamentoQuintaController() {
        return this.daoFrequenciaTratamentoQuinta.getListaFrequenciaTratamentoQuintaDAO();
    }

    /**
     * atualiza FrequenciaTratamentoQuinta
     *
     * @param pFrequenciaTratamentoQuintaModel return boolean
     * @return
     */
    public boolean atualizarFrequenciaTratamentoQuintaController(FrequenciaTratamentoQuintaModel pFrequenciaTratamentoQuintaModel) {
        return this.daoFrequenciaTratamentoQuinta.atualizarFrequenciaTratamentoQuintaDAO(pFrequenciaTratamentoQuintaModel);
    }

    /**
     * exclui FrequenciaTratamentoQuinta
     *
     * @param pIdFrequenciaTratamentoQuinta return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoQuintaController(int pIdFrequenciaTratamentoQuinta) {
        return this.daoFrequenciaTratamentoQuinta.excluirFrequenciaTratamentoQuintaDAO(pIdFrequenciaTratamentoQuinta);
    }
}
