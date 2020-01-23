package br.com.sisgete.view;

import br.com.sisgete.model.SessaoModel;
import br.com.sisgete.util.GetDateUtil;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

/**
 *
 * @author luiz
 */
public class PrincipalView extends javax.swing.JFrame {

    CadastroFichaView cadastroFichaView = new CadastroFichaView();
    PesquisaPacienteView pesquisaPacienteView = new PesquisaPacienteView();
    MagnetizadorView magnetizadorView = new MagnetizadorView();
    AuxiliarView auxiliarView = new AuxiliarView();
    AcompanhamentoDomingoView acompanhamentoDomingoView = new AcompanhamentoDomingoView();
    AcompanhamentoTercaView acompanhamentoTercaView = new AcompanhamentoTercaView();
    AcompanhamentoQuintaView acompanhamentoQuintaView = new AcompanhamentoQuintaView();
    ConsultaDomingoView consultaDomingoView = new ConsultaDomingoView();
    ExtraView extraView = new ExtraView();
    GetDateUtil getDateUtil = new GetDateUtil();

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        this.setIconImage(new ImageIcon(getClass().getResource("/br/com/sisgete/images/others/LogotipoFECMA.jpg")).getImage());
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setarData();
        dadosIniciais();
//        setarNivel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbCadastroPaciente = new javax.swing.JButton();
        jbConsultaPaciente = new javax.swing.JButton();
        jbFrequenciaDomingo = new javax.swing.JButton();
        jbFrequenciaQuinta = new javax.swing.JButton();
        jbFrequenciaTerca = new javax.swing.JButton();
        jbMagnetizador = new javax.swing.JButton();
        jbAuxiliar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbExtra = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlDataLogin = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jbConsulta = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISGETE - FECMA");

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        jbCadastroPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-24.png"))); // NOI18N
        jbCadastroPaciente.setText("Ficha paciente");
        jbCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroPacienteActionPerformed(evt);
            }
        });

        jbConsultaPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbConsultaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-24.png"))); // NOI18N
        jbConsultaPaciente.setText("Pesquisar  paciente");
        jbConsultaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaPacienteActionPerformed(evt);
            }
        });

        jbFrequenciaDomingo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbFrequenciaDomingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24.png"))); // NOI18N
        jbFrequenciaDomingo.setText("Frequencia Domingo");
        jbFrequenciaDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrequenciaDomingoActionPerformed(evt);
            }
        });

        jbFrequenciaQuinta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbFrequenciaQuinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24 (1).png"))); // NOI18N
        jbFrequenciaQuinta.setText("Frequencia Quinta");
        jbFrequenciaQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrequenciaQuintaActionPerformed(evt);
            }
        });

        jbFrequenciaTerca.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbFrequenciaTerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24ter.png"))); // NOI18N
        jbFrequenciaTerca.setText("Frequencia Terça");
        jbFrequenciaTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrequenciaTercaActionPerformed(evt);
            }
        });

        jbMagnetizador.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbMagnetizador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jbMagnetizador.setText("Magenetizador");
        jbMagnetizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMagnetizadorActionPerformed(evt);
            }
        });

        jbAuxiliar.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbAuxiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jbAuxiliar.setText("Auxiliar");
        jbAuxiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAuxiliarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FUNÇÕES BÁSICAS.:");

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-desligar-24.png"))); // NOI18N
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FUNÇÕES AVANÇADAS:");

        jbExtra.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-funcionalidades-extra-24.png"))); // NOI18N
        jbExtra.setText("Extra");
        jbExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExtraActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INFORMAÇÕES.:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUÁRIO LOGADO NA SESSÃO.:");

        jlUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlUsuario.setText("$USER");

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HORÁRIO DE LOGIN.:");

        jlDataLogin.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlDataLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlDataLogin.setText("$dd/MM/yyyy HH:mm:ss");

        jlData.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlData.setForeground(new java.awt.Color(255, 255, 255));
        jlData.setText("$dd/MM/yyyy HH:mm:ss");

        jbConsulta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-na-lista-24.png"))); // NOI18N
        jbConsulta.setText("Consultas Paciente");
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbConsultaPaciente)
                                    .addComponent(jbCadastroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(7, 7, 7)))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel3)
                                            .addGap(47, 47, 47))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(22, 22, 22)
                                                    .addComponent(jlUsuario)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4)
                                    .addComponent(jlDataLogin))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbFrequenciaQuinta)
                                            .addComponent(jbFrequenciaTerca)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jbMagnetizador)))
                                        .addGap(9, 9, 9))
                                    .addComponent(jbFrequenciaDomingo)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jbExtra))
                                            .addComponent(jbAuxiliar)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbConsulta)
                                            .addComponent(jLabel2))))
                                .addGap(18, 18, 18))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCadastroPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbConsultaPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbFrequenciaDomingo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbFrequenciaQuinta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbFrequenciaTerca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbMagnetizador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAuxiliar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsuario)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDataLogin)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSair, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlData)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroPacienteActionPerformed
        desktopPane.add(cadastroFichaView);
        cadastroFichaView.setVisible(true);
    }//GEN-LAST:event_jbCadastroPacienteActionPerformed

    private void jbConsultaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaPacienteActionPerformed
        desktopPane.add(pesquisaPacienteView);
        pesquisaPacienteView.setVisible(true);
    }//GEN-LAST:event_jbConsultaPacienteActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbFrequenciaDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFrequenciaDomingoActionPerformed
        desktopPane.add(acompanhamentoDomingoView);
        acompanhamentoDomingoView.setVisible(true);
    }//GEN-LAST:event_jbFrequenciaDomingoActionPerformed

    private void jbFrequenciaQuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFrequenciaQuintaActionPerformed
        desktopPane.add(acompanhamentoQuintaView);
        acompanhamentoQuintaView.setVisible(true);
    }//GEN-LAST:event_jbFrequenciaQuintaActionPerformed

    private void jbFrequenciaTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFrequenciaTercaActionPerformed
        desktopPane.add(acompanhamentoTercaView);
        acompanhamentoTercaView.setVisible(true);
    }//GEN-LAST:event_jbFrequenciaTercaActionPerformed

    private void jbMagnetizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMagnetizadorActionPerformed
        desktopPane.add(magnetizadorView);
        magnetizadorView.setVisible(true);
    }//GEN-LAST:event_jbMagnetizadorActionPerformed

    private void jbAuxiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAuxiliarActionPerformed
        desktopPane.add(auxiliarView);
        auxiliarView.setVisible(true);
    }//GEN-LAST:event_jbAuxiliarActionPerformed

    private void jbExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExtraActionPerformed
        desktopPane.add(extraView);
        extraView.setVisible(true);
    }//GEN-LAST:event_jbExtraActionPerformed

    private void jbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaActionPerformed
        desktopPane.add(consultaDomingoView);
        consultaDomingoView.setVisible(true);
    }//GEN-LAST:event_jbConsultaActionPerformed

    private void dadosIniciais() {
        jlUsuario.setText(SessaoModel.nomeUsuario);
        jlDataLogin.setText(getDateUtil.getDateNow());
    }

    /**
     * exibir na toolbar (barra de status/ barra inferior) a data atual do login
     * do usuário.
     */
    public void setarData() {
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
                    LocalDateTime timepoint = LocalDateTime.now();
                    jlData.setText(timepoint.format(fmt));
                }
            }
        };
        clock.start();
    }

    private void setarNivel() {
        switch (SessaoModel.nivelAcessoUsuario) {
            case "MAGNETIZADOR/AUXILIAR":
                jbFrequenciaDomingo.setEnabled(true);
                jbFrequenciaQuinta.setEnabled(true);
                jbFrequenciaTerca.setEnabled(true);
                jbMagnetizador.setEnabled(true);
                jbAuxiliar.setEnabled(true);
                jbExtra.setEnabled(true);
                break;
            case "ATENDENTE FRATERNO":
                jbFrequenciaDomingo.setEnabled(false);
                jbFrequenciaQuinta.setEnabled(false);
                jbFrequenciaTerca.setEnabled(false);
                jbMagnetizador.setEnabled(false);
                jbAuxiliar.setEnabled(false);
                jbExtra.setEnabled(false);
                break;
            default:
                break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAuxiliar;
    private javax.swing.JButton jbCadastroPaciente;
    private javax.swing.JButton jbConsulta;
    private javax.swing.JButton jbConsultaPaciente;
    private javax.swing.JButton jbExtra;
    private javax.swing.JButton jbFrequenciaDomingo;
    private javax.swing.JButton jbFrequenciaQuinta;
    private javax.swing.JButton jbFrequenciaTerca;
    private javax.swing.JButton jbMagnetizador;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlDataLogin;
    private javax.swing.JLabel jlUsuario;
    // End of variables declaration//GEN-END:variables
}
