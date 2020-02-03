package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.UsuarioDAO;
import br.com.sisgete.model.UsuarioModel;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class UsuarioController {

    private UsuarioDAO daoUsuario = new UsuarioDAO();

    /**
     * grava Usuario
     *
     * @param pUsuarioModel
     * @return int
     */
    public int salvarUsuarioController(UsuarioModel pUsuarioModel) {
        return this.daoUsuario.salvarUsuarioDAO(pUsuarioModel);
    }

    /**
     * recupera Usuario
     *
     * @param pIdUsuario
     * @return UsuarioModel
     */
    public UsuarioModel getUsuarioController(int pIdUsuario) {
        return this.daoUsuario.getUsuarioDAO(pIdUsuario);
    }

    /**
     * retorna usuario pelo nome
     *
     * @param pUsuario
     * @return
     */
    public UsuarioModel getUsuarioController(String pUsuario) {
        return this.daoUsuario.getUsuarioDAO(pUsuario);
    }

    /**
     * recupera uma lista deUsuario
     *
     * @return ArrayList
     */
    public ArrayList<UsuarioModel> getListaUsuarioController() {
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
     * atualiza Usuario
     *
     * @param pUsuarioModel
     * @return boolean
     */
    public boolean atualizarUsuarioController(UsuarioModel pUsuarioModel) {
        return this.daoUsuario.atualizarUsuarioDAO(pUsuarioModel);
    }

    /**
     * exclui Usuario
     *
     * @param pIdUsuario
     * @return boolean
     */
    public boolean excluirUsuarioController(int pIdUsuario) {
        return this.daoUsuario.excluirUsuarioDAO(pIdUsuario);
    }

    /**
     * realiza login do usuario
     *
     * @param pUsuarioModel
     * @return
     */
    public boolean validarUsuario(UsuarioModel pUsuarioModel) {
        return this.daoUsuario.validarUsuarioDAO(pUsuarioModel);
    }
}
