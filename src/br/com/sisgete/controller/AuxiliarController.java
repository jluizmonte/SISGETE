package br.com.sisgete.controller;

import br.com.sisgete.model.AuxiliarModel;
import br.com.sisgete.model.DAO.AuxiliarDAO;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class AuxiliarController {

    private AuxiliarDAO auxiliarDao = new AuxiliarDAO();

    /**
     * grava Auxiliar
     *
     * @param pAuxiliarModel return int
     * @return
     */
    public int salvarAuxiliarController(AuxiliarModel pAuxiliarModel) {
        return this.auxiliarDao.salvarAuxiliarDAO(pAuxiliarModel);
    }

    /**
     * recupera Auxiliar
     *
     * @param pIdAuxiliar return AuxiliarModel
     * @return
     */
    public AuxiliarModel getAuxiliarController(int pIdAuxiliar) {
        return this.auxiliarDao.getAuxiliarDAO(pIdAuxiliar);
    }

    /**
     * recupera Auxiliar
     *
     * @param pAuxiliar
     * @return
     */
    public AuxiliarModel getAuxiliarController(String pAuxiliar) {
        return this.auxiliarDao.getAuxiliarDAO(pAuxiliar);
    }

    /**
     * recupera uma lista deAuxiliar
     *
     * @return
     */
    public ArrayList<AuxiliarModel> getListaAuxiliarController() {
        return this.auxiliarDao.getListaAuxiliarDAO();
    }

    /**
     * atualiza Auxiliar
     *
     * @param pAuxiliarModel return boolean
     * @return
     */
    public boolean atualizarAuxiliarController(AuxiliarModel pAuxiliarModel) {
        return this.auxiliarDao.atualizarAuxiliarDAO(pAuxiliarModel);
    }

    /**
     * exclui Auxiliar
     *
     * @param pIdAuxiliar return boolean
     * @return
     */
    public boolean excluirAuxiliarController(int pIdAuxiliar) {
        return this.auxiliarDao.excluirAuxiliarDAO(pIdAuxiliar);
    }
}
