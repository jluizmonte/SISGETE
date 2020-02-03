package br.com.sisgete.view;

import br.com.sisgete.model.SessaoModel;
import br.com.sisgete.util.GetDateUtil;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

/**
 *
 * @author luiz
 */
public class PrincipalView extends javax.swing.JFrame {
    
    CadastroFichaView cadastroFichaView = new CadastroFichaView();
    PesquisaPacienteView pesquisaPacienteView = new PesquisaPacienteView();
    MagnetizadorView magnetizadorView = new MagnetizadorView();
    AuxiliarView auxiliarView = new AuxiliarView();
    AcompanhamentoDomingoView acompanhamentoDomingoView = new AcompanhamentoDomingoView();
    AcompanhamentoTercaView acompanhamentoTercaView = new AcompanhamentoTercaView();
    AcompanhamentoQuintaView acompanhamentoQuintaView = new AcompanhamentoQuintaView();
    ConsultaDomingoView consultaDomingoView = new ConsultaDomingoView();
    ListaPacienteView listaPacienteView = new ListaPacienteView();
    ExtraView extraView = new ExtraView();
    GetDateUtil getDateUtil = new GetDateUtil();

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        this.setIconImage(new ImageIcon(getClass().getResource("/br/com/sisgete/images/others/LogotipoFECMA.jpg")).getImage());
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setarData();
        dadosIniciais();
        //   setarNivel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbCadastroPaciente = new javax.swing.JButton();
        jbConsultaPaciente = new javax.swing.JButton();
        jbFrequenciaDomingo = new javax.swing.JButton();
        jbFrequenciaQuinta = new javax.swing.JButton();
        jbFrequenciaTerca = new javax.swing.JButton();
        jbMagnetizador = new javax.swing.JButton();
        jbAuxiliar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbExtra = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jbAtendimento = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jbConsulta = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmiNovoPaciente = new javax.swing.JMenuItem();
        jmiPesquisarPaciente = new javax.swing.JMenuItem();
        jmiAtendimento = new javax.swing.JMenuItem();
        jmiPacienteConsulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISGETE - FECMA");

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        jbCadastroPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-24.png"))); // NOI18N
        jbCadastroPaciente.setText("Ficha paciente");
        jbCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroPacienteActionPerformed(evt);
            }
        });

        jbConsultaPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbConsultaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-24.png"))); // NOI18N
        jbConsultaPaciente.setText("Pesquisar  paciente");
        jbConsultaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaPacienteActionPerformed(evt);
            }
        });

        jbFrequenciaDomingo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbFrequenciaDomingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24.png"))); // NOI18N
        jbFrequenciaDomingo.setText("Frequencia Domingo");
        jbFrequenciaDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrequenciaDomingoActionPerformed(evt);
            }
        });

        jbFrequenciaQuinta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbFrequenciaQuinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24 (1).png"))); // NOI18N
        jbFrequenciaQuinta.setText("Frequencia Quinta");
        jbFrequenciaQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrequenciaQuintaActionPerformed(evt);
            }
        });

        jbFrequenciaTerca.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbFrequenciaTerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24ter.png"))); // NOI18N
        jbFrequenciaTerca.setText("Frequencia Terça");
        jbFrequenciaTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrequenciaTercaActionPerformed(evt);
            }
        });

        jbMagnetizador.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbMagnetizador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jbMagnetizador.setText("Magenetizador");
        jbMagnetizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMagnetizadorActionPerformed(evt);
            }
        });

        jbAuxiliar.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbAuxiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jbAuxiliar.setText("Auxiliar");
        jbAuxiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAuxiliarActionPerformed(evt);
            }
        });

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-desligar-24.png"))); // NOI18N
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FUNÇÕES AVANÇADAS:");

        jbExtra.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-funcionalidades-extra-24.png"))); // NOI18N
        jbExtra.setText("Extra");
        jbExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExtraActionPerformed(evt);
            }
        });

        jbAtendimento.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-na-lista-24.png"))); // NOI18N
        jbAtendimento.setText("Atendimento");
        jbAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtendimentoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FUNÇÕES BÁSICAS.:");

        jPanel3.setBackground(new java.awt.Color(0, 112, 192));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INFORMAÇÕES.:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUÁRIO LOGADO NA SESSÃO.:");

        jlUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlUsuario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlUsuario.setText("$USER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jlUsuario)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jlUsuario)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jlData.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlData.setForeground(new java.awt.Color(255, 255, 255));
        jlData.setText("dd/MM/yyyy HH:mm:ss");

        jbConsulta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-lista-24.png"))); // NOI18N
        jbConsulta.setText("Lista Consulta");
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbFrequenciaDomingo)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbFrequenciaTerca)
                                            .addComponent(jbFrequenciaQuinta)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jbMagnetizador))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jbExtra))
                                            .addComponent(jbAuxiliar)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbConsultaPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel1))
                                    .addComponent(jbCadastroPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbAtendimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24))))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCadastroPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConsultaPaciente)
                .addGap(4, 4, 4)
                .addComponent(jbAtendimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbFrequenciaDomingo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbFrequenciaQuinta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbFrequenciaTerca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMagnetizador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAuxiliar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbSair)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlData)
                        .addGap(14, 14, 14))))
        );

        ImageIcon icon = new ImageIcon(getClass().getResource("/br/com/sisgete/images/others/sisgete.jpg"));
        Image image = icon.getImage();
        desktopPane = new javax.swing.JDesktopPane() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N

        jmiSair.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-desligar-24.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Funções");
        jMenu2.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N

        jMenu3.setText("Básicas");
        jMenu3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N

        jmiNovoPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiNovoPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiNovoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-24.png"))); // NOI18N
        jmiNovoPaciente.setText("Novo Paciente");
        jmiNovoPaciente.setToolTipText("Abrir ficha novo paciente");
        jmiNovoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovoPacienteActionPerformed(evt);
            }
        });
        jMenu3.add(jmiNovoPaciente);

        jmiPesquisarPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiPesquisarPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiPesquisarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-24.png"))); // NOI18N
        jmiPesquisarPaciente.setText("Pesquisar paciente");
        jmiPesquisarPaciente.setToolTipText("");
        jmiPesquisarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPesquisarPacienteActionPerformed(evt);
            }
        });
        jMenu3.add(jmiPesquisarPaciente);

        jmiAtendimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiAtendimento.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-na-lista-24.png"))); // NOI18N
        jmiAtendimento.setText("Atendimento");
        jmiAtendimento.setToolTipText("Separar fichas para tratamento ou consulta");
        jmiAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAtendimentoActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAtendimento);

        jmiPacienteConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiPacienteConsulta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiPacienteConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-lista-24.png"))); // NOI18N
        jmiPacienteConsulta.setText("Pacientes Consulta");
        jmiPacienteConsulta.setToolTipText("Lista de pacientes para  consulta");
        jmiPacienteConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPacienteConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(jmiPacienteConsulta);

        jMenu2.add(jMenu3);

        jMenu4.setText("Avançadas");
        jMenu4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24.png"))); // NOI18N
        jMenuItem2.setText("Frequência Domingo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24 (1).png"))); // NOI18N
        jMenuItem1.setText("Frequência Quinta");
        jMenu4.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24ter.png"))); // NOI18N
        jMenuItem3.setText("Frequência Terça");
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jMenuItem4.setText("Novo Magnetizador");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jMenuItem5.setText("Novo Auxiliar");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-funcionalidades-extra-24.png"))); // NOI18N
        jMenuItem6.setText("Funções Extras");
        jMenu4.add(jMenuItem6);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void jbCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroPacienteActionPerformed
        desktopPane.add(cadastroFichaView);
        cadastroFichaView.setVisible(true);
    }//GEN-LAST:event_jbCadastroPacienteActionPerformed

    private void jbConsultaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaPacienteActionPerformed
        desktopPane.add(pesquisaPacienteView);
        pesquisaPacienteView.setVisible(true);
    }//GEN-LAST:event_jbConsultaPacienteActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbFrequenciaDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFrequenciaDomingoActionPerformed
        desktopPane.add(acompanhamentoDomingoView);
        acompanhamentoDomingoView.setVisible(true);
    }//GEN-LAST:event_jbFrequenciaDomingoActionPerformed

    private void jbFrequenciaQuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFrequenciaQuintaActionPerformed
        desktopPane.add(acompanhamentoQuintaView);
        acompanhamentoQuintaView.setVisible(true);
    }//GEN-LAST:event_jbFrequenciaQuintaActionPerformed

    private void jbFrequenciaTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFrequenciaTercaActionPerformed
        desktopPane.add(acompanhamentoTercaView);
        acompanhamentoTercaView.setVisible(true);
    }//GEN-LAST:event_jbFrequenciaTercaActionPerformed

    private void jbMagnetizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMagnetizadorActionPerformed
        desktopPane.add(magnetizadorView);
        magnetizadorView.setVisible(true);
    }//GEN-LAST:event_jbMagnetizadorActionPerformed

    private void jbAuxiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAuxiliarActionPerformed
        desktopPane.add(auxiliarView);
        auxiliarView.setVisible(true);
    }//GEN-LAST:event_jbAuxiliarActionPerformed

    private void jbExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExtraActionPerformed
        desktopPane.add(extraView);
        extraView.setVisible(true);
    }//GEN-LAST:event_jbExtraActionPerformed

    private void jbAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtendimentoActionPerformed
        desktopPane.add(consultaDomingoView);
        consultaDomingoView.setVisible(true);

    }//GEN-LAST:event_jbAtendimentoActionPerformed

    private void jbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaActionPerformed
        desktopPane.add(listaPacienteView);
        listaPacienteView.setVisible(true);
    }//GEN-LAST:event_jbConsultaActionPerformed

    private void jmiNovoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovoPacienteActionPerformed
        desktopPane.add(cadastroFichaView);
        cadastroFichaView.setVisible(true);
    }//GEN-LAST:event_jmiNovoPacienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        desktopPane.add(listaPacienteView);
        listaPacienteView.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmiPesquisarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPesquisarPacienteActionPerformed
        desktopPane.add(pesquisaPacienteView);
        pesquisaPacienteView.setVisible(true);
    }//GEN-LAST:event_jmiPesquisarPacienteActionPerformed

    private void jmiAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAtendimentoActionPerformed
        desktopPane.add(consultaDomingoView);
        consultaDomingoView.setVisible(true);
    }//GEN-LAST:event_jmiAtendimentoActionPerformed

    private void jmiPacienteConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPacienteConsultaActionPerformed
        desktopPane.add(listaPacienteView);
        listaPacienteView.setVisible(true);
    }//GEN-LAST:event_jmiPacienteConsultaActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed
    
    private void dadosIniciais() {
        jlUsuario.setText(SessaoModel.nomeUsuario);
    }

    /**
     * exibir na toolbar (barra de status/ barra inferior) a data atual do login
     * do usuário.
     */
    public void setarData() {
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    LocalDateTime timepoint = LocalDateTime.now();
                    jlData.setText(timepoint.format(fmt));
                }
            }
        };
        clock.start();
    }
    
    private void setarNivel() {
        switch (SessaoModel.nivelAcessoUsuario) {
            case "MAGNETIZADOR/AUXILIAR":
                jbFrequenciaDomingo.setEnabled(true);
                jbFrequenciaQuinta.setEnabled(true);
                jbFrequenciaTerca.setEnabled(true);
                jbMagnetizador.setEnabled(true);
                jbAuxiliar.setEnabled(true);
                jbExtra.setEnabled(true);
                break;
            case "ATENDENTE FRATERNO":
                jbFrequenciaDomingo.setEnabled(false);
                jbFrequenciaQuinta.setEnabled(false);
                jbFrequenciaTerca.setEnabled(false);
                jbMagnetizador.setEnabled(false);
                jbAuxiliar.setEnabled(false);
                jbExtra.setEnabled(false);
                break;
            default:
                break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAtendimento;
    private javax.swing.JButton jbAuxiliar;
    private javax.swing.JButton jbCadastroPaciente;
    private javax.swing.JButton jbConsulta;
    private javax.swing.JButton jbConsultaPaciente;
    private javax.swing.JButton jbExtra;
    private javax.swing.JButton jbFrequenciaDomingo;
    private javax.swing.JButton jbFrequenciaQuinta;
    private javax.swing.JButton jbFrequenciaTerca;
    private javax.swing.JButton jbMagnetizador;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenuItem jmiAtendimento;
    private javax.swing.JMenuItem jmiNovoPaciente;
    private javax.swing.JMenuItem jmiPacienteConsulta;
    private javax.swing.JMenuItem jmiPesquisarPaciente;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables
}
