package br.com.sisgete.view;

import br.com.sisgete.controller.AuxiliarController;
import br.com.sisgete.controller.FrequenciaTratamentoDomingoController;
import br.com.sisgete.controller.MagnetizadorController;
import br.com.sisgete.controller.PacienteController;
import br.com.sisgete.model.AuxiliarModel;
import br.com.sisgete.model.FrequenciaTratamentoDomingoModel;
import br.com.sisgete.model.MagnetizadorModel;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.util.GetDateUtil;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class FrequenciaDomingoView extends javax.swing.JFrame {

    PacienteController pacienteController = new PacienteController();
    PacienteModel pacienteModel = new PacienteModel();
    ArrayList<PacienteModel> listaPacienteModel = new ArrayList<>();

    MagnetizadorController magnetizadorController = new MagnetizadorController();
    MagnetizadorModel magnetizadorModel = new MagnetizadorModel();
    ArrayList<MagnetizadorModel> listaMagnetizadorModel = new ArrayList<>();

    AuxiliarController auxiliarController = new AuxiliarController();
    AuxiliarModel auxiliarModel = new AuxiliarModel();
    ArrayList<AuxiliarModel> listaAuxiliarModels = new ArrayList<>();

    FrequenciaTratamentoDomingoModel frequenciaTratamentoDomingoModel = new FrequenciaTratamentoDomingoModel();
    FrequenciaTratamentoDomingoController frequenciaTratamentoDomingoController = new FrequenciaTratamentoDomingoController();

    GetDateUtil getDateUtil = new GetDateUtil();
    String periodoObs;

    /**
     * Creates new form FrequenciaDomingoView
     */
    public FrequenciaDomingoView() {
        this.setIconImage(new ImageIcon(getClass().getResource("/br/com/sisgete/images/others/LogotipoFECMA.jpg")).getImage());
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcbPaciente = new javax.swing.JComboBox<>();
        jlSetor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfRecomendacoes = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jcbStatusTratamento = new javax.swing.JComboBox<>();
        jcRecomendacoesSim = new javax.swing.JCheckBox();
        jcRecomendacoesNao = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jcbMagnetizador = new javax.swing.JComboBox<>();
        jcbAuxiliar = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jlAtendente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acompanhamento Domingo");

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jLabel1.setText("FRATERNIDADE ESPÍRITA CRISTINA MENEZES DE ALBUQUERQUE");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setText("FREQUÊNCIA TRATAMENTO ESPIRITUAL/PASSES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(101, 101, 101))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12))
        );

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DOMINGO");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Paciente.:");

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Setor.:");

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Magnetizador.:");

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Há recomendações para o paciente?.:");

        jcbPaciente.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jcbPaciente.setForeground(new java.awt.Color(0, 112, 192));
        jcbPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE UM PACIENTE" }));
        jcbPaciente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbPacientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbPacientePopupMenuWillBecomeVisible(evt);
            }
        });

        jlSetor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlSetor.setForeground(new java.awt.Color(255, 255, 255));
        jlSetor.setText("SELEC.");

        jtfRecomendacoes.setColumns(20);
        jtfRecomendacoes.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jtfRecomendacoes.setLineWrap(true);
        jtfRecomendacoes.setRows(5);
        jScrollPane1.setViewportView(jtfRecomendacoes);

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STATUS TRATAMENTO.:");

        jcbStatusTratamento.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jcbStatusTratamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE UMA OPÇÃO", "CONTINUAR TRATAMENTO", "PACIENTE LIBERADO", "EM OBSERVAÇÃO" }));
        jcbStatusTratamento.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbStatusTratamentoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jcRecomendacoesSim.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jcRecomendacoesSim.setForeground(new java.awt.Color(255, 255, 255));
        jcRecomendacoesSim.setText("Sim");
        jcRecomendacoesSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRecomendacoesSimActionPerformed(evt);
            }
        });

        jcRecomendacoesNao.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jcRecomendacoesNao.setForeground(new java.awt.Color(255, 255, 255));
        jcRecomendacoesNao.setText("Não");
        jcRecomendacoesNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRecomendacoesNaoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Data atendimento.:");

        jlData.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlData.setForeground(new java.awt.Color(255, 255, 255));
        jlData.setText("SEL. PACIENTE");

        jbSalvar.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-salvar-como-24.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-cancelar-24.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Auxiliar.:");

        jcbMagnetizador.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jcbMagnetizador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        jcbMagnetizador.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbMagnetizadorPopupMenuWillBecomeVisible(evt);
            }
        });

        jcbAuxiliar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jcbAuxiliar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE" }));
        jcbAuxiliar.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbAuxiliarPopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Atendente.:");

        jlAtendente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlAtendente.setForeground(new java.awt.Color(255, 255, 255));
        jlAtendente.setText("SELECIONE PACIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(jcRecomendacoesSim)
                                .addGap(229, 229, 229))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21)
                                .addComponent(jcbPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcRecomendacoesNao)
                                    .addComponent(jlSetor))
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbStatusTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbMagnetizador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbAuxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbCancelar)
                        .addGap(31, 31, 31)
                        .addComponent(jbSalvar)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlData)
                .addGap(38, 38, 38)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAtendente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jlSetor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jlData)
                    .addComponent(jLabel11)
                    .addComponent(jlAtendente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jcbMagnetizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAuxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcRecomendacoesSim)
                    .addComponent(jcRecomendacoesNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbStatusTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addGap(15, 15, 15))
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

    private void jcbPacientePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbPacientePopupMenuWillBecomeVisible
        carregarPaciente();
    }//GEN-LAST:event_jcbPacientePopupMenuWillBecomeVisible

    private void jcbPacientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbPacientePopupMenuWillBecomeInvisible
        valoresCampos();
    }//GEN-LAST:event_jcbPacientePopupMenuWillBecomeInvisible

    private void jcRecomendacoesNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRecomendacoesNaoActionPerformed
        if (jcRecomendacoesNao.isSelected()) {
            jcRecomendacoesSim.setSelected(false);
            jtfRecomendacoes.setEditable(false);
            jtfRecomendacoes.setText("SEM RECOMENDAÇÕES NA PRESENTE DATA");
        }
    }//GEN-LAST:event_jcRecomendacoesNaoActionPerformed

    private void jcRecomendacoesSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRecomendacoesSimActionPerformed
        if (jcRecomendacoesSim.isSelected()) {
            jcRecomendacoesNao.setSelected(false);
            jtfRecomendacoes.setText("");
            jtfRecomendacoes.setEditable(true);
            jtfRecomendacoes.requestFocusInWindow();
        }
    }//GEN-LAST:event_jcRecomendacoesSimActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jcbMagnetizadorPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbMagnetizadorPopupMenuWillBecomeVisible
        carregarMagnetizador();
    }//GEN-LAST:event_jcbMagnetizadorPopupMenuWillBecomeVisible

    private void jcbAuxiliarPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbAuxiliarPopupMenuWillBecomeVisible
        carregarAuxiliar();
    }//GEN-LAST:event_jcbAuxiliarPopupMenuWillBecomeVisible

    private void jcbStatusTratamentoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbStatusTratamentoPopupMenuWillBecomeInvisible
        if (jcbStatusTratamento.getSelectedItem().equals("EM OBSERVAÇÃO")) {
            Object[] opcoes = {"SELECIONE", "30 DIAS", "60 DIAS", "90 DIAS"};
            Object resposta;
            resposta = JOptionPane.showInputDialog(null,
                    "quantidade de dias",
                    "Continuar tratamento",
                    JOptionPane.OK_CANCEL_OPTION,
                    null,
                    opcoes,
                    "SELECIONE");
            periodoObs = String.valueOf(resposta);
        }
    }//GEN-LAST:event_jcbStatusTratamentoPopupMenuWillBecomeInvisible

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        salvarFrequencia();
        }//GEN-LAST:event_jbSalvarActionPerformed

    private void limparCampos() {
        jcbPaciente.setSelectedItem("SELECIONE UM PACIENTE");
        jcbStatusTratamento.setSelectedItem("SELECIONE UMA OPÇÃO");
        jtfRecomendacoes.setText("");
        jtfRecomendacoes.setEditable(true);
        jcRecomendacoesNao.setSelected(false);
        jcRecomendacoesSim.setSelected(false);
        jlSetor.setText("SELEC.");
        jlAtendente.setText("SELECIONE PACIENTE");
        jlData.setText("SEL. PACIENTE");
        jcbAuxiliar.setSelectedItem("SELECIONE");
        jcbMagnetizador.setSelectedItem("SELECIONE");
        jcbStatusTratamento.setSelectedItem("SELECIONE UMA OPÇÃO");
        carregarPaciente();
    }

    private void carregarPaciente() {
        // listaPacienteModel = new ArrayList<>();
        listaPacienteModel = pacienteController.getListaPacienteController();
        jcbPaciente.removeAllItems();
        listaPacienteModel.forEach((paciente) -> {
            jcbPaciente.addItem(String.valueOf(paciente.getNome()));
        });
    }

    private void valoresCampos() {
        pacienteModel = pacienteController.getPaciente(jcbPaciente.getSelectedItem().toString());
        jlSetor.setText(pacienteModel.getSetor());
        jlData.setText(pacienteModel.getDataAtendimento());
        jlAtendente.setText(pacienteModel.getAtendente());
    }

    private void carregarMagnetizador() {
        listaMagnetizadorModel = magnetizadorController.getListaMagnetizadorController();
        jcbMagnetizador.removeAllItems();
        listaMagnetizadorModel.forEach((magnetizador) -> {
            jcbMagnetizador.addItem(String.valueOf(magnetizador.getNomeMagnetizador()));
        });
    }

    private void carregarAuxiliar() {
        listaAuxiliarModels = auxiliarController.getListaAuxiliarController();
        jcbAuxiliar.removeAllItems();
        listaAuxiliarModels.forEach((auxiliar) -> {
            jcbAuxiliar.addItem(String.valueOf(auxiliar.getNomeAuxiliar()));
        });
    }

    private void salvarFrequencia() {
        int idMagnetizador = magnetizadorController.getMagnetizadorController(jcbMagnetizador.getSelectedItem().toString()).getIdMagnetizador();
        int idPaciente = pacienteController.getPaciente(jcbPaciente.getSelectedItem().toString()).getIdPaciente();
        int idAuxiliar = auxiliarController.getAuxiliarController(jcbAuxiliar.getSelectedItem().toString()).getIdAuxiliar();
        String dataFrequenciaTratamento = getDateUtil.getDateTime();

        frequenciaTratamentoDomingoModel.setIdMagnetizador(idMagnetizador);
        frequenciaTratamentoDomingoModel.setIdPaciente(idPaciente);
        frequenciaTratamentoDomingoModel.setIdAuxiliar(idAuxiliar);
        frequenciaTratamentoDomingoModel.setFrequenciaDomingo(dataFrequenciaTratamento);
        frequenciaTratamentoDomingoModel.setRecomendacoesEspirituais(jtfRecomendacoes.getText());
        frequenciaTratamentoDomingoModel.setSetorPaciente(jlSetor.getText());

        if (frequenciaTratamentoDomingoController.salvarFrequenciaTratamentoDomingoController(frequenciaTratamentoDomingoModel) > 0) {
            //  JOptionPane.showMessageDialog(this, "Infomações salvas com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
            //     limparCampos();
            atualizarStatusPaciente();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar informações", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarStatusPaciente() {
        String paciente = pacienteController.getPaciente(jcbPaciente.getSelectedItem().toString()).getNome();

        if (jcbStatusTratamento.getSelectedItem().equals("PACIENTE LIBERADO")) {
            pacienteModel.setStatusTratamento("LIBERADO");
            pacienteModel.setAcompanhamentoPaciente(getDateUtil.getDateTime());
            pacienteController.atualizarPacienteController(pacienteModel);
            limparCampos();
        } else if (jcbStatusTratamento.getSelectedItem().equals("EM OBSERVAÇÃO")) {
            pacienteModel.setStatusTratamento("EM OBSERVAÇÃO");
            pacienteModel.setAcompanhamentoPaciente(periodoObs);
            pacienteController.atualizarPacienteController(pacienteModel);
            limparCampos();
        } else {
            pacienteModel.setStatusTratamento("EM TRATAMENTO");
            pacienteModel.setAcompanhamentoPaciente(periodoObs);
            pacienteController.atualizarPacienteController(pacienteModel);
            limparCampos();
        }
        JOptionPane.showMessageDialog(this, "Infomações salvas com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JCheckBox jcRecomendacoesNao;
    private javax.swing.JCheckBox jcRecomendacoesSim;
    private javax.swing.JComboBox<String> jcbAuxiliar;
    private javax.swing.JComboBox<String> jcbMagnetizador;
    private javax.swing.JComboBox<String> jcbPaciente;
    private javax.swing.JComboBox<String> jcbStatusTratamento;
    private javax.swing.JLabel jlAtendente;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlSetor;
    private javax.swing.JTextArea jtfRecomendacoes;
    // End of variables declaration//GEN-END:variables

}
