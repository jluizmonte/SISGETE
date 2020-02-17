package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.FrequenciaTratamentoTercaModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoTercaDAO extends SisgeteConnectionMySql {

    /**
     * grava FrequenciaTratamentoTerca
     *
     * @param pFrequenciaTratamentoTercaModel return int
     * @return
     */
    public int salvarFrequenciaTratamentoTercaDAO(FrequenciaTratamentoTercaModel pFrequenciaTratamentoTercaModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_frequencia_tratamento_terca ("
                    + "pk_id_frequencia_terca,"
                    + "fk_paciente,"
                    + "frequencia_terca"
                    + ") VALUES ("
                    + "'" + pFrequenciaTratamentoTercaModel.getIdFrequenciaTratamentoTerca() + "',"
                    + "'" + pFrequenciaTratamentoTercaModel.getPaciente() + "',"
                    + "'" + pFrequenciaTratamentoTercaModel.getFrequenciaTerca() + "'"
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
     * recupera FrequenciaTratamentoTerca
     *
     * @param pIdFrequenciaTratamentoTerca return FrequenciaTratamentoTercaModel
     * @return
     */
    public FrequenciaTratamentoTercaModel getFrequenciaTratamentoTercaDAO(int pIdFrequenciaTratamentoTerca) {
        FrequenciaTratamentoTercaModel modelFrequenciaTratamentoTerca = new FrequenciaTratamentoTercaModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_frequencia_terca,"
                    + "fk_paciente,"
                    + "frequencia_terca"
                    + " FROM"
                    + " tbl_frequencia_tratamento_terca"
                    + " WHERE"
                    + " pk_id_frequencia_terca = '" + pIdFrequenciaTratamentoTerca + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoTerca.setIdFrequenciaTratamentoTerca(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoTerca.setPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoTerca.setFrequenciaTerca(this.getResultSet().getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelFrequenciaTratamentoTerca;
    }

    /**
     * recupera uma lista de FrequenciaTratamentoTerca return ArrayList
     *
     * @return
     */
    public ArrayList<FrequenciaTratamentoTercaModel> getListaFrequenciaTratamentoTercaDAO() {
        ArrayList<FrequenciaTratamentoTercaModel> listamodelFrequenciaTratamentoTerca = new ArrayList();
        FrequenciaTratamentoTercaModel modelFrequenciaTratamentoTerca = new FrequenciaTratamentoTercaModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM"
                    + " tbl_frequencia_tratamento_terca"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoTerca = new FrequenciaTratamentoTercaModel();
                modelFrequenciaTratamentoTerca.setIdFrequenciaTratamentoTerca(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoTerca.setPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoTerca.setFrequenciaTerca(this.getResultSet().getString(3));
                listamodelFrequenciaTratamentoTerca.add(modelFrequenciaTratamentoTerca);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelFrequenciaTratamentoTerca;
    }

    /**
     * atualiza FrequenciaTratamentoTerca
     *
     * @param pFrequenciaTratamentoTercaModel return boolean
     * @return
     */
    public boolean atualizarFrequenciaTratamentoTercaDAO(FrequenciaTratamentoTercaModel pFrequenciaTratamentoTercaModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_frequencia_tratamento_terca SET "
                    + "pk_id_frequencia_terca = '" + pFrequenciaTratamentoTercaModel.getIdFrequenciaTratamentoTerca() + "',"
                    + "fk_paciente = '" + pFrequenciaTratamentoTercaModel.getPaciente() + "',"
                    + "frequencia_terca = '" + pFrequenciaTratamentoTercaModel.getFrequenciaTerca() + "'"
                    + " WHERE "
                    + "pk_id_frequencia_terca = '" + pFrequenciaTratamentoTercaModel.getIdFrequenciaTratamentoTerca() + "'"
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
     * exclui FrequenciaTratamentoTerca
     *
     * @param pIdFrequenciaTratamentoTerca return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoTercaDAO(int pIdFrequenciaTratamentoTerca) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_frequencia_tratamento_terca "
                    + " WHERE "
                    + "pk_id_frequencia_terca = '" + pIdFrequenciaTratamentoTerca + "'"
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
