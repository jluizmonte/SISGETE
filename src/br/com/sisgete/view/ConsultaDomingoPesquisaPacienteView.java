package br.com.sisgete.view;

import br.com.sisgete.controller.PacienteController;
import br.com.sisgete.controller.PacienteLogController;
import br.com.sisgete.controller.QuadroPsicofisicoController;
import br.com.sisgete.model.PacienteLogModel;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import br.com.sisgete.util.LogCatch;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
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
    MenuOpcoesView menuOpcoesView = new MenuOpcoesView(null, true, "DESEJA SALVAR AS INFORMAÇÕES?");
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
        alignCenterTable(0);
        alignCenterTable(1);
        alignCenterTable(2);
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
        jbLimparPesquisa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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
            jtPaciente.getColumnModel().getColumn(0).setMaxWidth(30);
            jtPaciente.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECIONE UM PACIENTE CLICANDO EM SEU NOME NA TABELA");

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

        jbLimparPesquisa.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbLimparPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-reiniciar-18.png"))); // NOI18N
        jbLimparPesquisa.setText("limpar pesquisa");
        jbLimparPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparPesquisaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ATALHO: F2 - Fechar esta janela");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLimparPesquisa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimparPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(1, 1));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setText("Fechar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacienteMouseClicked
        menuOpcoesView.setVisible(true);
        if (menuOpcoesView.flag == true) {
            salvarLog();
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!", "Cancelada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtPacienteMouseClicked

    private void jtfPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPacienteActionPerformed
        pesquisaPaciente();
    }//GEN-LAST:event_jtfPacienteActionPerformed

    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        pesquisaPaciente();

    }//GEN-LAST:event_jbPesquisaActionPerformed

    private void jbLimparPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparPesquisaActionPerformed
        pesquisaPaciente();
    }//GEN-LAST:event_jbLimparPesquisaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
        if (pacienteLogController.insertPacienteLog(pacienteLogModel) > 0) {
            JOptionPane.showMessageDialog(null, "Paciente inserido a lista de atendimento.", "Sucesso", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar as informações");
            new LogCatch().writeLog("O paciente não foi inserido na lista, houve um erro", getClass().toString());
        }

    }

    private void alignCenterTable(int column) {

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();

        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        headerRenderer.setBackground(Color.lightGray);

        jtPaciente.getColumnModel().getColumn(column).setCellRenderer(cellRenderer);
        jtPaciente.getColumnModel().getColumn(column).setHeaderRenderer(headerRenderer);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimparPesquisa;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JTable jtPaciente;
    private javax.swing.JTextField jtfPaciente;
    // End of variables declaration//GEN-END:variables
}
