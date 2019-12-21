package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class QuadroPsicofisicoDAO extends SisgeteConnectionMySql {

    /**
     * grava QuadroPsicofisico
     *
     * @param pQuadroPsicofisicoModel return int
     * @return
     */
    public int salvarQuadroPsicofisicoDAO(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_quadro_psicofisico ("
                    + "pk_id_quadro_psicofisico,"
                    + "fk_atendente,"
                    + "fk_paciente,"
                    + "observacoes,"
                    + "sintomas,"
                    + "intensidade_sintomas,"
                    + "uso_medicamento_tratamento,"
                    + "tipo_medicamento_tratamento,"
                    + "periodo_medicamento_tratamento,"
                    + "tratamento_observacoes"
                    + ") VALUES ("
                    + "'" + pQuadroPsicofisicoModel.getIdQuadroPsicofisico() + "',"
                    + "'" + pQuadroPsicofisicoModel.getAtendente() + "',"
                    + "'" + pQuadroPsicofisicoModel.getPaciente() + "',"
                    + "'" + pQuadroPsicofisicoModel.getObservacoes() + "',"
                    + "'" + pQuadroPsicofisicoModel.getSintomas() + "',"
                    + "'" + pQuadroPsicofisicoModel.getIntensidadeSintomas() + "'"
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
     * recupera QuadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return QuadroPsicofisicoModel
     * @return
     */
    public QuadroPsicofisicoModel getQuadroPsicofisicoDAO(int pIdQuadroPsicofisico) {
        QuadroPsicofisicoModel modelQuadroPsicofisico = new QuadroPsicofisicoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_quadro_psicofisico,"
                    + "fk_atendente,"
                    + "fk_paciente,"
                    + "observacoes,"
                    + "sintomas,"
                    + "intensidade_sintomas,"
                    + "uso_medicamento_tratamento,"
                    + "tipo_medicamento_tratamento,"
                    + "periodo_medicamento_tratamento,"
                    + "tratamento_observacoes"
                    + " FROM"
                    + " tbl_quadro_psicofisico"
                    + " WHERE"
                    + " pk_id_quadro_psicofisico = '" + pIdQuadroPsicofisico + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelQuadroPsicofisico.setIdQuadroPsicofisico(this.getResultSet().getInt(1));
                modelQuadroPsicofisico.setAtendente(this.getResultSet().getInt(2));
                modelQuadroPsicofisico.setPaciente(this.getResultSet().getInt(3));
                modelQuadroPsicofisico.setObservacoes(this.getResultSet().getString(4));
                modelQuadroPsicofisico.setSintomas(this.getResultSet().getString(5));
                modelQuadroPsicofisico.setIntensidadeSintomas(this.getResultSet().getString(6));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelQuadroPsicofisico;
    }

    /**
     * recupera uma lista de QuadroPsicofisico return ArrayList
     *
     * @return
     */
    public ArrayList<QuadroPsicofisicoModel> getListaQuadroPsicofisicoDAO() {
        ArrayList<QuadroPsicofisicoModel> listamodelQuadroPsicofisico = new ArrayList();
        QuadroPsicofisicoModel modelQuadroPsicofisico = new QuadroPsicofisicoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_quadro_psicofisico,"
                    + "fk_atendente,"
                    + "fk_paciente,"
                    + "observacoes,"
                    + "sintomas,"
                    + "intensidade_sintomas,"
                    + "uso_medicamento_tratamento,"
                    + "tipo_medicamento_tratamento,"
                    + "periodo_medicamento_tratamento,"
                    + "tratamento_observacoes"
                    + " FROM"
                    + " tbl_quadro_psicofisico"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelQuadroPsicofisico = new QuadroPsicofisicoModel();
                modelQuadroPsicofisico.setIdQuadroPsicofisico(this.getResultSet().getInt(1));
                modelQuadroPsicofisico.setAtendente(this.getResultSet().getInt(2));
                modelQuadroPsicofisico.setPaciente(this.getResultSet().getInt(3));
                modelQuadroPsicofisico.setObservacoes(this.getResultSet().getString(4));
                modelQuadroPsicofisico.setSintomas(this.getResultSet().getString(5));
                modelQuadroPsicofisico.setIntensidadeSintomas(this.getResultSet().getString(6));

                listamodelQuadroPsicofisico.add(modelQuadroPsicofisico);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelQuadroPsicofisico;
    }

    /**
     * atualiza QuadroPsicofisico
     *
     * @param pQuadroPsicofisicoModel return boolean
     * @return
     */
    public boolean atualizarQuadroPsicofisicoDAO(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_quadro_psicofisico SET "
                    + "pk_id_quadro_psicofisico = '" + pQuadroPsicofisicoModel.getIdQuadroPsicofisico() + "',"
                    + "fk_atendente = '" + pQuadroPsicofisicoModel.getAtendente() + "',"
                    + "fk_paciente = '" + pQuadroPsicofisicoModel.getPaciente() + "',"
                    + "observacoes = '" + pQuadroPsicofisicoModel.getObservacoes() + "',"
                    + "sintomas = '" + pQuadroPsicofisicoModel.getSintomas() + "',"
                    + "intensidade_sintomas = '" + pQuadroPsicofisicoModel.getIntensidadeSintomas() + "'"
                    + " WHERE "
                    + "pk_id_quadro_psicofisico = '" + pQuadroPsicofisicoModel.getIdQuadroPsicofisico() + "'"
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
     * exclui QuadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return boolean
     * @return
     */
    public boolean excluirQuadroPsicofisicoDAO(int pIdQuadroPsicofisico) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_quadro_psicofisico "
                    + " WHERE "
                    + "pk_id_quadro_psicofisico = '" + pIdQuadroPsicofisico + "'"
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
