package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.FrequenciaTratamentoModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoDAO extends SisgeteConnectionMySql {

    /**
     * grava frequenciaTratamento
     *
     * @param pFrequenciaTratamentoModel return int
     * @return 
     */
    public int salvarfrequenciaTratamentoDAO(FrequenciaTratamentoModel pFrequenciaTratamentoModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_frequencia_tratamento ("
                    + "pk_id_frequencia,"
                    + "fk_paciente,"
                    + "fk_responsavel_ficha,"
                    + "frequencia_domingo,"
                    + "frequencia_quinta,"
                    + "recomendacoes_espirituais"
                    + ") VALUES ("
                    + "'" + pFrequenciaTratamentoModel.getIdFrequencia() + "',"
                    + "'" + pFrequenciaTratamentoModel.getPaciente() + "',"
                    + "'" + pFrequenciaTratamentoModel.getResponsavelFicha() + "',"
                    + "'" + pFrequenciaTratamentoModel.getFrequenciaDomingo() + "',"
                    + "'" + pFrequenciaTratamentoModel.getFrequenciaQuinta() + "',"
                    + "'" + pFrequenciaTratamentoModel.getRecomendacoesEspirituais() + "'"
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
     * recupera frequenciaTratamento
     *
     * @param pIdFrequencia return FrequenciaTratamentoModel
     * @return 
     */
    public FrequenciaTratamentoModel getfrequenciaTratamentoDAO(int pIdFrequencia) {
        FrequenciaTratamentoModel modelfrequenciaTratamento = new FrequenciaTratamentoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_frequencia,"
                    + "fk_paciente,"
                    + "fk_responsavel_ficha,"
                    + "frequencia_domingo,"
                    + "frequencia_quinta,"
                    + "recomendacoes_espirituais"
                    + " FROM"
                    + " tbl_frequencia_tratamento"
                    + " WHERE"
                    + " pk_id_frequencia = '" + pIdFrequencia + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelfrequenciaTratamento.setIdFrequencia(this.getResultSet().getInt(1));
                modelfrequenciaTratamento.setPaciente(this.getResultSet().getInt(2));
                modelfrequenciaTratamento.setResponsavelFicha(this.getResultSet().getInt(3));
                modelfrequenciaTratamento.setFrequenciaDomingo(this.getResultSet().getString(4));
                modelfrequenciaTratamento.setFrequenciaQuinta(this.getResultSet().getString(5));
                modelfrequenciaTratamento.setRecomendacoesEspirituais(this.getResultSet().getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelfrequenciaTratamento;
    }

    /**
     * recupera uma lista de frequenciaTratamento return ArrayList
     * @return 
     */
    public ArrayList<FrequenciaTratamentoModel> getListafrequenciaTratamentoDAO() {
        ArrayList<FrequenciaTratamentoModel> listamodelfrequenciaTratamento = new ArrayList();
        FrequenciaTratamentoModel modelfrequenciaTratamento = new FrequenciaTratamentoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_frequencia,"
                    + "fk_paciente,"
                    + "fk_responsavel_ficha,"
                    + "frequencia_domingo,"
                    + "frequencia_quinta,"
                    + "recomendacoes_espirituais"
                    + " FROM"
                    + " tbl_frequencia_tratamento"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelfrequenciaTratamento = new FrequenciaTratamentoModel();
                modelfrequenciaTratamento.setIdFrequencia(this.getResultSet().getInt(1));
                modelfrequenciaTratamento.setPaciente(this.getResultSet().getInt(2));
                modelfrequenciaTratamento.setResponsavelFicha(this.getResultSet().getInt(3));
                modelfrequenciaTratamento.setFrequenciaDomingo(this.getResultSet().getString(4));
                modelfrequenciaTratamento.setFrequenciaQuinta(this.getResultSet().getString(5));
                modelfrequenciaTratamento.setRecomendacoesEspirituais(this.getResultSet().getString(6));
                listamodelfrequenciaTratamento.add(modelfrequenciaTratamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelfrequenciaTratamento;
    }

    /**
     * atualiza frequenciaTratamento
     *
     * @param pFrequenciaTratamentoModel return boolean
     * @return 
     */
    public boolean atualizarfrequenciaTratamentoDAO(FrequenciaTratamentoModel pFrequenciaTratamentoModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_frequencia_tratamento SET "
                    + "pk_id_frequencia = '" + pFrequenciaTratamentoModel.getIdFrequencia() + "',"
                    + "fk_paciente = '" + pFrequenciaTratamentoModel.getPaciente() + "',"
                    + "fk_responsavel_ficha = '" + pFrequenciaTratamentoModel.getResponsavelFicha() + "',"
                    + "frequencia_domingo = '" + pFrequenciaTratamentoModel.getFrequenciaDomingo() + "',"
                    + "frequencia_quinta = '" + pFrequenciaTratamentoModel.getFrequenciaQuinta() + "',"
                    + "recomendacoes_espirituais = '" + pFrequenciaTratamentoModel.getRecomendacoesEspirituais() + "'"
                    + " WHERE "
                    + "pk_id_frequencia = '" + pFrequenciaTratamentoModel.getIdFrequencia() + "'"
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
     * exclui frequenciaTratamento
     *
     * @param pIdFrequencia return boolean
     * @return 
     */
    public boolean excluirfrequenciaTratamentoDAO(int pIdFrequencia) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_frequencia_tratamento "
                    + " WHERE "
                    + "pk_id_frequencia = '" + pIdFrequencia + "'"
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
