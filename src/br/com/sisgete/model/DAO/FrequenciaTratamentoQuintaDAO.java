package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.FrequenciaTratamentoQuintaModel;
import java.sql.SQLException;

import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class FrequenciaTratamentoQuintaDAO extends SisgeteConnectionMySql {

    /**
     * grava FrequenciaTratamentoQuinta
     *
     * @param pFrequenciaTratamentoQuintaModel return int
     * @return
     */
    public int salvarFrequenciaTratamentoQuintaDAO(FrequenciaTratamentoQuintaModel pFrequenciaTratamentoQuintaModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_frequencia_tratamento_quinta ("
                    + "pk_id_frequencia_tratamento_quinta,"
                    + "fk_paciente,"
                    + "fk_magnetizador,"
                    + "setor_paciente,"
                    + "recomendacoes_espirituais,"
                    + "frequencia_quinta"
                    + ") VALUES ("
                    + "'" + pFrequenciaTratamentoQuintaModel.getIdFrequenciaTratamentoQuinta() + "',"
                    + "'" + pFrequenciaTratamentoQuintaModel.getPaciente() + "',"
                    + "'" + pFrequenciaTratamentoQuintaModel.getMagnetizador() + "',"
                    + "'" + pFrequenciaTratamentoQuintaModel.getSetorPaciente() + "',"
                    + "'" + pFrequenciaTratamentoQuintaModel.getRecomendacoesEspirituais() + "',"
                    + "'" + pFrequenciaTratamentoQuintaModel.getFrequenciaQuinta() + "'"
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
     * recupera FrequenciaTratamentoQuinta
     *
     * @param pIdFrequenciaTratamentoQuinta return
     * FrequenciaTratamentoQuintaModel
     * @return
     */
    public FrequenciaTratamentoQuintaModel getFrequenciaTratamentoQuintaDAO(int pIdFrequenciaTratamentoQuinta) {
        FrequenciaTratamentoQuintaModel modelFrequenciaTratamentoQuinta = new FrequenciaTratamentoQuintaModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM"
                    + " tbl_frequencia_tratamento_quinta"
                    + " WHERE"
                    + " pk_id_frequencia_tratamento_quinta = '" + pIdFrequenciaTratamentoQuinta + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoQuinta.setIdFrequenciaTratamentoQuinta(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoQuinta.setPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoQuinta.setMagnetizador(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoQuinta.setSetorPaciente(this.getResultSet().getString(4));
                modelFrequenciaTratamentoQuinta.setRecomendacoesEspirituais(this.getResultSet().getString(5));
                modelFrequenciaTratamentoQuinta.setFrequenciaQuinta(this.getResultSet().getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelFrequenciaTratamentoQuinta;
    }

    /**
     * recupera uma lista de FrequenciaTratamentoQuinta return ArrayList
     *
     * @return
     */
    public ArrayList<FrequenciaTratamentoQuintaModel> getListaFrequenciaTratamentoQuintaDAO() {
        ArrayList<FrequenciaTratamentoQuintaModel> listamodelFrequenciaTratamentoQuinta = new ArrayList();
        FrequenciaTratamentoQuintaModel modelFrequenciaTratamentoQuinta = new FrequenciaTratamentoQuintaModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM tbl_frequencia_tratamento_quinta;"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoQuinta = new FrequenciaTratamentoQuintaModel();
                modelFrequenciaTratamentoQuinta.setIdFrequenciaTratamentoQuinta(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoQuinta.setPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoQuinta.setMagnetizador(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoQuinta.setSetorPaciente(this.getResultSet().getString(4));
                modelFrequenciaTratamentoQuinta.setRecomendacoesEspirituais(this.getResultSet().getString(5));
                modelFrequenciaTratamentoQuinta.setFrequenciaQuinta(this.getResultSet().getString(6));
                listamodelFrequenciaTratamentoQuinta.add(modelFrequenciaTratamentoQuinta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelFrequenciaTratamentoQuinta;
    }

    /**
     * atualiza FrequenciaTratamentoQuinta
     *
     * @param pFrequenciaTratamentoQuintaModel return boolean
     * @return
     */
    public boolean atualizarFrequenciaTratamentoQuintaDAO(FrequenciaTratamentoQuintaModel pFrequenciaTratamentoQuintaModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_frequencia_tratamento_quinta SET "
                    + "pk_id_frequencia_tratamento_quinta = '" + pFrequenciaTratamentoQuintaModel.getIdFrequenciaTratamentoQuinta() + "',"
                    + "fk_paciente = '" + pFrequenciaTratamentoQuintaModel.getPaciente() + "',"
                    + "fk_magnetizador = '" + pFrequenciaTratamentoQuintaModel.getMagnetizador() + "',"
                    + "setor_paciente = '" + pFrequenciaTratamentoQuintaModel.getSetorPaciente() + "',"
                    + "recomendacoes_espirituais = '" + pFrequenciaTratamentoQuintaModel.getRecomendacoesEspirituais() + "',"
                    + "frequencia_quinta = '" + pFrequenciaTratamentoQuintaModel.getFrequenciaQuinta() + "'"
                    + " WHERE "
                    + "pk_id_frequencia_tratamento_quinta = '" + pFrequenciaTratamentoQuintaModel.getIdFrequenciaTratamentoQuinta() + "'"
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
     * exclui FrequenciaTratamentoQuinta
     *
     * @param pIdFrequenciaTratamentoQuinta return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoQuintaDAO(int pIdFrequenciaTratamentoQuinta) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_frequencia_tratamento_quinta "
                    + " WHERE "
                    + "pk_id_frequencia_tratamento_quinta = '" + pIdFrequenciaTratamentoQuinta + "'"
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
