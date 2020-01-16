package br.com.sisgete.util;

import javax.swing.UIManager;

/**
 * @author Michael Hagen
 */
public class GUIProperties {

    /**
     * temas padrões
     */
    public static String PLAF_METAL = "javax.swing.plaf.metal.MetalLookAndFeel";
    public static String PLAF_NIMBUS = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
    public static String PLAF_MOTIF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
    public static String PLAF_SYSTEM = UIManager.getSystemLookAndFeelClassName();

    /**
     * Temas Synthetica
     */
    public static final String PLAF_SYNTHETICA_BLUE = "de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel";
    public static final String PLAF_SYNTHETICA_BLACKSTEEL = "de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel";
    public static final String PLAF_SYNTHETICA_PLAIN = "de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel";
}
