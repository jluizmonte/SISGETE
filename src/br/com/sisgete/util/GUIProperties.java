package br.com.sisgete.util;

import javax.swing.UIManager;

/**
 *
 * @author luiz
 */
public class GUIProperties {

    /**
     * temas padrões
     */
    public static String PLAF_METAL = "javax.swing.plaf.metal.MetalLookAndFeel";
    public static String PLAF_NIMBUS = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
    public static String PLAF_MOTIF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
    public static String PLAF_SYSTEM = UIManager.getSystemLookAndFeelClassName();
}
