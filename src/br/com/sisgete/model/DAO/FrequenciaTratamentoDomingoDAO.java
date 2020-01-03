package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.FrequenciaTratamentoDomingoModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoDomingoDAO extends SisgeteConnectionMySql {

    /**
     * grava FrequenciaTratamentoDomingo
     *
     * @param pFrequenciaTratamentoDomingoModel return int
     * @return
     */
    public int salvarFrequenciaTratamentoDomingoDAO(FrequenciaTratamentoDomingoModel pFrequenciaTratamentoDomingoModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_frequencia_tratamento_domingo ("
                    + "pk_id_frequencia_tratamento_domingo,"
                    + "fk_id_paciente,"
                    + "fk_id_magnetizador,"
                    + "frequencia_domingo,"
                    + "recomendacoes_espirituais"
                    + ") VALUES ("
                    + "'" + pFrequenciaTratamentoDomingoModel.getIdFrequenciaTratamentoDomingo() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getIdPaciente() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getIdMagnetizador() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getFrequenciaDomingo() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getRecomendacoesEspirituais() + "'"
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
     * recupera FrequenciaTratamentoDomingo
     *
     * @param pIdFrequenciaTratamentoDomingo return
     * FrequenciaTratamentoDomingoModel
     * @return
     */
    public FrequenciaTratamentoDomingoModel getFrequenciaTratamentoDomingoDAO(int pIdFrequenciaTratamentoDomingo) {
        FrequenciaTratamentoDomingoModel modelFrequenciaTratamentoDomingo = new FrequenciaTratamentoDomingoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_frequencia_tratamento_domingo,"
                    + "fk_id_paciente,"
                    + "fk_id_magnetizador,"
                    + "frequencia_domingo,"
                    + "recomendacoes_espirituais"
                    + " FROM"
                    + " tbl_frequencia_tratamento_domingo"
                    + " WHERE"
                    + " pk_id_frequencia_tratamento_domingo = '" + pIdFrequenciaTratamentoDomingo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoDomingo.setIdFrequenciaTratamentoDomingo(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoDomingo.setIdPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoDomingo.setIdMagnetizador(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoDomingo.setFrequenciaDomingo(this.getResultSet().getString(4));
                modelFrequenciaTratamentoDomingo.setRecomendacoesEspirituais(this.getResultSet().getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelFrequenciaTratamentoDomingo;
    }

    /**
     * recupera uma lista de FrequenciaTratamentoDomingo return ArrayList
     *
     * @return
     */
    public ArrayList<FrequenciaTratamentoDomingoModel> getListaFrequenciaTratamentoDomingoDAO() {
        ArrayList<FrequenciaTratamentoDomingoModel> listamodelFrequenciaTratamentoDomingo = new ArrayList();
        FrequenciaTratamentoDomingoModel modelFrequenciaTratamentoDomingo = new FrequenciaTratamentoDomingoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_frequencia_tratamento_domingo,"
                    + "fk_id_paciente,"
                    + "fk_id_magnetizador,"
                    + "frequencia_domingo,"
                    + "recomendacoes_espirituais"
                    + " FROM"
                    + " tbl_frequencia_tratamento_domingo"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoDomingo = new FrequenciaTratamentoDomingoModel();
                modelFrequenciaTratamentoDomingo.setIdFrequenciaTratamentoDomingo(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoDomingo.setIdPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoDomingo.setIdMagnetizador(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoDomingo.setFrequenciaDomingo(this.getResultSet().getString(4));
                modelFrequenciaTratamentoDomingo.setRecomendacoesEspirituais(this.getResultSet().getString(5));
                listamodelFrequenciaTratamentoDomingo.add(modelFrequenciaTratamentoDomingo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelFrequenciaTratamentoDomingo;
    }

    /**
     * atualiza FrequenciaTratamentoDomingo
     *
     * @param pFrequenciaTratamentoDomingoModel return boolean
     * @return
     */
    public boolean atualizarFrequenciaTratamentoDomingoDAO(FrequenciaTratamentoDomingoModel pFrequenciaTratamentoDomingoModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_frequencia_tratamento_domingo SET "
                    + "pk_id_frequencia_tratamento_domingo = '" + pFrequenciaTratamentoDomingoModel.getIdFrequenciaTratamentoDomingo() + "',"
                    + "fk_id_paciente = '" + pFrequenciaTratamentoDomingoModel.getIdPaciente() + "',"
                    + "fk_id_magnetizador = '" + pFrequenciaTratamentoDomingoModel.getIdMagnetizador() + "',"
                    + "frequencia_domingo = '" + pFrequenciaTratamentoDomingoModel.getFrequenciaDomingo() + "',"
                    + "recomendacoes_espirituais = '" + pFrequenciaTratamentoDomingoModel.getRecomendacoesEspirituais() + "'"
                    + " WHERE "
                    + "pk_id_frequencia_tratamento_domingo = '" + pFrequenciaTratamentoDomingoModel.getIdFrequenciaTratamentoDomingo() + "'"
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
     * exclui FrequenciaTratamentoDomingo
     *
     * @param pIdFrequenciaTratamentoDomingo return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoDomingoDAO(int pIdFrequenciaTratamentoDomingo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_frequencia_tratamento_domingo "
                    + " WHERE "
                    + "pk_id_frequencia_tratamento_domingo = '" + pIdFrequenciaTratamentoDomingo + "'"
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
