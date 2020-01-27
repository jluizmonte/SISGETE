package br.com.sisgete.view;

import br.com.sisgete.connection.PacienteLogDB;
import br.com.sisgete.controller.PacienteController;
import br.com.sisgete.controller.PacienteLogController;
import br.com.sisgete.controller.QuadroPsicofisicoController;
import br.com.sisgete.model.PacienteLogModel;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import br.com.sisgete.model.SessaoModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author luiz
 */
public class ConsultaDomingoPesquisaPacienteView extends javax.swing.JDialog {
    
    PacienteLogModel pacienteLogModel = new PacienteLogModel();
    PacienteLogController pacienteLogController = new PacienteLogController();
    PacienteController pacienteController = new PacienteController();
    PacienteModel pacienteModel = new PacienteModel();
    ArrayList<PacienteModel> listaPacienteModel = new ArrayList<>();
    QuadroPsicofisicoController quadroPsicofisicoController = new QuadroPsicofisicoController();
    QuadroPsicofisicoModel quadroPsicofisicoModel = new QuadroPsicofisicoModel();
    ArrayList<QuadroPsicofisicoModel> listaQuadroPsicofisicoModels = new ArrayList<>();
    String termoPesquisa;

    /**
     * Creates new form ConsultaDomingoPesquisaPacienteView
     *
     * @param parent
     * @param modal
     */
    public ConsultaDomingoPesquisaPacienteView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        popularTabela();
        jtfPaciente.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPaciente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfPaciente = new javax.swing.JTextField();
        jbPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PACIENTES PARA CONSULTAS");

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        jtPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jtPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "#", "NOME", "SETOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPaciente);
        if (jtPaciente.getColumnModel().getColumnCount() > 0) {
            jtPaciente.getColumnModel().getColumn(0).setPreferredWidth(25);
            jtPaciente.getColumnModel().getColumn(2).setPreferredWidth(25);
        }

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECIONE UM PACIENTE NA TABELA ABAIXO.:");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INSIRA O NOME OU PARTE DO NOME DO PACIENTE.:");

        jtfPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jtfPaciente.setForeground(new java.awt.Color(0, 112, 192));
        jtfPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPacienteActionPerformed(evt);
            }
        });

        jbPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-24.png"))); // NOI18N
        jbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacienteMouseClicked
        Object[] opcoes = {"SIM", "NÃO"};
        Object resposta;
        resposta = JOptionPane.showInputDialog(null,
                "Adicionar paciente a lista de atendimentos?",
                "Escolha",
                JOptionPane.OK_CANCEL_OPTION,
                null,
                opcoes,
                "SIM");
        if (resposta.equals("SIM")) {
            salvarLog();
        }
    }//GEN-LAST:event_jtPacienteMouseClicked

    private void jtfPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPacienteActionPerformed
        pesquisaPaciente();
    }//GEN-LAST:event_jtfPacienteActionPerformed

    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        pesquisaPaciente();
        
    }//GEN-LAST:event_jbPesquisaActionPerformed
    
    private void popularTabela() {
        listaPacienteModel = new ArrayList<>();
        listaPacienteModel = pacienteController.getListaPacienteController();
        listaQuadroPsicofisicoModels = quadroPsicofisicoController.getListaQuadroPsicofisicoController();
        DefaultTableModel modelo = (DefaultTableModel) jtPaciente.getModel();
        modelo.setNumRows(0);
        
        int cont = listaPacienteModel.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaPacienteModel.get(i).getIdPaciente(),
                listaPacienteModel.get(i).getNome(),
                listaPacienteModel.get(i).getSetor(),
                listaPacienteModel.get(i).getDataAtendimento(),
                listaPacienteModel.get(i).getAtendente(),
                listaPacienteModel.get(i).getModoDesobsessao(),
                listaPacienteModel.get(i).getStatusTratamento(),
                listaPacienteModel.get(i).getStatusFicha()
            });
        }
    }
    
    private void pesquisaPaciente() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtPaciente.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtPaciente.setRowSorter(classificador);
        classificador.setRowFilter(RowFilter.regexFilter(jtfPaciente.getText().toUpperCase(), 1));
        jtfPaciente.setText("");
    }
    
    private void salvarLog() {
        int linha = jtPaciente.getSelectedRow();
        int codigoPaciente = (int) jtPaciente.getValueAt(linha, 0);
        pacienteModel = pacienteController.getPacienteController(codigoPaciente);
        pacienteLogModel.setPacienteLog(pacienteModel.getNome());
        pacienteLogModel.setSetorPacienteLog(pacienteModel.getSetor());
        pacienteLogModel.setTipoPacienteLog("ATENDIMENTO");
        pacienteLogController.insertPacienteLog(pacienteLogModel);
        JOptionPane.showMessageDialog(null, "Paciente adicionado a lista de atendimento!", "Sucesso", JOptionPane.WARNING_MESSAGE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JTable jtPaciente;
    private javax.swing.JTextField jtfPaciente;
    // End of variables declaration//GEN-END:variables
}
