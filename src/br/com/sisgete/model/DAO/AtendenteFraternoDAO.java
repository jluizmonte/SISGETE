package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.AtendenteFraternoModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class AtendenteFraternoDAO extends SisgeteConnectionMySql {

    /**
     * grava AtendenteFraterno
     *
     * @param pAtendenteFraternoModel return int
     * @return
     */
    public int salvarAtendenteFraternoDAO(AtendenteFraternoModel pAtendenteFraternoModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO ttbl_atendente_fraterno ("
                    + "pk_id_atendente,"
                    + "nome,"
                    + "usuario,"
                    + "senha"
                    + ") VALUES ("
                    + "'" + pAtendenteFraternoModel.getIdAtendenteFraterno() + "',"
                    + "'" + pAtendenteFraternoModel.getNome() + "',"
                    + "'" + pAtendenteFraternoModel.getUsuario() + "',"
                    + "'" + pAtendenteFraternoModel.getSenha() + "'"
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
     * recupera AtendenteFraterno
     *
     * @param pIdAtendente return AtendenteFraternoModel
     * @return
     */
    public AtendenteFraternoModel getAtendenteFraternoDAO(int pIdAtendente) {
        AtendenteFraternoModel modelAtendenteFraterno = new AtendenteFraternoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_atendente,"
                    + "nome,"
                    + "usuario,"
                    + "senha"
                    + " FROM"
                    + " tbl_atendente_fraterno"
                    + " WHERE"
                    + " pk_id_atendente = '" + pIdAtendente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAtendenteFraterno.setIdAtendenteFraterno(this.getResultSet().getInt(1));
                modelAtendenteFraterno.setNome(this.getResultSet().getString(2));
                modelAtendenteFraterno.setUsuario(this.getResultSet().getString(3));
                modelAtendenteFraterno.setSenha(this.getResultSet().getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelAtendenteFraterno;
    }

    /**
     *
     * @param pAtendente
     * @return
     */
    public AtendenteFraternoModel getAtendenteFraternoDAO(String pAtendente) {
        AtendenteFraternoModel modelAtendenteFraterno = new AtendenteFraternoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_atendente,"
                    + "nome,"
                    + "usuario,"
                    + "senha"
                    + " FROM"
                    + " tbl_atendente_fraterno"
                    + " WHERE"
                    + " usuario = '" + pAtendente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAtendenteFraterno.setIdAtendenteFraterno(this.getResultSet().getInt(1));
                modelAtendenteFraterno.setNome(this.getResultSet().getString(2));
                modelAtendenteFraterno.setUsuario(this.getResultSet().getString(3));
                modelAtendenteFraterno.setSenha(this.getResultSet().getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelAtendenteFraterno;
    }

    /**
     * recupera uma lista de AtendenteFraterno return ArrayList
     *
     * @return
     */
    public ArrayList<AtendenteFraternoModel> getListaAtendenteFraternoDAO() {
        ArrayList<AtendenteFraternoModel> listamodelAtendenteFraterno = new ArrayList();
        AtendenteFraternoModel modelAtendenteFraterno = new AtendenteFraternoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_atendente,"
                    + "nome,"
                    + "usuario,"
                    + "senha"
                    + " FROM"
                    + " tbl_atendente_fraterno"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAtendenteFraterno = new AtendenteFraternoModel();
                modelAtendenteFraterno.setIdAtendenteFraterno(this.getResultSet().getInt(1));
                modelAtendenteFraterno.setNome(this.getResultSet().getString(2));
                modelAtendenteFraterno.setUsuario(this.getResultSet().getString(3));
                modelAtendenteFraterno.setSenha(this.getResultSet().getString(4));
                listamodelAtendenteFraterno.add(modelAtendenteFraterno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelAtendenteFraterno;
    }

    /**
     * atualiza AtendenteFraterno
     *
     * @param pAtendenteFraternoModel return boolean
     * @return
     */
    public boolean atualizarAtendenteFraternoDAO(AtendenteFraternoModel pAtendenteFraternoModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_atendente_fraterno SET "
                    + "pk_id_atendente = '" + pAtendenteFraternoModel.getIdAtendenteFraterno() + "',"
                    + "nome = '" + pAtendenteFraternoModel.getNome() + "',"
                    + "usuario = '" + pAtendenteFraternoModel.getUsuario() + "',"
                    + "senha = '" + pAtendenteFraternoModel.getSenha() + "'"
                    + " WHERE "
                    + "pk_id_atendente = '" + pAtendenteFraternoModel.getIdAtendenteFraterno() + "'"
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
     * exclui AtendenteFraterno
     *
     * @param pIdAtendente return boolean
     * @return
     */
    public boolean excluirAtendenteFraternoDAO(int pIdAtendente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_atendente_fraterno "
                    + " WHERE "
                    + "pk_id_atendente = '" + pIdAtendente + "'"
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
     * @param pAtendenteFraterno
     * @return
     */
    public boolean getValidarAtendenteDAO(AtendenteFraternoModel pAtendenteFraterno) {
        try {
            this.conectar();
            this.executarSQL("SELECT *" + " FROM" + " tbl_atendente_fraterno" + " WHERE" + " usuario = '"
                    + pAtendenteFraterno.getUsuario() + "' AND senha = '" + pAtendenteFraterno.getSenha() + "'" + ";");

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
