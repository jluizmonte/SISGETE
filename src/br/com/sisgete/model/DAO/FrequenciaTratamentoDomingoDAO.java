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
                    + "fk_paciente,"
                    + "fk_setor_paciente,"
                    + "fk_status_tratamento,"
                    + "fk_magnetizador,"
                    + "recomendacoes_espirituais,"
                    + "frequencia_domingo"
                    + ") VALUES ("
                    + "'" + pFrequenciaTratamentoDomingoModel.getIdFrequenciaTratamentoDomingo() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getPaciente() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getSetorPaciente() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getStatusTratamento() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getMagnetizador() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getRecomendacoesEspirituais() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getFrequenciaDomingo() + "'"
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
                    + "fk_paciente,"
                    + "fk_setor_paciente,"
                    + "fk_status_tratamento,"
                    + "fk_magnetizador,"
                    + "recomendacoes_espirituais,"
                    + "frequencia_domingo"
                    + " FROM"
                    + " tbl_frequencia_tratamento_domingo"
                    + " WHERE"
                    + " pk_id_frequencia_tratamento_domingo = '" + pIdFrequenciaTratamentoDomingo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoDomingo.setIdFrequenciaTratamentoDomingo(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoDomingo.setPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoDomingo.setSetorPaciente(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoDomingo.setStatusTratamento(this.getResultSet().getInt(4));
                modelFrequenciaTratamentoDomingo.setMagnetizador(this.getResultSet().getInt(5));
                modelFrequenciaTratamentoDomingo.setRecomendacoesEspirituais(this.getResultSet().getString(6));
                modelFrequenciaTratamentoDomingo.setFrequenciaDomingo(this.getResultSet().getString(7));
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
                    + "fk_paciente,"
                    + "fk_setor_paciente,"
                    + "fk_status_tratamento,"
                    + "fk_magnetizador,"
                    + "recomendacoes_espirituais,"
                    + "frequencia_domingo"
                    + " FROM"
                    + " tbl_frequencia_tratamento_domingo"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoDomingo = new FrequenciaTratamentoDomingoModel();
                modelFrequenciaTratamentoDomingo.setIdFrequenciaTratamentoDomingo(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoDomingo.setPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoDomingo.setSetorPaciente(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoDomingo.setStatusTratamento(this.getResultSet().getInt(4));
                modelFrequenciaTratamentoDomingo.setMagnetizador(this.getResultSet().getInt(5));
                modelFrequenciaTratamentoDomingo.setRecomendacoesEspirituais(this.getResultSet().getString(6));
                modelFrequenciaTratamentoDomingo.setFrequenciaDomingo(this.getResultSet().getString(7));
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
                    + "fk_paciente = '" + pFrequenciaTratamentoDomingoModel.getPaciente() + "',"
                    + "fk_setor_paciente = '" + pFrequenciaTratamentoDomingoModel.getSetorPaciente() + "',"
                    + "fk_status_tratamento = '" + pFrequenciaTratamentoDomingoModel.getStatusTratamento() + "',"
                    + "fk_magnetizador = '" + pFrequenciaTratamentoDomingoModel.getMagnetizador() + "',"
                    + "recomendacoes_espirituais = '" + pFrequenciaTratamentoDomingoModel.getRecomendacoesEspirituais() + "',"
                    + "frequencia_domingo = '" + pFrequenciaTratamentoDomingoModel.getFrequenciaDomingo() + "'"
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
