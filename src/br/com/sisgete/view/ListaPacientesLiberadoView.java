package br.com.sisgete.view;

import br.com.sisgete.controller.FrequenciaTratamentoDomingoController;
import br.com.sisgete.controller.PacienteController;
import br.com.sisgete.model.FrequenciaTratamentoDomingoModel;
import br.com.sisgete.model.PacienteFrequenciaModel;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.util.ColorirLinhaTabelas;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class ListaPacientesLiberadoView extends javax.swing.JInternalFrame {

    PacienteController pacienteController = new PacienteController();
    PacienteModel pacienteModel = new PacienteModel();
    ArrayList<PacienteModel> listaPacienteModel = new ArrayList<>();

    FrequenciaTratamentoDomingoModel frequenciaTratamentoDomingoModel = new FrequenciaTratamentoDomingoModel();
    FrequenciaTratamentoDomingoController frequenciaTratamentoDomingoController = new FrequenciaTratamentoDomingoController();
    ArrayList<FrequenciaTratamentoDomingoModel> listaTratamentoDomingoModels = new ArrayList<>();

    PacienteFrequenciaModel pacienteFrequenciaModel = new PacienteFrequenciaModel();
    ArrayList<PacienteFrequenciaModel> listaFrequenciaModels = new ArrayList<>();

    /**
     * Creates new form ListaPacientesDomingoView
     */
    public ListaPacientesLiberadoView() {
        initComponents();
        popularTabela();
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
        setTitle("ARQUIVO MORTO - LIBERADOS");

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AQUI SERÁ MOSTRADA UMA LISTA COM TODOS OS PACIENTES LIBERADOS");

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
                "#", "NOME", "FICHA", "SETOR", "DATA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPaciente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtPaciente);
        if (jtPaciente.getColumnModel().getColumnCount() > 0) {
            jtPaciente.getColumnModel().getColumn(0).setMaxWidth(35);
            jtPaciente.getColumnModel().getColumn(2).setMaxWidth(90);
            jtPaciente.getColumnModel().getColumn(3).setMaxWidth(55);
            jtPaciente.getColumnModel().getColumn(4).setMaxWidth(95);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void popularTabela() {
        listaPacienteModel = new ArrayList<>();
        listaTratamentoDomingoModels = new ArrayList<>();
        listaFrequenciaModels = new ArrayList<>();
        listaPacienteModel = pacienteController.getListaPacienteController();
        listaTratamentoDomingoModels = frequenciaTratamentoDomingoController.getListaFrequenciaTratamentoDomingoController();
        //    listaFrequenciaModels = pacienteController.getListaPacienteLiberadoDAO(1);
        DefaultTableModel modelo = (DefaultTableModel) jtPaciente.getModel();
        modelo.setNumRows(0);
        int cont = listaPacienteModel.size();
//        for (int i = 0; i < cont; i++) {
//            modelo.addRow(new Object[]{
//                paciente.getIdPaciente(),
//                paciente.getNome(),
//                paciente.getSetor(),
//                paciente.getStatusTratamento()
//            });
//        }
        listaPacienteModel.forEach((paciente) -> {
            paciente.getIdPaciente();
            paciente.getNome();
            paciente.getSetor();
            paciente.getStatusTratamento();
        });
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
