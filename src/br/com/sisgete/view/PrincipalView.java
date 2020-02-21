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
    ListaPacienteConsultaView listaPacienteView = new ListaPacienteConsultaView();
    ListaPacientesDomingoView listaPacientesDomingoView = new ListaPacientesDomingoView();
    ListaPacientesInativoView listaPacientesLiberadoView = new ListaPacientesInativoView();
    ExtraView extraView = new ExtraView();
    GetDateUtil getDateUtil = new GetDateUtil();

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        this.setIconImage(new ImageIcon(getClass().getResource("/br/com/sisgete/images/others/logo.png")).getImage());
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setarData();
        dadosIniciais();
        desabilitarItens();
//  setarNivel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbCadastroPaciente = new javax.swing.JButton();
        jbPesquisaPaciente = new javax.swing.JButton();
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
        jmiCadastroPaciente = new javax.swing.JMenuItem();
        jmiPesquisaPaciente = new javax.swing.JMenuItem();
        jmiAtendimento = new javax.swing.JMenuItem();
        jmiConsulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiFrequenciaDomingo = new javax.swing.JMenuItem();
        jmiFrequenciaQuinta = new javax.swing.JMenuItem();
        jmiFrequenciaTerca = new javax.swing.JMenuItem();
        jmiMagnetizador = new javax.swing.JMenuItem();
        jmiAuxiliar = new javax.swing.JMenuItem();
        jmiExtras = new javax.swing.JMenuItem();
        jmiPacienteDomingo = new javax.swing.JMenuItem();
        jmiPacienteLiberado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISGETE - FECMA");

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        jbCadastroPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-24.png"))); // NOI18N
        jbCadastroPaciente.setText("Ficha paciente");
        jbCadastroPaciente.setEnabled(false);
        jbCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroPacienteActionPerformed(evt);
            }
        });

        jbPesquisaPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbPesquisaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-24.png"))); // NOI18N
        jbPesquisaPaciente.setText("Pesquisar  paciente");
        jbPesquisaPaciente.setEnabled(false);
        jbPesquisaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaPacienteActionPerformed(evt);
            }
        });

        jbFrequenciaDomingo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbFrequenciaDomingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24.png"))); // NOI18N
        jbFrequenciaDomingo.setText("Frequencia Domingo");
        jbFrequenciaDomingo.setEnabled(false);
        jbFrequenciaDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrequenciaDomingoActionPerformed(evt);
            }
        });

        jbFrequenciaQuinta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbFrequenciaQuinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24 (1).png"))); // NOI18N
        jbFrequenciaQuinta.setText("Frequencia Quinta");
        jbFrequenciaQuinta.setEnabled(false);
        jbFrequenciaQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrequenciaQuintaActionPerformed(evt);
            }
        });

        jbFrequenciaTerca.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbFrequenciaTerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24ter.png"))); // NOI18N
        jbFrequenciaTerca.setText("Frequencia Terça");
        jbFrequenciaTerca.setEnabled(false);
        jbFrequenciaTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrequenciaTercaActionPerformed(evt);
            }
        });

        jbMagnetizador.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbMagnetizador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jbMagnetizador.setText("Magenetizador");
        jbMagnetizador.setEnabled(false);
        jbMagnetizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMagnetizadorActionPerformed(evt);
            }
        });

        jbAuxiliar.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbAuxiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jbAuxiliar.setText("Auxiliar");
        jbAuxiliar.setEnabled(false);
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
        jbExtra.setEnabled(false);
        jbExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExtraActionPerformed(evt);
            }
        });

        jbAtendimento.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-na-lista-24.png"))); // NOI18N
        jbAtendimento.setText("Atendimento");
        jbAtendimento.setEnabled(false);
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
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jlUsuario))
        );

        jlData.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlData.setForeground(new java.awt.Color(255, 255, 255));
        jlData.setText("dd/MM/yyyy HH:mm:ss");

        jbConsulta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-lista-24.png"))); // NOI18N
        jbConsulta.setText("Lista Consulta");
        jbConsulta.setEnabled(false);
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jbPesquisaPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel1))
                                    .addComponent(jbCadastroPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbAtendimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCadastroPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPesquisaPaciente)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
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

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
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

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-ferramentas-administrativas-24.png"))); // NOI18N
        jMenu2.setText("Funções");
        jMenu2.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-xbox-b-24.png"))); // NOI18N
        jMenu3.setText("Básicas");
        jMenu3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N

        jmiCadastroPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiCadastroPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-24.png"))); // NOI18N
        jmiCadastroPaciente.setText("Novo Paciente");
        jmiCadastroPaciente.setToolTipText("Abrir ficha novo paciente");
        jmiCadastroPaciente.setEnabled(false);
        jmiCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroPacienteActionPerformed(evt);
            }
        });
        jMenu3.add(jmiCadastroPaciente);

        jmiPesquisaPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiPesquisaPaciente.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiPesquisaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-24.png"))); // NOI18N
        jmiPesquisaPaciente.setText("Pesquisar paciente");
        jmiPesquisaPaciente.setToolTipText("");
        jmiPesquisaPaciente.setEnabled(false);
        jmiPesquisaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPesquisaPacienteActionPerformed(evt);
            }
        });
        jMenu3.add(jmiPesquisaPaciente);

        jmiAtendimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiAtendimento.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pesquisar-na-lista-24.png"))); // NOI18N
        jmiAtendimento.setText("Atendimento");
        jmiAtendimento.setToolTipText("Separar fichas para tratamento ou consulta");
        jmiAtendimento.setEnabled(false);
        jmiAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAtendimentoActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAtendimento);

        jmiConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jmiConsulta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-lista-24.png"))); // NOI18N
        jmiConsulta.setText("Pacientes Consulta");
        jmiConsulta.setToolTipText("Lista de pacientes para  consulta");
        jmiConsulta.setEnabled(false);
        jmiConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(jmiConsulta);

        jMenu2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-xbox-a-24.png"))); // NOI18N
        jMenu4.setText("Avançadas");
        jMenu4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N

        jmiFrequenciaDomingo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmiFrequenciaDomingo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiFrequenciaDomingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24.png"))); // NOI18N
        jmiFrequenciaDomingo.setText("Frequência Domingo");
        jmiFrequenciaDomingo.setEnabled(false);
        jmiFrequenciaDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFrequenciaDomingoActionPerformed(evt);
            }
        });
        jMenu4.add(jmiFrequenciaDomingo);

        jmiFrequenciaQuinta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmiFrequenciaQuinta.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiFrequenciaQuinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24 (1).png"))); // NOI18N
        jmiFrequenciaQuinta.setText("Frequência Quinta");
        jmiFrequenciaQuinta.setEnabled(false);
        jmiFrequenciaQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFrequenciaQuintaActionPerformed(evt);
            }
        });
        jMenu4.add(jmiFrequenciaQuinta);

        jmiFrequenciaTerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jmiFrequenciaTerca.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiFrequenciaTerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-tag-rfid-24ter.png"))); // NOI18N
        jmiFrequenciaTerca.setText("Frequência Terça");
        jmiFrequenciaTerca.setEnabled(false);
        jmiFrequenciaTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFrequenciaTercaActionPerformed(evt);
            }
        });
        jMenu4.add(jmiFrequenciaTerca);

        jmiMagnetizador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmiMagnetizador.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiMagnetizador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jmiMagnetizador.setText("Novo Magnetizador");
        jmiMagnetizador.setEnabled(false);
        jmiMagnetizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMagnetizadorActionPerformed(evt);
            }
        });
        jMenu4.add(jmiMagnetizador);

        jmiAuxiliar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmiAuxiliar.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiAuxiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-usuário-masculino-241.png"))); // NOI18N
        jmiAuxiliar.setText("Novo Auxiliar");
        jmiAuxiliar.setEnabled(false);
        jmiAuxiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAuxiliarActionPerformed(evt);
            }
        });
        jMenu4.add(jmiAuxiliar);

        jmiExtras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmiExtras.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiExtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-funcionalidades-extra-24.png"))); // NOI18N
        jmiExtras.setText("Funções Extras");
        jmiExtras.setEnabled(false);
        jmiExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExtrasActionPerformed(evt);
            }
        });
        jMenu4.add(jmiExtras);

        jmiPacienteDomingo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmiPacienteDomingo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiPacienteDomingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-pessoas-multiculturais-24.png"))); // NOI18N
        jmiPacienteDomingo.setText("Lista de Pacientes (DOMINGO)");
        jmiPacienteDomingo.setEnabled(false);
        jmiPacienteDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPacienteDomingoActionPerformed(evt);
            }
        });
        jMenu4.add(jmiPacienteDomingo);

        jmiPacienteLiberado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmiPacienteLiberado.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jmiPacienteLiberado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-abrir-documento-24.png"))); // NOI18N
        jmiPacienteLiberado.setText("Lista de Pacientes (LIBERADOS E INATIVOS)");
        jmiPacienteLiberado.setEnabled(false);
        jmiPacienteLiberado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPacienteLiberadoActionPerformed(evt);
            }
        });
        jMenu4.add(jmiPacienteLiberado);

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

    private void jbPesquisaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaPacienteActionPerformed
        desktopPane.add(pesquisaPacienteView);
        pesquisaPacienteView.setVisible(true);
    }//GEN-LAST:event_jbPesquisaPacienteActionPerformed

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

    private void jmiCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroPacienteActionPerformed
        desktopPane.add(cadastroFichaView);
        cadastroFichaView.setVisible(true);
    }//GEN-LAST:event_jmiCadastroPacienteActionPerformed

    private void jmiFrequenciaDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFrequenciaDomingoActionPerformed
        desktopPane.add(acompanhamentoDomingoView);
        acompanhamentoDomingoView.setVisible(true);
    }//GEN-LAST:event_jmiFrequenciaDomingoActionPerformed

    private void jmiPesquisaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPesquisaPacienteActionPerformed
        desktopPane.add(pesquisaPacienteView);
        pesquisaPacienteView.setVisible(true);
    }//GEN-LAST:event_jmiPesquisaPacienteActionPerformed

    private void jmiAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAtendimentoActionPerformed
        desktopPane.add(consultaDomingoView);
        consultaDomingoView.setVisible(true);
    }//GEN-LAST:event_jmiAtendimentoActionPerformed

    private void jmiConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaActionPerformed
        desktopPane.add(listaPacienteView);
        listaPacienteView.setVisible(true);
    }//GEN-LAST:event_jmiConsultaActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiFrequenciaQuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFrequenciaQuintaActionPerformed
        desktopPane.add(acompanhamentoQuintaView);
        acompanhamentoQuintaView.setVisible(true);
    }//GEN-LAST:event_jmiFrequenciaQuintaActionPerformed

    private void jmiFrequenciaTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFrequenciaTercaActionPerformed
        desktopPane.add(acompanhamentoTercaView);
        acompanhamentoTercaView.setVisible(true);
    }//GEN-LAST:event_jmiFrequenciaTercaActionPerformed

    private void jmiMagnetizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMagnetizadorActionPerformed
        desktopPane.add(magnetizadorView);
        magnetizadorView.setVisible(true);
    }//GEN-LAST:event_jmiMagnetizadorActionPerformed

    private void jmiAuxiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAuxiliarActionPerformed
        desktopPane.add(auxiliarView);
        auxiliarView.setVisible(true);
    }//GEN-LAST:event_jmiAuxiliarActionPerformed

    private void jmiExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExtrasActionPerformed
        desktopPane.add(extraView);
        extraView.setVisible(true);
    }//GEN-LAST:event_jmiExtrasActionPerformed

    private void jmiPacienteDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPacienteDomingoActionPerformed
        desktopPane.add(listaPacientesDomingoView);
        listaPacientesDomingoView.setVisible(true);
    }//GEN-LAST:event_jmiPacienteDomingoActionPerformed

    private void jmiPacienteLiberadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPacienteLiberadoActionPerformed
        desktopPane.add(listaPacientesLiberadoView);
        listaPacientesLiberadoView.setVisible(true);
    }//GEN-LAST:event_jmiPacienteLiberadoActionPerformed

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
            case "ADMINISTRADOR":
                //funções básicas
                jbCadastroPaciente.setEnabled(true);
                jbConsulta.setEnabled(true);
                jbPesquisaPaciente.setEnabled(true);
                jbAtendimento.setEnabled(true);
                // funções avançadas
                jbFrequenciaDomingo.setEnabled(true);
                jbFrequenciaQuinta.setEnabled(true);
                jbFrequenciaTerca.setEnabled(true);
                jbMagnetizador.setEnabled(true);
                jbAuxiliar.setEnabled(true);
                jbExtra.setEnabled(true);
                // funções extras
                jmiPacienteLiberado.setEnabled(true);
                jmiPacienteDomingo.setEnabled(true);
                jmiCadastroPaciente.setEnabled(true);
                jmiConsulta.setEnabled(true);
                jmiFrequenciaTerca.setEnabled(true);
                jmiFrequenciaQuinta.setEnabled(true);
                jmiFrequenciaDomingo.setEnabled(true);
                jmiAtendimento.setEnabled(true);
                jmiAuxiliar.setEnabled(true);
                jmiExtras.setEnabled(true);
                jmiMagnetizador.setEnabled(true);
                jmiPesquisaPaciente.setEnabled(true);
                break;

            case "ATENDENTE FRATERNO":
                jbCadastroPaciente.setEnabled(true);
                jmiCadastroPaciente.setEnabled(true);
                jbConsulta.setEnabled(true);
                jmiConsulta.setEnabled(true);
                break;

            case "RECEPÇÃO":
                jbAtendimento.setEnabled(true);
                jmiAtendimento.setEnabled(true);
                jbConsulta.setEnabled(true);
                jmiConsulta.setEnabled(true);
                break;

            case "MAGNETIZADOR/AUXILIAR":
                jbFrequenciaTerca.setEnabled(true);
                jmiFrequenciaTerca.setEnabled(true);
                jbFrequenciaQuinta.setEnabled(true);
                jmiFrequenciaQuinta.setEnabled(true);
                jbFrequenciaDomingo.setEnabled(true);
                jmiFrequenciaDomingo.setEnabled(true);
                break;

            default:
                break;
        }
    }

    private void desabilitarItens() {
        //funções básicas
        jbCadastroPaciente.setEnabled(true);
        jbConsulta.setEnabled(true);
        jbPesquisaPaciente.setEnabled(true);
        jbAtendimento.setEnabled(true);
        // funções avançadas
        jbFrequenciaDomingo.setEnabled(true);
        jbFrequenciaQuinta.setEnabled(true);
        jbFrequenciaTerca.setEnabled(true);
        jbMagnetizador.setEnabled(true);
        jbAuxiliar.setEnabled(true);
        jbExtra.setEnabled(true);
        // funções extras
        jmiPacienteLiberado.setEnabled(true);
        jmiPacienteDomingo.setEnabled(true);
        jmiCadastroPaciente.setEnabled(true);
        jmiConsulta.setEnabled(true);
        jmiFrequenciaTerca.setEnabled(true);
        jmiFrequenciaQuinta.setEnabled(true);
        jmiFrequenciaDomingo.setEnabled(true);
        jmiAtendimento.setEnabled(true);
        jmiAuxiliar.setEnabled(true);
        jmiExtras.setEnabled(true);
        jmiMagnetizador.setEnabled(true);
        jmiPesquisaPaciente.setEnabled(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAtendimento;
    private javax.swing.JButton jbAuxiliar;
    private javax.swing.JButton jbCadastroPaciente;
    private javax.swing.JButton jbConsulta;
    private javax.swing.JButton jbExtra;
    private javax.swing.JButton jbFrequenciaDomingo;
    private javax.swing.JButton jbFrequenciaQuinta;
    private javax.swing.JButton jbFrequenciaTerca;
    private javax.swing.JButton jbMagnetizador;
    private javax.swing.JButton jbPesquisaPaciente;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenuItem jmiAtendimento;
    private javax.swing.JMenuItem jmiAuxiliar;
    private javax.swing.JMenuItem jmiCadastroPaciente;
    private javax.swing.JMenuItem jmiConsulta;
    private javax.swing.JMenuItem jmiExtras;
    private javax.swing.JMenuItem jmiFrequenciaDomingo;
    private javax.swing.JMenuItem jmiFrequenciaQuinta;
    private javax.swing.JMenuItem jmiFrequenciaTerca;
    private javax.swing.JMenuItem jmiMagnetizador;
    private javax.swing.JMenuItem jmiPacienteDomingo;
    private javax.swing.JMenuItem jmiPacienteLiberado;
    private javax.swing.JMenuItem jmiPesquisaPaciente;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables
}
