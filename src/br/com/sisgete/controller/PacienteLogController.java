package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.PacienteLogDAO;
import br.com.sisgete.model.PacienteLogModel;

/**
 *
 * @author luiz
 */
public class PacienteLogController {

    PacienteLogDAO pacienteLogDAO = new PacienteLogDAO();

    public int insertPacienteLog(PacienteLogModel pacienteLogModel) {
        return this.pacienteLogDAO.insertPacienteLog(pacienteLogModel);
    }
}
