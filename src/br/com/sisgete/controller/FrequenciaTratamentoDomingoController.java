package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.FrequenciaTratamentoDomingoDAO;
import br.com.sisgete.model.FrequenciaTratamentoDomingoModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoDomingoController {

    private FrequenciaTratamentoDomingoDAO frequenciaTratamentoDomingoDAO = new FrequenciaTratamentoDomingoDAO();

    /**
     * grava FrequenciaTratamentoDomingo
     *
     * @param pFrequenciaTratamentoDomingoModel return int
     * @return
     */
    public int salvarFrequenciaTratamentoDomingoController(FrequenciaTratamentoDomingoModel pFrequenciaTratamentoDomingoModel) {
        return this.frequenciaTratamentoDomingoDAO.salvarFrequenciaTratamentoDomingoDAO(pFrequenciaTratamentoDomingoModel);
    }

    /**
     * recupera FrequenciaTratamentoDomingo
     *
     * @param pIdFrequenciaTratamentoDomingo return
     * FrequenciaTratamentoDomingoModel
     * @return
     */
    public FrequenciaTratamentoDomingoModel getFrequenciaTratamentoDomingoController(int pIdFrequenciaTratamentoDomingo) {
        return this.frequenciaTratamentoDomingoDAO.getFrequenciaTratamentoDomingoDAO(pIdFrequenciaTratamentoDomingo);
    }

    /**
     * recupera uma lista deFrequenciaTratamentoDomingo
     *
     * @return
     */
    public ArrayList<FrequenciaTratamentoDomingoModel> getListaFrequenciaTratamentoDomingoController() {
        return this.frequenciaTratamentoDomingoDAO.getListaFrequenciaTratamentoDomingoDAO();
    }

    /**
     * atualiza FrequenciaTratamentoDomingo
     *
     * @param pFrequenciaTratamentoDomingoModel return boolean
     * @return
     */
    public boolean atualizarFrequenciaTratamentoDomingoController(FrequenciaTratamentoDomingoModel pFrequenciaTratamentoDomingoModel) {
        return this.frequenciaTratamentoDomingoDAO.atualizarFrequenciaTratamentoDomingoDAO(pFrequenciaTratamentoDomingoModel);
    }

    /**
     * exclui FrequenciaTratamentoDomingo
     *
     * @param pIdFrequenciaTratamentoDomingo return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoDomingoController(int pIdFrequenciaTratamentoDomingo) {
        return this.frequenciaTratamentoDomingoDAO.excluirFrequenciaTratamentoDomingoDAO(pIdFrequenciaTratamentoDomingo);
    }
}
