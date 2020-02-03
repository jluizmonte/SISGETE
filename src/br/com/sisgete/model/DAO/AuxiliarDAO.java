package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.AuxiliarModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class AuxiliarDAO extends SisgeteConnectionMySql {

    /**
     * grava Auxiliar
     *
     * @param pAuxiliarModel return int
     * @return
     */
    public int salvarAuxiliarDAO(AuxiliarModel pAuxiliarModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_auxiliar ("
                    + "pk_id_auxiliar,"
                    + "nome_auxiliar"
                    + ") VALUES ("
                    + "'" + pAuxiliarModel.getIdAuxiliar() + "',"
                    + "'" + pAuxiliarModel.getNomeAuxiliar() + "'"
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
     * recupera Auxiliar
     *
     * @param pIdAuxiliar return AuxiliarModel
     * @return
     */
    public AuxiliarModel getAuxiliarDAO(int pIdAuxiliar) {
        AuxiliarModel modelAuxiliar = new AuxiliarModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_auxiliar,"
                    + "nome_auxiliar"
                    + " FROM"
                    + " tbl_auxiliar"
                    + " WHERE"
                    + " pk_id_auxiliar = '" + pIdAuxiliar + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAuxiliar.setIdAuxiliar(this.getResultSet().getInt(1));
                modelAuxiliar.setNomeAuxiliar(this.getResultSet().getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelAuxiliar;
    }

    /**
     * recupera Auxiliar
     *
     * @param pIdAuxiliar return AuxiliarModel
     * @return
     */
    public AuxiliarModel getAuxiliarDAO(String pAuxiliar) {
        AuxiliarModel modelAuxiliar = new AuxiliarModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_auxiliar,"
                    + "nome_auxiliar"
                    + " FROM"
                    + " tbl_auxiliar"
                    + " WHERE"
                    + " nome_auxiliar = '" + pAuxiliar + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAuxiliar.setIdAuxiliar(this.getResultSet().getInt(1));
                modelAuxiliar.setNomeAuxiliar(this.getResultSet().getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelAuxiliar;
    }

    /**
     * recupera uma lista de Auxiliar return ArrayList
     *
     * @return
     */
    public ArrayList<AuxiliarModel> getListaAuxiliarDAO() {
        ArrayList<AuxiliarModel> listamodelAuxiliar = new ArrayList();
        AuxiliarModel modelAuxiliar = new AuxiliarModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_auxiliar,"
                    + "nome_auxiliar"
                    + " FROM"
                    + " tbl_auxiliar"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelAuxiliar = new AuxiliarModel();
                modelAuxiliar.setIdAuxiliar(this.getResultSet().getInt(1));
                modelAuxiliar.setNomeAuxiliar(this.getResultSet().getString(2));
                listamodelAuxiliar.add(modelAuxiliar);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelAuxiliar;
    }

    /**
     * atualiza Auxiliar
     *
     * @param pAuxiliarModel return boolean
     * @return
     */
    public boolean atualizarAuxiliarDAO(AuxiliarModel pAuxiliarModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_auxiliar SET "
                    + "pk_id_auxiliar = '" + pAuxiliarModel.getIdAuxiliar() + "',"
                    + "nome_auxiliar = '" + pAuxiliarModel.getNomeAuxiliar() + "'"
                    + " WHERE "
                    + "pk_id_auxiliar = '" + pAuxiliarModel.getIdAuxiliar() + "'"
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
     * exclui Auxiliar
     *
     * @param pIdAuxiliar return boolean
     * @return
     */
    public boolean excluirAuxiliarDAO(int pIdAuxiliar) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_auxiliar "
                    + " WHERE "
                    + "pk_id_auxiliar = '" + pIdAuxiliar + "'"
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
