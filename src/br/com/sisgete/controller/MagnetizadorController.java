package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.MagnetizadorDAO;
import br.com.sisgete.model.MagnetizadorModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class MagnetizadorController {

    private MagnetizadorDAO daoMagnetizador = new MagnetizadorDAO();

    /**
     * grava Magnetizador
     *
     * @param pMagnetizadorModel return int
     * @return
     */
    public int salvarMagnetizadorController(MagnetizadorModel pMagnetizadorModel) {
        return this.daoMagnetizador.salvarMagnetizadorDAO(pMagnetizadorModel);
    }

    /**
     * recupera Magnetizador
     *
     * @param pIdMagnetizador return MagnetizadorModel
     * @return
     */
    public MagnetizadorModel getMagnetizadorController(int pIdMagnetizador) {
        return this.daoMagnetizador.getMagnetizadorDAO(pIdMagnetizador);
    }

    /**
     * recupera uma lista deMagnetizador
     *
     * @return ArrayList
     */
    public ArrayList<MagnetizadorModel> getListaMagnetizadorController() {
        return this.daoMagnetizador.getListaMagnetizadorDAO();
    }

    /**
     * atualiza Magnetizador
     *
     * @param pMagnetizadorModel return boolean
     * @return
     */
    public boolean atualizarMagnetizadorController(MagnetizadorModel pMagnetizadorModel) {
        return this.daoMagnetizador.atualizarMagnetizadorDAO(pMagnetizadorModel);
    }

    /**
     * exclui Magnetizador
     *
     * @param pIdMagnetizador return boolean
     * @return
     */
    public boolean excluirMagnetizadorController(int pIdMagnetizador) {
        return this.daoMagnetizador.excluirMagnetizadorDAO(pIdMagnetizador);
    }
}
