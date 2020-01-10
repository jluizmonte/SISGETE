package br.com.sisgete.view;

import br.com.sisgete.util.GetDateUtil;
import javax.swing.ImageIcon;

/**
 *
 * @author luiz
 */
public class CadastroFicha extends javax.swing.JFrame {

    GetDateUtil getDateUtil = new GetDateUtil();

    /**
     * Creates new form CadastroFicha
     */
    public CadastroFicha() {
        this.setIconImage(new ImageIcon(getClass().getResource("/br/com/sisgete/images/others/LogotipoFECMA.jpg")).getImage());
        initComponents();
        //   setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpBarraLateral = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jbHome = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jpPanel3 = new javax.swing.JPanel();
        jpInfoPaciente = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JFormattedTextField();
        jlIdade = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jtfNumImovel = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcbCidade = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfDataNascimento = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpQuadroPsicofisico = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jcbQuadroOuveVozes = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jcbQuadroPresencaEspiritos = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jcbQuadroVultos = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jcbQuadroIrritacao = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jcbQuadroZumbidos = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jcbQuadroCalafrios = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jcbQuadroTaquicardia = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jcbQuadroPesadelos = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jcbQuadroInsonia = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jcbQuadroFaltaConcetracao = new javax.swing.JComboBox<>();
        jlabel = new javax.swing.JLabel();
        jcbQuadroDesanimo = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jcbQuadroAngustia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jcbQuadroDorCabeca = new javax.swing.JComboBox<>();
        jcbQuadroFaltaApetite = new javax.swing.JComboBox<>();
        jcbQuadroSudorese = new javax.swing.JComboBox<>();
        jcbQuadroTonturas = new javax.swing.JComboBox<>();
        jcbQuadroMedo = new javax.swing.JComboBox<>();
        jcbQuadroAnsiedade = new javax.swing.JComboBox<>();
        jcbQuadroDormencia = new javax.swing.JComboBox<>();
        jcbQuadroIdeiasSuicidas = new javax.swing.JComboBox<>();
        jcbQuadroDorColuna = new javax.swing.JComboBox<>();
        jcbQuadroDorPerna = new javax.swing.JComboBox<>();
        jcbQuadroCansaco = new javax.swing.JComboBox<>();
        jcbQuadroSonolencia = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jpTratamentos = new javax.swing.JPanel();
        jpOutrasInfo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atendimento Fraterno");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jpBarraLateral.setBackground(new java.awt.Color(0, 112, 192));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/others/IMG-20191218-WA0001.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Atendimento Fraterno");

        jLabel58.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("ATENÇÃO!");

        jLabel60.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText(" clique no botão avançar");

        jLabel59.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Para preencher as informações");

        jLabel61.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("caso necessite volte a janela");

        jLabel62.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("utilizando o botão abaixo:");

        jbHome.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-casa-24.png"))); // NOI18N
        jbHome.setText("INICIO");
        jbHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHomeActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("principal para revisar algo");

