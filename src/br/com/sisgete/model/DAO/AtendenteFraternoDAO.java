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
                    "INSERT INTO tbl_atendente_fraterno ("
                    + "pk_id_atendente_fraterno,"
                    + "nome"
                    + ") VALUES ("
                    + "'" + pAtendenteFraternoModel.getIdAtendenteFraterno() + "',"
                    + "'" + pAtendenteFraternoModel.getNome() + "'"
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
     * @param pIdAtendenteFraterno return AtendenteFraternoModel
     * @return
     */
    public AtendenteFraternoModel getAtendenteFraternoDAO(int pIdAtendenteFraterno) {
        AtendenteFraternoModel modelAtendenteFraterno = new AtendenteFraternoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_atentende_fraterno WHERE"
                    + " pk_id_atendente_fraterno = '" + pIdAtendenteFraterno + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAtendenteFraterno.setIdAtendenteFraterno(this.getResultSet().getInt(1));
                modelAtendenteFraterno.setNome(this.getResultSet().getString(2));
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
                    "SELECT * FROM tbl_atentende_fraterno;"
            );

            while (this.getResultSet().next()) {
                modelAtendenteFraterno = new AtendenteFraternoModel();
                modelAtendenteFraterno.setIdAtendenteFraterno(this.getResultSet().getInt(1));
                modelAtendenteFraterno.setNome(this.getResultSet().getString(2));
                listamodelAtendenteFraterno.add(modelAtendenteFraterno);
            }
        } catch (Exception e) {
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
                    + "pk_id_atendente_fraterno = '" + pAtendenteFraternoModel.getIdAtendenteFraterno() + "',"
                    + "nome = '" + pAtendenteFraternoModel.getNome() + "'"
                    + " WHERE "
                    + "pk_id_atendente_fraterno = '" + pAtendenteFraternoModel.getIdAtendenteFraterno() + "'"
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
     * @param pIdAtendenteFraterno return boolean
     * @return
     */
    public boolean excluirAtendenteFraternoDAO(int pIdAtendenteFraterno) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_atendente_fraterno "
                    + " WHERE "
                    + "pk_id_atendente_fraterno = '" + pIdAtendenteFraterno + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
