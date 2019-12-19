package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.ResponsavelFichaModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class ResponsavelFichaDAO extends SisgeteConnectionMySql {

    /**
     * grava responsavelFicha
     *
     * @param pResponsavelFichaModel return int
     * @return 
     */
    public int salvarresponsavelFichaDAO(ResponsavelFichaModel pResponsavelFichaModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_responsavel_ficha ("
                    + "pk_id_responsavel_ficha,"
                    + "nome,"
                    + "sobrenome"
                    + ") VALUES ("
                    + "'" + pResponsavelFichaModel.getIdResponsavelFicha() + "',"
                    + "'" + pResponsavelFichaModel.getNome() + "',"
                    + "'" + pResponsavelFichaModel.getSobrenome() + "'"
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
     * recupera responsavelFicha
     *
     * @param pIdResponsavelFichaModel return ResponsavelFichaModel
     * @return 
     */
    public ResponsavelFichaModel getresponsavelFichaDAO(int pIdResponsavelFichaModel) {
        ResponsavelFichaModel modelresponsavelFicha = new ResponsavelFichaModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_responsavel_ficha,"
                    + "nome,"
                    + "sobrenome"
                    + " FROM"
                    + " tbl_responsavel_ficha"
                    + " WHERE"
                    + " pk_id_responsavel_ficha = '" + pIdResponsavelFichaModel + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelresponsavelFicha.setIdResponsavelFicha(this.getResultSet().getInt(1));
                modelresponsavelFicha.setNome(this.getResultSet().getString(2));
                modelresponsavelFicha.setSobrenome(this.getResultSet().getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelresponsavelFicha;
    }

    /**
     * recupera uma lista de responsavelFicha return ArrayList
     * @return 
     */
    public ArrayList<ResponsavelFichaModel> getListaresponsavelFichaDAO() {
        ArrayList<ResponsavelFichaModel> listamodelresponsavelFicha = new ArrayList();
        ResponsavelFichaModel modelresponsavelFicha = new ResponsavelFichaModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_responsavel_ficha,"
                    + "nome,"
                    + "sobrenome"
                    + " FROM"
                    + " tbl_responsavel_ficha"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelresponsavelFicha = new ResponsavelFichaModel();
                modelresponsavelFicha.setIdResponsavelFicha(this.getResultSet().getInt(1));
                modelresponsavelFicha.setNome(this.getResultSet().getString(2));
                modelresponsavelFicha.setSobrenome(this.getResultSet().getString(3));
                listamodelresponsavelFicha.add(modelresponsavelFicha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelresponsavelFicha;
    }

    /**
     * atualiza responsavelFicha
     *
     * @param pResponsavelFichaModel return boolean
     * @return 
     */
    public boolean atualizarresponsavelFichaDAO(ResponsavelFichaModel pResponsavelFichaModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_responsavel_ficha SET "
                    + "pk_id_responsavel_ficha = '" + pResponsavelFichaModel.getIdResponsavelFicha() + "',"
                    + "nome = '" + pResponsavelFichaModel.getNome() + "',"
                    + "sobrenome = '" + pResponsavelFichaModel.getSobrenome() + "'"
                    + " WHERE "
                    + "pk_id_responsavel_ficha = '" + pResponsavelFichaModel.getIdResponsavelFicha() + "'"
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
     * exclui responsavelFicha
     *
     * @param pIdResponsavelFichaModel return boolean
     * @return 
     */
    public boolean excluirresponsavelFichaDAO(int pIdResponsavelFichaModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_responsavel_ficha "
                    + " WHERE "
                    + "pk_id_responsavel_ficha = '" + pIdResponsavelFichaModel + "'"
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
