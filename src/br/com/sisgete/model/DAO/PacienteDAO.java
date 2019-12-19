package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionMySql;
import br.com.sisgete.model.PacienteModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class PacienteDAO extends SisgeteConnectionMySql {

    /**
     * grava paciente
     *
     * @param pPacienteModel return int
     * @return 
     */
    public int salvarpacienteDAO(PacienteModel pPacienteModel) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_paciente ("
                    + "pk_id_paciente,"
                    + "paciente_reincidente,"
                    + "data_nascimento,"
                    + "status_tratamento,"
                    + "modo_desobsessao,"
                    + "acompanhamento_paciente,"
                    + "rua,"
                    + "num_casa,"
                    + "bairro,"
                    + "cidade,"
                    + "idade,"
                    + "conhecimento_espirita_previo,"
                    + "fonte_conhecimento_espirita,"
                    + "objetivo_tratamento,"
                    + "nome,"
                    + "sobrenome,"
                    + "setor,"
                    + "telefone,"
                    + "email"
                    + ") VALUES ("
                    + "'" + pPacienteModel.getIdPaciente() + "',"
                    + "'" + pPacienteModel.getPacienteReincidente() + "',"
                    + "'" + pPacienteModel.getDataNascimento() + "',"
                    + "'" + pPacienteModel.getStatusTratamento() + "',"
                    + "'" + pPacienteModel.getModoDesobsessao() + "',"
                    + "'" + pPacienteModel.getAcompanhamentoPaciente() + "',"
                    + "'" + pPacienteModel.getRua() + "',"
                    + "'" + pPacienteModel.getNumCasa() + "',"
                    + "'" + pPacienteModel.getBairro() + "',"
                    + "'" + pPacienteModel.getCidade() + "',"
                    + "'" + pPacienteModel.getIdade() + "',"
                    + "'" + pPacienteModel.getConhecimentoEspiritaPrevio() + "',"
                    + "'" + pPacienteModel.getFonteConhecimentoEspirita() + "',"
                    + "'" + pPacienteModel.getObjetivoTratamento() + "',"
                    + "'" + pPacienteModel.getNome() + "',"
                    + "'" + pPacienteModel.getSobrenome() + "',"
                    + "'" + pPacienteModel.getSetor() + "',"
                    + "'" + pPacienteModel.getTelefone() + "',"
                    + "'" + pPacienteModel.getEmail() + "'"
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
     * recupera paciente
     *
     * @param pIdPaciente return PacienteModel
     * @return 
     */
    public PacienteModel getpacienteDAO(int pIdPaciente) {
        PacienteModel modelpaciente = new PacienteModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_paciente,"
                    + "paciente_reincidente,"
                    + "data_nascimento,"
                    + "status_tratamento,"
                    + "modo_desobsessao,"
                    + "acompanhamento_paciente,"
                    + "rua,"
                    + "num_casa,"
                    + "bairro,"
                    + "cidade,"
                    + "idade,"
                    + "conhecimento_espirita_previo,"
                    + "fonte_conhecimento_espirita,"
                    + "objetivo_tratamento,"
                    + "nome,"
                    + "sobrenome,"
                    + "setor,"
                    + "telefone,"
                    + "email"
                    + " FROM"
                    + " tbl_paciente"
                    + " WHERE"
                    + " pk_id_paciente = '" + pIdPaciente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelpaciente.setIdPaciente(this.getResultSet().getInt(1));
                modelpaciente.setPacienteReincidente(this.getResultSet().getString(2));
                modelpaciente.setDataNascimento(this.getResultSet().getString(3));
                modelpaciente.setStatusTratamento(this.getResultSet().getString(4));
                modelpaciente.setModoDesobsessao(this.getResultSet().getString(5));
                modelpaciente.setAcompanhamentoPaciente(this.getResultSet().getString(6));
                modelpaciente.setRua(this.getResultSet().getString(7));
                modelpaciente.setNumCasa(this.getResultSet().getInt(8));
                modelpaciente.setBairro(this.getResultSet().getString(9));
                modelpaciente.setCidade(this.getResultSet().getString(10));
                modelpaciente.setIdade(this.getResultSet().getInt(11));
                modelpaciente.setConhecimentoEspiritaPrevio(this.getResultSet().getString(12));
                modelpaciente.setFonteConhecimentoEspirita(this.getResultSet().getString(13));
                modelpaciente.setObjetivoTratamento(this.getResultSet().getString(14));
                modelpaciente.setNome(this.getResultSet().getString(15));
                modelpaciente.setSobrenome(this.getResultSet().getString(16));
                modelpaciente.setSetor(this.getResultSet().getString(17));
                modelpaciente.setTelefone(this.getResultSet().getString(18));
                modelpaciente.setEmail(this.getResultSet().getString(19));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelpaciente;
    }

    /**
     * recupera uma lista de paciente return ArrayList
     * @return 
     */
    public ArrayList<PacienteModel> getListapacienteDAO() {
        ArrayList<PacienteModel> listamodelpaciente = new ArrayList();
        PacienteModel modelpaciente = new PacienteModel();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_paciente,"
                    + "paciente_reincidente,"
                    + "data_nascimento,"
                    + "status_tratamento,"
                    + "modo_desobsessao,"
                    + "acompanhamento_paciente,"
                    + "rua,"
                    + "num_casa,"
                    + "bairro,"
                    + "cidade,"
                    + "idade,"
                    + "conhecimento_espirita_previo,"
                    + "fonte_conhecimento_espirita,"
                    + "objetivo_tratamento,"
                    + "nome,"
                    + "sobrenome,"
                    + "setor,"
                    + "telefone,"
                    + "email"
                    + " FROM"
                    + " tbl_paciente"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelpaciente = new PacienteModel();
                modelpaciente.setIdPaciente(this.getResultSet().getInt(1));
                modelpaciente.setPacienteReincidente(this.getResultSet().getString(2));
                modelpaciente.setDataNascimento(this.getResultSet().getString(3));
                modelpaciente.setStatusTratamento(this.getResultSet().getString(4));
                modelpaciente.setModoDesobsessao(this.getResultSet().getString(5));
                modelpaciente.setAcompanhamentoPaciente(this.getResultSet().getString(6));
                modelpaciente.setRua(this.getResultSet().getString(7));
                modelpaciente.setNumCasa(this.getResultSet().getInt(8));
                modelpaciente.setBairro(this.getResultSet().getString(9));
                modelpaciente.setCidade(this.getResultSet().getString(10));
                modelpaciente.setIdade(this.getResultSet().getInt(11));
                modelpaciente.setConhecimentoEspiritaPrevio(this.getResultSet().getString(12));
                modelpaciente.setFonteConhecimentoEspirita(this.getResultSet().getString(13));
                modelpaciente.setObjetivoTratamento(this.getResultSet().getString(14));
                modelpaciente.setNome(this.getResultSet().getString(15));
                modelpaciente.setSobrenome(this.getResultSet().getString(16));
                modelpaciente.setSetor(this.getResultSet().getString(17));
                modelpaciente.setTelefone(this.getResultSet().getString(18));
                modelpaciente.setEmail(this.getResultSet().getString(19));
                listamodelpaciente.add(modelpaciente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelpaciente;
    }

    /**
     * atualiza paciente
     *
     * @param pPacienteModel return boolean
     * @return 
     */
    public boolean atualizarpacienteDAO(PacienteModel pPacienteModel) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_paciente SET "
                    + "pk_id_paciente = '" + pPacienteModel.getIdPaciente() + "',"
                    + "paciente_reincidente = '" + pPacienteModel.getPacienteReincidente() + "',"
                    + "data_nascimento = '" + pPacienteModel.getDataNascimento() + "',"
                    + "status_tratamento = '" + pPacienteModel.getStatusTratamento() + "',"
                    + "modo_desobsessao = '" + pPacienteModel.getModoDesobsessao() + "',"
                    + "acompanhamento_paciente = '" + pPacienteModel.getAcompanhamentoPaciente() + "',"
                    + "rua = '" + pPacienteModel.getRua() + "',"
                    + "num_casa = '" + pPacienteModel.getNumCasa() + "',"
                    + "bairro = '" + pPacienteModel.getBairro() + "',"
                    + "cidade = '" + pPacienteModel.getCidade() + "',"
                    + "idade = '" + pPacienteModel.getIdade() + "',"
                    + "conhecimento_espirita_previo = '" + pPacienteModel.getConhecimentoEspiritaPrevio() + "',"
                    + "fonte_conhecimento_espirita = '" + pPacienteModel.getFonteConhecimentoEspirita() + "',"
                    + "objetivo_tratamento = '" + pPacienteModel.getObjetivoTratamento() + "',"
                    + "nome = '" + pPacienteModel.getNome() + "',"
                    + "sobrenome = '" + pPacienteModel.getSobrenome() + "',"
                    + "setor = '" + pPacienteModel.getSetor() + "',"
                    + "telefone = '" + pPacienteModel.getTelefone() + "',"
                    + "email = '" + pPacienteModel.getEmail() + "'"
                    + " WHERE "
                    + "pk_id_paciente = '" + pPacienteModel.getIdPaciente() + "'"
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
     * exclui paciente
     *
     * @param pIdPaciente return boolean
     * @return 
     */
    public boolean excluirpacienteDAO(int pIdPaciente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_paciente "
                    + " WHERE "
                    + "pk_id_paciente = '" + pIdPaciente + "'"
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
