package br.com.sisgete.view;

import br.com.sisgete.controller.AtendenteFraternoController;
import br.com.sisgete.controller.MedicamentoTratamentoController;
import br.com.sisgete.controller.QuadroPsicofisicoController;
import br.com.sisgete.model.AtendenteFraternoModel;
import br.com.sisgete.model.MedicamentoTratamentoModel;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import br.com.sisgete.model.SessaoAtendenteModel;
import br.com.sisgete.util.GetDateUtil;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author RojeruSan
 */
public class AtendimentoFraternoView extends javax.swing.JFrame {

    GetDateUtil getDateUtil = new GetDateUtil();

    QuadroPsicofisicoModel quadroPsicofisicoModel = new QuadroPsicofisicoModel();
    QuadroPsicofisicoController quadroPsicofisicoController = new QuadroPsicofisicoController();
    MedicamentoTratamentoController medicamentoTratamentoController = new MedicamentoTratamentoController();
    MedicamentoTratamentoModel medicamentoTratamentoModel = new MedicamentoTratamentoModel();
    AtendenteFraternoModel atendenteFraternoModel = new AtendenteFraternoModel();
    AtendenteFraternoController atendenteFraternoController = new AtendenteFraternoController();

    String tipoRemedios, tipoDengue, tipoHepatite, tipoHipertensao, tipoDiabetes, tipoParacetamol, tipoAlcool, tipoFumo, tipoAlergias, tipoHernia, tipoDoencaEstomago, tipoDoencaOssos, tipoDoencaPulmoes, tipoDoencaAutoimune, tipoCancer, tipoFeridas;
    String obsRemedios, obsDengue, obsHepatite, obsHipertensao, obsDiabetes, obsParacetamol, obsAlcool, obsFumo, obsAlergias, obsHernia, obsDoencaEstomago, obsDoencaOssos, obsDoencaPulmoes, obsDoencaAutoimune, obsCancer, obsFeridas;
    String conhecimentoPrevio, modoDesobsessao, tratamentoFecma, setor;

