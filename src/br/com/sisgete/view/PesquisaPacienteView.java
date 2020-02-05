package br.com.sisgete.view;

import br.com.sisgete.controller.PacienteController;
import br.com.sisgete.controller.PacienteLogController;
import br.com.sisgete.controller.QuadroPsicofisicoController;
import br.com.sisgete.model.PacienteLogModel;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import br.com.sisgete.util.ColorirLinhaStatus;
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
public class PesquisaPacienteView extends javax.swing.JInternalFrame {

    String termoPesquisa;
    
    PacienteController pacienteController = new PacienteController();
    PacienteModel pacienteModel = new PacienteModel();
    ArrayList<PacienteModel> listaPacienteModel = new ArrayList<>();
    
    QuadroPsicofisicoController quadroPsicofisicoController = new QuadroPsicofisicoController();
    QuadroPsicofisicoModel quadroPsicofisicoModel = new QuadroPsicofisicoModel();
    ArrayList<QuadroPsicofisicoModel> listaQuadroPsicofisicoModels = new ArrayList<>();

    PacienteLogController pacienteLogController = new PacienteLogController();
    PacienteLogModel pacienteLogModel = new PacienteLogModel();

    /**
     * Creates new form ConsultaPaciente
     */
    public PesquisaPacienteView() {
        initComponents();
        popularTabela();
        corLinhaStatusPaciente();
        corLinhaStatusFicha();
        setIconifiable(true);
        setClosable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbFiltroNome = new javax.swing.JRadioButton();
        jrbFiltroSetor = new javax.swing.JRadioButton();
        jrbFiltroStatusTratamento = new javax.swing.JRadioButton();
        jrbFiltroDesobsessão = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jrfStatusFicha = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtResultado = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Pesquisa de Pacientes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escolha um dos filtros disponíveis para consulta do paciente:");

        jrbFiltroNome.setBackground(new java.awt.Color(0, 112, 192));
        jrbFiltroNome.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jrbFiltroNome.setForeground(new java.awt.Color(255, 255, 255));
        jrbFiltroNome.setText("Por nome");
        jrbFiltroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFiltroNomeActionPerformed(evt);
            }
        });

        jrbFiltroSetor.setBackground(new java.awt.Color(0, 112, 192));
        jrbFiltroSetor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jrbFiltroSetor.setForeground(new java.awt.Color(255, 255, 255));
        jrbFiltroSetor.setText("Por setor");
        jrbFiltroSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFiltroSetorActionPerformed(evt);
            }
        });

        jrbFiltroStatusTratamento.setBackground(new java.awt.Color(0, 112, 192));
        jrbFiltroStatusTratamento.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jrbFiltroStatusTratamento.setForeground(new java.awt.Color(255, 255, 255));
        jrbFiltroStatusTratamento.setText("Por status tratamento");
        jrbFiltroStatusTratamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFiltroStatusTratamentoActionPerformed(evt);
            }
        });

        jrbFiltroDesobsessão.setBackground(new java.awt.Color(0, 112, 192));
        jrbFiltroDesobsessão.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jrbFiltroDesobsessão.setForeground(new java.awt.Color(255, 255, 255));
        jrbFiltroDesobsessão.setText("Por modo de desobsessão");
        jrbFiltroDesobsessão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFiltroDesobsessãoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jLabel2.setText("(UM POR VEZ)");

        jrfStatusFicha.setBackground(new java.awt.Color(0, 112, 192));
        jrfStatusFicha.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jrfStatusFicha.setForeground(new java.awt.Color(255, 255, 255));
        jrfStatusFicha.setText("Por status ficha");
        jrfStatusFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrfStatusFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbFiltroNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbFiltroSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63)
                        .addComponent(jrbFiltroStatusTratamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(jrbFiltroDesobsessão, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jrfStatusFicha)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbFiltroNome)
                    .addComponent(jrbFiltroSetor)
                    .addComponent(jrbFiltroStatusTratamento)
                    .addComponent(jrbFiltroDesobsessão)
                    .addComponent(jrfStatusFicha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtResultado.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jtResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Paciente", "Setor", "Data Atendimento", "Atendente", "Desobsessão", "Status", "Ficha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtResultado);
        if (jtResultado.getColumnModel().getColumnCount() > 0) {
            jtResultado.getColumnModel().getColumn(0).setPreferredWidth(25);
            jtResultado.getColumnModel().getColumn(2).setPreferredWidth(25);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jrbFiltroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFiltroNomeActionPerformed
        if (jrbFiltroNome.isSelected()) {
            jrbFiltroDesobsessão.setSelected(false);
            jrbFiltroSetor.setSelected(false);
            jrbFiltroStatusTratamento.setSelected(false);

            termoPesquisa = JOptionPane.showInputDialog(this, "Entre o nome do paciente:", "Pesquisa paciente", JOptionPane.INFORMATION_MESSAGE).toUpperCase();
            pesquisaPaciente(1);
            desmarcarFiltro();
        }
    }//GEN-LAST:event_jrbFiltroNomeActionPerformed

    private void jrbFiltroSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFiltroSetorActionPerformed
        if (jrbFiltroSetor.isSelected()) {
            jrbFiltroStatusTratamento.setSelected(false);
            jrbFiltroDesobsessão.setSelected(false);
            jrbFiltroNome.setSelected(false);
            Object[] opcoes = {"A1", "A2", "B1", "B2"};
            Object resposta;
            resposta = JOptionPane.showInputDialog(null,
                    "Setor",
                    "Pesquisa paciente",
                    JOptionPane.OK_CANCEL_OPTION,
                    null,
                    opcoes,
                    "A1");
            termoPesquisa = String.valueOf(resposta);
            pesquisaPaciente(2);
            desmarcarFiltro();
        }
    }//GEN-LAST:event_jrbFiltroSetorActionPerformed

    private void jrbFiltroStatusTratamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFiltroStatusTratamentoActionPerformed
        if (jrbFiltroStatusTratamento.isSelected()) {
            jrbFiltroDesobsessão.setSelected(false);
            jrbFiltroSetor.setSelected(false);
            jrbFiltroNome.setSelected(false);
            Object[] opcoes = {"LIBERADO", "EM OBSERVAÇÃO", "EM TRATAMENTO"};
            Object resposta;
            resposta = JOptionPane.showInputDialog(null,
                    "Status do paciente",
                    "Pesquisa paciente",
                    JOptionPane.OK_CANCEL_OPTION,
                    null,
                    opcoes,
                    "LIBERADO");
            termoPesquisa = String.valueOf(resposta).toUpperCase();
            pesquisaPaciente(6);
            desmarcarFiltro();
        }
    }//GEN-LAST:event_jrbFiltroStatusTratamentoActionPerformed

    private void jrbFiltroDesobsessãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFiltroDesobsessãoActionPerformed
        if (jrbFiltroDesobsessão.isSelected()) {
            jrbFiltroStatusTratamento.setSelected(false);
            jrbFiltroSetor.setSelected(false);
            jrbFiltroNome.setSelected(false);
            Object[] opcoes = {"À DISTÂNCIA", "NO CENTRO"};
            Object resposta;
            resposta = JOptionPane.showInputDialog(null,
                    "Desobsessão",
                    "Pesquisa paciente",
                    JOptionPane.OK_CANCEL_OPTION,
                    null,
                    opcoes,
                    "À DISTÂNCIA");
            termoPesquisa = String.valueOf(resposta);
            pesquisaPaciente(5);
            desmarcarFiltro();
        }
    }//GEN-LAST:event_jrbFiltroDesobsessãoActionPerformed

    private void jrfStatusFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrfStatusFichaActionPerformed
        if (jrfStatusFicha.isSelected()) {
            jrbFiltroDesobsessão.setSelected(false);
            jrbFiltroStatusTratamento.setSelected(false);
            jrbFiltroSetor.setSelected(false);
            jrbFiltroNome.setSelected(false);
            Object[] opcoes = {"ATIVA", "INATIVA"};
            Object resposta;
            resposta = JOptionPane.showInputDialog(null,
                    "Status da ficha",
                    "Pesquisa paciente",
                    JOptionPane.OK_CANCEL_OPTION,
                    null,
                    opcoes,
                    "ATIVA");
            termoPesquisa = String.valueOf(resposta);
            pesquisaPaciente(7);
            desmarcarFiltro();
        }
    }//GEN-LAST:event_jrfStatusFichaActionPerformed

    private void popularTabela() {
        listaPacienteModel = new ArrayList<>();
        listaPacienteModel = pacienteController.getListaPacienteController();
        listaQuadroPsicofisicoModels = quadroPsicofisicoController.getListaQuadroPsicofisicoController();
        DefaultTableModel modelo = (DefaultTableModel) jtResultado.getModel();
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

    private void pesquisaPaciente(int row) {
        DefaultTableModel modelo = (DefaultTableModel) this.jtResultado.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtResultado.setRowSorter(classificador);
        classificador.setRowFilter(RowFilter.regexFilter(termoPesquisa, row));
    }

    private void desmarcarFiltro() {
        jrbFiltroDesobsessão.setSelected(false);
        jrbFiltroNome.setSelected(false);
        jrbFiltroSetor.setSelected(false);
        jrbFiltroStatusTratamento.setSelected(false);
        jrfStatusFicha.setSelected(false);
    }

    private void corLinhaStatusPaciente() {
        ColorirLinhaStatus colorirLinhaStatus = new ColorirLinhaStatus(6);
        jtResultado.getColumnModel().getColumn(6).setCellRenderer(colorirLinhaStatus);
    }

    private void corLinhaStatusFicha() {
        ColorirLinhaStatus colorirLinhaStatusFicha = new ColorirLinhaStatus(7);
        jtResultado.getColumnModel().getColumn(7).setCellRenderer(colorirLinhaStatusFicha);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jrbFiltroDesobsessão;
    private javax.swing.JRadioButton jrbFiltroNome;
    private javax.swing.JRadioButton jrbFiltroSetor;
    private javax.swing.JRadioButton jrbFiltroStatusTratamento;
    private javax.swing.JRadioButton jrfStatusFicha;
    private javax.swing.JTable jtResultado;
    // End of variables declaration//GEN-END:variables

}
