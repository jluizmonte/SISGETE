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
                    + "pk_id_frequencia_domingo,"
                    + "fk_paciente,"
                    + "fk_magnetizador,"
                    + "fk_auxiliar,"
                    + "setor_paciente,"
                    + "recomendacoes_espirituais,"
                    + "frequencia_domingo"
                    + ") VALUES ("
                    + "'" + pFrequenciaTratamentoDomingoModel.getIdQuadroPsicofisicoDomingo() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getIdPaciente() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getIdMagnetizador() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getIdAuxiliar() + "',"
                    + "'" + pFrequenciaTratamentoDomingoModel.getSetorPaciente() + "',"
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
     * @param pIdQuadroPsicofisicoDomingo return
     * FrequenciaTratamentoDomingoModel
     * @return
     */
    public FrequenciaTratamentoDomingoModel getFrequenciaTratamentoDomingoDAO(int pIdQuadroPsicofisicoDomingo) {
        FrequenciaTratamentoDomingoModel modelFrequenciaTratamentoDomingo = new FrequenciaTratamentoDomingoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_frequencia_domingo,"
                    + "fk_paciente,"
                    + "fk_magnetizador,"
                    + "fk_auxiliar,"
                    + "setor_paciente,"
                    + "recomendacoes_espirituais,"
                    + "frequencia_domingo"
                    + " FROM"
                    + " tbl_frequencia_tratamento_domingo"
                    + " WHERE"
                    + " pk_id_frequencia_domingo = '" + pIdQuadroPsicofisicoDomingo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoDomingo.setIdQuadroPsicofisicoDomingo(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoDomingo.setIdPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoDomingo.setIdMagnetizador(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoDomingo.setIdAuxiliar(this.getResultSet().getInt(4));
                modelFrequenciaTratamentoDomingo.setSetorPaciente(this.getResultSet().getString(5));
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
                    + "pk_id_frequencia_domingo,"
                    + "fk_paciente,"
                    + "fk_magnetizador,"
                    + "fk_auxiliar,"
                    + "setor_paciente,"
                    + "recomendacoes_espirituais,"
                    + "frequencia_domingo"
                    + " FROM"
                    + " tbl_frequencia_tratamento_domingo"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelFrequenciaTratamentoDomingo = new FrequenciaTratamentoDomingoModel();
                modelFrequenciaTratamentoDomingo.setIdQuadroPsicofisicoDomingo(this.getResultSet().getInt(1));
                modelFrequenciaTratamentoDomingo.setIdPaciente(this.getResultSet().getInt(2));
                modelFrequenciaTratamentoDomingo.setIdMagnetizador(this.getResultSet().getInt(3));
                modelFrequenciaTratamentoDomingo.setIdAuxiliar(this.getResultSet().getInt(4));
                modelFrequenciaTratamentoDomingo.setSetorPaciente(this.getResultSet().getString(5));
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
                    + "pk_id_frequencia_domingo = '" + pFrequenciaTratamentoDomingoModel.getIdQuadroPsicofisicoDomingo() + "',"
                    + "fk_paciente = '" + pFrequenciaTratamentoDomingoModel.getIdPaciente() + "',"
                    + "fk_magnetizador = '" + pFrequenciaTratamentoDomingoModel.getIdMagnetizador() + "',"
                    + "fk_auxiliar = '" + pFrequenciaTratamentoDomingoModel.getIdAuxiliar() + "',"
                    + "setor_paciente = '" + pFrequenciaTratamentoDomingoModel.getSetorPaciente() + "',"
                    + "recomendacoes_espirituais = '" + pFrequenciaTratamentoDomingoModel.getRecomendacoesEspirituais() + "',"
                    + "frequencia_domingo = '" + pFrequenciaTratamentoDomingoModel.getFrequenciaDomingo() + "'"
                    + " WHERE "
                    + "pk_id_frequencia_domingo = '" + pFrequenciaTratamentoDomingoModel.getIdQuadroPsicofisicoDomingo() + "'"
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
     * @param pIdQuadroPsicofisicoDomingo return boolean
     * @return
     */
    public boolean excluirFrequenciaTratamentoDomingoDAO(int pIdQuadroPsicofisicoDomingo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_frequencia_tratamento_domingo "
                    + " WHERE "
                    + "pk_id_frequencia_domingo = '" + pIdQuadroPsicofisicoDomingo + "'"
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
