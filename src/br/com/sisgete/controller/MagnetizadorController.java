package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.MagnetizadorDAO;
import br.com.sisgete.model.MagnetizadorModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class MagnetizadorController {

    private MagnetizadorDAO magnetizadorDAO = new MagnetizadorDAO();

    /**
     * grava Magnetizador
     *
     * @param pMagnetizadorModel return int
     * @return
     */
    public int salvarMagnetizadorController(MagnetizadorModel pMagnetizadorModel) {
        return this.magnetizadorDAO.salvarMagnetizadorDAO(pMagnetizadorModel);
    }

    /**
     * recupera Magnetizador
     *
     * @param pIdMagnetizador return MagnetizadorModel
     * @return
     */
    public MagnetizadorModel getMagnetizadorController(int pIdMagnetizador) {
        return this.magnetizadorDAO.getMagnetizadorDAO(pIdMagnetizador);
    }

    /**
     * recupera Magnetizador
     *
     * @param pMagnetizador return MagnetizadorModel
     * @return
     */
    public MagnetizadorModel getMagnetizadorController(String pMagnetizador) {
        return this.magnetizadorDAO.getMagnetizadorDAO(pMagnetizador);
    }

    /**
     * recupera uma lista deMagnetizador
     *
     * @return
     */
    public ArrayList<MagnetizadorModel> getListaMagnetizadorController() {
        return this.magnetizadorDAO.getListaMagnetizadorDAO();
    }

    /**
     * atualiza Magnetizador
     *
     * @param pMagnetizadorModel return boolean
     * @return
     */
    public boolean atualizarMagnetizadorController(MagnetizadorModel pMagnetizadorModel) {
        return this.magnetizadorDAO.atualizarMagnetizadorDAO(pMagnetizadorModel);
    }

    /**
     * exclui Magnetizador
     *
     * @param pIdMagnetizador return boolean
     * @return
     */
    public boolean excluirMagnetizadorController(int pIdMagnetizador) {
        return this.magnetizadorDAO.excluirMagnetizadorDAO(pIdMagnetizador);
    }
}
