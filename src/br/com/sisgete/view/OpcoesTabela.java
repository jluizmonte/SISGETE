package br.com.sisgete.view;

import br.com.sisgete.controller.FrequenciaTratamentoDomingoController;
import br.com.sisgete.controller.MagnetizadorController;
import br.com.sisgete.controller.UsuarioController;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class OpcoesTabela extends javax.swing.JDialog {

    UsuarioController usuarioController = new UsuarioController();
    MagnetizadorController magnetizadorController = new MagnetizadorController();
    FrequenciaTratamentoDomingoController frequenciaTratamentoDomingoController = new FrequenciaTratamentoDomingoController();
    MenuOpcoesView menuOpcoesView = new MenuOpcoesView(null, true, "VOCÊ QUER ALTERAR O STATUS DO MAGNETIZADOR?");
    public boolean flag;
    public int codigoMagnetizador;
    public String janela;

    /**
     * Creates new form OpcoesTabela
     *
     * @param parent
     * @param modal
     * @param codigo
     * @param janelaAberta
     *
     */
    public OpcoesTabela(java.awt.Frame parent, boolean modal, int codigo, String janelaAberta) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        codigoMagnetizador = codigo;
        janela = janelaAberta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbExcluir = new javax.swing.JButton();
        jbAlterarStatus = new javax.swing.JButton();
        jbAlterarNome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("ESCOLHA UMA DAS OPÇÕES ABAIXO.:");

        jbExcluir.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterarStatus.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbAlterarStatus.setText("Alterar Status");
        jbAlterarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarStatusActionPerformed(evt);
            }
        });

        jbAlterarNome.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbAlterarNome.setText("Alterar Nome");
        jbAlterarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel2.setText("ATALHO F2 - Fechar esta janela");

        jMenuBar1.setPreferredSize(new java.awt.Dimension(1, 1));

        jMenu1.setText("File");

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbAlterarNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterarStatus))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterarNome)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterarStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarStatusActionPerformed
        this.dispose();
        menuOpcoesView.setVisible(true);
        if (menuOpcoesView.flag == true) {
            this.flag = true;
        }
    }//GEN-LAST:event_jbAlterarStatusActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        exclusaoDados();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarNomeActionPerformed

    private void exclusaoDados() {
        if (this.janela.equals("Usuario")) {
            if (usuarioController.excluirUsuarioController(codigoMagnetizador)) {
                JOptionPane.showMessageDialog(this, "Usuário excluido com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(this.janela.equals("Magnetizador"))
        {
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbAlterarNome;
    private javax.swing.JButton jbAlterarStatus;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables

}
