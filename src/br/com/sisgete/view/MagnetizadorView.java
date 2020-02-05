package br.com.sisgete.view;

import br.com.sisgete.controller.MagnetizadorController;
import br.com.sisgete.model.MagnetizadorModel;
import br.com.sisgete.util.ColorirLinhaStatus;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class MagnetizadorView extends javax.swing.JInternalFrame {

    MagnetizadorController magnetizadorController = new MagnetizadorController();
    MagnetizadorModel magnetizadorModel = new MagnetizadorModel();
    ArrayList<MagnetizadorModel> listaMagnetizadorModels = new ArrayList<>();
    MenuOpcoesView menuOpcoesView = new MenuOpcoesView(null, true);

    /**
     * Creates new form MagnetizadorView
     */
    public MagnetizadorView() {
        initComponents();
        carregarDados();
        corLinhaStatusMagnetizador();
        setIconifiable(true);
        setClosable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfMagnetizador = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMagnetizador = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("ENTRADA DE MAGENTIZADORES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setText("NOME DO MAGNETIZADOR.:");

        jtfMagnetizador.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jtfMagnetizador.setForeground(new java.awt.Color(0, 112, 192));
        jtfMagnetizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMagnetizadorActionPerformed(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-salvar-como-24.png"))); // NOI18N
        jbSalvar.setText("SALVAR");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-cancelar-24.png"))); // NOI18N
        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGULARES NO ATENDIMENTO ESPIRITUAL MAGNÉTICO");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATENÇÃO!");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UTILIZE ESTE FORMULÁRIO PARA CADASTRAR OS MAGNETIZADORES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
        );

        jtMagnetizador.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jtMagnetizador.setForeground(new java.awt.Color(0, 112, 192));
        jtMagnetizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "#", "Nome", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMagnetizador.getTableHeader().setReorderingAllowed(false);
        jtMagnetizador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMagnetizadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMagnetizador);
        if (jtMagnetizador.getColumnModel().getColumnCount() > 0) {
            jtMagnetizador.getColumnModel().getColumn(0).setMaxWidth(25);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addGap(306, 306, 306)
                        .addComponent(jbSalvar))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfMagnetizador, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfMagnetizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparCampos();
        carregarDados();

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        salvarDados();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtfMagnetizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMagnetizadorActionPerformed
        salvarDados();
    }//GEN-LAST:event_jtfMagnetizadorActionPerformed

    private void jtMagnetizadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMagnetizadorMouseClicked
        menuOpcoesView.setVisible(true);
        if (menuOpcoesView.flag == true) {
            atualizarDados();
        }
    }//GEN-LAST:event_jtMagnetizadorMouseClicked

    private void limparCampos() {
        jtfMagnetizador.setText("");
    }

    public void atualizarDados() {
        String status = "";
        int linha = jtMagnetizador.getSelectedRow();
        String paciente = (String.valueOf(jtMagnetizador.getValueAt(linha, 1)));
        magnetizadorModel = magnetizadorController.getMagnetizadorController(paciente);

        if (magnetizadorModel.getStatusMagnetizador().equals("ATIVO")) {
            magnetizadorModel.setStatusMagnetizador("INATIVO");
        } else if (magnetizadorModel.getStatusMagnetizador().equals("INATIVO")) {
            magnetizadorModel.setStatusMagnetizador("ATIVO");
        }

        if (magnetizadorController.atualizarMagnetizadorController(magnetizadorModel)) {
            JOptionPane.showMessageDialog(this, "Status do magnetizador alterado!", "Sucesso", JOptionPane.WARNING_MESSAGE);
            carregarDados();
        } else {
            JOptionPane.showMessageDialog(this, "Status do magnetizador não alterado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void salvarDados() {
        magnetizadorModel.setNomeMagnetizador(jtfMagnetizador.getText().toUpperCase());
        magnetizadorModel.setStatusMagnetizador("ATIVO");
        if (magnetizadorController.salvarMagnetizadorController(magnetizadorModel) > 1) {
            JOptionPane.showMessageDialog(this, "Infomações salvas com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
            limparCampos();
            jtfMagnetizador.requestFocusInWindow();
            carregarDados();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar informações", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void carregarDados() {
        listaMagnetizadorModels = new ArrayList<>();
        listaMagnetizadorModels = magnetizadorController.getListaMagnetizadorController();
        DefaultTableModel modelo = (DefaultTableModel) jtMagnetizador.getModel();
        modelo.setNumRows(0);

        int cont = listaMagnetizadorModels.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaMagnetizadorModels.get(i).getIdMagnetizador(),
                listaMagnetizadorModels.get(i).getNomeMagnetizador(),
                listaMagnetizadorModels.get(i).getStatusMagnetizador()
            });
        }
    }

    private void corLinhaStatusMagnetizador() {
        ColorirLinhaStatus colorirLinhaStatus = new ColorirLinhaStatus(2);
        jtMagnetizador.getColumnModel().getColumn(2).setCellRenderer(colorirLinhaStatus);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtMagnetizador;
    private javax.swing.JTextField jtfMagnetizador;
    // End of variables declaration//GEN-END:variables

}
