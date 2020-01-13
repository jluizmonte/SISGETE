package br.com.sisgete.view;

import br.com.sisgete.controller.PacienteController;
import br.com.sisgete.controller.QuadroPsicofisicoController;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import br.com.sisgete.util.ColorirLinhaStatus;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author luiz
 */
public class ConsultaPaciente extends javax.swing.JFrame {

    String termoPesquisa;
    PacienteController medicamentoTratamentoController = new PacienteController();
    PacienteModel medicamentoTratamentoModel = new PacienteModel();
    ArrayList<PacienteModel> listaTratamentoModels = new ArrayList<>();
    QuadroPsicofisicoController quadroPsicofisicoController = new QuadroPsicofisicoController();
    QuadroPsicofisicoModel quadroPsicofisicoModel = new QuadroPsicofisicoModel();
    ArrayList<QuadroPsicofisicoModel> listaQuadroPsicofisicoModels = new ArrayList<>();

    /**
     * Creates new form ConsultaPaciente
     */
    public ConsultaPaciente() {
        this.setIconImage(new ImageIcon(getClass().getResource("/br/com/sisgete/images/others/LogotipoFECMA.jpg")).getImage());
        this.setLocation(400, 100);
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        popularTabela();
        corLinhaTabela();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtResultado = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Pacientes");

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
        jrbFiltroDesobsessão.setText("por modo de desobsessão");
        jrbFiltroDesobsessão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFiltroDesobsessãoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(UM POR VEZ)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbFiltroNome, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(jrbFiltroSetor, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(93, 93, 93)
                .addComponent(jrbFiltroStatusTratamento, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(66, 66, 66)
                .addComponent(jrbFiltroDesobsessão, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addGap(89, 89, 89)
                .addComponent(jLabel2)
                .addContainerGap())
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
                    .addComponent(jrbFiltroDesobsessão))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Paciente", "Setor", "Data Atendimento", "Atendente", "Desobsessão", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtResultado.setColorBackgoundHead(new java.awt.Color(204, 204, 204));
        jtResultado.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        jtResultado.setColorForegroundHead(new java.awt.Color(0, 112, 192));
        jtResultado.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        jtResultado.setFuenteFilas(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jtResultado.setFuenteFilasSelect(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jtResultado.setFuenteHead(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jtResultado.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtResultado);
        if (jtResultado.getColumnModel().getColumnCount() > 0) {
            jtResultado.getColumnModel().getColumn(0).setResizable(false);
            jtResultado.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
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

    private void popularTabela() {
        listaTratamentoModels = new ArrayList<>();
        listaTratamentoModels = medicamentoTratamentoController.getListaPacienteController();
        listaQuadroPsicofisicoModels = quadroPsicofisicoController.getListaQuadroPsicofisicoController();
        DefaultTableModel modelo = (DefaultTableModel) jtResultado.getModel();
        modelo.setNumRows(0);

        int cont = listaTratamentoModels.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaTratamentoModels.get(i).getIdPaciente(),
                listaTratamentoModels.get(i).getNome(),
                listaTratamentoModels.get(i).getSetor(),
                listaTratamentoModels.get(i).getDataAtendimento(),
                listaTratamentoModels.get(i).getAtendente(),
                listaTratamentoModels.get(i).getModoDesobsessao(),
                listaTratamentoModels.get(i).getStatusTratamento()
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
    }

    private void corLinhaTabela() {
        ColorirLinhaStatus colorirLinhaStatus = new ColorirLinhaStatus(6);
        jtResultado.getColumnModel().getColumn(6).setCellRenderer(colorirLinhaStatus);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbFiltroDesobsessão;
    private javax.swing.JRadioButton jrbFiltroNome;
    private javax.swing.JRadioButton jrbFiltroSetor;
    private javax.swing.JRadioButton jrbFiltroStatusTratamento;
    private rojerusan.RSTableMetro jtResultado;
    // End of variables declaration//GEN-END:variables

}
