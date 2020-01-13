package br.com.sisgete.util;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author luiz
 */
public class SisgeteLoaderUtil {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        String tema = GUIProperties.PLAF_NIMBUS;
            UIManager.setLookAndFeel(tema);
            new CarregarSplash().setSplashTime();
    }
}
