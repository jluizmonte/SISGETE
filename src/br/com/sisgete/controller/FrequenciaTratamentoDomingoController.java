package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.FrequenciaTratamentoDomingoDAO;
import br.com.sisgete.model.FrequenciaTratamentoDomingoModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoDomingoController {

    private FrequenciaTratamentoDomingoDAO daoFrequenciaTratamentoDomingo = new FrequenciaTratamentoDomingoDAO();

    /**
     * grava FrequenciaTratamentoDomingo
     *
     * @param pFrequenciaTratamentoDomingoModel return int
     * @return
     */
    public int salvarFrequenciaTratamentoDomingoController(FrequenciaTratamentoDomingoModel pFrequenciaTratamentoDomingoModel) {
        return this.daoFrequenciaTratamentoDomingo.salvarFrequenciaTratamentoDomingoDAO(pFrequenciaTratamentoDomingoModel);
    }

    /**
     * recupera FrequenciaTratamentoDomingo
     *
     * @param pIdFrequenciaTratamentoDomingo return
     * FrequenciaTratamentoDomingoModel
     * @return
     */
    public FrequenciaTratamentoDomingoModel getFrequenciaTratamentoDomingoController(int pIdFrequenciaTratamentoDomingo) {
        return this.daoFrequenciaTratamentoDomingo.getFrequenciaTratamentoDomingoDAO(pIdFrequenciaTratamentoDomingo);
    }

    /**
     * recupera uma lista deFrequenciaTratamentoDomingo
     *
     * @return
     */
    public ArrayList<FrequenciaTratamentoDomingoModel> getListaFrequenciaTratamentoDomingoController() {
        return this.daoFrequenciaTratamentoDomingo.getListaFrequenciaTratamentoDomingoDAO();
    }

    /**
     * atualiza FrequenciaTratamentoDomingo
     *
     * @param pFrequenciaTratamentoDomingoModel return boolean
     * @return
     */
    public boolean atualizarFrequenciaTratamentoDomingoController(FrequenciaTratamentoDomingoModel pFrequenciaTratamentoDomingoModel) {
        return this.daoFrequenciaTratamentoDomingo.atualizarFrequenciaTratamentoDomingoDAO(pFrequenciaTratamentoDomingoModel);
    }

    /**
     * exclui FrequenciaTratamentoDomingo
     *
     * @param pIdFrequenciaTratamentoDomingo return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoDomingoController(int pIdFrequenciaTratamentoDomingo) {
        return this.daoFrequenciaTratamentoDomingo.excluirFrequenciaTratamentoDomingoDAO(pIdFrequenciaTratamentoDomingo);
    }
}
