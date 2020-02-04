package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.MagnetizadorModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class MagnetizadorDAO extends SisgeteConnectionMySql {

    /**
     * grava Magnetizador
     *
     * @param pMagnetizadorModel return int
     * @return
     */
    public int salvarMagnetizadorDAO(MagnetizadorModel pMagnetizadorModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_magnetizador ("
                    + "pk_id_magnetizador,"
                    + "nome_magnetizador,"
                    + "status_magnetizador"
                    + ") VALUES ("
                    + "'" + pMagnetizadorModel.getIdMagnetizador() + "',"
                    + "'" + pMagnetizadorModel.getNomeMagnetizador() + "',"
                    + "'" + pMagnetizadorModel.getStatusMagnetizador() + "'"
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
     * recupera Magnetizador
     *
     * @param pIdMagnetizador return MagnetizadorModel
     * @return
     */
    public MagnetizadorModel getMagnetizadorDAO(int pIdMagnetizador) {
        MagnetizadorModel modelMagnetizador = new MagnetizadorModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM"
                    + " tbl_magnetizador"
                    + " WHERE"
                    + " pk_id_magnetizador = '" + pIdMagnetizador + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMagnetizador.setIdMagnetizador(this.getResultSet().getInt(1));
                modelMagnetizador.setNomeMagnetizador(this.getResultSet().getString(2));
                modelMagnetizador.setStatusMagnetizador(this.getResultSet().getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelMagnetizador;
    }

    /**
     * recupera Magnetizador
     *
     * @param pMagnetizador return MagnetizadorModel
     * @return
     */
    public MagnetizadorModel getMagnetizadorDAO(String pMagnetizador) {
        MagnetizadorModel modelMagnetizador = new MagnetizadorModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM"
                    + " tbl_magnetizador"
                    + " WHERE"
                    + " nome_magnetizador = '" + pMagnetizador + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMagnetizador.setIdMagnetizador(this.getResultSet().getInt(1));
                modelMagnetizador.setNomeMagnetizador(this.getResultSet().getString(2));
                modelMagnetizador.setStatusMagnetizador(this.getResultSet().getString(3));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelMagnetizador;
    }

    /**
     * recupera uma lista de Magnetizador return ArrayList
     *
     * @return
     */
    public ArrayList<MagnetizadorModel> getListaMagnetizadorDAO() {
        ArrayList<MagnetizadorModel> listamodelMagnetizador = new ArrayList();
        MagnetizadorModel modelMagnetizador = new MagnetizadorModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM"
                    + " tbl_magnetizador"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelMagnetizador = new MagnetizadorModel();
                modelMagnetizador.setIdMagnetizador(this.getResultSet().getInt(1));
                modelMagnetizador.setNomeMagnetizador(this.getResultSet().getString(2));
                modelMagnetizador.setStatusMagnetizador(this.getResultSet().getString(3));

                listamodelMagnetizador.add(modelMagnetizador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelMagnetizador;
    }

    /**
     * atualiza Magnetizador
     *
     * @param pMagnetizadorModel return boolean
     * @return
     */
    public boolean atualizarMagnetizadorDAO(MagnetizadorModel pMagnetizadorModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_magnetizador SET "
                    + "pk_id_magnetizador = '" + pMagnetizadorModel.getIdMagnetizador() + "',"
                    + "nome_magnetizador = '" + pMagnetizadorModel.getNomeMagnetizador() + "',"
                    + "status_magnetizador ='" + pMagnetizadorModel.getStatusMagnetizador() + "'"
                    + " WHERE "
                    + "pk_id_magnetizador = '" + pMagnetizadorModel.getIdMagnetizador() + "'"
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
     * exclui Magnetizador
     *
     * @param pIdMagnetizador return boolean
     * @return
     */
    public boolean excluirMagnetizadorDAO(int pIdMagnetizador) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_magnetizador "
                    + " WHERE "
                    + "pk_id_magnetizador = '" + pIdMagnetizador + "'"
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
