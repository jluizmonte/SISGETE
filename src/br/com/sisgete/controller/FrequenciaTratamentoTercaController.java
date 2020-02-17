package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.FrequenciaTratamentoTercaDAO;
import br.com.sisgete.model.FrequenciaTratamentoTercaModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoTercaController {

    private FrequenciaTratamentoTercaDAO frequenciaTratamentoTercaDAO = new FrequenciaTratamentoTercaDAO();

    /**
     * grava FrequenciaTratamentoTerca
     *
     * @param pFrequenciaTratamentoTercaModel return int
     * @return
     */
    public int salvarFrequenciaTratamentoTercaController(FrequenciaTratamentoTercaModel pFrequenciaTratamentoTercaModel) {
        return this.frequenciaTratamentoTercaDAO.salvarFrequenciaTratamentoTercaDAO(pFrequenciaTratamentoTercaModel);
    }

    /**
     * recupera FrequenciaTratamentoTerca
     *
     * @param pIdFrequenciaTratamentoTerca return FrequenciaTratamentoTercaModel
     * @return
     */
    public FrequenciaTratamentoTercaModel getFrequenciaTratamentoTercaController(int pIdFrequenciaTratamentoTerca) {
        return this.frequenciaTratamentoTercaDAO.getFrequenciaTratamentoTercaDAO(pIdFrequenciaTratamentoTerca);
    }

    /**
     * recupera uma lista deFrequenciaTratamentoTerca
     *
     * @return
     */
    public ArrayList<FrequenciaTratamentoTercaModel> getListaFrequenciaTratamentoTercaController() {
        return this.frequenciaTratamentoTercaDAO.getListaFrequenciaTratamentoTercaDAO();
    }

    /**
     * atualiza FrequenciaTratamentoTerca
     *
     * @param pFrequenciaTratamentoTercaModel return boolean
     * @return
     */
    public boolean atualizarFrequenciaTratamentoTercaController(FrequenciaTratamentoTercaModel pFrequenciaTratamentoTercaModel) {
        return this.frequenciaTratamentoTercaDAO.atualizarFrequenciaTratamentoTercaDAO(pFrequenciaTratamentoTercaModel);
    }

    /**
     * exclui FrequenciaTratamentoTerca
     *
     * @param pIdFrequenciaTratamentoTerca return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoTercaController(int pIdFrequenciaTratamentoTerca) {
        return this.frequenciaTratamentoTercaDAO.excluirFrequenciaTratamentoTercaDAO(pIdFrequenciaTratamentoTerca);
    }
}
