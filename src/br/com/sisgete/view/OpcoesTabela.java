package br.com.sisgete.view;

import br.com.sisgete.controller.AuxiliarController;
import br.com.sisgete.controller.FrequenciaTratamentoDomingoController;
import br.com.sisgete.controller.MagnetizadorController;
import br.com.sisgete.controller.UsuarioController;
import br.com.sisgete.util.LogCatch;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class OpcoesTabela extends javax.swing.JDialog {

    UsuarioController usuarioController = new UsuarioController();
    MagnetizadorController magnetizadorController = new MagnetizadorController();
    AuxiliarController auxiliarController = new AuxiliarController();
    FrequenciaTratamentoDomingoController frequenciaTratamentoDomingoController = new FrequenciaTratamentoDomingoController();
    MenuOpcoesView menuOpcoesView;
    public boolean flag;
    public int codigoRecebido;
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
        codigoRecebido = codigo;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jmiStatus = new javax.swing.JMenuItem();
        jmiNome = new javax.swing.JMenuItem();
        jmiExcluir = new javax.swing.JMenuItem();

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
        jLabel2.setText("ATALHOS F2 - Fechar esta janela ");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel3.setText("F3 - Alterar Nome");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel4.setText("F4 - Excluir");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel5.setText("F5 - Alterar Status");

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

        jmiStatus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiStatus.setText("jMenuItem1");
        jmiStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiStatusActionPerformed(evt);
            }
        });
        jMenu1.add(jmiStatus);

        jmiNome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiNome.setText("jMenuItem2");
        jmiNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNomeActionPerformed(evt);
            }
        });
        jMenu1.add(jmiNome);

        jmiExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiExcluir.setText("jMenuItem1");
        jmiExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcluirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiExcluir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAlterarNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterarStatus))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarStatusActionPerformed
        alterarStatus();
    }//GEN-LAST:event_jbAlterarStatusActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarNomeActionPerformed
        JOptionPane.showMessageDialog(null, "FUNÇÃO EM DESENVOLVIMENTO!");
    }//GEN-LAST:event_jbAlterarNomeActionPerformed

    private void jmiStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiStatusActionPerformed
        alterarStatus();
    }//GEN-LAST:event_jmiStatusActionPerformed

    private void jmiNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNomeActionPerformed
        JOptionPane.showMessageDialog(null, "FUNÇÃO EM DESENVOLVIMENTO!");
    }//GEN-LAST:event_jmiNomeActionPerformed

    private void jmiExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_jmiExcluirActionPerformed

    private void exclusaoDados() {
        switch (this.janela) {
            case "USUÁRIO":
                try {
                    usuarioController.excluirUsuarioController(codigoRecebido);
                    JOptionPane.showMessageDialog(this, this.janela + " excluido com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
                } catch (HeadlessException e) {
                    new LogCatch().writeLog("Erro ao excluir " + this.janela + ": " + e, this.getClass().toString());
                }
                break;
            case "MAGNETIZADOR":
                try {
                    magnetizadorController.excluirMagnetizadorController(codigoRecebido);
                    JOptionPane.showMessageDialog(this, this.janela + " excluido com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
                } catch (HeadlessException e) {
                    new LogCatch().writeLog("Erro ao excluir " + this.janela + ": " + e, this.getClass().toString());
                }
                break;
            case "AUXILIAR":
                try {
                    auxiliarController.excluirAuxiliarController(codigoRecebido);
                    JOptionPane.showMessageDialog(this, this.janela + " excluido com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
                } catch (HeadlessException e) {
                    new LogCatch().writeLog("Erro ao excluir " + this.janela + ": " + e, this.getClass().toString());
                }
                break;
            default:
                break;
        }
    }

    private void alterarStatus() {
        this.dispose();
        menuOpcoesView = new MenuOpcoesView(null, true, "ALTERAR STATUS DO " + this.janela + "?");
        menuOpcoesView.setVisible(true);
        if (menuOpcoesView.flag == true) {
            this.flag = true;
        }
    }

    private void excluir() {
        this.dispose();
        menuOpcoesView = new MenuOpcoesView(null, true, "DESEJA EXCLUIR O " + this.janela + "?");
        menuOpcoesView.setVisible(true);
        if (menuOpcoesView.flagExcluir == true) {
            exclusaoDados();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbAlterarNome;
    private javax.swing.JButton jbAlterarStatus;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JMenuItem jmiExcluir;
    private javax.swing.JMenuItem jmiNome;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiStatus;
    // End of variables declaration//GEN-END:variables

}
