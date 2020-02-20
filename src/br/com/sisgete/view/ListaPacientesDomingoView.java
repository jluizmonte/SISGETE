package br.com.sisgete.view;

import br.com.sisgete.controller.PacienteController;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.util.ColorirLinhaTabelas;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class ListaPacientesDomingoView extends javax.swing.JInternalFrame {
    
    PacienteController pacienteController = new PacienteController();
    PacienteModel pacienteModel = new PacienteModel();
    ArrayList<PacienteModel> listaPacienteModel = new ArrayList<>();
    DadosPacienteView dadosPacienteView = new DadosPacienteView(null, true);

    /**
     * Creates new form ListaPacientesDomingoView
     */
    public ListaPacientesDomingoView() {
        initComponents();
        popularTabela();
        corLinhaStatusPaciente();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPaciente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("LISTA DE PACIENTES ATENDIDOS (TOTAL)");

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AQUI SERÁ MOSTRADA UMA LISTA COM TODOS OS PACIENTES");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUE FORAM ATENDIDOS NO TRATAMENTO DE DOMINGO.");

        jtPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "NOME", "SETOR", "DATA", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            jtPaciente.getColumnModel().getColumn(0).setMaxWidth(25);
            jtPaciente.getColumnModel().getColumn(2).setPreferredWidth(55);
            jtPaciente.getColumnModel().getColumn(2).setMaxWidth(55);
            jtPaciente.getColumnModel().getColumn(3).setPreferredWidth(120);
            jtPaciente.getColumnModel().getColumn(3).setMaxWidth(120);
            jtPaciente.getColumnModel().getColumn(4).setPreferredWidth(120);
            jtPaciente.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLIQUE EM UM DOS PACIENTES PARA VER INFORMAÇÕES DETALHADAS.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
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

    private void jtPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacienteMouseClicked
        enviarDados();
    }//GEN-LAST:event_jtPacienteMouseClicked
    
    private void corLinhaStatusPaciente() {
        ColorirLinhaTabelas colorirLinhaStatus = new ColorirLinhaTabelas(4);
        jtPaciente.getColumnModel().getColumn(4).setCellRenderer(colorirLinhaStatus);
    }
    
    private void popularTabela() {
        listaPacienteModel = new ArrayList<>();
        listaPacienteModel = pacienteController.getListaPacienteAtivoController();
        DefaultTableModel modelo = (DefaultTableModel) jtPaciente.getModel();
        modelo.setNumRows(0);
        
        int cont = listaPacienteModel.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaPacienteModel.get(i).getIdPaciente(),
                listaPacienteModel.get(i).getNome(),
                listaPacienteModel.get(i).getSetor(),
                listaPacienteModel.get(i).getDataAtendimento(),
                listaPacienteModel.get(i).getStatusTratamento(),});
        }
    }
    
    private void enviarDados() {
        pacienteModel = new PacienteModel();
        int linha = jtPaciente.getSelectedRow();
        int codigoPaciente = (int) jtPaciente.getValueAt(linha, 0);
        pacienteModel = pacienteController.getPacienteController(codigoPaciente);
        
        dadosPacienteView.jlBairro.setText(pacienteModel.getBairro());
        dadosPacienteView.jlCidade.setText(pacienteModel.getCidade());
        dadosPacienteView.jlDataNascimento.setText(pacienteModel.getDataNascimento());
        dadosPacienteView.jlEmail.setText(pacienteModel.getEmail());
        dadosPacienteView.jlEndereco.setText(pacienteModel.getRua());
        dadosPacienteView.jlIdade.setText(String.valueOf(pacienteModel.getIdade()));
        dadosPacienteView.jlNome.setText(pacienteModel.getNome());
        dadosPacienteView.jlNumImovel.setText(String.valueOf(pacienteModel.getNumCasa()));
        dadosPacienteView.jlTelefone.setText(pacienteModel.getTelefone());
        dadosPacienteView.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtPaciente;
    // End of variables declaration//GEN-END:variables

}
