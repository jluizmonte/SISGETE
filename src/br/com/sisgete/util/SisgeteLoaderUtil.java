package br.com.sisgete.util;

import br.com.sisgete.connection.PacienteLogDB;
import br.com.sisgete.connection.SisgeteConnectionSqLite;
import br.com.sisgete.controller.TemaController;
import br.com.sisgete.model.TemaModel;
import br.com.sisgete.view.PrincipalView;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author luiz
 */
public class SisgeteLoaderUtil {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException {
        SisgeteConnectionSqLite criacaoBDTema = new SisgeteConnectionSqLite();
        PacienteLogDB pacienteLogDB = new PacienteLogDB();
     
        criacaoBDTema.sisgeteDB();
        criacaoBDTema.sisgeteTableDB();

        pacienteLogDB.pacienteLogDB();
        pacienteLogDB.pacienteTableDB();

        TemaModel temaModel = new TemaModel();
        temaModel = new TemaController().getTemaDAO();
        String tema = temaModel.getTema();

        new LogCatch().criarPastaLogs();
        new LogCatch().firstWriteFile();
        try {
            UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
            try {
                UIManager.setLookAndFeel(tema);
                //  new CarregarSplash().setSplashTime();
                new PrincipalView().setVisible(true);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                //      e.printStackTrace();
            }
        } catch (UnsupportedLookAndFeelException erro) {
            //  erro.printStackTrace();
        }
    }
}
