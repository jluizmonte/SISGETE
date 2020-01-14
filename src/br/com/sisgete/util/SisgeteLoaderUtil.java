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
        UIManager.setLookAndFeel(GUIProperties.PLAF_NIMBUS);
        //    new CarregarSplash().setSplashTime();
        //   new MagnetizadorView().setVisible(true);
        new PrincipalView().setVisible(true);
        //new CadastroFichaView().setVisible(true);
        // new ConsultaPacienteView().setVisible(true);
    }
}
