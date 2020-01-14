package br.com.sisgete.view;

import br.com.sisgete.controller.AtendenteFraternoController;
import br.com.sisgete.controller.PacienteController;
import br.com.sisgete.controller.QuadroPsicofisicoController;
import br.com.sisgete.model.AtendenteFraternoModel;
import br.com.sisgete.model.PacienteModel;
import br.com.sisgete.model.QuadroPsicofisicoModel;
import br.com.sisgete.model.SessaoModel;
import br.com.sisgete.util.GetDateUtil;
import br.com.sisgete.util.MedicamentoUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class CadastroFichaView extends javax.swing.JInternalFrame {

    GetDateUtil getDateUtil = new GetDateUtil();
    PacienteController pacienteController = new PacienteController();
    PacienteModel pacienteModel = new PacienteModel();
    QuadroPsicofisicoController quadroPsicofisicoController = new QuadroPsicofisicoController();
    QuadroPsicofisicoModel quadroPsicofisicoModel = new QuadroPsicofisicoModel();
    AtendenteFraternoModel atendenteFraternoModel = new AtendenteFraternoModel();
    AtendenteFraternoController atendenteFraternoController = new AtendenteFraternoController();

    /**
     * Creates new form CadastroFicha
     */
    public CadastroFichaView() {
        initComponents();
        dadosIniciais();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
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
        jbLimparSelecoes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jpTratamentos = new javax.swing.JPanel();
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
        jButton7 = new javax.swing.JButton();
        jpOutrasInfo = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jcDesobsessaoCentro = new javax.swing.JCheckBox();
        jcDesobsessaoDistancia = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfObjetivoTratamento = new javax.swing.JTextArea();
        jcTratamentoSim = new javax.swing.JCheckBox();
        jcTratamentoNao = new javax.swing.JCheckBox();
        jcConhecimentoEspiritaSim = new javax.swing.JCheckBox();
        jcConhecimentoEspiritaNao = new javax.swing.JCheckBox();
        jtfFonte = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
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

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Atendimento Fraterno");

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
            .addGap(0, 194, Short.MAX_VALUE)
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

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("As informações deste cadastro");

        jLabel61.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("são iguais as fichas já em uso.");

        jLabel62.setFont(new java.awt.Font("DejaVu Sans", 2, 10)); // NOI18N
        jLabel62.setText("developed by: NSOFT");

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
                            .addGroup(jpBarraLateralLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabel12)
                            .addComponent(jLabel61)
                            .addComponent(jLabel59)
                            .addGroup(jpBarraLateralLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel60))
                            .addGroup(jpBarraLateralLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel58)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBarraLateralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel62)))
                .addContainerGap())
        );
        jpBarraLateralLayout.setVerticalGroup(
            jpBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarraLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel61)
                .addGap(96, 96, 96)
                .addComponent(jLabel62)
                .addContainerGap())
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
jtfDataNascimento.setFormat(2);
try {
    jtfDataNascimento.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(1990, 0, 1),
        new java.util.GregorianCalendar(1990, 0, 1))));
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
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel10))
                    .addGap(69, 69, 69)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfRua)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(jcbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jtfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlIdade)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jtfNome))))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
            .addGap(30, 30, 30)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jtfDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(20, 20, 20)
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
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14)
                .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(33, Short.MAX_VALUE))
    );

    jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
    jLabel11.setText("FRATERNIDADE ESPÍRITA CRISTINA DE MENEZES DE ALBUQUERQUE");

    jLabel54.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
    jLabel54.setText("ATENDIMENTO FRATERNO");

    jLabel63.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel63.setText("TRATAMENTO ESPIRITUAL");

    jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-avançar-24.png"))); // NOI18N
    jButton1.setText("Avançar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jpInfoPacienteLayout = new javax.swing.GroupLayout(jpInfoPaciente);
    jpInfoPaciente.setLayout(jpInfoPacienteLayout);
    jpInfoPacienteLayout.setHorizontalGroup(
        jpInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpInfoPacienteLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jpInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoPacienteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
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
                    .addGroup(jpInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoPacienteLayout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(12, 12, 12)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))))
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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
            .addGroup(jpInfoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoPacienteLayout.createSequentialGroup()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(422, 422, 422))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoPacienteLayout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1)
                    .addGap(15, 15, 15))))
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
                    .addComponent(jLabel22)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbQuadroVultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jcbQuadroMedo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel24)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbQuadroZumbidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel30)
                        .addComponent(jLabel27))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbQuadroAngustia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbQuadroPesadelos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jlabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbQuadroDesanimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                    .addComponent(jcbQuadroOuveVozes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel23)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbQuadroCalafrios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbQuadroInsonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel33)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbQuadroTonturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(jLabel36)
                            .addGap(162, 162, 162))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
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
                    .addComponent(jcbQuadroDormencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbQuadroSudorese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jcbQuadroCansaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel32))
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

    jbLimparSelecoes.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbLimparSelecoes.setForeground(new java.awt.Color(0, 112, 192));
    jbLimparSelecoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-limpar-formatação-24.png"))); // NOI18N
    jbLimparSelecoes.setText("Limpar Seleções");
    jbLimparSelecoes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbLimparSelecoesActionPerformed(evt);
        }
    });

    jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel7.setText("Selecione as informações do quadro psicofísico do paciente");

    jLabel44.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel44.setText("Caso deseje utilize o botão para desfazer as seleções");

    javax.swing.GroupLayout jpQuadroPsicofisicoLayout = new javax.swing.GroupLayout(jpQuadroPsicofisico);
    jpQuadroPsicofisico.setLayout(jpQuadroPsicofisicoLayout);
    jpQuadroPsicofisicoLayout.setHorizontalGroup(
        jpQuadroPsicofisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpQuadroPsicofisicoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jbLimparSelecoes)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2)
            .addGap(31, 31, 31))
        .addGroup(jpQuadroPsicofisicoLayout.createSequentialGroup()
            .addGroup(jpQuadroPsicofisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpQuadroPsicofisicoLayout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addGroup(jpQuadroPsicofisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpQuadroPsicofisicoLayout.createSequentialGroup()
                            .addComponent(jLabel44)
                            .addGap(19, 19, 19))))
                .addGroup(jpQuadroPsicofisicoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(21, Short.MAX_VALUE))
    );
    jpQuadroPsicofisicoLayout.setVerticalGroup(
        jpQuadroPsicofisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpQuadroPsicofisicoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel44)
            .addGap(18, 18, 18)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
            .addGroup(jpQuadroPsicofisicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton2)
                .addComponent(jbLimparSelecoes))
            .addGap(14, 14, 14))
    );

    jpPanel3.add(jpQuadroPsicofisico, "card3");

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

    jLabel46.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
    jLabel46.setForeground(new java.awt.Color(0, 112, 192));
    jLabel46.setText("TRATAMENTOS/MEDICAMENTOS");

    jLabel55.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
    jLabel55.setForeground(new java.awt.Color(0, 112, 192));
    jLabel55.setText("TIPO");

    jLabel56.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
    jLabel56.setForeground(new java.awt.Color(0, 112, 192));
    jLabel56.setText("DESDE QUANDO?");

    jLabel57.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
    jLabel57.setForeground(new java.awt.Color(0, 112, 192));
    jLabel57.setText("OBSERVAÇÕES");

    jtfPeriodoDoencaPulmoes.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoDoencaPulmoes.setShowOneMonth(true);

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

    jtfPeriodoRemedio.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoRemedio.setShowOneMonth(true);

