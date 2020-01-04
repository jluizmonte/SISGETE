package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.QuadroPsicofisicoModel;
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
     */
    public int salvarQuadroPsicofisicoDAO(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_quadro_psicofisico ("
                    + "pk_id_quadro_psicofisico,"
                    + "fk_id_paciente,"
                    + "presenca_espirito_intensidade,"
                    + "ouve_vozes_intensidade,"
                    + "vultos_intensidade,"
                    + "ideias_suicidas_intensidade,"
                    + "zumbidos_intensidade,"
                    + "calafrios_intensidade,"
                    + "aceleracao_coracao_intensidade,"
                    + "pesadelos_intensidade,"
                    + "medo_intensidade,"
                    + "falta_concentracao_intensidade,"
                    + "desanimo_intensidade,"
                    + "angustia_intensidade,"
                    + "insonia_intensidade,"
                    + "falta_apetite_intensidade,"
                    + "ansiedade_intensidade,"
                    + "irritacao_sem_motivo_intensidade,"
                    + "dormecias_intensidade,"
                    + "dores_pernas_bracos_intensidade,"
                    + "sudorese_intensidade,"
                    + "tontura_intensidade,"
                    + "sonolencia_intensidade,"
                    + "cansaco_intensidade,"
                    + "dor_cabeca_intensidade,"
                    + "dor_coluna_intensidade"
                    + ") VALUES ("
                    + "'" + pQuadroPsicofisicoModel.getIdQuadroPsicofisico() + "',"
                    + "'" + pQuadroPsicofisicoModel.getIdPaciente() + "',"
                    + "'" + pQuadroPsicofisicoModel.getPresenca_espirito_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getOuve_vozes_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getVultos_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getIdeias_suicidas_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getZumbidos_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getCalafrios_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getAceleracao_coracao_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getPesadelos_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getMedo_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getFalta_concentracao_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getDesanimo_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getAngustia_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getInsonia_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getFalta_apetite_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getAnsiedade_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getIrritacao_sem_motivo_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getDormecias_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getDores_pernas_bracos_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getSudorese_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getTontura_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getSonolencia_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getCansaco_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getDor_cabeca_intensidade() + "',"
                    + "'" + pQuadroPsicofisicoModel.getDor_coluna_intensidade() + "'"
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
     */
    public QuadroPsicofisicoModel getQuadroPsicofisicoDAO(int pIdQuadroPsicofisico) {
        QuadroPsicofisicoModel modelQuadroPsicofisico = new QuadroPsicofisicoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_quadro_psicofisico,"
                    + "fk_id_paciente,"
                    + "presenca_espirito_intensidade,"
                    + "ouve_vozes_intensidade,"
                    + "vultos_intensidade,"
                    + "ideias_suicidas_intensidade,"
                    + "zumbidos_intensidade,"
                    + "calafrios_intensidade,"
                    + "aceleracao_coracao_intensidade,"
                    + "pesadelos_intensidade,"
                    + "medo_intensidade,"
                    + "falta_concentracao_intensidade,"
                    + "desanimo_intensidade,"
                    + "angustia_intensidade,"
                    + "insonia_intensidade,"
                    + "falta_apetite_intensidade,"
                    + "ansiedade_intensidade,"
                    + "irritacao_sem_motivo_intensidade,"
                    + "dormecias_intensidade,"
                    + "dores_pernas_bracos_intensidade,"
                    + "sudorese_intensidade,"
                    + "tontura_intensidade,"
                    + "sonolencia_intensidade,"
                    + "cansaco_intensidade,"
                    + "dor_cabeca_intensidade,"
                    + "dor_coluna_intensidade"
                    + " FROM"
                    + " tbl_quadro_psicofisico"
                    + " WHERE"
                    + " pk_id_quadro_psicofisico = '" + pIdQuadroPsicofisico + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelQuadroPsicofisico.setIdQuadroPsicofisico(this.getResultSet().getInt(1));
                modelQuadroPsicofisico.setIdPaciente(this.getResultSet().getInt(2));
                modelQuadroPsicofisico.setPresenca_espirito_intensidade(this.getResultSet().getString(3));
                modelQuadroPsicofisico.setOuve_vozes_intensidade(this.getResultSet().getString(4));
                modelQuadroPsicofisico.setVultos_intensidade(this.getResultSet().getString(5));
                modelQuadroPsicofisico.setIdeias_suicidas_intensidade(this.getResultSet().getString(6));
                modelQuadroPsicofisico.setZumbidos_intensidade(this.getResultSet().getString(7));
                modelQuadroPsicofisico.setCalafrios_intensidade(this.getResultSet().getString(8));
                modelQuadroPsicofisico.setAceleracao_coracao_intensidade(this.getResultSet().getString(9));
                modelQuadroPsicofisico.setPesadelos_intensidade(this.getResultSet().getString(10));
                modelQuadroPsicofisico.setMedo_intensidade(this.getResultSet().getString(11));
                modelQuadroPsicofisico.setFalta_concentracao_intensidade(this.getResultSet().getString(12));
                modelQuadroPsicofisico.setDesanimo_intensidade(this.getResultSet().getString(13));
                modelQuadroPsicofisico.setAngustia_intensidade(this.getResultSet().getString(14));
                modelQuadroPsicofisico.setInsonia_intensidade(this.getResultSet().getString(15));
                modelQuadroPsicofisico.setFalta_apetite_intensidade(this.getResultSet().getString(16));
                modelQuadroPsicofisico.setAnsiedade_intensidade(this.getResultSet().getString(17));
                modelQuadroPsicofisico.setIrritacao_sem_motivo_intensidade(this.getResultSet().getString(18));
                modelQuadroPsicofisico.setDormecias_intensidade(this.getResultSet().getString(19));
                modelQuadroPsicofisico.setDores_pernas_bracos_intensidade(this.getResultSet().getString(20));
                modelQuadroPsicofisico.setSudorese_intensidade(this.getResultSet().getString(21));
                modelQuadroPsicofisico.setTontura_intensidade(this.getResultSet().getString(22));
                modelQuadroPsicofisico.setSonolencia_intensidade(this.getResultSet().getString(23));
                modelQuadroPsicofisico.setCansaco_intensidade(this.getResultSet().getString(24));
                modelQuadroPsicofisico.setDor_cabeca_intensidade(this.getResultSet().getString(25));
                modelQuadroPsicofisico.setDor_coluna_intensidade(this.getResultSet().getString(26));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelQuadroPsicofisico;
    }

    /**
     * recupera uma lista de QuadroPsicofisico return ArrayList
     */
    public ArrayList<QuadroPsicofisicoModel> getListaQuadroPsicofisicoDAO() {
        ArrayList<QuadroPsicofisicoModel> listamodelQuadroPsicofisico = new ArrayList();
        QuadroPsicofisicoModel modelQuadroPsicofisico = new QuadroPsicofisicoModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_quadro_psicofisico,"
                    + "fk_id_paciente,"
                    + "presenca_espirito_intensidade,"
                    + "ouve_vozes_intensidade,"
                    + "vultos_intensidade,"
                    + "ideias_suicidas_intensidade,"
                    + "zumbidos_intensidade,"
                    + "calafrios_intensidade,"
                    + "aceleracao_coracao_intensidade,"
                    + "pesadelos_intensidade,"
                    + "medo_intensidade,"
                    + "falta_concentracao_intensidade,"
                    + "desanimo_intensidade,"
                    + "angustia_intensidade,"
                    + "insonia_intensidade,"
                    + "falta_apetite_intensidade,"
                    + "ansiedade_intensidade,"
                    + "irritacao_sem_motivo_intensidade,"
                    + "dormecias_intensidade,"
                    + "dores_pernas_bracos_intensidade,"
                    + "sudorese_intensidade,"
                    + "tontura_intensidade,"
                    + "sonolencia_intensidade,"
                    + "cansaco_intensidade,"
                    + "dor_cabeca_intensidade,"
                    + "dor_coluna_intensidade"
                    + " FROM"
                    + " tbl_quadro_psicofisico"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelQuadroPsicofisico = new QuadroPsicofisicoModel();
                modelQuadroPsicofisico.setIdQuadroPsicofisico(this.getResultSet().getInt(1));
                modelQuadroPsicofisico.setIdPaciente(this.getResultSet().getInt(2));
                modelQuadroPsicofisico.setPresenca_espirito_intensidade(this.getResultSet().getString(3));
                modelQuadroPsicofisico.setOuve_vozes_intensidade(this.getResultSet().getString(4));
                modelQuadroPsicofisico.setVultos_intensidade(this.getResultSet().getString(5));
                modelQuadroPsicofisico.setIdeias_suicidas_intensidade(this.getResultSet().getString(6));
                modelQuadroPsicofisico.setZumbidos_intensidade(this.getResultSet().getString(7));
                modelQuadroPsicofisico.setCalafrios_intensidade(this.getResultSet().getString(8));
                modelQuadroPsicofisico.setAceleracao_coracao_intensidade(this.getResultSet().getString(9));
                modelQuadroPsicofisico.setPesadelos_intensidade(this.getResultSet().getString(10));
                modelQuadroPsicofisico.setMedo_intensidade(this.getResultSet().getString(11));
                modelQuadroPsicofisico.setFalta_concentracao_intensidade(this.getResultSet().getString(12));
                modelQuadroPsicofisico.setDesanimo_intensidade(this.getResultSet().getString(13));
                modelQuadroPsicofisico.setAngustia_intensidade(this.getResultSet().getString(14));
                modelQuadroPsicofisico.setInsonia_intensidade(this.getResultSet().getString(15));
                modelQuadroPsicofisico.setFalta_apetite_intensidade(this.getResultSet().getString(16));
                modelQuadroPsicofisico.setAnsiedade_intensidade(this.getResultSet().getString(17));
                modelQuadroPsicofisico.setIrritacao_sem_motivo_intensidade(this.getResultSet().getString(18));
                modelQuadroPsicofisico.setDormecias_intensidade(this.getResultSet().getString(19));
                modelQuadroPsicofisico.setDores_pernas_bracos_intensidade(this.getResultSet().getString(20));
                modelQuadroPsicofisico.setSudorese_intensidade(this.getResultSet().getString(21));
                modelQuadroPsicofisico.setTontura_intensidade(this.getResultSet().getString(22));
                modelQuadroPsicofisico.setSonolencia_intensidade(this.getResultSet().getString(23));
                modelQuadroPsicofisico.setCansaco_intensidade(this.getResultSet().getString(24));
                modelQuadroPsicofisico.setDor_cabeca_intensidade(this.getResultSet().getString(25));
                modelQuadroPsicofisico.setDor_coluna_intensidade(this.getResultSet().getString(26));
                listamodelQuadroPsicofisico.add(modelQuadroPsicofisico);
            }
        } catch (Exception e) {
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
     */
    public boolean atualizarQuadroPsicofisicoDAO(QuadroPsicofisicoModel pQuadroPsicofisicoModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_quadro_psicofisico SET "
                    + "pk_id_quadro_psicofisico = '" + pQuadroPsicofisicoModel.getIdQuadroPsicofisico() + "',"
                    + "fk_id_paciente = '" + pQuadroPsicofisicoModel.getIdPaciente() + "',"
                    + "presenca_espirito_intensidade = '" + pQuadroPsicofisicoModel.getPresenca_espirito_intensidade() + "',"
                    + "ouve_vozes_intensidade = '" + pQuadroPsicofisicoModel.getOuve_vozes_intensidade() + "',"
                    + "vultos_intensidade = '" + pQuadroPsicofisicoModel.getVultos_intensidade() + "',"
                    + "ideias_suicidas_intensidade = '" + pQuadroPsicofisicoModel.getIdeias_suicidas_intensidade() + "',"
                    + "zumbidos_intensidade = '" + pQuadroPsicofisicoModel.getZumbidos_intensidade() + "',"
                    + "calafrios_intensidade = '" + pQuadroPsicofisicoModel.getCalafrios_intensidade() + "',"
                    + "aceleracao_coracao_intensidade = '" + pQuadroPsicofisicoModel.getAceleracao_coracao_intensidade() + "',"
                    + "pesadelos_intensidade = '" + pQuadroPsicofisicoModel.getPesadelos_intensidade() + "',"
                    + "medo_intensidade = '" + pQuadroPsicofisicoModel.getMedo_intensidade() + "',"
                    + "falta_concentracao_intensidade = '" + pQuadroPsicofisicoModel.getFalta_concentracao_intensidade() + "',"
                    + "desanimo_intensidade = '" + pQuadroPsicofisicoModel.getDesanimo_intensidade() + "',"
                    + "angustia_intensidade = '" + pQuadroPsicofisicoModel.getAngustia_intensidade() + "',"
                    + "insonia_intensidade = '" + pQuadroPsicofisicoModel.getInsonia_intensidade() + "',"
                    + "falta_apetite_intensidade = '" + pQuadroPsicofisicoModel.getFalta_apetite_intensidade() + "',"
                    + "ansiedade_intensidade = '" + pQuadroPsicofisicoModel.getAnsiedade_intensidade() + "',"
                    + "irritacao_sem_motivo_intensidade = '" + pQuadroPsicofisicoModel.getIrritacao_sem_motivo_intensidade() + "',"
                    + "dormecias_intensidade = '" + pQuadroPsicofisicoModel.getDormecias_intensidade() + "',"
                    + "dores_pernas_bracos_intensidade = '" + pQuadroPsicofisicoModel.getDores_pernas_bracos_intensidade() + "',"
                    + "sudorese_intensidade = '" + pQuadroPsicofisicoModel.getSudorese_intensidade() + "',"
                    + "tontura_intensidade = '" + pQuadroPsicofisicoModel.getTontura_intensidade() + "',"
                    + "sonolencia_intensidade = '" + pQuadroPsicofisicoModel.getSonolencia_intensidade() + "',"
                    + "cansaco_intensidade = '" + pQuadroPsicofisicoModel.getCansaco_intensidade() + "',"
                    + "dor_cabeca_intensidade = '" + pQuadroPsicofisicoModel.getDor_cabeca_intensidade() + "',"
                    + "dor_coluna_intensidade = '" + pQuadroPsicofisicoModel.getDor_coluna_intensidade() + "'"
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
