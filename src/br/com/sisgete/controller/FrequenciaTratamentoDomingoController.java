package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.FrequenciaTratamentoDomingoDAO;
import br.com.sisgete.model.FrequenciaTratamentoDomingoModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoDomingoController {

    private FrequenciaTratamentoDomingoDAO frequenciaDomingoDao = new FrequenciaTratamentoDomingoDAO();

    /**
     * grava FrequenciaTratamentoDomingo
     *
     * @param pFrequenciaTratamentoDomingoModel return int
     * @return
     */
    public int salvarFrequenciaTratamentoDomingoController(FrequenciaTratamentoDomingoModel pFrequenciaTratamentoDomingoModel) {
        return this.frequenciaDomingoDao.salvarFrequenciaTratamentoDomingoDAO(pFrequenciaTratamentoDomingoModel);
    }

    /**
     * recupera FrequenciaTratamentoDomingo
     *
     * @param pIdQuadroPsicofisicoDomingo return
     * FrequenciaTratamentoDomingoModel
     * @return
     */
    public FrequenciaTratamentoDomingoModel getFrequenciaTratamentoDomingoController(int pIdQuadroPsicofisicoDomingo) {
        return this.frequenciaDomingoDao.getFrequenciaTratamentoDomingoDAO(pIdQuadroPsicofisicoDomingo);
    }

    /**
     * recupera uma lista deFrequenciaTratamentoDomingo
     *
     * @return
     */
    public ArrayList<FrequenciaTratamentoDomingoModel> getListaFrequenciaTratamentoDomingoController() {
        return this.frequenciaDomingoDao.getListaFrequenciaTratamentoDomingoDAO();
    }

    /**
     * atualiza FrequenciaTratamentoDomingo
     *
     * @param pFrequenciaTratamentoDomingoModel return boolean
     * @return
     */
    public boolean atualizarFrequenciaTratamentoDomingoController(FrequenciaTratamentoDomingoModel pFrequenciaTratamentoDomingoModel) {
        return this.frequenciaDomingoDao.atualizarFrequenciaTratamentoDomingoDAO(pFrequenciaTratamentoDomingoModel);
    }

    /**
     * exclui FrequenciaTratamentoDomingo
     *
     * @param pIdQuadroPsicofisicoDomingo return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoDomingoController(int pIdQuadroPsicofisicoDomingo) {
        return this.frequenciaDomingoDao.excluirFrequenciaTratamentoDomingoDAO(pIdQuadroPsicofisicoDomingo);
    }
}
