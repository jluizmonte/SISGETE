package br.com.sisgete.view;

import br.com.sisgete.controller.PacienteController;
import br.com.sisgete.controller.PacienteLogController;
import br.com.sisgete.controller.QuadroPsicofisicoController;
import br.com.sisgete.model.PacienteLogModel;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class ConsultaDomingoView extends javax.swing.JInternalFrame {

    PacienteController pacienteController = new PacienteController();
    PacienteModel pacienteModel = new PacienteModel();
    ArrayList<PacienteModel> listaPacienteModel = new ArrayList<>();
    QuadroPsicofisicoController quadroPsicofisicoController = new QuadroPsicofisicoController();
    QuadroPsicofisicoModel quadroPsicofisicoModel = new QuadroPsicofisicoModel();
    ArrayList<QuadroPsicofisicoModel> listaQuadroPsicofisicoModels = new ArrayList<>();
    PacienteLogModel pacienteLogModel = new PacienteLogModel();
    PacienteLogController pacienteLogController = new PacienteLogController();
    String nomePaciente;
    ConsultaDomingoPesquisaPacienteView consultaPaciente = new ConsultaDomingoPesquisaPacienteView(null, true);

    /**
     * Creates new form ConsultaDomingoView
     */
    public ConsultaDomingoView() {
        initComponents();
        carregarPaciente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbPaciente = new javax.swing.JComboBox<>();
        jlSetor = new javax.swing.JLabel();
        jbAddPaciente = new javax.swing.JButton();
        jbPesquisaPaciente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jbAddConsulta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Entrada de paciente domingo");

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PACIENTES PARA TRATAMENTO E CONSULTA");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PACIENTES EM TRATAMENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setText("NOME.:");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setText("SETOR.:");

        jcbPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N
        jcbPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbPaciente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbPacientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jlSetor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlSetor.setText("$SETOR");

        jbAddPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbAddPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-24.png"))); // NOI18N
        jbAddPaciente.setText("Adicionar Paciente");
        jbAddPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddPacienteActionPerformed(evt);
            }
        });

        jbPesquisaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-24.png"))); // NOI18N
        jbPesquisaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jcbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisaPaciente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlSetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAddPaciente))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jcbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPesquisaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlSetor)
                    .addComponent(jbAddPaciente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTA ATENDIMENTO FRATERNO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12))); // NOI18N

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setText("NOME.:");

        jtfNome.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N
        jtfNome.setForeground(new java.awt.Color(0, 112, 192));
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jbAddConsulta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbAddConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-regra-24.png"))); // NOI18N
        jbAddConsulta.setText("Adicionar Consulta");
        jbAddConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAddConsulta))
                    .addComponent(jtfNome))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAddConsulta))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void jcbPacientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbPacientePopupMenuWillBecomeInvisible
        carregarValores();
    }//GEN-LAST:event_jcbPacientePopupMenuWillBecomeInvisible

    private void jbPesquisaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaPacienteActionPerformed
        consultaPaciente.setVisible(true);

    }//GEN-LAST:event_jbPesquisaPacienteActionPerformed

    private void jbAddConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddConsultaActionPerformed
        salvarListaConsulta();
    }//GEN-LAST:event_jbAddConsultaActionPerformed

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        salvarListaConsulta();
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbAddPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAddPacienteActionPerformed

    private void carregarPaciente() {
        listaPacienteModel = pacienteController.getListaPacienteController();
        jcbPaciente.removeAllItems();
        listaPacienteModel.forEach((paciente) -> {
            jcbPaciente.addItem(String.valueOf(paciente.getNome()));
        });
    }

    private void salvarListaConsulta() {
        pacienteLogModel.setPacienteLog(jtfNome.getText().toUpperCase());
        pacienteLogModel.setTipoPacienteLog("CONSULTA");
        pacienteLogModel.setSetorPacienteLog("NULL");
        pacienteLogController.insertPacienteLog(pacienteLogModel);
        JOptionPane.showMessageDialog(null, "Consulta salva com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
        jtfNome.setText("");
    }

    private void carregarValores() {
        pacienteModel = pacienteController.getPaciente(jcbPaciente.getSelectedItem().toString());
        jlSetor.setText(pacienteModel.getSetor());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbAddConsulta;
    private javax.swing.JButton jbAddPaciente;
    private javax.swing.JButton jbPesquisaPaciente;
    private javax.swing.JComboBox<String> jcbPaciente;
    private javax.swing.JLabel jlSetor;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables

}
