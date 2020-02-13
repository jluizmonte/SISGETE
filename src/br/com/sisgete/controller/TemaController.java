package br.com.sisgete.controller;

import br.com.sisgete.model.DAO.TemaDao;
import br.com.sisgete.model.TemaModel;

public class TemaController {

    TemaDao temaDao = new TemaDao();

    public boolean atualizarTemaDAO(TemaModel pTemaModel) {
        return temaDao.atualizarTemaDAO(pTemaModel);
    }

    public TemaModel getTemaDAO() {
        return temaDao.getTemaDAO();
    }

}