    /**
     * Creates new form Principal
     */
    public AtendimentoFraternoView() {
        this.setIconImage(new ImageIcon(getClass().getResource("/br/com/sisgete/images/others/LogotipoFECMA.jpg")).getImage());
        this.setLocation(400, 100);
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        jlIdade.setText("");
        jlAtendente.setText(SessaoAtendenteModel.nomeAtendente);
        jtfNome.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jbHome = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        pnl1 = new javax.swing.JPanel();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jbAvancarPnl1 = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
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
        jbAvancarPsicofisico = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jbLimparSelecoes = new javax.swing.JButton();
        pnl3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jlAlcool = new javax.swing.JLabel();
        jLabelFumo = new javax.swing.JLabel();
        jlFeridaTumor = new javax.swing.JLabel();
        jlCancer = new javax.swing.JLabel();
        jlDoencaAutoimune = new javax.swing.JLabel();
        jlDoencaOssos = new javax.swing.JLabel();
        jlDoencaEstomago = new javax.swing.JLabel();
        jlHernia = new javax.swing.JLabel();
        jlAlergia = new javax.swing.JLabel();
        jcbRemedioControlado = new javax.swing.JComboBox<>();
        jcbDengue = new javax.swing.JComboBox<>();
        jcbHepatite = new javax.swing.JComboBox<>();
        jcbHipertensao = new javax.swing.JComboBox<>();
        jcbDoencaPulmoes = new javax.swing.JComboBox<>();
        jcbDiabetes = new javax.swing.JComboBox<>();
        jcbParacetamol = new javax.swing.JComboBox<>();
        jcbAlcool = new javax.swing.JComboBox<>();
        jcbFumo = new javax.swing.JComboBox<>();
        jcbAlergia = new javax.swing.JComboBox<>();
        jcbHernia = new javax.swing.JComboBox<>();
        jcbDoencaEstomago = new javax.swing.JComboBox<>();
        jcbDoencaAutoimune = new javax.swing.JComboBox<>();
        jcbDoencaOssos = new javax.swing.JComboBox<>();
        jcbFeridas = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jtfPeriodoDoencaPulmoes = new datechooser.beans.DateChooserCombo();
        jbObsDoencaPulomoes = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jbDoencaPulmoes = new javax.swing.JButton();
        jcbCancer = new javax.swing.JComboBox<>();
        jbCancer = new javax.swing.JButton();
        jbAvancarPnl3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jbFeridatumor = new javax.swing.JButton();
        jbDoencaOssos = new javax.swing.JButton();
        jbDoencaAutoimune = new javax.swing.JButton();
        jbAlergia = new javax.swing.JButton();
        jbFumo = new javax.swing.JButton();
        jbHernia = new javax.swing.JButton();
        jbDoencaEstomago = new javax.swing.JButton();
        jbRemedioControlado = new javax.swing.JButton();
        jbHepatite = new javax.swing.JButton();
        jbDengue = new javax.swing.JButton();
        jbDiabetes = new javax.swing.JButton();
        jbHipertensao = new javax.swing.JButton();
        jbAlcool = new javax.swing.JButton();
        jbParacetamol = new javax.swing.JButton();
        jbObsRemedio = new javax.swing.JButton();
        jbObsHepatite = new javax.swing.JButton();
        jbObsDengue = new javax.swing.JButton();
        jbObsDoencaEstomago = new javax.swing.JButton();
        jbObsHernia = new javax.swing.JButton();
        jbObsDiabetes = new javax.swing.JButton();
        jbObsHipertensao = new javax.swing.JButton();
        jbObsFeridas = new javax.swing.JButton();
        jbObsDoencaOssos = new javax.swing.JButton();
        jbObsCancer = new javax.swing.JButton();
        jbObsDoencaAutoimune = new javax.swing.JButton();
        jbObsAlergia = new javax.swing.JButton();
        jbObsFumo = new javax.swing.JButton();
        jbObsAlcool = new javax.swing.JButton();
        jbObsParacetamol = new javax.swing.JButton();
        jtfPeriodoRemedio = new datechooser.beans.DateChooserCombo();
        jtfPeriodoDengue = new datechooser.beans.DateChooserCombo();
        jtfPeriodoDiabetes = new datechooser.beans.DateChooserCombo();
        jtfPeriodoHipertensao = new datechooser.beans.DateChooserCombo();
        jtfPeriodoHepatite = new datechooser.beans.DateChooserCombo();
        jtfPeriodoFumo = new datechooser.beans.DateChooserCombo();
        jtfPeriodoAlcool = new datechooser.beans.DateChooserCombo();
        jtfPeriodoParacetamol = new datechooser.beans.DateChooserCombo();
        jtfPeriodoDoencaEstomago = new datechooser.beans.DateChooserCombo();
        jtfPeriodoHernia = new datechooser.beans.DateChooserCombo();
        jtfPeriodoAlergia = new datechooser.beans.DateChooserCombo();
        jtfPeriodoFeridas = new datechooser.beans.DateChooserCombo();
        jtfPeriodoDoencaAutoimune = new datechooser.beans.DateChooserCombo();
        jtfPeriodoDoencaOssos = new datechooser.beans.DateChooserCombo();
        jtfPeriodoCancer = new datechooser.beans.DateChooserCombo();
        pnl4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jcDesobsessaoSim = new javax.swing.JCheckBox();
        jcDesobsessaoNao = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfObjetivoTratamento = new javax.swing.JTextArea();
        jcTratamentoSim = new javax.swing.JCheckBox();
        jcTratamentoNao = new javax.swing.JCheckBox();
        jcConhecimentoEspiritaSim = new javax.swing.JCheckBox();
        jcConhecimentoEspiritaNao = new javax.swing.JCheckBox();
        jtfFonte = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jlAtendente = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jbTratamentos = new javax.swing.JButton();
        jbQuadroPsicofisco = new javax.swing.JButton();
        jbInfoPaciente = new javax.swing.JButton();
        jbFinalizarAtendimento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atendimento Fraterno");

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel60)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel61))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel62)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jbHome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        pnl1.setName("pnl1"); // NOI18N

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
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(51, 51, 51),
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
jtfDataNascimento.setFormat(2);
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
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtfRua)))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jtfDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
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
                            .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(jcbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14)
                .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(70, 70, 70))
    );

    jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel11.setText("FRATERNIDADE ESPÍRITA CRISTINA DE MENEZES DE ALBUQUERQUE");

    jLabel54.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
    jLabel54.setText("ATENDIMENTO FRATERNO");

    jLabel63.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel63.setText("TRATAMENTO ESPIRITUAL");

    jLabel64.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
    jLabel64.setForeground(new java.awt.Color(0, 112, 192));
    jLabel64.setText("PREENCHA AS IFORMAÇÕES A SEGUIR CONFORME PEDIDO");

    jLabel65.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
    jLabel65.setForeground(new java.awt.Color(0, 112, 192));
    jLabel65.setText("ALGUMAS INFRMOÇÕES ESTÃO EM POSIÇÕES DIFERENTES DA FICHA IMPRESSA");

    jLabel66.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
    jLabel66.setForeground(new java.awt.Color(0, 112, 192));
    jLabel66.setText("NADA QUE ALTERE O RESULTADO FINAL.");

    jbAvancarPnl1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbAvancarPnl1.setForeground(new java.awt.Color(0, 112, 192));
    jbAvancarPnl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-avançar-24.png"))); // NOI18N
    jbAvancarPnl1.setText("Avançar");
    jbAvancarPnl1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbAvancarPnl1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
    pnl1.setLayout(pnl1Layout);
    pnl1Layout.setHorizontalGroup(
        pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jSeparator2)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addGap(43, 43, 43))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                    .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                            .addComponent(jLabel66)
                            .addGap(128, 128, 128))
                        .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel64)
                            .addGap(85, 85, 85)))
                    .addGap(57, 57, 57))))
        .addGroup(pnl1Layout.createSequentialGroup()
            .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl1Layout.createSequentialGroup()
                    .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl1Layout.createSequentialGroup()
                            .addGap(215, 215, 215)
                            .addComponent(jLabel54))
                        .addGroup(pnl1Layout.createSequentialGroup()
                            .addGap(242, 242, 242)
                            .addComponent(jLabel63)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jbAvancarPnl1)))
            .addContainerGap())
    );
    pnl1Layout.setVerticalGroup(
        pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel11)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel63)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel64)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel65)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel66)
            .addGap(28, 28, 28)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jbAvancarPnl1)
            .addContainerGap(34, Short.MAX_VALUE))
    );

    rSPanelsSlider1.add(pnl1, "card2");

    pnl2.setName("pnl2"); // NOI18N

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quadro Psicofísico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12))); // NOI18N

    jLabel18.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel18.setText("Presença onstensiva de espíritos");

    jcbQuadroOuveVozes.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroOuveVozes.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroOuveVozes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel21.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel21.setText("Ouve vozes");

    jcbQuadroPresencaEspiritos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroPresencaEspiritos.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroPresencaEspiritos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel22.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel22.setText("Vê vultos");

    jcbQuadroVultos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroVultos.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroVultos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel25.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel25.setText("Ideias suicidas");

    jcbQuadroIrritacao.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroIrritacao.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroIrritacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel24.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel24.setText("Zumbidos");

    jcbQuadroZumbidos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroZumbidos.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroZumbidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel23.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel23.setText("Calafrios");

    jcbQuadroCalafrios.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroCalafrios.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroCalafrios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel31.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel31.setText("Aceleração do coração");

    jcbQuadroTaquicardia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroTaquicardia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroTaquicardia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel30.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel30.setText("Pesadelos");

    jcbQuadroPesadelos.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroPesadelos.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroPesadelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel29.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel29.setText("Medo");

    jcbQuadroInsonia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroInsonia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroInsonia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel26.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel26.setText("Falta de concentração");

    jcbQuadroFaltaConcetracao.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroFaltaConcetracao.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroFaltaConcetracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jlabel.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jlabel.setText("Desânimo");

    jcbQuadroDesanimo.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroDesanimo.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroDesanimo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jLabel27.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel27.setText("Angustia");

    jcbQuadroAngustia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroAngustia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroAngustia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

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
    jcbQuadroDorCabeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroFaltaApetite.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroFaltaApetite.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroFaltaApetite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroSudorese.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroSudorese.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroSudorese.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroTonturas.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroTonturas.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroTonturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroMedo.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroMedo.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroMedo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroAnsiedade.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroAnsiedade.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroAnsiedade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroDormencia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroDormencia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroDormencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroIdeiasSuicidas.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroIdeiasSuicidas.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroIdeiasSuicidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroDorColuna.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroDorColuna.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroDorColuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroDorPerna.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroDorPerna.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroDorPerna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroCansaco.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroCansaco.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroCansaco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jcbQuadroSonolencia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jcbQuadroSonolencia.setForeground(new java.awt.Color(0, 112, 192));
    jcbQuadroSonolencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AS VEZES", "QUASE SEMPRE", "SEMPRE" }));

    jbAvancarPsicofisico.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbAvancarPsicofisico.setForeground(new java.awt.Color(0, 112, 192));
    jbAvancarPsicofisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-avançar-24.png"))); // NOI18N
    jbAvancarPsicofisico.setText("Avançar");
    jbAvancarPsicofisico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbAvancarPsicofisicoActionPerformed(evt);
        }
    });

    jbLimparSelecoes.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbLimparSelecoes.setForeground(new java.awt.Color(0, 112, 192));
    jbLimparSelecoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-limpar-formatação-24.png"))); // NOI18N
    jbLimparSelecoes.setText("Limpar Seleções");
    jbLimparSelecoes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbLimparSelecoesActionPerformed(evt);
        }
    });

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
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
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
            .addContainerGap(57, Short.MAX_VALUE))
        .addComponent(jSeparator1)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jbLimparSelecoes)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbAvancarPsicofisico)
            .addGap(22, 22, 22))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(43, 43, 43)
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
                .addComponent(jcbQuadroDormencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbAvancarPsicofisico)
                .addComponent(jbLimparSelecoes))
            .addGap(25, 25, 25))
    );

    javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
    pnl2.setLayout(pnl2Layout);
    pnl2Layout.setHorizontalGroup(
        pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    pnl2Layout.setVerticalGroup(
        pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    rSPanelsSlider1.add(pnl2, "card3");

    pnl3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tratamentos/Medicamentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12))); // NOI18N
    pnl3.setName("pnl3"); // NOI18N

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel6.setText("Rémedios Controlados");

    jLabel39.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel39.setText("Dengue");

    jLabel40.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel40.setText("Hepatite");

    jLabel41.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel41.setText("Hipertensão");

    jLabel42.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel42.setText("Diabetes");

    jLabel43.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel43.setText("Toma Paracetamol");

    jlAlcool.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlAlcool.setText("Álcool");

    jLabelFumo.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabelFumo.setText("Fumo");

    jlFeridaTumor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlFeridaTumor.setText("Feridas ou tumores");

    jlCancer.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlCancer.setText("Câncer");
    jlCancer.setToolTipText("");

    jlDoencaAutoimune.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlDoencaAutoimune.setText("Doenças auto-imune*");
    jlDoencaAutoimune.setToolTipText("ex. Lúpus, Viltigo");

    jlDoencaOssos.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlDoencaOssos.setText("Doença nos ossos*");
    jlDoencaOssos.setToolTipText("ex. Atrite, Artrose, Osteoporose");

    jlDoencaEstomago.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlDoencaEstomago.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jlDoencaEstomago.setText("Doença no estômago");

    jlHernia.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlHernia.setText("Hérnia*");
    jlHernia.setToolTipText("ex. Hiato, Disco, Umbilical, Inguinal");

    jlAlergia.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlAlergia.setText("Alergia");

    jcbRemedioControlado.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbRemedioControlado.setForeground(new java.awt.Color(0, 112, 192));
    jcbRemedioControlado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbDengue.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbDengue.setForeground(new java.awt.Color(0, 112, 192));
    jcbDengue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbHepatite.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbHepatite.setForeground(new java.awt.Color(0, 112, 192));
    jcbHepatite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbHipertensao.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbHipertensao.setForeground(new java.awt.Color(0, 112, 192));
    jcbHipertensao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbDoencaPulmoes.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbDoencaPulmoes.setForeground(new java.awt.Color(0, 112, 192));
    jcbDoencaPulmoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbDiabetes.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbDiabetes.setForeground(new java.awt.Color(0, 112, 192));
    jcbDiabetes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbParacetamol.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbParacetamol.setForeground(new java.awt.Color(0, 112, 192));
    jcbParacetamol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbAlcool.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbAlcool.setForeground(new java.awt.Color(0, 112, 192));
    jcbAlcool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbFumo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbFumo.setForeground(new java.awt.Color(0, 112, 192));
    jcbFumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbAlergia.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbAlergia.setForeground(new java.awt.Color(0, 112, 192));
    jcbAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbHernia.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbHernia.setForeground(new java.awt.Color(0, 112, 192));
    jcbHernia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbDoencaEstomago.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbDoencaEstomago.setForeground(new java.awt.Color(0, 112, 192));
    jcbDoencaEstomago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbDoencaAutoimune.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbDoencaAutoimune.setForeground(new java.awt.Color(0, 112, 192));
    jcbDoencaAutoimune.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbDoencaOssos.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbDoencaOssos.setForeground(new java.awt.Color(0, 112, 192));
    jcbDoencaOssos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jcbFeridas.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbFeridas.setForeground(new java.awt.Color(0, 112, 192));
    jcbFeridas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jLabel46.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jLabel46.setText("TRATAMENTOS/MEDICAMENTOS");

    jLabel55.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jLabel55.setText("TIPO");

    jLabel56.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jLabel56.setText("DESDE QUANDO?");

    jLabel57.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
    jLabel57.setText("OBSERVAÇÕES");

    jbObsDoencaPulomoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsDoencaPulomoes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsDoencaPulomoesActionPerformed(evt);
        }
    });

    jLabel28.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel28.setText("Doença nos pulmões");

    jbDoencaPulmoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbDoencaPulmoes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbDoencaPulmoesActionPerformed(evt);
        }
    });

    jcbCancer.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jcbCancer.setForeground(new java.awt.Color(0, 112, 192));
    jcbCancer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM", "NÃO" }));

    jbCancer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbCancer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbCancerActionPerformed(evt);
        }
    });

    jbAvancarPnl3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbAvancarPnl3.setForeground(new java.awt.Color(0, 112, 192));
    jbAvancarPnl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-avançar-24.png"))); // NOI18N
    jbAvancarPnl3.setText("Avançar");
    jbAvancarPnl3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbAvancarPnl3ActionPerformed(evt);
        }
    });

    jbFeridatumor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbFeridatumor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbFeridatumorActionPerformed(evt);
        }
    });

    jbDoencaOssos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbDoencaOssos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbDoencaOssosActionPerformed(evt);
        }
    });

    jbDoencaAutoimune.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbDoencaAutoimune.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbDoencaAutoimuneActionPerformed(evt);
        }
    });

    jbAlergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbAlergia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbAlergiaActionPerformed(evt);
        }
    });

    jbFumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbFumo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbFumoActionPerformed(evt);
        }
    });

    jbHernia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbHernia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbHerniaActionPerformed(evt);
        }
    });

    jbDoencaEstomago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbDoencaEstomago.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbDoencaEstomagoActionPerformed(evt);
        }
    });

    jbRemedioControlado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbRemedioControlado.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbRemedioControladoActionPerformed(evt);
        }
    });

    jbHepatite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbHepatite.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbHepatiteActionPerformed(evt);
        }
    });

    jbDengue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbDengue.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbDengueActionPerformed(evt);
        }
    });

    jbDiabetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbDiabetes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbDiabetesActionPerformed(evt);
        }
    });

    jbHipertensao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbHipertensao.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbHipertensaoActionPerformed(evt);
        }
    });

    jbAlcool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbAlcool.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbAlcoolActionPerformed(evt);
        }
    });

    jbParacetamol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-tipo-20.png"))); // NOI18N
    jbParacetamol.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbParacetamolActionPerformed(evt);
        }
    });

    jbObsRemedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsRemedio.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsRemedioActionPerformed(evt);
        }
    });

    jbObsHepatite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsHepatite.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsHepatiteActionPerformed(evt);
        }
    });

    jbObsDengue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsDengue.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsDengueActionPerformed(evt);
        }
    });

    jbObsDoencaEstomago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsDoencaEstomago.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsDoencaEstomagoActionPerformed(evt);
        }
    });

    jbObsHernia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsHernia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsHerniaActionPerformed(evt);
        }
    });

    jbObsDiabetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsDiabetes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsDiabetesActionPerformed(evt);
        }
    });

    jbObsHipertensao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsHipertensao.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsHipertensaoActionPerformed(evt);
        }
    });

    jbObsFeridas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsFeridas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsFeridasActionPerformed(evt);
        }
    });

    jbObsDoencaOssos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsDoencaOssos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsDoencaOssosActionPerformed(evt);
        }
    });

    jbObsCancer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsCancer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsCancerActionPerformed(evt);
        }
    });

    jbObsDoencaAutoimune.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsDoencaAutoimune.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsDoencaAutoimuneActionPerformed(evt);
        }
    });

    jbObsAlergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsAlergia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsAlergiaActionPerformed(evt);
        }
    });

    jbObsFumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsFumo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsFumoActionPerformed(evt);
        }
    });

    jbObsAlcool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsAlcool.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsAlcoolActionPerformed(evt);
        }
    });

    jbObsParacetamol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-adicionar-linha-20.png"))); // NOI18N
    jbObsParacetamol.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbObsParacetamolActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(16, 16, 16)
                            .addComponent(jcbDoencaPulmoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jlFeridaTumor)
                        .addComponent(jlHernia)
                        .addComponent(jlAlergia)
                        .addComponent(jLabel43)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlAlcool)
                                .addComponent(jLabelFumo)
                                .addComponent(jLabel6)
                                .addComponent(jLabel39)
                                .addComponent(jLabel40)
                                .addComponent(jLabel41)
                                .addComponent(jLabel42))
                            .addGap(3, 3, 3)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbRemedioControlado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbDengue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcbHernia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcbHipertensao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbHepatite, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbAlcool, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbParacetamol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbDiabetes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcbFumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbAlergia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jlDoencaOssos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbDoencaOssos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jlDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlCancer))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbFeridas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel46)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                            .addComponent(jLabel55)
                            .addGap(56, 56, 56))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbFeridatumor)
                                .addComponent(jbCancer)
                                .addComponent(jbDoencaOssos)
                                .addComponent(jbDoencaAutoimune)
                                .addComponent(jbHernia)
                                .addComponent(jbDoencaEstomago)
                                .addComponent(jbFumo)
                                .addComponent(jbAlergia)
                                .addComponent(jbDoencaPulmoes)
                                .addComponent(jbRemedioControlado)
                                .addComponent(jbDengue)
                                .addComponent(jbHepatite)
                                .addComponent(jbHipertensao)
                                .addComponent(jbDiabetes)
                                .addComponent(jbParacetamol)
                                .addComponent(jbAlcool))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPeriodoDoencaPulmoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPeriodoRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtfPeriodoDengue, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPeriodoHepatite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPeriodoHipertensao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtfPeriodoDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPeriodoParacetamol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPeriodoAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtfPeriodoFumo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPeriodoAlergia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPeriodoHernia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtfPeriodoDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPeriodoDoencaOssos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPeriodoDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtfPeriodoFeridas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel56)))
                    .addGap(29, 29, 29)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel57)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbObsRemedio)
                                .addComponent(jbObsDoencaPulomoes)
                                .addComponent(jbObsHepatite)
                                .addComponent(jbObsDengue)
                                .addComponent(jbObsDiabetes)
                                .addComponent(jbObsHipertensao)
                                .addComponent(jbObsDoencaEstomago)
                                .addComponent(jbObsHernia)
                                .addComponent(jbObsDoencaAutoimune)
                                .addComponent(jbObsDoencaOssos)
                                .addComponent(jbObsCancer)
                                .addComponent(jbObsFeridas)
                                .addComponent(jbObsAlcool)
                                .addComponent(jbObsAlergia)
                                .addComponent(jbObsFumo)
                                .addComponent(jbObsParacetamol)))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jbAvancarPnl3)))
            .addContainerGap())
        .addComponent(jSeparator3)
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel46)
                .addComponent(jLabel56)
                .addComponent(jLabel57)
                .addComponent(jLabel55))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jbObsDoencaPulomoes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsDengue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsHepatite, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsHipertensao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbObsParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsFumo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsHernia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsDoencaOssos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsFeridas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbObsCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jcbDoencaPulmoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jbDoencaPulmoes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfPeriodoDoencaPulmoes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcbRemedioControlado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jbRemedioControlado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfPeriodoRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbDengue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel39))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbHepatite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel40))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbHipertensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel41))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel42))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel43)
                                .addComponent(jcbParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlAlcool)
                                .addComponent(jcbAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelFumo)
                                .addComponent(jcbFumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlAlergia)
                                .addComponent(jcbAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlHernia)
                                .addComponent(jcbHernia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlDoencaEstomago)
                                .addComponent(jcbDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbDengue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfPeriodoDengue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jbHepatite, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbHipertensao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jtfPeriodoHepatite, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfPeriodoHipertensao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfPeriodoDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jbParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(jbFumo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jtfPeriodoParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfPeriodoAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfPeriodoFumo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jbAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbHernia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jtfPeriodoAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfPeriodoHernia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfPeriodoDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlDoencaOssos)
                                        .addComponent(jcbDoencaOssos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlDoencaAutoimune)
                                        .addComponent(jcbDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jbDoencaOssos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jbFeridatumor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlFeridaTumor)
                                        .addComponent(jcbFeridas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlCancer)
                                        .addComponent(jcbCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jtfPeriodoDoencaOssos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfPeriodoDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfPeriodoFeridas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jbAvancarPnl3)
            .addContainerGap(44, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
    pnl3.setLayout(pnl3Layout);
    pnl3Layout.setHorizontalGroup(
        pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    pnl3Layout.setVerticalGroup(
        pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    rSPanelsSlider1.add(pnl3, "card4");

    pnl4.setName("pnl4"); // NOI18N

    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outras Informações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12))); // NOI18N

    jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel7.setText("OBJETIVO QUE PRETENDE DO TRATAMENTO ESPIRITUAL:");

    jLabel44.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel44.setText("Já realizou tratamento no FECMA?:");

    jLabel45.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel45.setText("Tem conhecimento espírita?");

    jLabel47.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel47.setText("Qual a fonte:");

    jLabel48.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel48.setText("Data do atendimento:");

    jLabel49.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel49.setText("Atendente:");

    jLabel50.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel50.setText("NO CASO DE TRATAEMENTO DE DESOBSSÃO:");

    jcDesobsessaoSim.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcDesobsessaoSim.setText("no Centro");
    jcDesobsessaoSim.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcDesobsessaoSimActionPerformed(evt);
        }
    });

    jcDesobsessaoNao.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcDesobsessaoNao.setText("à distância");
    jcDesobsessaoNao.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcDesobsessaoNaoActionPerformed(evt);
        }
    });

    jtfObjetivoTratamento.setColumns(20);
    jtfObjetivoTratamento.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jtfObjetivoTratamento.setForeground(new java.awt.Color(0, 112, 192));
    jtfObjetivoTratamento.setRows(5);
    jScrollPane1.setViewportView(jtfObjetivoTratamento);

    jcTratamentoSim.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcTratamentoSim.setText("Sim");
    jcTratamentoSim.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcTratamentoSimActionPerformed(evt);
        }
    });

    jcTratamentoNao.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcTratamentoNao.setText("Não");
    jcTratamentoNao.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcTratamentoNaoActionPerformed(evt);
        }
    });

    jcConhecimentoEspiritaSim.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcConhecimentoEspiritaSim.setText("Sim");
    jcConhecimentoEspiritaSim.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcConhecimentoEspiritaSimActionPerformed(evt);
        }
    });

    jcConhecimentoEspiritaNao.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcConhecimentoEspiritaNao.setText("Não");
    jcConhecimentoEspiritaNao.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcConhecimentoEspiritaNaoActionPerformed(evt);
        }
    });

    jtfFonte.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jtfFonte.setForeground(new java.awt.Color(0, 112, 192));

    jLabel51.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel51.setText("Recife,");

    jlData.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlData.setForeground(new java.awt.Color(0, 112, 192));
    jlData.setText("$DATA");

    jlAtendente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jlAtendente.setForeground(new java.awt.Color(0, 112, 192));
    jlAtendente.setText("$Atendente");

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jScrollPane1)
                    .addContainerGap())
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel44)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcTratamentoSim)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcTratamentoNao)
                    .addGap(117, 117, 117))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel48)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel51)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlData))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel49)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlAtendente)))
                    .addGap(0, 442, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jLabel50)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jcDesobsessaoSim)
                    .addGap(56, 56, 56)
                    .addComponent(jcDesobsessaoNao)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jLabel45)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jcConhecimentoEspiritaSim)
                    .addGap(12, 12, 12)
                    .addComponent(jcConhecimentoEspiritaNao)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel47)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jtfFonte)
                    .addContainerGap())))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(13, 13, 13)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel44)
                .addComponent(jcTratamentoNao)
                .addComponent(jcTratamentoSim))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel45)
                .addComponent(jcConhecimentoEspiritaSim)
                .addComponent(jcConhecimentoEspiritaNao)
                .addComponent(jLabel47)
                .addComponent(jtfFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel48)
                .addComponent(jLabel51)
                .addComponent(jlData))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel49)
                .addComponent(jlAtendente))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel50)
                .addComponent(jcDesobsessaoSim)
                .addComponent(jcDesobsessaoNao))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 14))); // NOI18N

    jLabel67.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel67.setForeground(new java.awt.Color(0, 112, 192));
    jLabel67.setText("ANTES DE FINALIZAR O ATENDIMENTO FRATERNO ");

    jLabel68.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel68.setForeground(new java.awt.Color(0, 112, 192));
    jLabel68.setText("CASO NECESSITE VOLTE AS JANELAS ANTERIORES UTILIZANDO OS BOTOẼS ABAIXO.");

    jLabel69.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel69.setForeground(new java.awt.Color(0, 112, 192));
    jLabel69.setText("NÃO ESQUEÇA DE EXPLICAR SOBRE AS RECOMENDAÇÕES DO TRATAMENTO");

    jLabel70.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel70.setForeground(new java.awt.Color(0, 112, 192));
    jLabel70.setText("CONFIRA OS DADOS INSERIDOS DO PACIENTE");

    jbTratamentos.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbTratamentos.setForeground(new java.awt.Color(0, 112, 192));
    jbTratamentos.setText("Tratamentos/Medicamentos");
    jbTratamentos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbTratamentosActionPerformed(evt);
        }
    });

    jbQuadroPsicofisco.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbQuadroPsicofisco.setForeground(new java.awt.Color(0, 112, 192));
    jbQuadroPsicofisco.setText("Quadro Psicofísico");
    jbQuadroPsicofisco.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbQuadroPsicofiscoActionPerformed(evt);
        }
    });

    jbInfoPaciente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbInfoPaciente.setForeground(new java.awt.Color(0, 112, 192));
    jbInfoPaciente.setText("Info. e endereço paciente");
    jbInfoPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbInfoPacienteActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(jLabel67))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(jLabel70))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel68)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel69)
            .addGap(44, 44, 44))
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addComponent(jbInfoPaciente)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jbQuadroPsicofisco)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
            .addComponent(jbTratamentos)
            .addContainerGap())
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addComponent(jLabel67)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel70)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel68)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel69)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbInfoPaciente)
                .addComponent(jbQuadroPsicofisco)
                .addComponent(jbTratamentos))
            .addGap(24, 24, 24))
    );

    jbFinalizarAtendimento.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbFinalizarAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-salvar-como-24.png"))); // NOI18N
    jbFinalizarAtendimento.setText("Finalizar Atendimento Fraterno");
    jbFinalizarAtendimento.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbFinalizarAtendimentoActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout pnl4Layout = new javax.swing.GroupLayout(pnl4);
    pnl4.setLayout(pnl4Layout);
    pnl4Layout.setHorizontalGroup(
        pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl4Layout.createSequentialGroup()
            .addContainerGap(435, Short.MAX_VALUE)
            .addComponent(jbFinalizarAtendimento)
            .addContainerGap())
        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    pnl4Layout.setVerticalGroup(
        pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnl4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jbFinalizarAtendimento)
            .addContainerGap(39, Short.MAX_VALUE))
    );

    rSPanelsSlider1.add(pnl4, "card5");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jbAvancarPsicofisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAvancarPsicofisicoActionPerformed
        if (!this.jbAvancarPsicofisico.isSelected()) {
            rSPanelsSlider1.slidPanel(20, pnl3, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_jbAvancarPsicofisicoActionPerformed

    private void jbAvancarPnl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAvancarPnl1ActionPerformed
        if (!this.jbAvancarPnl1.isSelected()) {
            rSPanelsSlider1.slidPanel(20, pnl2, RSPanelsSlider.direct.Right);
        }
        date();
    }//GEN-LAST:event_jbAvancarPnl1ActionPerformed

    private void jbHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHomeActionPerformed
        if (!this.jbHome.isSelected()) {
            rSPanelsSlider1.slidPanel(20, pnl1, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_jbHomeActionPerformed

    private void jtfDataNascimentoOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_jtfDataNascimentoOnCommit
        date();
    }//GEN-LAST:event_jtfDataNascimentoOnCommit

    private void jbLimparSelecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparSelecoesActionPerformed
        limparSelecao();
    }//GEN-LAST:event_jbLimparSelecoesActionPerformed

    private void jbAvancarPnl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAvancarPnl3ActionPerformed
        if (!this.jbAvancarPnl3.isSelected()) {
            rSPanelsSlider1.slidPanel(20, pnl4, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_jbAvancarPnl3ActionPerformed

    private void jbDoencaPulmoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoencaPulmoesActionPerformed
        tipoDoencaPulmoes = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDoencaPulmoesActionPerformed

    private void jbObsDoencaPulomoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDoencaPulomoesActionPerformed
        obsDoencaPulmoes = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDoencaPulomoesActionPerformed

    private void jbObsRemedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsRemedioActionPerformed
        obsRemedios = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsRemedioActionPerformed

    private void jbObsHepatiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsHepatiteActionPerformed
        obsHepatite = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsHepatiteActionPerformed

    private void jbObsDengueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDengueActionPerformed
        obsDengue = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDengueActionPerformed

    private void jbObsDoencaEstomagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDoencaEstomagoActionPerformed
        obsDoencaEstomago = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDoencaEstomagoActionPerformed

    private void jbObsHerniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsHerniaActionPerformed
        obsHernia = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsHerniaActionPerformed

    private void jbObsDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDiabetesActionPerformed
        obsDiabetes = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDiabetesActionPerformed

    private void jbObsHipertensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsHipertensaoActionPerformed
        obsHipertensao = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsHipertensaoActionPerformed

    private void jbObsFeridasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsFeridasActionPerformed
        obsFeridas = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsFeridasActionPerformed

    private void jbObsDoencaOssosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDoencaOssosActionPerformed
        obsDoencaOssos = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDoencaOssosActionPerformed

    private void jbObsCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsCancerActionPerformed
        obsCancer = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsCancerActionPerformed

    private void jbObsDoencaAutoimuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDoencaAutoimuneActionPerformed
        obsDoencaAutoimune = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDoencaAutoimuneActionPerformed

    private void jbObsAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsAlergiaActionPerformed
        obsAlergias = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsAlergiaActionPerformed

    private void jbObsFumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsFumoActionPerformed
        obsFumo = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsFumoActionPerformed

    private void jbObsAlcoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsAlcoolActionPerformed
        obsAlcool = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsAlcoolActionPerformed

    private void jbObsParacetamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsParacetamolActionPerformed
        obsParacetamol = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsParacetamolActionPerformed

    private void jbRemedioControladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemedioControladoActionPerformed
        tipoRemedios = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbRemedioControladoActionPerformed

    private void jbCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancerActionPerformed
        tipoCancer = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbCancerActionPerformed

    private void jbDengueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDengueActionPerformed
        tipoDengue = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDengueActionPerformed

    private void jbHepatiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHepatiteActionPerformed
        tipoHepatite = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbHepatiteActionPerformed

    private void jbHipertensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHipertensaoActionPerformed
        tipoHipertensao = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbHipertensaoActionPerformed

    private void jbDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDiabetesActionPerformed
        tipoDiabetes = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDiabetesActionPerformed

    private void jbParacetamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbParacetamolActionPerformed
        tipoParacetamol = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbParacetamolActionPerformed

    private void jbAlcoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlcoolActionPerformed
        tipoAlcool = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbAlcoolActionPerformed

    private void jbFumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFumoActionPerformed
        tipoFumo = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbFumoActionPerformed

    private void jbAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlergiaActionPerformed
        tipoAlergias = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbAlergiaActionPerformed

    private void jbHerniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHerniaActionPerformed
        tipoHernia = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbHerniaActionPerformed

    private void jbDoencaEstomagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoencaEstomagoActionPerformed
        tipoDoencaEstomago = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDoencaEstomagoActionPerformed

    private void jbDoencaOssosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoencaOssosActionPerformed
        tipoDoencaOssos = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDoencaOssosActionPerformed

    private void jbDoencaAutoimuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoencaAutoimuneActionPerformed
        tipoDoencaAutoimune = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDoencaAutoimuneActionPerformed

    private void jbFeridatumorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFeridatumorActionPerformed
        tipoFeridas = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbFeridatumorActionPerformed

    private void jbFinalizarAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarAtendimentoActionPerformed

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
        obterDadosTratamentoMedicamento();
    }//GEN-LAST:event_jbFinalizarAtendimentoActionPerformed

    private void jbTratamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTratamentosActionPerformed
        if (!this.jbTratamentos.isSelected()) {
            rSPanelsSlider1.slidPanel(20, pnl3, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_jbTratamentosActionPerformed

    private void jbQuadroPsicofiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuadroPsicofiscoActionPerformed
        if (!this.jbQuadroPsicofisco.isSelected()) {
            rSPanelsSlider1.slidPanel(20, pnl2, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_jbQuadroPsicofiscoActionPerformed

    private void jbInfoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInfoPacienteActionPerformed
        if (!this.jbInfoPaciente.isSelected()) {
            rSPanelsSlider1.slidPanel(20, pnl1, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_jbInfoPacienteActionPerformed

    private void jcTratamentoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTratamentoSimActionPerformed
        if (this.jcTratamentoSim.isSelected()) {
            tratamentoFecma = "Sim";
            jcTratamentoNao.setSelected(false);
        } else {
            jcTratamentoNao.setSelected(true);
        }
   }//GEN-LAST:event_jcTratamentoSimActionPerformed

    private void jcTratamentoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTratamentoNaoActionPerformed
        if (this.jcTratamentoNao.isSelected()) {
            tratamentoFecma = "Não";
            jcTratamentoSim.setEnabled(false);
        }
    }//GEN-LAST:event_jcTratamentoNaoActionPerformed

    private void jcConhecimentoEspiritaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcConhecimentoEspiritaSimActionPerformed
        if (this.jcConhecimentoEspiritaSim.isSelected()) {
            conhecimentoPrevio = "Sim";
            jcConhecimentoEspiritaNao.setEnabled(false);
            jtfFonte.setEnabled(true);
        }
    }//GEN-LAST:event_jcConhecimentoEspiritaSimActionPerformed

    private void jcConhecimentoEspiritaNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcConhecimentoEspiritaNaoActionPerformed
        if (this.jcConhecimentoEspiritaNao.isSelected()) {
            conhecimentoPrevio = "Não";
            jcConhecimentoEspiritaSim.setEnabled(false);
            jtfFonte.setEnabled(false);
        }
    }//GEN-LAST:event_jcConhecimentoEspiritaNaoActionPerformed

    private void jcDesobsessaoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDesobsessaoSimActionPerformed
        if (jcDesobsessaoSim.isSelected()) {
            jcDesobsessaoNao.setSelected(false);
            modoDesobsessao = jcDesobsessaoSim.getText();
        }
    }//GEN-LAST:event_jcDesobsessaoSimActionPerformed

    private void jcDesobsessaoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDesobsessaoNaoActionPerformed
        if (jcDesobsessaoNao.isSelected()) {
            jcDesobsessaoSim.setSelected(false);
            modoDesobsessao = jcDesobsessaoNao.getText();

        }
    }//GEN-LAST:event_jcDesobsessaoNaoActionPerformed

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
        jlData.setText(getDateUtil.getDateTime());
    }

    /**
     * metodo pra limpar as seleções realizadas no quadro psicofisico os valores
     * voltam a ser 'SELECIONE'
     */
    private void limparSelecao() {
        jcbQuadroAngustia.setSelectedItem("SELECIONE");
        jcbQuadroAnsiedade.setSelectedItem("SELECIONE");
        jcbQuadroCalafrios.setSelectedItem("SELECIONE");
        jcbQuadroCansaco.setSelectedItem("SELECIONE");
        jcbQuadroDesanimo.setSelectedItem("SELECIONE");
        jcbQuadroDorCabeca.setSelectedItem("SELECIONE");
        jcbQuadroDorColuna.setSelectedItem("SELECIONE");
        jcbQuadroDorPerna.setSelectedItem("SELECIONE");
        jcbQuadroDormencia.setSelectedItem("SELECIONE");
        jcbQuadroFaltaApetite.setSelectedItem("SELECIONE");
        jcbQuadroFaltaConcetracao.setSelectedItem("SELECIONE");
        jcbQuadroIdeiasSuicidas.setSelectedItem("SELECIONE");
        jcbQuadroInsonia.setSelectedItem("SELECIONE");
        jcbQuadroIrritacao.setSelectedItem("SELECIONE");
        jcbQuadroMedo.setSelectedItem("SELECIONE");
        jcbQuadroOuveVozes.setSelectedItem("SELECIONE");
        jcbQuadroPesadelos.setSelectedItem("SELECIONE");
        jcbQuadroPresencaEspiritos.setSelectedItem("SELECIONE");
        jcbQuadroSonolencia.setSelectedItem("SELECIONE");
        jcbQuadroSudorese.setSelectedItem("SELECIONE");
        jcbQuadroTaquicardia.setSelectedItem("SELECIONE");
        jcbQuadroTonturas.setSelectedItem("SELECIONE");
        jcbQuadroVultos.setSelectedItem("SELECIONE");
        jcbQuadroZumbidos.setSelectedItem("SELECIONE");
    }

    private void obterDadosTratamentoMedicamento() {
        medicamentoTratamentoModel.setDataNascimento(jtfDataNascimento.getText());
        medicamentoTratamentoModel.setEmail(jtfEmail.getText());
        medicamentoTratamentoModel.setFonteConhecimentoEspirita(jtfFonte.getText());
        medicamentoTratamentoModel.setIdade(Integer.parseInt(jlIdade.getText()));
        medicamentoTratamentoModel.setNome(jtfNome.getText().toUpperCase());
        medicamentoTratamentoModel.setNumCasa(Integer.parseInt(jtfNumImovel.getText()));
        medicamentoTratamentoModel.setModoDesobsessao(modoDesobsessao);
        medicamentoTratamentoModel.setObjetivoTratamento(jtfObjetivoTratamento.getText());
        medicamentoTratamentoModel.setPacienteReincidente(tratamentoFecma);
        medicamentoTratamentoModel.setRua(jtfRua.getText());
        medicamentoTratamentoModel.setSetor(setor);
        medicamentoTratamentoModel.setTelefone(jtfTelefone.getText());
        medicamentoTratamentoModel.setStatusTratamento("EM TRATAMENTO");
        medicamentoTratamentoModel.setBairro(jtfBairro.getText());
        medicamentoTratamentoModel.setCidade(jcbCidade.getSelectedItem().toString());
        medicamentoTratamentoModel.setConhecimentoEspiritaPrevio(conhecimentoPrevio);

        medicamentoTratamentoModel.setAlcool(jcbAlcool.getSelectedItem().toString());
        medicamentoTratamentoModel.setAlcoolObs(obsDengue);
        medicamentoTratamentoModel.setAlcoolPeriodo(jtfPeriodoAlcool.getText());
        medicamentoTratamentoModel.setAlcoolTipo(tipoAlcool);
        medicamentoTratamentoModel.setDengue(jcbDengue.getSelectedItem().toString());
        medicamentoTratamentoModel.setDengueObs(obsDengue);
        medicamentoTratamentoModel.setDenguePeriodo(jtfPeriodoDengue.getText());
        medicamentoTratamentoModel.setDengueTipo(tipoDengue);
        medicamentoTratamentoModel.setDiabetes(jcbDiabetes.getSelectedItem().toString());
        medicamentoTratamentoModel.setDiabetesObs(obsDengue);
        medicamentoTratamentoModel.setDiabetesPeriodo(jtfPeriodoDiabetes.getText());
        medicamentoTratamentoModel.setDiabetesTipo(tipoDiabetes);
        medicamentoTratamentoModel.setFumo(jcbFumo.getSelectedItem().toString());
        medicamentoTratamentoModel.setFumoObs(obsFumo);
        medicamentoTratamentoModel.setFumoPeriodo(jtfPeriodoFumo.getText());
        medicamentoTratamentoModel.setFumoTipo(tipoFumo);
        medicamentoTratamentoModel.setHepatite(jcbHepatite.getSelectedItem().toString());
        medicamentoTratamentoModel.setHepatiteObs(obsHepatite);
        medicamentoTratamentoModel.setHepatitePeriodo(jtfPeriodoHepatite.getText());
        medicamentoTratamentoModel.setHipertensao(jcbHipertensao.getSelectedItem().toString());
        medicamentoTratamentoModel.setHipertensaoObs(obsHipertensao);
        medicamentoTratamentoModel.setHipertensaoPeriodo(jtfPeriodoHipertensao.getText());
        medicamentoTratamentoModel.setHipertensaoTipo(tipoHipertensao);
        medicamentoTratamentoModel.setRemedio(jcbRemedioControlado.getSelectedItem().toString());
        medicamentoTratamentoModel.setRemedioObs(obsRemedios);
        medicamentoTratamentoModel.setRemedioPeriodo(jtfPeriodoRemedio.getText());
        medicamentoTratamentoModel.setRemedioTipo(tipoRemedios);
        medicamentoTratamentoModel.setUsoParacetamol(jcbParacetamol.getSelectedItem().toString());
        medicamentoTratamentoModel.setUsoParacetamolObs(obsParacetamol);
        medicamentoTratamentoModel.setUsoParacetamolPeriodo(jtfPeriodoParacetamol.getText());
        medicamentoTratamentoModel.setUsoParacetamolTipo(tipoParacetamol);
        medicamentoTratamentoModel.setAlergias(jcbAlergia.getSelectedItem().toString());
        medicamentoTratamentoModel.setAlergiasObs(obsAlergias);
        medicamentoTratamentoModel.setAlergiasPeriodo(jtfPeriodoAlergia.getText());
        medicamentoTratamentoModel.setAlergiasTipo(tipoAlergias);
        medicamentoTratamentoModel.setCancer(jcbCancer.getSelectedItem().toString());
        medicamentoTratamentoModel.setCancerObs(obsCancer);
        medicamentoTratamentoModel.setCancerPeriodo(jtfPeriodoCancer.getText());
        medicamentoTratamentoModel.setCancerTipo(tipoCancer);
        medicamentoTratamentoModel.setDoencaEstomago(jcbDoencaEstomago.getSelectedItem().toString());
        medicamentoTratamentoModel.setDoencaEstomagoObs(obsDoencaEstomago);
        medicamentoTratamentoModel.setDoencaEstomagoPeriodo(jtfPeriodoDoencaEstomago.getText());
        medicamentoTratamentoModel.setDoencaEstomagoTipo(tipoDoencaEstomago);
        medicamentoTratamentoModel.setDoencaOssos(jcbDoencaOssos.getSelectedItem().toString());
        medicamentoTratamentoModel.setDoencaOssosObs(obsDoencaOssos);
        medicamentoTratamentoModel.setDoencaOssosPeriodo(jtfPeriodoDoencaOssos.getText());
        medicamentoTratamentoModel.setDoencaOssosTipo(tipoDoencaOssos);
        medicamentoTratamentoModel.setDoencaPulmoes(jcbDoencaPulmoes.getSelectedItem().toString());
        medicamentoTratamentoModel.setDoencaPulmoesObs(obsDoencaPulmoes);
        medicamentoTratamentoModel.setDoencaPulmoesPeriodo(jtfPeriodoDoencaPulmoes.getText());
        medicamentoTratamentoModel.setDoencaPulmoesTipo(tipoDoencaPulmoes);
        medicamentoTratamentoModel.setFeridasTumores(jcbFeridas.getSelectedItem().toString());
        medicamentoTratamentoModel.setFeridasTumoresObs(obsFeridas);
        medicamentoTratamentoModel.setFeridasTumoresPeriodo(jtfPeriodoFeridas.getText());
        medicamentoTratamentoModel.setFeridasTumoresTipo(tipoFeridas);
        medicamentoTratamentoModel.setHernia(jcbHernia.getSelectedItem().toString());
        medicamentoTratamentoModel.setHerniaObs(obsHernia);
        medicamentoTratamentoModel.setHerniaPeriodo(jtfPeriodoHernia.getText());
        medicamentoTratamentoModel.setHerniaTipo(tipoHernia);

        if (medicamentoTratamentoController.salvarMedicamentoTratamentoController(medicamentoTratamentoModel) > 0) {
            JOptionPane.showMessageDialog(this, "Infomações salvas com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar informações", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        jtfBairro.setText("");
        jtfEmail.setText("");
        jtfFonte.setText("");
        jtfNome.setText("");
        jtfNumImovel.setText("");
        jtfObjetivoTratamento.setText("");
        jtfRua.setText("");
        jtfTelefone.setText("");
        jcConhecimentoEspiritaNao.setSelected(false);
        jcConhecimentoEspiritaSim.setSelected(false);
        jcDesobsessaoNao.setSelected(false);
        jcDesobsessaoSim.setSelected(false);
        jcTratamentoNao.setSelected(false);
        jcTratamentoSim.setSelected(false);
        limparSelecao();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFumo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbAlcool;
    private javax.swing.JButton jbAlergia;
    private javax.swing.JButton jbAvancarPnl1;
    private javax.swing.JButton jbAvancarPnl3;
    private javax.swing.JButton jbAvancarPsicofisico;
    private javax.swing.JButton jbCancer;
    private javax.swing.JButton jbDengue;
    private javax.swing.JButton jbDiabetes;
    private javax.swing.JButton jbDoencaAutoimune;
    private javax.swing.JButton jbDoencaEstomago;
    private javax.swing.JButton jbDoencaOssos;
    private javax.swing.JButton jbDoencaPulmoes;
    private javax.swing.JButton jbFeridatumor;
    private javax.swing.JButton jbFinalizarAtendimento;
    private javax.swing.JButton jbFumo;
    private javax.swing.JButton jbHepatite;
    private javax.swing.JButton jbHernia;
    private javax.swing.JButton jbHipertensao;
    private javax.swing.JButton jbHome;
    private javax.swing.JButton jbInfoPaciente;
    private javax.swing.JButton jbLimparSelecoes;
    private javax.swing.JButton jbObsAlcool;
    private javax.swing.JButton jbObsAlergia;
    private javax.swing.JButton jbObsCancer;
    private javax.swing.JButton jbObsDengue;
    private javax.swing.JButton jbObsDiabetes;
    private javax.swing.JButton jbObsDoencaAutoimune;
    private javax.swing.JButton jbObsDoencaEstomago;
    private javax.swing.JButton jbObsDoencaOssos;
    private javax.swing.JButton jbObsDoencaPulomoes;
    private javax.swing.JButton jbObsFeridas;
    private javax.swing.JButton jbObsFumo;
    private javax.swing.JButton jbObsHepatite;
    private javax.swing.JButton jbObsHernia;
    private javax.swing.JButton jbObsHipertensao;
    private javax.swing.JButton jbObsParacetamol;
    private javax.swing.JButton jbObsRemedio;
    private javax.swing.JButton jbParacetamol;
    private javax.swing.JButton jbQuadroPsicofisco;
    private javax.swing.JButton jbRemedioControlado;
    private javax.swing.JButton jbTratamentos;
    private javax.swing.JCheckBox jcConhecimentoEspiritaNao;
    private javax.swing.JCheckBox jcConhecimentoEspiritaSim;
    private javax.swing.JCheckBox jcDesobsessaoNao;
    private javax.swing.JCheckBox jcDesobsessaoSim;
    private javax.swing.JCheckBox jcTratamentoNao;
    private javax.swing.JCheckBox jcTratamentoSim;
    private javax.swing.JComboBox<String> jcbAlcool;
    private javax.swing.JComboBox<String> jcbAlergia;
    private javax.swing.JComboBox<String> jcbCancer;
    private javax.swing.JComboBox<String> jcbCidade;
    private javax.swing.JComboBox<String> jcbDengue;
    private javax.swing.JComboBox<String> jcbDiabetes;
    private javax.swing.JComboBox<String> jcbDoencaAutoimune;
    private javax.swing.JComboBox<String> jcbDoencaEstomago;
    private javax.swing.JComboBox<String> jcbDoencaOssos;
    private javax.swing.JComboBox<String> jcbDoencaPulmoes;
    private javax.swing.JComboBox<String> jcbFeridas;
    private javax.swing.JComboBox<String> jcbFumo;
    private javax.swing.JComboBox<String> jcbHepatite;
    private javax.swing.JComboBox<String> jcbHernia;
    private javax.swing.JComboBox<String> jcbHipertensao;
    private javax.swing.JComboBox<String> jcbParacetamol;
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
    private javax.swing.JComboBox<String> jcbRemedioControlado;
    private javax.swing.JLabel jlAlcool;
    private javax.swing.JLabel jlAlergia;
    private javax.swing.JLabel jlAtendente;
    private javax.swing.JLabel jlCancer;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlDoencaAutoimune;
    private javax.swing.JLabel jlDoencaEstomago;
    private javax.swing.JLabel jlDoencaOssos;
    private javax.swing.JLabel jlFeridaTumor;
    private javax.swing.JLabel jlHernia;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTextField jtfBairro;
    private datechooser.beans.DateChooserCombo jtfDataNascimento;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfFonte;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumImovel;
    private javax.swing.JTextArea jtfObjetivoTratamento;
    private datechooser.beans.DateChooserCombo jtfPeriodoAlcool;
    private datechooser.beans.DateChooserCombo jtfPeriodoAlergia;
    private datechooser.beans.DateChooserCombo jtfPeriodoCancer;
    private datechooser.beans.DateChooserCombo jtfPeriodoDengue;
    private datechooser.beans.DateChooserCombo jtfPeriodoDiabetes;
    private datechooser.beans.DateChooserCombo jtfPeriodoDoencaAutoimune;
    private datechooser.beans.DateChooserCombo jtfPeriodoDoencaEstomago;
    private datechooser.beans.DateChooserCombo jtfPeriodoDoencaOssos;
    private datechooser.beans.DateChooserCombo jtfPeriodoDoencaPulmoes;
    private datechooser.beans.DateChooserCombo jtfPeriodoFeridas;
    private datechooser.beans.DateChooserCombo jtfPeriodoFumo;
    private datechooser.beans.DateChooserCombo jtfPeriodoHepatite;
    private datechooser.beans.DateChooserCombo jtfPeriodoHernia;
    private datechooser.beans.DateChooserCombo jtfPeriodoHipertensao;
    private datechooser.beans.DateChooserCombo jtfPeriodoParacetamol;
    private datechooser.beans.DateChooserCombo jtfPeriodoRemedio;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JFormattedTextField jtfTelefone;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    // End of variables declaration//GEN-END:variables
}
