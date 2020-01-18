package br.com.sisgete.util;

import br.com.sisgete.connection.AcervoConnectionSqLite;
import br.com.sisgete.controller.TemaController;
import br.com.sisgete.model.TemaModel;
import br.com.sisgete.view.AuxiliarView;
import br.com.sisgete.view.CadastroFichaView;
import br.com.sisgete.view.ConsultaPacienteView;
import br.com.sisgete.view.MagnetizadorView;
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
        AcervoConnectionSqLite criacaoBDTema = new AcervoConnectionSqLite();
        criacaoBDTema.createNewDatabase();
        criacaoBDTema.createNewTable();
        TemaModel temaModel = new TemaModel();
        temaModel = new TemaController().getTemaDAO();
        String tema = temaModel.getTema();

        try {
            UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
            try {
                UIManager.setLookAndFeel(tema);
                //       new CarregarSplash().setSplashTime();
                new PrincipalView().setVisible(true);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                //      e.printStackTrace();
            }
        } catch (UnsupportedLookAndFeelException erro) {
            //  erro.printStackTrace();
        }
    }
}
