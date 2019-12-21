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
     * grava atendenteFraterno
     *
     * @param pAtendenteFraternoModel return int
     * @return
     */
    public int salvaratendenteFraternoDAO(AtendenteFraternoModel pAtendenteFraternoModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_atendimento_fraterno ("
                    + "pk_id_atendente_fraterno,"
                    + "nome"
                    + ") VALUES ("
                    + "'" + pAtendenteFraternoModel.getIdAtendenteFraterno() + "',"
                    + "'" + pAtendenteFraternoModel.getNome() + "',"
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
     * recupera atendenteFraterno
     *
     * @param pIdAtendenteFraterno return AtendenteFraternoModel
     * @return
     */
    public AtendenteFraternoModel getatendenteFraternoDAO(int pIdAtendenteFraterno) {
        AtendenteFraternoModel modelatendenteFraterno = new AtendenteFraternoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_atendente_fraterno,"
                    + "nome,"
                    + "sobrenome"
                    + " FROM"
                    + " tbl_atendimento_fraterno"
                    + " WHERE"
                    + " pk_id_atendente_fraterno = '" + pIdAtendenteFraterno + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelatendenteFraterno.setIdAtendenteFraterno(this.getResultSet().getInt(1));
                modelatendenteFraterno.setNome(this.getResultSet().getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelatendenteFraterno;
    }

    /**
     * recupera uma lista de atendenteFraterno return ArrayList
     *
     * @return
     */
    public ArrayList<AtendenteFraternoModel> getListaatendenteFraternoDAO() {
        ArrayList<AtendenteFraternoModel> listamodelatendenteFraterno = new ArrayList();
        AtendenteFraternoModel modelatendenteFraterno = new AtendenteFraternoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_atendente_fraterno,"
                    + "nome,"
                    + "sobrenome"
                    + " FROM"
                    + " tbl_atendimento_fraterno"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelatendenteFraterno = new AtendenteFraternoModel();
                modelatendenteFraterno.setIdAtendenteFraterno(this.getResultSet().getInt(1));
                modelatendenteFraterno.setNome(this.getResultSet().getString(2));
                listamodelatendenteFraterno.add(modelatendenteFraterno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelatendenteFraterno;
    }

    /**
     * atualiza atendenteFraterno
     *
     * @param pAtendenteFraternoModel return boolean
     * @return
     */
    public boolean atualizaratendenteFraternoDAO(AtendenteFraternoModel pAtendenteFraternoModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_atendimento_fraterno SET "
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
     * exclui atendenteFraterno
     *
     * @param pIdAtendenteFraterno return boolean
     * @return
     */
    public boolean excluiratendenteFraternoDAO(int pIdAtendenteFraterno) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_atendimento_fraterno "
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
