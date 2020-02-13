package br.com.sisgete.model.DAO;

import br.com.sisgete.connection.SisgeteConnectionSqLite;
import br.com.sisgete.model.TemaModel;
import java.sql.SQLException;

public class TemaDao extends SisgeteConnectionSqLite {

    public TemaModel getTemaDAO() {
        TemaModel temaModel = new TemaModel();
        try {
            this.connect();
            this.executeSQL("SELECT * FROM tbl_tema");
            while (this.getResultSet().next()) {
                temaModel.setTema(this.getResultSet().getString("tema_nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeConection();
        }
        return temaModel;
    }

    public boolean atualizarTemaDAO(TemaModel pTemaModel) {
        try {
            this.connect();
            this.executeUpdateDeleSQL("UPDATE tbl_tema SET tema_nome = ?");
            this.getPreparedStatement().setString(1, pTemaModel.getTema());
            this.getPreparedStatement().executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }
}