jtfPeriodoDengue.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoDengue.setShowOneMonth(true);

jtfPeriodoDiabetes.setShowOneMonth(true);

jtfPeriodoHipertensao.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
    jtfPeriodoHipertensao.setShowOneMonth(true);

    jtfPeriodoHepatite.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoHepatite.setShowOneMonth(true);

jtfPeriodoFumo.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoFumo.setShowOneMonth(true);

jtfPeriodoAlcool.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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

    jtfPeriodoParacetamol.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoParacetamol.setShowOneMonth(true);

jtfPeriodoDoencaEstomago.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoDoencaEstomago.setShowOneMonth(true);

jtfPeriodoHernia.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
    jtfPeriodoHernia.setShowOneMonth(true);

    jtfPeriodoAlergia.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoAlergia.setShowOneMonth(true);

jtfPeriodoFeridas.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoFeridas.setShowOneMonth(true);

jtfPeriodoDoencaAutoimune.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
    jtfPeriodoDoencaAutoimune.setShowOneMonth(true);

    jtfPeriodoDoencaOssos.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoDoencaOssos.setShowOneMonth(true);

jtfPeriodoCancer.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
jtfPeriodoCancer.setShowOneMonth(true);

javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
jPanel4.setLayout(jPanel4Layout);
jPanel4Layout.setHorizontalGroup(
jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel28)
                    .addGap(16, 16, 16)
                    .addComponent(jcbDoencaPulmoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jlFeridaTumor)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbFeridas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addComponent(jlDoencaOssos)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbDoencaOssos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addComponent(jlDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jcbDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCancer))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbDoencaAutoimune, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbCancer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel46)
            .addGap(19, 19, 19)))
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(jbHipertensao)
                    .addComponent(jbDiabetes)
                    .addComponent(jbParacetamol)
                    .addComponent(jbAlcool)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel55))
            .addComponent(jbDoencaPulmoes, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jbRemedioControlado, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jbDengue, javax.swing.GroupLayout.Alignment.TRAILING))
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(jbHepatite)))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jtfPeriodoRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGap(10, 10, 10)
                    .addComponent(jLabel56)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbObsRemedio)
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
                        .addComponent(jbObsParacetamol)
                        .addComponent(jbObsDoencaPulomoes))
                    .addGap(36, 36, 36))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel57)
                    .addGap(16, 16, 16))))
        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
            .addComponent(jtfPeriodoDoencaPulmoes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18))))
);
jPanel4Layout.setVerticalGroup(
    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel46)
                .addComponent(jLabel57)
                .addComponent(jLabel55))
            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(jbObsDoencaPulomoes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jcbDoencaPulmoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jbDoencaPulmoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jtfPeriodoDoencaPulmoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbDengue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPeriodoDengue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
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
                                .addComponent(jtfPeriodoParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPeriodoAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPeriodoFumo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jbParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbFumo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(jtfPeriodoDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jbObsAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbObsHernia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbObsDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbDengue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbHepatite, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
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
                                    .addComponent(jcbDoencaEstomago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbDoencaOssos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlDoencaOssos)
                                .addComponent(jcbDoencaOssos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlDoencaAutoimune)
                                .addComponent(jcbDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbDoencaAutoimune, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
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
                        .addComponent(jtfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jbObsRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbObsDengue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbObsHepatite, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbObsHipertensao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbObsDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbObsParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbObsAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbObsFumo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jbObsDoencaOssos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbObsDoencaAutoimune, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbObsFeridas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbObsCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
    );

    jButton7.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-avançar-24.png"))); // NOI18N
    jButton7.setText("Avançar");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jpTratamentosLayout = new javax.swing.GroupLayout(jpTratamentos);
    jpTratamentos.setLayout(jpTratamentosLayout);
    jpTratamentosLayout.setHorizontalGroup(
        jpTratamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpTratamentosLayout.createSequentialGroup()
            .addGroup(jpTratamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jButton7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jpTratamentosLayout.setVerticalGroup(
        jpTratamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpTratamentosLayout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7)
            .addContainerGap())
    );

    jpPanel3.add(jpTratamentos, "card4");

    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outras Informações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 1, 12))); // NOI18N

    jLabel45.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel45.setText("OBJETIVO QUE PRETENDE DO TRATAMENTO ESPIRITUAL:");

    jLabel47.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel47.setText("Já realizou tratamento no FECMA?:");

    jLabel48.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel48.setText("Tem conhecimento espírita?");

    jLabel49.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel49.setText("Qual a fonte:");

    jLabel50.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel50.setText("Data do atendimento:");

    jLabel51.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel51.setText("Atendente:");

    jLabel52.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel52.setText("NO CASO DE TRATAEMENTO DE DESOBSSÃO:");

    jcDesobsessaoCentro.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcDesobsessaoCentro.setText("NO CENTRO");
    jcDesobsessaoCentro.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcDesobsessaoCentroActionPerformed(evt);
        }
    });

    jcDesobsessaoDistancia.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcDesobsessaoDistancia.setText("À DISTÂNCIA");
    jcDesobsessaoDistancia.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcDesobsessaoDistanciaActionPerformed(evt);
        }
    });

    jtfObjetivoTratamento.setColumns(20);
    jtfObjetivoTratamento.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jtfObjetivoTratamento.setForeground(new java.awt.Color(0, 112, 192));
    jtfObjetivoTratamento.setRows(5);
    jScrollPane1.setViewportView(jtfObjetivoTratamento);

    jcTratamentoSim.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcTratamentoSim.setText("SIM");
    jcTratamentoSim.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcTratamentoSimActionPerformed(evt);
        }
    });

    jcTratamentoNao.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcTratamentoNao.setText("NÃO");
    jcTratamentoNao.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcTratamentoNaoActionPerformed(evt);
        }
    });

    jcConhecimentoEspiritaSim.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcConhecimentoEspiritaSim.setText("SIM");
    jcConhecimentoEspiritaSim.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcConhecimentoEspiritaSimActionPerformed(evt);
        }
    });

    jcConhecimentoEspiritaNao.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jcConhecimentoEspiritaNao.setText("NÃO");
    jcConhecimentoEspiritaNao.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcConhecimentoEspiritaNaoActionPerformed(evt);
        }
    });

    jtfFonte.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
    jtfFonte.setForeground(new java.awt.Color(0, 112, 192));
    jtfFonte.setEnabled(false);

    jLabel53.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jLabel53.setText("Recife,");

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
                        .addComponent(jLabel45)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel47)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcTratamentoSim)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcTratamentoNao)
                    .addGap(117, 117, 117))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel50)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlData))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel51)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlAtendente)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jLabel52)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jcDesobsessaoCentro)
                    .addGap(56, 56, 56)
                    .addComponent(jcDesobsessaoDistancia)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jLabel48)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jcConhecimentoEspiritaSim)
                    .addGap(12, 12, 12)
                    .addComponent(jcConhecimentoEspiritaNao)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel49)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jtfFonte)
                    .addContainerGap())))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel45)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(13, 13, 13)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel47)
                .addComponent(jcTratamentoNao)
                .addComponent(jcTratamentoSim))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel48)
                .addComponent(jcConhecimentoEspiritaSim)
                .addComponent(jcConhecimentoEspiritaNao)
                .addComponent(jLabel49)
                .addComponent(jtfFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel50)
                .addComponent(jLabel53)
                .addComponent(jlData))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel51)
                .addComponent(jlAtendente))
            .addGap(18, 18, 18)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel52)
                .addComponent(jcDesobsessaoCentro)
                .addComponent(jcDesobsessaoDistancia))
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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbInfoPaciente)
                .addComponent(jbQuadroPsicofisco)
                .addComponent(jbTratamentos)))
    );

    jbFinalizarAtendimento.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
    jbFinalizarAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisgete/images/icons/icons8-salvar-como-24.png"))); // NOI18N
    jbFinalizarAtendimento.setText("Finalizar Atendimento Fraterno");
    jbFinalizarAtendimento.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbFinalizarAtendimentoActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jpOutrasInfoLayout = new javax.swing.GroupLayout(jpOutrasInfo);
    jpOutrasInfo.setLayout(jpOutrasInfoLayout);
    jpOutrasInfoLayout.setHorizontalGroup(
        jpOutrasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpOutrasInfoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jpOutrasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOutrasInfoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jbFinalizarAtendimento)
                    .addGap(9, 9, 9)))
            .addContainerGap())
    );
    jpOutrasInfoLayout.setVerticalGroup(
        jpOutrasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpOutrasInfoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
            .addComponent(jbFinalizarAtendimento)
            .addGap(17, 17, 17))
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
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jbLimparSelecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparSelecoesActionPerformed
        limparSelecao();
    }//GEN-LAST:event_jbLimparSelecoesActionPerformed

    private void jbObsDoencaPulomoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDoencaPulomoesActionPerformed
        MedicamentoUtil.obsDoencaPulmoes = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDoencaPulomoesActionPerformed

    private void jbDoencaPulmoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoencaPulmoesActionPerformed
        MedicamentoUtil.obsDoencaPulmoes = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDoencaPulmoesActionPerformed

    private void jbCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancerActionPerformed
        MedicamentoUtil.tipoCancer = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbCancerActionPerformed

    private void jbFeridatumorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFeridatumorActionPerformed
        MedicamentoUtil.tipoFeridas = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbFeridatumorActionPerformed

    private void jbDoencaOssosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoencaOssosActionPerformed
        MedicamentoUtil.tipoDoencaOssos = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDoencaOssosActionPerformed

    private void jbDoencaAutoimuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoencaAutoimuneActionPerformed
        MedicamentoUtil.tipoDoencaAutoimune = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDoencaAutoimuneActionPerformed

    private void jbAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlergiaActionPerformed
        MedicamentoUtil.tipoAlergias = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbAlergiaActionPerformed

    private void jbFumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFumoActionPerformed
        MedicamentoUtil.tipoFumo = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbFumoActionPerformed

    private void jbHerniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHerniaActionPerformed
        MedicamentoUtil.tipoHernia = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbHerniaActionPerformed

    private void jbDoencaEstomagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoencaEstomagoActionPerformed
        MedicamentoUtil.tipoDoencaEstomago = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDoencaEstomagoActionPerformed

    private void jbRemedioControladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemedioControladoActionPerformed
        MedicamentoUtil.tipoRemedios = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbRemedioControladoActionPerformed

    private void jbHepatiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHepatiteActionPerformed
        MedicamentoUtil.tipoHepatite = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbHepatiteActionPerformed

    private void jbDengueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDengueActionPerformed
        MedicamentoUtil.tipoDengue = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDengueActionPerformed

    private void jbDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDiabetesActionPerformed
        MedicamentoUtil.tipoDiabetes = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbDiabetesActionPerformed

    private void jbHipertensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHipertensaoActionPerformed
        MedicamentoUtil.tipoHipertensao = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbHipertensaoActionPerformed

    private void jbAlcoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlcoolActionPerformed
        MedicamentoUtil.tipoAlcool = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbAlcoolActionPerformed

    private void jbParacetamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbParacetamolActionPerformed
        MedicamentoUtil.tipoParacetamol = JOptionPane.showInputDialog(this, "Entre com o tipo:");
    }//GEN-LAST:event_jbParacetamolActionPerformed

    private void jbObsRemedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsRemedioActionPerformed
        MedicamentoUtil.obsRemedios = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsRemedioActionPerformed

    private void jbObsHepatiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsHepatiteActionPerformed
        MedicamentoUtil.obsHepatite = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsHepatiteActionPerformed

    private void jbObsDengueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDengueActionPerformed
        MedicamentoUtil.obsDengue = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDengueActionPerformed

    private void jbObsDoencaEstomagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDoencaEstomagoActionPerformed
        MedicamentoUtil.obsDoencaEstomago = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDoencaEstomagoActionPerformed

    private void jbObsHerniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsHerniaActionPerformed
        MedicamentoUtil.obsHernia = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsHerniaActionPerformed

    private void jbObsDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDiabetesActionPerformed
        MedicamentoUtil.obsDiabetes = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDiabetesActionPerformed

    private void jbObsHipertensaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsHipertensaoActionPerformed
        MedicamentoUtil.obsHipertensao = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsHipertensaoActionPerformed

    private void jbObsFeridasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsFeridasActionPerformed
        MedicamentoUtil.obsFeridas = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsFeridasActionPerformed

    private void jbObsDoencaOssosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDoencaOssosActionPerformed
        MedicamentoUtil.obsDoencaOssos = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDoencaOssosActionPerformed

    private void jbObsCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsCancerActionPerformed
        MedicamentoUtil.obsCancer = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsCancerActionPerformed

    private void jbObsDoencaAutoimuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsDoencaAutoimuneActionPerformed
        MedicamentoUtil.obsDoencaAutoimune = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsDoencaAutoimuneActionPerformed

    private void jbObsAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsAlergiaActionPerformed
        MedicamentoUtil.obsAlergias = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsAlergiaActionPerformed

    private void jbObsFumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsFumoActionPerformed
        MedicamentoUtil.obsFumo = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsFumoActionPerformed

    private void jbObsAlcoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsAlcoolActionPerformed
        MedicamentoUtil.obsAlcool = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsAlcoolActionPerformed

    private void jbObsParacetamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObsParacetamolActionPerformed
        MedicamentoUtil.obsParacetamol = JOptionPane.showInputDialog(this, "Entre com a observação");
    }//GEN-LAST:event_jbObsParacetamolActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.jpTratamentos.setVisible(false);
        this.jpOutrasInfo.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jcDesobsessaoCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDesobsessaoCentroActionPerformed
        if (jcDesobsessaoCentro.isSelected()) {
            jcDesobsessaoDistancia.setEnabled(false);
            MedicamentoUtil.modoDesobsessao = jcDesobsessaoCentro.getText().toUpperCase();
        } else {
            jcDesobsessaoDistancia.setEnabled(true);
        }
    }//GEN-LAST:event_jcDesobsessaoCentroActionPerformed

    private void jcDesobsessaoDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDesobsessaoDistanciaActionPerformed
        if (jcDesobsessaoDistancia.isSelected()) {
            jcDesobsessaoCentro.setEnabled(false);
            MedicamentoUtil.modoDesobsessao = jcDesobsessaoDistancia.getText().toUpperCase();
        } else {
            jcDesobsessaoCentro.setEnabled(true);
        }
    }//GEN-LAST:event_jcDesobsessaoDistanciaActionPerformed

    private void jcTratamentoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTratamentoSimActionPerformed
        if (this.jcTratamentoSim.isSelected()) {
            MedicamentoUtil.tratamentoFecma = "SIM";
            jcTratamentoNao.setEnabled(false);
        } else {
            jcTratamentoNao.setEnabled(true);
        }
    }//GEN-LAST:event_jcTratamentoSimActionPerformed

    private void jcTratamentoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTratamentoNaoActionPerformed
        if (this.jcTratamentoNao.isSelected()) {
            MedicamentoUtil.tratamentoFecma = "NÃO";
            jcTratamentoSim.setEnabled(false);
        } else {
            jcTratamentoSim.setEnabled(true);
        }
    }//GEN-LAST:event_jcTratamentoNaoActionPerformed

    private void jcConhecimentoEspiritaSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcConhecimentoEspiritaSimActionPerformed
        if (this.jcConhecimentoEspiritaSim.isSelected()) {
            MedicamentoUtil.conhecimentoPrevio = "SIM";
            jcConhecimentoEspiritaNao.setEnabled(false);
            jtfFonte.setEnabled(true);
        } else {
            jcConhecimentoEspiritaNao.setEnabled(true);
            jtfFonte.setEnabled(false);
        }
    }//GEN-LAST:event_jcConhecimentoEspiritaSimActionPerformed

    private void jcConhecimentoEspiritaNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcConhecimentoEspiritaNaoActionPerformed
        if (this.jcConhecimentoEspiritaNao.isSelected()) {
            MedicamentoUtil.conhecimentoPrevio = "NÃO";
            jcConhecimentoEspiritaSim.setEnabled(false);
            jtfFonte.setEnabled(false);
        } else {
            jcConhecimentoEspiritaSim.setEnabled(true);
            jtfFonte.setEnabled(true);
        }
    }//GEN-LAST:event_jcConhecimentoEspiritaNaoActionPerformed

    private void jbTratamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTratamentosActionPerformed
        if (!this.jbTratamentos.isSelected()) {
            this.jpTratamentos.setVisible(true);
            this.jpOutrasInfo.setVisible(false);
        }
    }//GEN-LAST:event_jbTratamentosActionPerformed

    private void jbQuadroPsicofiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuadroPsicofiscoActionPerformed
        if (!this.jbQuadroPsicofisco.isSelected()) {
            this.jpQuadroPsicofisico.setVisible(true);
            this.jpOutrasInfo.setVisible(false);
        }
    }//GEN-LAST:event_jbQuadroPsicofiscoActionPerformed

    private void jbInfoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInfoPacienteActionPerformed
        if (!this.jbInfoPaciente.isSelected()) {
            this.jpInfoPaciente.setVisible(true);
            this.jpOutrasInfo.setVisible(false);
        }
    }//GEN-LAST:event_jbInfoPacienteActionPerformed

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
        MedicamentoUtil.setor = String.valueOf(resposta);
        obterDadosTratamentoMedicamento();
    }//GEN-LAST:event_jbFinalizarAtendimentoActionPerformed

    /**
     * metodo para calcular a idade do paciente e automaticamente atribuir na
     * tela
     */
    private void date() {
        jlIdade.setVisible(true);
        jLabel4.setVisible(true);
        String texto;
        texto = jtfDataNascimento.getText();
        int anoAniversario = Integer.parseInt(texto.substring(6, 10));
        int anoAtual = Integer.parseInt(getDateUtil.getYear());
        int idade = anoAtual - anoAniversario;
        jlIdade.setText(String.valueOf(idade));
    }

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
        //dados do paciente
        pacienteModel.setDataNascimento(jtfDataNascimento.getText());
        pacienteModel.setEmail(jtfEmail.getText().toUpperCase());
        pacienteModel.setFonteConhecimentoEspirita(jtfFonte.getText().toUpperCase());
        pacienteModel.setIdade(Integer.parseInt(jlIdade.getText()));
        pacienteModel.setNome(jtfNome.getText().toUpperCase());
        pacienteModel.setNumCasa(Integer.parseInt(jtfNumImovel.getText()));
        pacienteModel.setModoDesobsessao(MedicamentoUtil.modoDesobsessao);
        pacienteModel.setObjetivoTratamento(jtfObjetivoTratamento.getText().toUpperCase());
        pacienteModel.setPacienteReincidente(MedicamentoUtil.tratamentoFecma);
        pacienteModel.setRua(jtfRua.getText().toUpperCase());
        pacienteModel.setSetor(MedicamentoUtil.setor);
        pacienteModel.setTelefone(jtfTelefone.getText());
        pacienteModel.setStatusTratamento("EM TRATAMENTO");
        pacienteModel.setBairro(jtfBairro.getText().toUpperCase());
        pacienteModel.setCidade(jcbCidade.getSelectedItem().toString());
        pacienteModel.setConhecimentoEspiritaPrevio(MedicamentoUtil.conhecimentoPrevio);
        pacienteModel.setAtendente(jlAtendente.getText().toUpperCase());

        //tratamentos/medicamentos
        pacienteModel.setAlcool(jcbAlcool.getSelectedItem().toString());
        pacienteModel.setAlcoolObs(MedicamentoUtil.obsDengue);
        pacienteModel.setAlcoolPeriodo(jtfPeriodoAlcool.getText());
        pacienteModel.setAlcoolTipo(MedicamentoUtil.tipoAlcool);
        pacienteModel.setDengue(jcbDengue.getSelectedItem().toString());
        pacienteModel.setDengueObs(MedicamentoUtil.obsDengue);
        pacienteModel.setDenguePeriodo(jtfPeriodoDengue.getText());
        pacienteModel.setDengueTipo(MedicamentoUtil.tipoDengue);
        pacienteModel.setDiabetes(jcbDiabetes.getSelectedItem().toString());
        pacienteModel.setDiabetesObs(MedicamentoUtil.obsDengue);
        pacienteModel.setDiabetesPeriodo(jtfPeriodoDiabetes.getText());
        pacienteModel.setDiabetesTipo(MedicamentoUtil.tipoDiabetes);
        pacienteModel.setFumo(jcbFumo.getSelectedItem().toString());
        pacienteModel.setFumoObs(MedicamentoUtil.obsFumo);
        pacienteModel.setFumoPeriodo(jtfPeriodoFumo.getText());
        pacienteModel.setFumoTipo(MedicamentoUtil.tipoFumo);
        pacienteModel.setHepatite(jcbHepatite.getSelectedItem().toString());
        pacienteModel.setHepatiteObs(MedicamentoUtil.obsHepatite);
        pacienteModel.setHepatitePeriodo(jtfPeriodoHepatite.getText());
        pacienteModel.setHipertensao(jcbHipertensao.getSelectedItem().toString());
        pacienteModel.setHipertensaoObs(MedicamentoUtil.obsHipertensao);
        pacienteModel.setHipertensaoPeriodo(jtfPeriodoHipertensao.getText());
        pacienteModel.setHipertensaoTipo(MedicamentoUtil.tipoHipertensao);
        pacienteModel.setRemedio(jcbRemedioControlado.getSelectedItem().toString());
        pacienteModel.setRemedioObs(MedicamentoUtil.obsRemedios);
        pacienteModel.setRemedioPeriodo(jtfPeriodoRemedio.getText());
        pacienteModel.setRemedioTipo(MedicamentoUtil.tipoRemedios);
        pacienteModel.setUsoParacetamol(jcbParacetamol.getSelectedItem().toString());
        pacienteModel.setUsoParacetamolObs(MedicamentoUtil.obsParacetamol);
        pacienteModel.setUsoParacetamolPeriodo(jtfPeriodoParacetamol.getText());
        pacienteModel.setUsoParacetamolTipo(MedicamentoUtil.tipoParacetamol);
        pacienteModel.setAlergias(jcbAlergia.getSelectedItem().toString());
        pacienteModel.setAlergiasObs(MedicamentoUtil.obsAlergias);
        pacienteModel.setAlergiasPeriodo(jtfPeriodoAlergia.getText());
        pacienteModel.setAlergiasTipo(MedicamentoUtil.tipoAlergias);
        pacienteModel.setCancer(jcbCancer.getSelectedItem().toString());
        pacienteModel.setCancerObs(MedicamentoUtil.obsCancer);
        pacienteModel.setCancerPeriodo(jtfPeriodoCancer.getText());
        pacienteModel.setCancerTipo(MedicamentoUtil.tipoCancer);
        pacienteModel.setDoencaEstomago(jcbDoencaEstomago.getSelectedItem().toString());
        pacienteModel.setDoencaEstomagoObs(MedicamentoUtil.obsDoencaEstomago);
        pacienteModel.setDoencaEstomagoPeriodo(jtfPeriodoDoencaEstomago.getText());
        pacienteModel.setDoencaEstomagoTipo(MedicamentoUtil.tipoDoencaEstomago);
        pacienteModel.setDoencaOssos(jcbDoencaOssos.getSelectedItem().toString());
        pacienteModel.setDoencaOssosObs(MedicamentoUtil.obsDoencaOssos);
        pacienteModel.setDoencaOssosPeriodo(jtfPeriodoDoencaOssos.getText());
        pacienteModel.setDoencaOssosTipo(MedicamentoUtil.tipoDoencaOssos);
        pacienteModel.setDoencaPulmoes(jcbDoencaPulmoes.getSelectedItem().toString());
        pacienteModel.setDoencaPulmoesObs(MedicamentoUtil.obsDoencaPulmoes);
        pacienteModel.setDoencaPulmoesPeriodo(jtfPeriodoDoencaPulmoes.getText());
        pacienteModel.setDoencaPulmoesTipo(MedicamentoUtil.tipoDoencaPulmoes);
        pacienteModel.setFeridasTumores(jcbFeridas.getSelectedItem().toString());
        pacienteModel.setFeridasTumoresObs(MedicamentoUtil.obsFeridas);
        pacienteModel.setFeridasTumoresPeriodo(jtfPeriodoFeridas.getText());
        pacienteModel.setFeridasTumoresTipo(MedicamentoUtil.tipoFeridas);
        pacienteModel.setHernia(jcbHernia.getSelectedItem().toString());
        pacienteModel.setHerniaObs(MedicamentoUtil.obsHernia);
        pacienteModel.setHerniaPeriodo(jtfPeriodoHernia.getText());
        pacienteModel.setHerniaTipo(MedicamentoUtil.tipoHernia);
        pacienteModel.setDataAtendimento(jlData.getText());

        // quadro psicofisico
        quadroPsicofisicoModel.setAngustia_intensidade(jcbQuadroAngustia.getSelectedItem().toString());
        quadroPsicofisicoModel.setAceleracao_coracao_intensidade(jcbQuadroTaquicardia.getSelectedItem().toString());
        quadroPsicofisicoModel.setAnsiedade_intensidade(jcbQuadroAnsiedade.getSelectedItem().toString());
        quadroPsicofisicoModel.setCalafrios_intensidade(jcbQuadroCalafrios.getSelectedItem().toString());
        quadroPsicofisicoModel.setCansaco_intensidade(jcbQuadroCansaco.getSelectedItem().toString());
        quadroPsicofisicoModel.setDesanimo_intensidade(jcbQuadroDesanimo.getSelectedItem().toString());
        quadroPsicofisicoModel.setDor_cabeca_intensidade(jcbQuadroDorCabeca.getSelectedItem().toString());
        quadroPsicofisicoModel.setDor_coluna_intensidade(jcbQuadroDorColuna.getSelectedItem().toString());
        quadroPsicofisicoModel.setDores_pernas_bracos_intensidade(jcbQuadroDorPerna.getSelectedItem().toString());
        quadroPsicofisicoModel.setDormecias_intensidade(jcbQuadroDormencia.getSelectedItem().toString());
        quadroPsicofisicoModel.setFalta_apetite_intensidade(jcbQuadroFaltaApetite.getSelectedItem().toString());
        quadroPsicofisicoModel.setFalta_concentracao_intensidade(jcbQuadroFaltaConcetracao.getSelectedItem().toString());
        quadroPsicofisicoModel.setIdeias_suicidas_intensidade(jcbQuadroIdeiasSuicidas.getSelectedItem().toString());
        quadroPsicofisicoModel.setInsonia_intensidade(jcbQuadroInsonia.getSelectedItem().toString());
        quadroPsicofisicoModel.setIrritacao_sem_motivo_intensidade(jcbQuadroIrritacao.getSelectedItem().toString());
        quadroPsicofisicoModel.setMedo_intensidade(jcbQuadroMedo.getSelectedItem().toString());
        quadroPsicofisicoModel.setOuve_vozes_intensidade(jcbQuadroOuveVozes.getSelectedItem().toString());
        quadroPsicofisicoModel.setPesadelos_intensidade(jcbQuadroPesadelos.getSelectedItem().toString());
        quadroPsicofisicoModel.setPresenca_espirito_intensidade(jcbQuadroPresencaEspiritos.getSelectedItem().toString());
        quadroPsicofisicoModel.setSonolencia_intensidade(jcbQuadroSonolencia.getSelectedItem().toString());
        quadroPsicofisicoModel.setSudorese_intensidade(jcbQuadroSudorese.getSelectedItem().toString());
        quadroPsicofisicoModel.setTontura_intensidade(jcbQuadroTonturas.getSelectedItem().toString());
        quadroPsicofisicoModel.setVultos_intensidade(jcbQuadroVultos.getSelectedItem().toString());
        quadroPsicofisicoModel.setZumbidos_intensidade(jcbQuadroZumbidos.getSelectedItem().toString());

        if (pacienteController.salvarPacienteController(pacienteModel) > 0) {

            if (quadroPsicofisicoController.salvarQuadroPsicofisicoController(quadroPsicofisicoModel) > 0) {
                JOptionPane.showMessageDialog(this, "Infomações salvas com sucesso!", "Sucesso", JOptionPane.WARNING_MESSAGE);
                this.jpOutrasInfo.setVisible(false);
                this.jpInfoPaciente.setVisible(true);
                limparCampos();
            }

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
        jcDesobsessaoDistancia.setSelected(false);
        jcDesobsessaoCentro.setSelected(false);
        jcTratamentoNao.setSelected(false);
        jcTratamentoSim.setSelected(false);
        jcbCidade.setSelectedItem("Abreu e Lima");
        jlIdade.setText("0");
        limparSelecao();

    }

    private void dadosIniciais() {
        jlAtendente.setText(SessaoModel.nomeUsuario);
        jlData.setText(getDateUtil.getDateTime()); //data do atendimento;
        jlIdade.setVisible(false);
        jLabel4.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel53;
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
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFumo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAlcool;
    private javax.swing.JButton jbAlergia;
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
    private javax.swing.JCheckBox jcDesobsessaoCentro;
    private javax.swing.JCheckBox jcDesobsessaoDistancia;
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
    private javax.swing.JPanel jpBarraLateral;
    private javax.swing.JPanel jpInfoPaciente;
    private javax.swing.JPanel jpOutrasInfo;
    private javax.swing.JPanel jpPanel3;
    private javax.swing.JPanel jpQuadroPsicofisico;
    private javax.swing.JPanel jpTratamentos;
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
    private rojerusan.RSPanelImage rSPanelImage1;
    // End of variables declaration//GEN-END:variables

}
