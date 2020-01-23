package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.PacienteLogDB;
import br.com.sisgete.model.PacienteLogModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author luiz
 */
public class PacienteLogDAO extends PacienteLogDB {

    public int insertPacienteLog(PacienteLogModel pacienteLogModel) {
        try {
            String sql = "INSERT INTO tbl_paciente (paciente, setor) VALUES (?,?)";
            PreparedStatement preparedStatement = this.connect().prepareStatement(sql);
            preparedStatement.setString(1, pacienteLogModel.getPacienteLog());
            preparedStatement.setString(2, pacienteLogModel.getSetorPacienteLog());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.closeConection();
        }
        return 0;
    }
}
