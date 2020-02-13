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
     */
    public int salvarFrequenciaTratamentoQuintaDAO(FrequenciaTratamentoQuintaModel pFrequenciaTratamentoQuintaModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_frequencia_quinta ("
                    + "pk_id_quadro_psicofisico_quinta,"
                    + "fk_paciente,"
                    + "fk_magnetizador,"
                    + "fk_auxiliar,"
                    + "setor_paciente,"
                    + "recomendacoes_espirituais,"
                    + "frequencia_quinta"
                    + ") VALUES ("
                    + "'" + pFrequenciaTratamentoQuintaModel.getIdQuadroPsicofisicoQuinta() + "',"
                    + "'" + pFrequenciaTratamentoQuintaModel.getIdPaciente() + "',"
                    + "'" + pFrequenciaTratamentoQuintaModel.getIdMagnetizador() + "',"
                    + "'" + pFrequenciaTratamentoQuintaModel.getIdAuxiliar() + "',"
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
     * @param pIdQuadroPsicofisicoQuinta return FrequenciaTratamentoQuintaModel
     * @return
     */
    public FrequenciaTratamentoQuintaModel getFrequenciaTratamentoQuintaDAO(int pIdQuadroPsicofisicoQuinta) {
        FrequenciaTratamentoQuintaModel modelFrequenciaTratamentoQuinta = new FrequenciaTratamentoQuintaModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT * FROM"
                    + " tbl_frequencia_quinta"
                    + " WHERE"
                    + " pk_id_quadro_psicofisico_quinta = '" + pIdQuadroPsicofisicoQuinta + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoQuinta.setIdQuadroPsicofisicoQuinta(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoQuinta.setIdPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoQuinta.setIdMagnetizador(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoQuinta.setIdAuxiliar(this.getResultSet().getInt(4));
                modelFrequenciaTratamentoQuinta.setSetorPaciente(this.getResultSet().getString(5));
                modelFrequenciaTratamentoQuinta.setRecomendacoesEspirituais(this.getResultSet().getString(6));
                modelFrequenciaTratamentoQuinta.setFrequenciaQuinta(this.getResultSet().getString(7));
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
                    "SELECT * FROM"
                    + " tbl_frequencia_quinta"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoQuinta = new FrequenciaTratamentoQuintaModel();
                modelFrequenciaTratamentoQuinta.setIdQuadroPsicofisicoQuinta(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoQuinta.setIdPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoQuinta.setIdMagnetizador(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoQuinta.setIdAuxiliar(this.getResultSet().getInt(4));
                modelFrequenciaTratamentoQuinta.setSetorPaciente(this.getResultSet().getString(5));
                modelFrequenciaTratamentoQuinta.setRecomendacoesEspirituais(this.getResultSet().getString(6));
                modelFrequenciaTratamentoQuinta.setFrequenciaQuinta(this.getResultSet().getString(7));
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
                    "UPDATE tbl_frequencia_quinta SET "
                    + "pk_id_quadro_psicofisico_quinta = '" + pFrequenciaTratamentoQuintaModel.getIdQuadroPsicofisicoQuinta() + "',"
                    + "fk_paciente = '" + pFrequenciaTratamentoQuintaModel.getIdPaciente() + "',"
                    + "fk_magnetizador = '" + pFrequenciaTratamentoQuintaModel.getIdMagnetizador() + "',"
                    + "fk_auxiliar = '" + pFrequenciaTratamentoQuintaModel.getIdAuxiliar() + "',"
                    + "setor_paciente = '" + pFrequenciaTratamentoQuintaModel.getSetorPaciente() + "',"
                    + "recomendacoes_espirituais = '" + pFrequenciaTratamentoQuintaModel.getRecomendacoesEspirituais() + "',"
                    + "frequencia_quinta = '" + pFrequenciaTratamentoQuintaModel.getFrequenciaQuinta() + "'"
                    + " WHERE "
                    + "pk_id_quadro_psicofisico_quinta = '" + pFrequenciaTratamentoQuintaModel.getIdQuadroPsicofisicoQuinta() + "'"
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
     * @param pIdQuadroPsicofisicoQuinta return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoQuintaDAO(int pIdQuadroPsicofisicoQuinta) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_frequencia_quinta "
                    + " WHERE "
                    + "pk_id_quadro_psicofisico_quinta = '" + pIdQuadroPsicofisicoQuinta + "'"
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
