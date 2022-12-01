package page;

//public class CodPage {
//    @FindBy(xpath = "//div[3]")
//    private WebElement div;
//
//    public WebElement getDiv() {
//        return div;
//    }
//
//    @FindAll({@FindBy(xpath = "//div")})
//    private List<WebElement> divList;
//
//    public List<WebElement> getDivList() {
//        return divList;
//    }
//
//    @FindBy(id = "span-base-custsearch-searchenter")
//    private WebElement clicarLupa;
//
//    public WebElement getClicarLupa() {
//        return clicarLupa;
//    }
//
//    @FindBy(id = "modalAlertasDoCliente__dialog_close_button")
//    private WebElement popUpAlertadoCliente;
//
//    public WebElement getPopUpAlertadoCliente() {
//        return popUpAlertadoCliente;
//    }
//
//    @FindBy(xpath = "//*[@id=\"modalTfcPassword__dialog_close_button\"]/i")
//    public WebElement fecharPopUp;
//
//    public WebElement getFecharPopUp() {
//        return fecharPopUp;
//    }
//
//    @FindBy(xpath = "//span[@class='value color-cpfCnpj']")
//    public WebElement cpf;
//
//    public WebElement getCpf() {
//        return cpf;
//    }
//
//    @FindBy(xpath = "//div[@class='loading-full']")
//    public WebElement iconeespera;
//
//    public WebElement getIconeespera() {
//        return iconeespera;
//    }
//
//    @FindBy(xpath = "//span[.='CONSOLIDADO']")
//    public WebElement consolidado;
//
//    public WebElement getConsolidado() {
//        return consolidado;
//    }
//
//    @FindBy(xpath = "//h2[.='Posição Consolidada dos Investimentos']")
//    public WebElement posicaoConsolidadaDosInvestimentos;
//
//    public WebElement getPosicaoConsolidadaDosInvestimentos() {
//        return posicaoConsolidadaDosInvestimentos;
//    }
//
//    @FindAll({@FindBy(xpath = "//div[@class='col-xs-12 allCols']//button")})
//    public List<WebElement> botaoResgatarAplicar;
//
//    public List<WebElement> getBotaoResgatarAplicar() {
//        return botaoResgatarAplicar;
//    }
//
//    @FindBy(xpath = "//p[.='Escolher um produto']")
//    public WebElement escolherProduto;
//
//    public WebElement getEscolherProduto() {
//        return escolherProduto;
//    }
//
//    @FindBy(xpath = "//p[.='Participar de uma reserva']")
//    public WebElement ParticiparReserva;
//
//    public WebElement getParticiparReserva() {
//        return ParticiparReserva;
//    }
//
//    @FindBy(xpath = "//div[@class='col-xs-12']//button[@class='large col-xs-6 col-xs-push-5 spaui-button secondary']")
//    public WebElement botaoVoltar;
//
//    public WebElement getBotaoVoltar() {
//        return botaoVoltar;
//    }
//
//    @FindBy(xpath = "//h1[.='Investimentos do Cliente']")
//    public WebElement tituloInvestimentosDoCliente;
//
//    public WebElement getTituloInvestimentosDoCliente() {
//        return tituloInvestimentosDoCliente;
//    }
//
//    @FindBy(xpath = "//*[@id=\"st-inv-pc-mdarVisualizacao\"]/ul/li[1]/span")
//    public WebElement botaoProdutos;
//
//    public WebElement getBotaoProdutos() {
//        return botaoProdutos;
//    }
//
//    @FindAll({@FindBy(xpath = "//div[@class='col-xs-12 actions']/div/div/button")})
//    public List<WebElement> botaoEscolherContinuar;
//
//    public List<WebElement> getBotaoEscolherContinuar() {
//        return botaoEscolherContinuar;
//    }
//
//    @FindBy(xpath = "//h1[.='Investimento por produto']")
//    public WebElement tituloInvestimentoPorProduto;
//
//    public WebElement getTituloInvestimentoPorProduto() {
//        return tituloInvestimentoPorProduto;
//    }
//
//    @FindAll({@FindBy(xpath = "//span[@class='accordion-tab-button']")})
//    public List<WebElement> botaoExpandirOpcoesDeProdutos;
//
//    public List<WebElement> getBotaoExpandirOpcoesDeProdutos() {
//        return botaoExpandirOpcoesDeProdutos;
//    }
//
//    @FindBy(xpath = "//span[text()='Santander Prev PGBL ']")
//    public WebElement santanderPrevPgbl;
//
//    public WebElement getSantanderPrevPgbl() {
//        return santanderPrevPgbl;
//    }
//
//    @FindAll({@FindBy(xpath = "//div[@class='ng-tns-c154-32 ng-star-inserted']")})
//    public List<WebElement> contratos;
//
//    public List<WebElement> getContratos() {
//        return contratos;
//    }
//
//    @FindBy(xpath = "//button[@class='small spaui-button primary ng-star-inserted']")
//    public WebElement botaoAliquotaIrpf;
//
//    public WebElement getBotaoAliquotaIrpf() {
//        return botaoAliquotaIrpf;
//    }
//
//    @FindBy(xpath = "//h2[.='Posição Consolidada de Alíquotas - Santander Prev PGBL']")
//    public WebElement tituloPosicaoConsolidadaDeAliquotasPrevPgbl;
//
//    public WebElement getTituloPosicaoConsolidadaDeAliquotasPrevPgbl() {
//        return tituloPosicaoConsolidadaDeAliquotasPrevPgbl;
//    }
//
//    @FindAll({@FindBy(xpath = "//em[@class='icon-seta-baixo']")})
//    public List<WebElement> expandirCertificados;
//
//    public List<WebElement> getExpandirCertificados() {
//        return expandirCertificados;
//    }
//
//    @FindBy(xpath = "//span[.='CERTIFICADO']")
//    public WebElement certificadosTelaPrevPGBL;
//
//    public WebElement getCertificadosTelaPrevPGBL() {
//        return certificadosTelaPrevPGBL;
//    }
//
//    @FindBy(xpath = "//p[.='Tributação: PROGRESSIVA']")
//    public WebElement tributacaoProgressiva;
//
//    public WebElement getTributacaoProgressiva() {
//        return tributacaoProgressiva;
//    }
//
//    @FindBy(xpath = "//p[.='Tributação: REGRESSIVA']")
//    public WebElement tributacaoRegressiva;
//
//    public WebElement getTributacaoRegressiva() {
//        return tributacaoRegressiva;
//    }
//
//    @FindBy(xpath = "//span[text()='SANT FIQ DI SUPREMO ']")
//    public WebElement SantFiqDiSupremo;
//
//    public WebElement getSantFiqDiSupremo() {
//        return SantFiqDiSupremo;
//    }
//
//    @FindBy(xpath = "//span[.='CLASSE DE ATIVOS']")
//    public WebElement botaoClasseDeAtivos;
//
//    public WebElement getBotaoClasseDeAtivos() {
//        return botaoClasseDeAtivos;
//    }
//
//    @FindBy(xpath = "//span[.='PRODUTO']")
//    public WebElement resgate;
//
//    public WebElement getResgate() {
//        return resgate;
//    }
//
//    @FindBy(xpath = "//*[@id=\"sd-inv-apgr-UnicOpcAccord\"]/table/tbody/tr[10]/td[1]/div/spaui-radio/div/div[1]/input/../../div[2]")
//    private WebElement expandirProdutoResgate;
//
//    public WebElement getExpandirProdutoResgate() {
//        return expandirProdutoResgate;
//    }
//
//    @FindAll({@FindBy(xpath = "//div[@class='ng-tns-c162-46 ng-star-inserted']")})
//    private List<WebElement> expandirResgate;
//
//    public List<WebElement> getExpandirResgate() {
//        return expandirResgate;
//    }
//
//    @FindBy(xpath = "//button[@id='btn-inv-apgr-ResgVend']")
//    private WebElement botaoResgatarResgate;
//
//    public WebElement getBotaoResgatarResgate() {
//        return botaoResgatarResgate;
//    }
//
//    @FindBy(xpath = "//div[@class='col-xs-12']//button[@class='large col-xs-6 spaui-button secondary'] ")
//    private WebElement botaoVoltarResgate;
//
//    public WebElement getBotaoVoltarResgate() {
//        return botaoVoltarResgate;
//    }
//
//    @FindBy(xpath = "//span[text()='Santander Prev PGBL - AFINIDADES ']")
//    public WebElement opcaoSantanderPrevPGBLAfinidades;
//
//    public WebElement getOpcaoSantanderPrevPGBLAfinidades() {
//        return opcaoSantanderPrevPGBLAfinidades;
//    }
//
//    @FindBy(xpath = "//h1[.='Resgatar Previdência']")
//    public WebElement telaResgatarPrevidencia;
//
//    public WebElement getTelaResgatarPrevidencia() {
//        return telaResgatarPrevidencia;
//    }
//
//    @FindBy(xpath = "//span[@class='ng-tns-c158-63 label-margin accordion-tab-title-regular ng-star-inserted']")
//    public WebElement opcaoSANTANDERSENIORRF407;
//
//    public WebElement getOpcaoSANTANDERSENIORRF407() {
//        return opcaoSANTANDERSENIORRF407;
//    }
//
//    @FindBy(xpath = "//span[@class='ng-tns-c158-64 label-margin accordion-tab-title-regular ng-star-inserted']")
//    public WebElement opcaoSANTMASTERRFR42DI;
//
//    public WebElement getOpcaoSANTMASTERRFR42DI() {
//        return opcaoSANTMASTERRFR42DI;
//    }
//    @FindBy(xpath = "//span[@class='ng-tns-c158-35 label-margin accordion-tab-title-regular ng-star-inserted']")
//    public WebElement opcaoSaintInteligente350;
//
//    public WebElement getOpcaoSaintInteligente350() {
//        return opcaoSaintInteligente350;
//    }
//    @FindAll({@FindBy(xpath = "//span[@class='spaui-tab-text noselect']")})
//    public List<WebElement> patrimonio;
//
//    public List<WebElement> getPatrimonio() {
//        return patrimonio;
//    }
//    @FindBy(xpath = "//h2[.='Evolução do Patrimônio']")
//    public WebElement evolucaoPatrimonio;
//
//    public WebElement getEvolucaoPatrimonio() {
//        return evolucaoPatrimonio;
//    }
//    @FindBy(xpath = "//h2[.='Evolução da Carteira']")
//    public WebElement evolucaoCarteira;
//
//    public WebElement getEvolucaoCarteira() {
//        return evolucaoCarteira;
//    }
//    @FindBy(xpath = "//*[@id=\"ss-inv-pc-cc\"]/div/div[3]/i")
//    public WebElement contaCorrente;
//
//    public WebElement getContaCorrente() {
//        return contaCorrente;
//    }
//
//    @FindBy(xpath = "//span[.='Agência: 1330   Conta: 01.020750.0']")
//    public WebElement opcoesContaCorrente;
//
//    public WebElement getOpcoesContaCorrente() {
//        return opcoesContaCorrente;
//
//    }@FindBy(xpath = "//*[@id=\"ss-inv-pc-cc\"]/div/div[3]/div/label")
//    public WebElement opcaoAgenciaConta;
//
//    public WebElement getOpcaoAgenciaConta() {
//        return opcaoAgenciaConta;
//
//    }@FindBy(xpath = "//div/button[text()='Voltar']")
//    private WebElement botaoVoltarResgatarPrevidencia;
//
//    public WebElement getBotaoVoltarResgatarPrevidencia() {
//        return botaoVoltarResgatarPrevidencia;
//    }
//    @FindBy(xpath = "//div[text()='Resgates que necessitam apresentar documentos do Procurador, Tutor, Curador, devem seguir o fluxo através de formulário.']")
//    private WebElement mensagemTelaResgatarPrevidencia;
//
//    public WebElement getMensagemTelaResgatarPrevidencia() {
//        return mensagemTelaResgatarPrevidencia;
//    }
//    @FindAll({@FindBy(xpath = "//label[text()='Sim']")})
//    public List<WebElement> radioButtonSim;
//
//    public List<WebElement> getRadioButtonSim() {
//        return radioButtonSim;
//    }
//    @FindAll({@FindBy(xpath = "//label[text()='Não']")})
//    public List<WebElement> radioButtonNao;
//
//    public List<WebElement> getRadioButtonNao() {
//        return radioButtonNao;
//    }
//
//    @FindBy(xpath = "//div[text()='Para não residente fiscal no Brasil, o resgate deve seguir o fluxo através de formulário.']")
//    private WebElement mensagem2TelaResgatePrevidencia;
//
//    public WebElement getMensagem2TelaResgatePrevidencia() {
//        return mensagem2TelaResgatePrevidencia;
//    }
//    @FindBy(xpath = "//label[text()='É PESSOA POLITICAMENTE EXPOSTA?']")
//    private WebElement questaoEPessoaPoliticamenteExposta;
//
//    public WebElement getQuestaoEPessoaPoliticamenteExposta() {
//        return questaoEPessoaPoliticamenteExposta;
//    }
//    @FindBy(xpath = "//div[text()='Para Pessoa Politicamente Exposta (PEP), o resgate deve seguir o fluxo através de formulário.']")
//    private WebElement mensagem1EPessoaPoliticamenteExposta;
//
//    public WebElement getMensagem1EPessoaPoliticamenteExposta() {
//        return mensagem1EPessoaPoliticamenteExposta;
//    }
//
//    @FindAll({@FindBy(xpath = "//h2[@class='title_bottom']")})
//    public List<WebElement> produtoEcertificadoDocliente;
//
//    public List<WebElement> geprodutoEcertificadoDocliente() {
//        return produtoEcertificadoDocliente;
//    }
//
//    @FindBy(xpath = "//*[@id=\"creditValueInput-0__input\"]")
//    private WebElement campoInserirvalor;
//
//    public WebElement getCampoInserirvalor() {
//        return campoInserirvalor;
//    }
//
//    @FindBy(xpath = "//p[.='VALOR A SER CREDITADO EM CONTA']")
//    private WebElement valorASerCreditadoConta;
//
//    public WebElement getValorASerCreditadoConta() {
//        return valorASerCreditadoConta;
//    }
//    @FindBy(xpath = "//div[@class='total-line-box-inner'][3]//p[2]")
//    private WebElement visualizoValorCreditadoConta;
//
//    public WebElement getVisualizoValorCreditadoConta() {
//        return visualizoValorCreditadoConta;
//    }
//
//    @FindBy(xpath = "//span[.='VALOR PARCIAL']")
//    private WebElement botãoValorParcial;
//
//    public WebElement getBotãoValorParcial() {
//        return botãoValorParcial;
//    }
//
//    @FindAll({@FindBy(xpath = "//table/tbody/tr[1]/td/div")})
//    private List<WebElement> campoValorTotalValorBruto;
//
//    public List<WebElement> getCampoValorTotalValorBruto() {
//        return campoValorTotalValorBruto;
//    }
//
//    @FindBy(xpath = "//label[@class='spaui-select-label ng-tns-c130-43 ng-star-inserted']")
//    private WebElement campoAgenciaContaDestino;
//
//    public WebElement getCampoAgenciaContaDestino() {
//        return campoAgenciaContaDestino;
//    }
//
//    @FindBy(xpath = "//li[@class='ng-tns-c130-47 ng-star-inserted'][3]/span")
//    private WebElement agenciaContaDestino;
//
//    public WebElement getAgenciaContaDestino() {
//        return agenciaContaDestino;
//
//    }
//
//    @FindBy(xpath ="//div/span[text()='Detalhamento do Resgate']" )
//    private WebElement detalahamentoDoResgate;
//
//    public WebElement getDetalahamentoDoResgate() {
//        return detalahamentoDoResgate;
//    }
//
//    @FindBy(xpath = "//button[@class='large spaui-button primary ng-star-inserted']")
//    private WebElement botaoAplicar;
//
//    public WebElement getBotaoAplicar() {
//        return botaoAplicar;
//    }
//
//    @FindBy(xpath = "//u[text()='Clique aqui para responder']")
//    private WebElement  mensagemCliqueAquiParaResponder;
//
//    public WebElement getMensagemCliqueAquiParaResponder() {
//        return mensagemCliqueAquiParaResponder;
//    }
//
//    @FindBy(xpath = "//*[@id=\"mensagemAtualizarQuestionario\"]")
//    private WebElement tituloQuestionarioInvestimentos;
//
//    public WebElement getTituloQuestionarioInvestimentos() {
//        return tituloQuestionarioInvestimentos;
//    }
//
//    @FindBy(xpath = "//span[text()='PATRIMÔNIO']")
//    private WebElement opcaoPatrimonio;
//
//    public WebElement getOpcaoPatrimonio() {
//        return opcaoPatrimonio;
//    }
//
//    @FindBy(xpath = "//span[text()='Descrição']")
//    private WebElement descricaoExtratoPatrimonio;
//
//    public WebElement getDescricaoExtratoPatrimonio() {
//        return descricaoExtratoPatrimonio;
//    }
//
//    @FindBy(xpath = "//span[text()='FUNDOS DE INVESTIMENTO ']")
//    private WebElement produtosPosicaoPatrimonio;
//
//    public WebElement getProdutosPosicaoPatrimonio() {
//        return produtosPosicaoPatrimonio;
//    }
//
//    @FindBy(xpath = "//span[text()='Posição']")
//    private WebElement botaoPosicao;
//
//    public WebElement getBotaoPosicao() {
//        return botaoPosicao;
//    }
//
//    @FindBy(xpath = "//div/button[text()='Voltar']")
//    private WebElement botaoVoltarTelaInvestimento;
//
//    public WebElement getBotaoVoltarTelaInvestimento() {
//        return botaoVoltarTelaInvestimento;
//    }
//
//    @FindBy(xpath = "//span[text()='VALOR TOTAL']")
//    private WebElement valorTotalPatrimonio;
//
//    public WebElement getValorTotalPatrimonio() {
//        return valorTotalPatrimonio;
//    }
//
//    @FindBy(xpath = " //div//span[text()='GANHOS NO MÊS']")
//    private WebElement valorGanhoMesPatrimonio;
//
//    public WebElement getValorGanhoMesPatrimonio() {
//        return valorGanhoMesPatrimonio;
//    }
//
//    @FindAll({@FindBy(xpath = "//*[local-name()='svg']//*[name()='g' and@class='highcharts-series highcharts-series-0 highcharts-areaspline-series ']//*[name()='path']")})
//    private List<WebElement> opcaoGrafico;
//
//    public List<WebElement> getOpcaoGrafico() {
//        return opcaoGrafico;
//    }
//
//    @FindBy(xpath = "//div[.='Atenção: a Evolução Patrimonial abaixo exibe a totalidade de investimentos do CPF/CNPJ do Cliente.']")
//    private WebElement mensagemTotalInvestimento;
//
//    public WebElement getMensagemTotalInvestimento() {
//        return mensagemTotalInvestimento;
//    }
//
//    @FindBy(xpath = "highcharts-point highcharts-point-select")
//    private WebElement graficoEvolucaoDaCarteira;
//
//    public WebElement getGraficoEvolucaoDaCarteira() {
//        return graficoEvolucaoDaCarteira;
//    }
//
//    @FindBy(xpath = "//*[@id=\"btn-inv-e-voltar\"]")
//    private WebElement botaoVoltarPatrimonio;
//
//    public WebElement getBotaoVoltarPatrimonio() {
//        return botaoVoltarPatrimonio;
//    }
//
//    @FindBy(xpath = "//*[@id=\"btn-inv-apg-subProd\"]/div[2]/div/div/h4/span[1]")
//    private WebElement opcaoPoupancaEspecial;
//
//    public WebElement getOpcaoPoupancaEspecial() {
//        return opcaoPoupancaEspecial;
//    }
//
//    @FindBy(xpath = "//span[@class='ng-tns-c163-35 label-margin accordion-tab-title-regular ng-star-inserted']")
//    private WebElement opcaoSantanderSeniorRf407;
//
//    public WebElement getOpcaoSantanderSeniorRf407() {
//        return opcaoSantanderSeniorRf407;
//    }
//
//    @FindBy(xpath = "//span[@class='ng-tns-c163-43 label-margin accordion-tab-title-regular ng-star-inserted']")
//    private WebElement opcaoSantMasterRF42DI;
//
//    public WebElement getOpcaoSantMasterRF42DI() {
//        return opcaoSantMasterRF42DI;
//    }
//
//
//    @Dado("que estou logado no sistema")
//    public void queEstouLogadoNoSistema() {
//        utilsLogic.acessarWeb();
//    }
//
//    @E("fazer algo")
//    public void fazerAlgo() {
//    }
//
//    @Então("visualizo popUp {string}")
//    public void visualizoPopUp(String popUp) {
//        utilsLogic.visualizoPopUp(popUp);
//    }
//
//    @Quando("fecho popUp")
//    public void fechoPopUp( String fechoPopUp) {
//        utilsLogic.fechoPopUp(fechoPopUp);
//    }
//
//    @Entao("visualizo o CPF {string}")
//    public void visualizoOCPF(String cpf)throws InterruptedException {
//        utilsLogic.validarCpf(cpf);
//    }
//
//    @Quando("clico na opção {string} na tela {string}")
//    public void clicoNaOpçãoNaTela(String opcao, String tela) {
//        utilsLogic.clicarOpcaoNaTela(opcao, tela);
//    }
//    @E("clico no botao {string} na opcao {string}")
//    public void clicoNoBotaoNaOpcao(String botao, String opcao) {
//        utilsLogic.clicarBotaoNaOpcao(botao, opcao);
//    }
//
//    @Então("visualizo opcao {string} na tela {string}")
//    public void visualizoOpcaoNaTela(String ocao, String tela) {
//        utilsLogic.visualizoOpcaoNaTela(ocao, tela);
//    }
//
//    @E("clico no botao {string} na tela {string}")
//    public void clicoNoBotaoNaTela(String botao, String tela) {
//        utilsLogic.clicarBotaoNaTela(botao, tela);
//    }
//    @Entao("visualizo os contratos da opcao {string}")
//    public void visualizoOsContratosDaOpcao(String opcao) {
//        utilsLogic.validarContratos(opcao);
//    }
//    @E("seleciono um certificado")
//    public void selecionoUmCertificado() {
//        utilsLogic.selecionarCertificado();
//
//    }
//    @Entao("visualizo que o botão {string} esta visivel e clicavel na tela {string}")
//    public void visualizoQueOBotãoEstaVisivelEClicavelNaTela(String botao, String tela) {
//        utilsLogic.validarBotao(botao, tela);
//    }
//    @Entao("visualizo {string} na tela {string}")
//    public void visualizoNaTela(String texto, String tela) {
//        utilsLogic.visualizarNaTela(texto, tela);
//    }
//
//    @Entao("visualizo {string} da opção {string} na tela {string}")
//    public void visualizoDaOpcaoNaTela(String titulo, String opcao, String tela) {
//        utilsLogic.validadarTirulo(titulo, opcao, tela);
//    }
//    @Entao("visualizo tela {string}")
//    public void visualizoTela(String tela) {
//        utilsLogic.visualizarNaTela(tela);
//    }
//
//    @Entao("visualizo a opcao de investimento {string} na tela {string}")
//    public void visualizoAOpcaoDeInvestimentoNaTela(String opcao, String tela) {
//        utilsLogic.visualizoAOpcaoDeInvestimentoNaTela(opcao, tela);
//    }
//
//    @E("seleciono um {string} na tela {string}")
//    public void selecionoUmNaTela(String opcao, String tela) {
//        utilsLogic.selecionoUmProdutoNaTela(opcao,tela);
//    }
//
//    @Entao("visualizo {string} no campo {string} na tela {string}")
//    public void visualizoNoCampoNaTela(String opcao, String campo, String tela) {
//        utilsLogic.visualizoNoCampoNaTela(opcao, campo, tela);
//    }
//
//    @Entao("visualizo mensagem {string}")
//    public void visualizoMensagem(String tela) {
//        utilsLogic.visualizarNaTela(tela);
//    }
//
//    @Entao("visualizo questão {string} esta visivel e clicavel na tela {string}")
//    public void visualizoQuestãoEstaVisivelEClicavelNaTela(String questao, String tela) {
//        utilsLogic.visualizoQuestãoEstaVisivelEClicavelNaTela(questao, tela);
//    }
//
//    @E("clico na opção {string} da questão {string} na tela {string}")
//    public void clicoNaOpçãoDaQuestãoNaTela(String opcao, String questao, String tela) {
//        utilsLogic.clicoNaOpçãoDaQuestãoNaTela(opcao, questao, tela);
//    }
//
//    @E("insiro o valor {string} no campo {string} na tela {string}")
//    public void insiroOValorNoCampoNaTela(String valor, String campo, String tela) {
//        utilsLogic.insiroOValorNoCampoNaTela(valor, campo, tela);
//    }
//
//    @Entao("visualizo que o botão {string} esta visivel na tela {string}")
//    public void visualizoQueOBotãoEstaVisivelNaTela(String botao, String tela) {
//        utilsLogic.visualizoQueOBotãoEstaVisivelNaTela(botao, tela);
//    }
//
//
//    @Quando("clico na mensagem {string} na tela {string}")
//    public void clicoNaMensagemNaTela(String mensagem, String tela) {
//        utilsLogic.clicoNaMensagemNaTela(mensagem, tela);
//    }
//
//    @Quando("clico no mês {string} do {string} na tela {string}")
//    public void clicoNoMêsDoNaTela(String mes, String campo, String tela) {
//        utilsLogic.clicoNoMêsDoNaTela(mes, campo, tela);
//    }
//
//    @Entao("visualizo {string} referente ao mes {string} na tela {string}")
//    public void visualizoReferenteAoMesNaTela(String valores, String campo, String tela) {
//        utilsLogic.visualizoReferenteAoMesNaTela(valores, campo, tela);
//    }
//
//    @Quando("clico no botao {string} na opcao {string} na tela {string}")
//    public void clicoNoBotaoNaOpcaoNaTela(String botao, String campo, String tela) {
//        utilsLogic.clicoNoBotaoNaOpcaoNaTela(botao, campo, tela);
//    }
//}