        javax.swing.GroupLayout jpBarraLateralLayout = new javax.swing.GroupLayout(jpBarraLateral);
        jpBarraLateral.setLayout(jpBarraLateralLayout);
        jpBarraLateralLayout.setHorizontalGroup(
            jpBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpBarraLateralLayout.createSequentialGroup()
                        .addGroup(jpBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addGroup(jpBarraLateralLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel60)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBarraLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(48, 48, 48))
            .addGroup(jpBarraLateralLayout.createSequentialGroup()
                .addGroup(jpBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBarraLateralLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel58))
                    .addGroup(jpBarraLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel61))
                    .addGroup(jpBarraLateralLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jpBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel62)))
                    .addGroup(jpBarraLateralLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jbHome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBarraLateralLayout.setVerticalGroup(
            jpBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52)
                .addGap(12, 12, 12)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addComponent(jbHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jpPanel3.setLayout(new java.awt.CardLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações e Endereço do paciente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Nome Completo.:");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setText("Telefone.:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setText("Idade:");

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel8.setText("Data Nascimento.:");

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel9.setText("Email.:");

        jtfNome.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jtfNome.setForeground(new java.awt.Color(0, 112, 192));

        jtfEmail.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jtfEmail.setForeground(new java.awt.Color(0, 112, 192));

        jtfTelefone.setForeground(new java.awt.Color(0, 112, 192));
        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTelefone.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        jlIdade.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jlIdade.setForeground(new java.awt.Color(0, 112, 192));
        jlIdade.setText("$0");

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 112, 192));
        jLabel12.setText("Anos");

        jtfRua.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jtfRua.setForeground(new java.awt.Color(0, 112, 192));
        jtfRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jtfNumImovel.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jtfNumImovel.setForeground(new java.awt.Color(0, 112, 192));

        jtfBairro.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jtfBairro.setForeground(new java.awt.Color(0, 112, 192));

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel10.setText("Endereço.:");

        jcbCidade.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jcbCidade.setForeground(new java.awt.Color(0, 112, 192));
        jcbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abreu e Lima", "Afogados da Ingazeira", "Afrânio", "Agrestina", "Água Preta", "Águas Belas", "Alagoinha", "Aliança", "Altinho", "Amaraji", "Angelim", "Araçoiaba", "Araripina", "Arcoverde", "Barra de Guabiraba", "Barreiros", "Belém de Maria", "Belém do São Francisco", "Belo Jardim", "Betânia", "Bezerros", "Bodocó", "Bom Conselho", "Bom Jardim", "Bonito", "Brejão", "Brejinho", "Brejo da Madre de Deus", "Buenos Aires", "Buíque", "Cabo de Santo Agostinho", "Cabrobó", "Cachoeirinha", "Caetés", "Calçado", "Calumbi", "Camaragibe", "Camocim de São Félix", "Camutanga", "Canhotinho", "Capoeiras", "Carnaíba", "Carnaubeira da Penha", "Carpina", "Caruaru", "Casinhas", "Catende", "Cedro", "Chã de Alegria", "Chã Grande", "Condado", "Correntes", "Cortês", "Cumaru", "Cupira", "Custódia", "Dormentes", "Escada", "Exu", "Feira Nova", "Fernando de Noronha", "Ferreiros", "Flores", "Floresta", "Frei Miguelinho", "Gameleira", "Garanhuns", "Glória do Goitá", "Goiana", "Granito", "Gravatá", "Iati", "Ibimirim", "Ibirajuba", "Igarassu", "Iguaraci", "Ilha de Itamaracá", "Inajá", "Ingazeira", "Ipojuca", "Ipubi", "Itacuruba", "Itaíba", "Itambé", "Itapetim", "Itapissuma", "Itaquitinga", "Jaboatão dos Guararapes", "Jaqueira", "Jataúba", "Jatobá", "João Alfredo", "Joaquim Nabuco", "Jucati", "Jupi", "Jurema", "Lagoa do Carro", "Lagoa do Itaenga", "Lagoa do Ouro", "Lagoa dos Gatos", "Lagoa Grande", "Lajedo", "Limoeiro", "Macaparana", "Machados", "Manarí", "Maraial", "Mirandiba", "Moreilândia", "Moreno", "Nazaré da Mata", "Olinda", "Orobó", "Orocó", "Ouricuri", "Palmares", "Palmeirina", "Panelas", "Paranatama", "Parnamirim", "Passira", "Paudalho", "Paulista", "Pedra", "Pesqueira", "Petrolândia", "Petrolina", "Poção", "Pombos", "Primavera", "Quipapá", "Quixaba", "Recife", "Riacho das Almas", "Ribeirão", "Rio Formoso", "Sairé", "Salgadinho", "Salgueiro", "Saloá", "Sanharó", "Santa Cruz da Baixa Verde", "Santa Cruz do Capibaribe", "Santa Cruz", "Santa Filomena", "Santa Maria da Boa Vista", "Santa Maria do Cambucá", "Santa Terezinha", "São Benedito do Sul", "São Bento do Una", "São Caitano", "São João", "São Joaquim do Monte", "São José da Coroa Grande", "São José do Belmonte", "São José do Egito", "São Lourenço da Mata", "São Vicente Férrer", "Serra Talhada", "Serrita", "Sertânia", "Sirinhaém", "Solidão", "Surubim", "Tabira", "Tacaimbó", "Tacaratu", "Tamandaré", "Taquaritinga do Norte", "Terezinha", "Terra Nova", "Timbaúba", "Toritama", "Tracunhaém", "Trindade", "Triunfo", "Tupanatinga", "Tuparetama", "Venturosa", "Verdejante", "Vertente do Lério", "Vertentes", "Vicência", "Vitória de Santo Antão", "Xexéu" }));

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel13.setText("N° imovél.:");

        jLabel14.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel14.setText("Bairro.:");

        jLabel15.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel15.setText("Cidade.:");

        jtfDataNascimento.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Noto Sans", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    jtfDataNascimento.setCalendarBackground(new java.awt.Color(255, 255, 255));
    jtfDataNascimento.setBorder(javax.swing.BorderFactory.createCompoundBorder(null,
        null));
jtfDataNascimento.setCalendarPreferredSize(new java.awt.Dimension(256, 184));
jtfDataNascimento.setNothingAllowed(false);
try {
    jtfDataNascimento.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2019, 11, 1),
        new java.util.GregorianCalendar(2019, 11, 1))));
} catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
e1.printStackTrace();
}
jtfDataNascimento.setFieldFont(new java.awt.Font("DejaVu Sans", java.awt.Font.PLAIN, 14));
jtfDataNascimento.setNavigateFont(new java.awt.Font("DejaVu Sans", java.awt.Font.BOLD, 14));
jtfDataNascimento.setCurrentNavigateIndex(0);
jtfDataNascimento.addCommitListener(new datechooser.events.CommitListener() {
    public void onCommit(datechooser.events.CommitEvent evt) {
        jtfDataNascimentoOnCommit(evt);
    }
    });

    jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-avançar-24.png"))); // NOI18N
    jButton1.setText("Avançar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jtfNome))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel10))
                    .addGap(69, 69, 69)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtfRua)))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jtfDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(54, 54, 54)
                    .addComponent(jlIdade)
                    .addGap(43, 43, 43)
                    .addComponent(jLabel12))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))
                    .addGap(70, 70, 70)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jtfNumImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlIdade)
                    .addComponent(jLabel12)))
            .addGap(32, 32, 32)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3)
                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10)
                .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jButton1))
            .addContainerGap(31, Short.MAX_VALUE))
    );

    jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel11.setText("FRATERNIDADE ESPÍRITA CRISTINA DE MENEZES DE ALBUQUERQUE");

    jLabel54.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
    jLabel54.setText("ATENDIMENTO FRATERNO");

    jLabel63.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel63.setText("TRATAMENTO ESPIRITUAL");

    javax.swing.GroupLayout jpInfoPacienteLayout = new javax.swing.GroupLayout(jpInfoPaciente);
    jpInfoPaciente.setLayout(jpInfoPacienteLayout);
    jpInfoPacienteLayout.setHorizontalGroup(
        jpInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoPacienteLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoPacienteLayout.createSequentialGroup()
                    .addComponent(jLabel54)
                    .addGap(173, 173, 173))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoPacienteLayout.createSequentialGroup()
                    .addComponent(jLabel63)
                    .addGap(208, 208, 208)))
            .addGap(48, 48, 48))
        .addGroup(jpInfoPacienteLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator1))
    );
    jpInfoPacienteLayout.setVerticalGroup(
        jpInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoPacienteLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jLabel11)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel63)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16))
    );

    jpPanel3.add(jpInfoPaciente, "card2");

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quadro Psicofísico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12))); // NOI18N

    jLabel18.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel18.setText("Presença onstensiva de espíritos");

    jcbQuadroOuveVozes.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroOuveVozes.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroOuveVozes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel21.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel21.setText("Ouve vozes");

    jcbQuadroPresencaEspiritos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroPresencaEspiritos.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroPresencaEspiritos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel22.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel22.setText("Vê vultos");

    jcbQuadroVultos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroVultos.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroVultos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel25.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel25.setText("Ideias suicidas");

    jcbQuadroIrritacao.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroIrritacao.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroIrritacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel24.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel24.setText("Zumbidos");

    jcbQuadroZumbidos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroZumbidos.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroZumbidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel23.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel23.setText("Calafrios");

    jcbQuadroCalafrios.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroCalafrios.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroCalafrios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel31.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel31.setText("Aceleração do coração");

    jcbQuadroTaquicardia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroTaquicardia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroTaquicardia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel30.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel30.setText("Pesadelos");

    jcbQuadroPesadelos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroPesadelos.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroPesadelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel29.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel29.setText("Medo");

    jcbQuadroInsonia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroInsonia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroInsonia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel26.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel26.setText("Falta de concentração");

    jcbQuadroFaltaConcetracao.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroFaltaConcetracao.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroFaltaConcetracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jlabel.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jlabel.setText("Desânimo");

    jcbQuadroDesanimo.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroDesanimo.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroDesanimo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel27.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel27.setText("Angustia");

    jcbQuadroAngustia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroAngustia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroAngustia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel5.setText("Insônia");

    jLabel16.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel16.setText("Falta de apetite");

    jLabel17.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel17.setText("Ansiedade");

    jLabel19.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel19.setText("Dormência");

    jLabel20.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel20.setText("Dores nas pernas e/ou braços");

    jLabel32.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel32.setText("Sudorese");

    jLabel33.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel33.setText("Tonturas");

    jLabel34.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel34.setText("Sonolência constante");

    jLabel35.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel35.setText("Cansaço sem motivo");

    jLabel36.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel36.setText("Dor de cabeça");

    jLabel37.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel37.setText("Dor na coluna");

    jLabel38.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel38.setText("Irritação sem motivo");

    jcbQuadroDorCabeca.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroDorCabeca.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroDorCabeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroFaltaApetite.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroFaltaApetite.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroFaltaApetite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroSudorese.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroSudorese.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroSudorese.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroTonturas.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroTonturas.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroTonturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroMedo.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroMedo.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroMedo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroAnsiedade.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroAnsiedade.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroAnsiedade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroDormencia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroDormencia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroDormencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroIdeiasSuicidas.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroIdeiasSuicidas.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroIdeiasSuicidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroDorColuna.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroDorColuna.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroDorColuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroDorPerna.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroDorPerna.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroDorPerna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroCansaco.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroCansaco.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroCansaco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroSonolencia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroSonolencia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroSonolencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "NUNCA", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel33)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbQuadroTonturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbQuadroCalafrios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbQuadroZumbidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbQuadroVultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30)
                                .addComponent(jLabel27))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbQuadroAngustia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbQuadroPesadelos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbQuadroInsonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbQuadroOuveVozes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jlabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbQuadroDesanimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel32)
                        .addComponent(jLabel29)
                        .addComponent(jLabel17))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcbQuadroAnsiedade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbQuadroSudorese, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbQuadroMedo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGap(18, 18, 18)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel31)
                        .addComponent(jLabel25))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcbQuadroTaquicardia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbQuadroIdeiasSuicidas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addComponent(jLabel26)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbQuadroFaltaConcetracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel36)
                            .addGap(162, 162, 162)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbQuadroDorCabeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbQuadroPresencaEspiritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbQuadroFaltaApetite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel16)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel38)
                        .addComponent(jLabel37)
                        .addComponent(jLabel20)
                        .addComponent(jLabel35)
                        .addComponent(jLabel34))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jcbQuadroIrritacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbQuadroDorColuna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbQuadroDorPerna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbQuadroCansaco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbQuadroSonolencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jLabel19)
                    .addGap(192, 192, 192)
                    .addComponent(jcbQuadroDormencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel22)
                .addComponent(jcbQuadroVultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel25)
                .addComponent(jcbQuadroIdeiasSuicidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel24)
                .addComponent(jcbQuadroZumbidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel31)
                .addComponent(jcbQuadroTaquicardia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel30)
                .addComponent(jcbQuadroPesadelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel26)
                .addComponent(jcbQuadroFaltaConcetracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel27)
                .addComponent(jcbQuadroAngustia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel18)
                .addComponent(jcbQuadroPresencaEspiritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbQuadroDesanimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcbQuadroDorCabeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel36)
                .addComponent(jlabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbQuadroOuveVozes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel21)
                .addComponent(jLabel16)
                .addComponent(jcbQuadroFaltaApetite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbQuadroCalafrios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel23)
                .addComponent(jLabel38)
                .addComponent(jcbQuadroIrritacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbQuadroInsonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5)
                .addComponent(jLabel37)
                .addComponent(jcbQuadroDorColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbQuadroTonturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel33)
                .addComponent(jLabel20)
                .addComponent(jcbQuadroDorPerna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbQuadroSudorese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel32)
                .addComponent(jLabel35)
                .addComponent(jcbQuadroCansaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel34)
                .addComponent(jLabel29)
                .addComponent(jcbQuadroMedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcbQuadroSonolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17)
                .addComponent(jcbQuadroAnsiedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel19)
                .addComponent(jcbQuadroDormencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    jButton2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-avançar-24.png"))); // NOI18N
    jButton2.setText("Avançar");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jpQuadroPsicofisicoLayout = new javax.swing.GroupLayout(jpQuadroPsicofisico);
    jpQuadroPsicofisico.setLayout(jpQuadroPsicofisicoLayout);
    jpQuadroPsicofisicoLayout.setHorizontalGroup(
        jpQuadroPsicofisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpQuadroPsicofisicoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(17, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpQuadroPsicofisicoLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2)
            .addGap(28, 28, 28))
    );
    jpQuadroPsicofisicoLayout.setVerticalGroup(
        jpQuadroPsicofisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpQuadroPsicofisicoLayout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButton2)
            .addContainerGap(27, Short.MAX_VALUE))
    );

    jpPanel3.add(jpQuadroPsicofisico, "card3");

    javax.swing.GroupLayout jpTratamentosLayout = new javax.swing.GroupLayout(jpTratamentos);
    jpTratamentos.setLayout(jpTratamentosLayout);
    jpTratamentosLayout.setHorizontalGroup(
        jpTratamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 711, Short.MAX_VALUE)
    );
    jpTratamentosLayout.setVerticalGroup(
        jpTratamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 523, Short.MAX_VALUE)
    );

    jpPanel3.add(jpTratamentos, "card4");

    jpOutrasInfo.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jpOutrasInfoLayout = new javax.swing.GroupLayout(jpOutrasInfo);
    jpOutrasInfo.setLayout(jpOutrasInfoLayout);
    jpOutrasInfoLayout.setHorizontalGroup(
        jpOutrasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 711, Short.MAX_VALUE)
    );
    jpOutrasInfoLayout.setVerticalGroup(
        jpOutrasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 523, Short.MAX_VALUE)
    );

    jpPanel3.add(jpOutrasInfo, "card5");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jpBarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jpPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jpBarraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jpPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHomeActionPerformed
        //        if (!this.jbHome.isSelected()) {
        //            rSPanelsSlider1.slidPanel(20, pnl1, RSPanelsSlider.direct.Right);
        //        }
    }//GEN-LAST:event_jbHomeActionPerformed

    private void jtfDataNascimentoOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_jtfDataNascimentoOnCommit
        date();
    }//GEN-LAST:event_jtfDataNascimentoOnCommit

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jpInfoPaciente.setVisible(false);
        this.jpQuadroPsicofisico.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jpQuadroPsicofisico.setVisible(false);
        this.jpTratamentos.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFicha().setVisible(true);
            }
        });
    }

    /**
     * metodo para calcular a idade do paciente e automaticamente atribuir na
     * tela
     */
    private void date() {
        String texto;
        texto = jtfDataNascimento.getText();
        int anoAniversario = Integer.parseInt(texto.substring(6, 10));
        int anoAtual = Integer.parseInt(getDateUtil.getYear());
        int idade = anoAtual - anoAniversario;
        jlIdade.setText(String.valueOf(idade));
        //   jlData.setText(getDateUtil.getDateTime());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbHome;
    private javax.swing.JComboBox<String> jcbCidade;
    private javax.swing.JComboBox<String> jcbQuadroAngustia;
    private javax.swing.JComboBox<String> jcbQuadroAnsiedade;
    private javax.swing.JComboBox<String> jcbQuadroCalafrios;
    private javax.swing.JComboBox<String> jcbQuadroCansaco;
    private javax.swing.JComboBox<String> jcbQuadroDesanimo;
    private javax.swing.JComboBox<String> jcbQuadroDorCabeca;
    private javax.swing.JComboBox<String> jcbQuadroDorColuna;
    private javax.swing.JComboBox<String> jcbQuadroDorPerna;
    private javax.swing.JComboBox<String> jcbQuadroDormencia;
    private javax.swing.JComboBox<String> jcbQuadroFaltaApetite;
    private javax.swing.JComboBox<String> jcbQuadroFaltaConcetracao;
    private javax.swing.JComboBox<String> jcbQuadroIdeiasSuicidas;
    private javax.swing.JComboBox<String> jcbQuadroInsonia;
    private javax.swing.JComboBox<String> jcbQuadroIrritacao;
    private javax.swing.JComboBox<String> jcbQuadroMedo;
    private javax.swing.JComboBox<String> jcbQuadroOuveVozes;
    private javax.swing.JComboBox<String> jcbQuadroPesadelos;
    private javax.swing.JComboBox<String> jcbQuadroPresencaEspiritos;
    private javax.swing.JComboBox<String> jcbQuadroSonolencia;
    private javax.swing.JComboBox<String> jcbQuadroSudorese;
    private javax.swing.JComboBox<String> jcbQuadroTaquicardia;
    private javax.swing.JComboBox<String> jcbQuadroTonturas;
    private javax.swing.JComboBox<String> jcbQuadroVultos;
    private javax.swing.JComboBox<String> jcbQuadroZumbidos;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlabel;
    private javax.swing.JPanel jpBarraLateral;
    private javax.swing.JPanel jpInfoPaciente;
    private javax.swing.JPanel jpOutrasInfo;
    private javax.swing.JPanel jpPanel3;
    private javax.swing.JPanel jpQuadroPsicofisico;
    private javax.swing.JPanel jpTratamentos;
    private javax.swing.JTextField jtfBairro;
    private datechooser.beans.DateChooserCombo jtfDataNascimento;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumImovel;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JFormattedTextField jtfTelefone;
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables

}
