package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.UsuarioModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class UsuarioDAO extends SisgeteConnectionMySql {

    /**
     * grava Usuario
     *
     * @param pUsuarioModel return int
     * @return
     */
    public int salvarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_usuario ("
                    + "pk_id_usuario,"
                    + "nome,"
                    + "usuario,"
                    + "senha,"
                    + "nivel_acesso"
                    + ") VALUES ("
                    + "'" + pUsuarioModel.getIdUsuario() + "',"
                    + "'" + pUsuarioModel.getNome() + "',"
                    + "'" + pUsuarioModel.getUsuario() + "',"
                    + "'" + pUsuarioModel.getSenha() + "',"
                    + "'" + pUsuarioModel.getNivelAcesso() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Usuario
     *
     * @param pIdUsuario return UsuarioModel
     * @return
     */
    public UsuarioModel getUsuarioDAO(int pIdUsuario) {
        UsuarioModel modelUsuario = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM WHERE pk_id_usuario ='"
                    + pIdUsuario + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
                modelUsuario.setUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenha(this.getResultSet().getString(4));
                modelUsuario.setNivelAcesso(this.getResultSet().getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
     * recupera Usuario
     *
     * @param pUsario return UsuarioModel
     * @return
     */
    public UsuarioModel getUsuarioDAO(String pUsario) {
        UsuarioModel modelUsuario = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM WHERE usuario='"
                    + pUsario + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
                modelUsuario.setUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenha(this.getResultSet().getString(4));
                modelUsuario.setNivelAcesso(this.getResultSet().getString(5));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
     * recupera uma lista de Usuario return ArrayList
     *
     * @return
     */
    public ArrayList<UsuarioModel> getListaUsuarioDAO() {
        ArrayList<UsuarioModel> listamodelUsuario = new ArrayList();
        UsuarioModel modelUsuario = new UsuarioModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_usuario;"
            );

            while (this.getResultSet().next()) {
                modelUsuario = new UsuarioModel();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
                modelUsuario.setUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenha(this.getResultSet().getString(4));
                modelUsuario.setNivelAcesso(this.getResultSet().getString(5));
                listamodelUsuario.add(modelUsuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
     * atualiza Usuario
     *
     * @param pUsuarioModel return boolean
     * @return
     */
    public boolean atualizarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_usuario SET "
                    + "pk_id_usuario = '" + pUsuarioModel.getIdUsuario() + "',"
                    + "nome = '" + pUsuarioModel.getNome() + "',"
                    + "usuario = '" + pUsuarioModel.getUsuario() + "',"
                    + "senha = '" + pUsuarioModel.getSenha() + "',"
                    + "nivel_acesso='" + pUsuarioModel.getNivelAcesso() + "'"
                    + " WHERE "
                    + "pk_id_usuario = '" + pUsuarioModel.getIdUsuario() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Usuario
     *
     * @param pIdUsuario return boolean
     * @return
     */
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_usuario "
                    + " WHERE "
                    + "pk_id_usuario = '" + pIdUsuario + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Validar login e senha do usuário
     *
     * @param pUsuarioModel
     * @return
     */
    public boolean validarUsuarioDAO(UsuarioModel pUsuarioModel) {
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_usario WHERE "
                    + " usuario = '" + pUsuarioModel.getUsuario()
                    + "' AND senha = '" + pUsuarioModel.getSenha() + "'"
                    + ";"
            );

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
