package br.com.sisgete.util;

import br.com.sisgete.view.AuxiliarView;
import br.com.sisgete.view.CadastroFichaView;
import br.com.sisgete.view.ConsultaPacienteView;
import br.com.sisgete.view.MagnetizadorView;
import br.com.sisgete.view.PrincipalView;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author luiz
 */
public class SisgeteLoaderUtil {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        try {
            UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
            UIManager.setLookAndFeel(GUIProperties.PLAF_SYNTHETICA_BLUE);
            new CarregarSplash().setSplashTime();
            //   new PrincipalView().setVisible(true);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
    }

}
