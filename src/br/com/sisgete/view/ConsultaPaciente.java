package br.com.sisgete.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class ConsultaPaciente extends javax.swing.JFrame {

    String nome, status, desobsessao, setor;

    /**
     * Creates new form ConsultaPaciente
     */
    public ConsultaPaciente() {
        this.setIconImage(new ImageIcon(getClass().getResource("/br/com/sisgete/images/others/LogotipoFECMA.jpg")).getImage());
        this.setLocation(400, 100);
        initComponents();
        setLocationRelativeTo(null);
        //  setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbFiltroNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jrbFiltroSetor)
                .addGap(93, 93, 93)
                .addComponent(jrbFiltroStatusTratamento)
                .addGap(66, 66, 66)
                .addComponent(jrbFiltroDesobsessão)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbFiltroNome)
                    .addComponent(jrbFiltroSetor)
                    .addComponent(jrbFiltroStatusTratamento)
                    .addComponent(jrbFiltroDesobsessão))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
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
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(204, 204, 204));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorForegroundHead(new java.awt.Color(0, 112, 192));
        rSTableMetro1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        rSTableMetro1.setFuenteFilas(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        rSTableMetro1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(rSTableMetro1);
        if (rSTableMetro1.getColumnModel().getColumnCount() > 0) {
            rSTableMetro1.getColumnModel().getColumn(0).setResizable(false);
            rSTableMetro1.getColumnModel().getColumn(0).setPreferredWidth(20);
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
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

            nome = JOptionPane.showInputDialog(this, "Entre o nome do paciente:", "Pesquisa paciente", JOptionPane.INFORMATION_MESSAGE);
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
            setor = String.valueOf(resposta);
        }
    }//GEN-LAST:event_jrbFiltroSetorActionPerformed

    private void jrbFiltroStatusTratamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFiltroStatusTratamentoActionPerformed
        if (jrbFiltroStatusTratamento.isSelected()) {
            jrbFiltroDesobsessão.setSelected(false);
            jrbFiltroSetor.setSelected(false);
            jrbFiltroNome.setSelected(false);
            Object[] opcoes = {"Liberado", "Em Observação", "Em Tratamento"};
            Object resposta;
            resposta = JOptionPane.showInputDialog(null,
                    "Status do paciente",
                    "Pesquisa paciente",
                    JOptionPane.OK_CANCEL_OPTION,
                    null,
                    opcoes,
                    "Liberado");
            status = String.valueOf(resposta);
        }
    }//GEN-LAST:event_jrbFiltroStatusTratamentoActionPerformed

    private void jrbFiltroDesobsessãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFiltroDesobsessãoActionPerformed
        if (jrbFiltroDesobsessão.isSelected()) {
            jrbFiltroStatusTratamento.setSelected(false);
            jrbFiltroSetor.setSelected(false);
            jrbFiltroNome.setSelected(false);
            Object[] opcoes = {"No Centro", "À Distância"};
            Object resposta;
            resposta = JOptionPane.showInputDialog(null,
                    "Desobsessão",
                    "Pesquisa paciente",
                    JOptionPane.OK_CANCEL_OPTION,
                    null,
                    opcoes,
                    "No Centro");
            desobsessao = String.valueOf(resposta);
        }
    }//GEN-LAST:event_jrbFiltroDesobsessãoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ConsultaPaciente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbFiltroDesobsessão;
    private javax.swing.JRadioButton jrbFiltroNome;
    private javax.swing.JRadioButton jrbFiltroSetor;
    private javax.swing.JRadioButton jrbFiltroStatusTratamento;
    private rojerusan.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables

}
