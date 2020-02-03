package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.FrequenciaTratamentoQuintaDAO;
import br.com.sisgete.model.FrequenciaTratamentoQuintaModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoQuintaController {

    private FrequenciaTratamentoQuintaDAO frequenciaQuintaDAO = new FrequenciaTratamentoQuintaDAO();

    /**
     * grava FrequenciaTratamentoQuinta
     *
     * @param pFrequenciaTratamentoQuintaModel return int
     * @return
     */
    public int salvarFrequenciaTratamentoQuintaController(FrequenciaTratamentoQuintaModel pFrequenciaTratamentoQuintaModel) {
        return this.frequenciaQuintaDAO.salvarFrequenciaTratamentoQuintaDAO(pFrequenciaTratamentoQuintaModel);
    }

    /**
     * recupera FrequenciaTratamentoQuinta
     *
     * @param pIdQuadroPsicofisicoQuinta return FrequenciaTratamentoQuintaModel
     * @return
     */
    public FrequenciaTratamentoQuintaModel getFrequenciaTratamentoQuintaController(int pIdQuadroPsicofisicoQuinta) {
        return this.frequenciaQuintaDAO.getFrequenciaTratamentoQuintaDAO(pIdQuadroPsicofisicoQuinta);
    }

    /**
     * recupera uma lista deFrequenciaTratamentoQuinta
     *
     * @param pIdQuadroPsicofisicoQuinta return ArrayList
     * @return
     */
    public ArrayList<FrequenciaTratamentoQuintaModel> getListaFrequenciaTratamentoQuintaController() {
        return this.frequenciaQuintaDAO.getListaFrequenciaTratamentoQuintaDAO();
    }

    /**
     * atualiza FrequenciaTratamentoQuinta
     *
     * @param pFrequenciaTratamentoQuintaModel return boolean
     * @return
     */
    public boolean atualizarFrequenciaTratamentoQuintaController(FrequenciaTratamentoQuintaModel pFrequenciaTratamentoQuintaModel) {
        return this.frequenciaQuintaDAO.atualizarFrequenciaTratamentoQuintaDAO(pFrequenciaTratamentoQuintaModel);
    }

    /**
     * exclui FrequenciaTratamentoQuinta
     *
     * @param pIdQuadroPsicofisicoQuinta return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoQuintaController(int pIdQuadroPsicofisicoQuinta) {
        return this.frequenciaQuintaDAO.excluirFrequenciaTratamentoQuintaDAO(pIdQuadroPsicofisicoQuinta);
    }
}
