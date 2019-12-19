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
     * grava quadroPsicofisico
     *
     * @param pQuadroPsicofisicoModel return int
     * @return 
     */
    public int salvarquadroPsicofisicoDAO(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_quadro_psicofisico ("
                    + "pk_id_quadro_psicofisico,"
                    + "fk_atendente,"
                    + "fk_paciente,"
                    + "observacoes,"
                    + "data_atendimento,"
                    + "sintomas,"
                    + "intensidade_sintomas,"
                    + "tipo_tratamento,"
                    + "periodo_tratamento,"
                    + "observacoes_tratamento,"
                    + "tipo_medicamento,"
                    + "periodo_medicamento,"
                    + "observacoes_medicamento"
                    + ") VALUES ("
                    + "'" + pQuadroPsicofisicoModel.getIdQuadroPsicofisico() + "',"
                    + "'" + pQuadroPsicofisicoModel.getAtendente() + "',"
                    + "'" + pQuadroPsicofisicoModel.getPaciente() + "',"
                    + "'" + pQuadroPsicofisicoModel.getObservacoes() + "',"
                    + "'" + pQuadroPsicofisicoModel.getDataAtendimento() + "',"
                    + "'" + pQuadroPsicofisicoModel.getSintomas() + "',"
                    + "'" + pQuadroPsicofisicoModel.getIntensidadeSintomas() + "',"
                    + "'" + pQuadroPsicofisicoModel.getTipoTratamento() + "',"
                    + "'" + pQuadroPsicofisicoModel.getPeriodoTratamento() + "',"
                    + "'" + pQuadroPsicofisicoModel.getObservacoesTratamento() + "',"
                    + "'" + pQuadroPsicofisicoModel.getTipoMedicamento() + "',"
                    + "'" + pQuadroPsicofisicoModel.getPeriodoMedicamento() + "',"
                    + "'" + pQuadroPsicofisicoModel.getObservacoesMedicamento() + "'"
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
     * recupera quadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return QuadroPsicofisicoModel
     * @return 
     */
    public QuadroPsicofisicoModel getquadroPsicofisicoDAO(int pIdQuadroPsicofisico) {
        QuadroPsicofisicoModel modelquadroPsicofisico = new QuadroPsicofisicoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_quadro_psicofisico,"
                    + "fk_atendente,"
                    + "fk_paciente,"
                    + "observacoes,"
                    + "data_atendimento,"
                    + "sintomas,"
                    + "intensidade_sintomas,"
                    + "tipo_tratamento,"
                    + "periodo_tratamento,"
                    + "observacoes_tratamento,"
                    + "tipo_medicamento,"
                    + "periodo_medicamento,"
                    + "observacoes_medicamento"
                    + " FROM"
                    + " tbl_quadro_psicofisico"
                    + " WHERE"
                    + " pk_id_quadro_psicofisico = '" + pIdQuadroPsicofisico + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelquadroPsicofisico.setIdQuadroPsicofisico(this.getResultSet().getInt(1));
                modelquadroPsicofisico.setAtendente(this.getResultSet().getInt(2));
                modelquadroPsicofisico.setPaciente(this.getResultSet().getInt(3));
                modelquadroPsicofisico.setObservacoes(this.getResultSet().getString(4));
                modelquadroPsicofisico.setDataAtendimento(this.getResultSet().getString(5));
                modelquadroPsicofisico.setSintomas(this.getResultSet().getString(6));
                modelquadroPsicofisico.setIntensidadeSintomas(this.getResultSet().getString(7));
                modelquadroPsicofisico.setTipoTratamento(this.getResultSet().getString(8));
                modelquadroPsicofisico.setPeriodoTratamento(this.getResultSet().getString(9));
                modelquadroPsicofisico.setObservacoesTratamento(this.getResultSet().getString(10));
                modelquadroPsicofisico.setTipoMedicamento(this.getResultSet().getString(11));
                modelquadroPsicofisico.setPeriodoMedicamento(this.getResultSet().getString(12));
                modelquadroPsicofisico.setObservacoesMedicamento(this.getResultSet().getString(13));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelquadroPsicofisico;
    }

    /**
     * recupera uma lista de quadroPsicofisico return ArrayList
     * @return 
     */
    public ArrayList<QuadroPsicofisicoModel> getListaquadroPsicofisicoDAO() {
        ArrayList<QuadroPsicofisicoModel> listamodelquadroPsicofisico = new ArrayList();
        QuadroPsicofisicoModel modelquadroPsicofisico = new QuadroPsicofisicoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_quadro_psicofisico,"
                    + "fk_atendente,"
                    + "fk_paciente,"
                    + "observacoes,"
                    + "data_atendimento,"
                    + "sintomas,"
                    + "intensidade_sintomas,"
                    + "tipo_tratamento,"
                    + "periodo_tratamento,"
                    + "observacoes_tratamento,"
                    + "tipo_medicamento,"
                    + "periodo_medicamento,"
                    + "observacoes_medicamento"
                    + " FROM"
                    + " tbl_quadro_psicofisico"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelquadroPsicofisico = new QuadroPsicofisicoModel();
                modelquadroPsicofisico.setIdQuadroPsicofisico(this.getResultSet().getInt(1));
                modelquadroPsicofisico.setAtendente(this.getResultSet().getInt(2));
                modelquadroPsicofisico.setPaciente(this.getResultSet().getInt(3));
                modelquadroPsicofisico.setObservacoes(this.getResultSet().getString(4));
                modelquadroPsicofisico.setDataAtendimento(this.getResultSet().getString(5));
                modelquadroPsicofisico.setSintomas(this.getResultSet().getString(6));
                modelquadroPsicofisico.setIntensidadeSintomas(this.getResultSet().getString(7));
                modelquadroPsicofisico.setTipoTratamento(this.getResultSet().getString(8));
                modelquadroPsicofisico.setPeriodoTratamento(this.getResultSet().getString(9));
                modelquadroPsicofisico.setObservacoesTratamento(this.getResultSet().getString(10));
                modelquadroPsicofisico.setTipoMedicamento(this.getResultSet().getString(11));
                modelquadroPsicofisico.setPeriodoMedicamento(this.getResultSet().getString(12));
                modelquadroPsicofisico.setObservacoesMedicamento(this.getResultSet().getString(13));
                listamodelquadroPsicofisico.add(modelquadroPsicofisico);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelquadroPsicofisico;
    }

    /**
     * atualiza quadroPsicofisico
     *
     * @param pQuadroPsicofisicoModel return boolean
     * @return 
     */
    public boolean atualizarquadroPsicofisicoDAO(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_quadro_psicofisico SET "
                    + "pk_id_quadro_psicofisico = '" + pQuadroPsicofisicoModel.getIdQuadroPsicofisico() + "',"
                    + "fk_atendente = '" + pQuadroPsicofisicoModel.getAtendente() + "',"
                    + "fk_paciente = '" + pQuadroPsicofisicoModel.getPaciente() + "',"
                    + "observacoes = '" + pQuadroPsicofisicoModel.getObservacoes() + "',"
                    + "data_atendimento = '" + pQuadroPsicofisicoModel.getDataAtendimento() + "',"
                    + "sintomas = '" + pQuadroPsicofisicoModel.getSintomas() + "',"
                    + "intensidade_sintomas = '" + pQuadroPsicofisicoModel.getIntensidadeSintomas() + "',"
                    + "tipo_tratamento = '" + pQuadroPsicofisicoModel.getTipoTratamento() + "',"
                    + "periodo_tratamento = '" + pQuadroPsicofisicoModel.getPeriodoTratamento() + "',"
                    + "observacoes_tratamento = '" + pQuadroPsicofisicoModel.getObservacoesTratamento() + "',"
                    + "tipo_medicamento = '" + pQuadroPsicofisicoModel.getTipoMedicamento() + "',"
                    + "periodo_medicamento = '" + pQuadroPsicofisicoModel.getPeriodoMedicamento() + "',"
                    + "observacoes_medicamento = '" + pQuadroPsicofisicoModel.getObservacoesMedicamento() + "'"
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
     * exclui quadroPsicofisico
     *
     * @param pIdQuadroPsicofisico return boolean
     * @return 
     */
    public boolean excluirquadroPsicofisicoDAO(int pIdQuadroPsicofisico) {
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
