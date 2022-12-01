package Func;

public class Cod {
//
//    public void acessarWeb() {
//        web().navigateToUrl();
////        log.info("Acessando Web");
//        rGen().registerStep(web().getScreenshot());
//    }
//
//    public void enterRobbot() {
//        Robot robot = null;
//        try {
//            robot = new Robot();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//        robot.keyPress(KeyEvent.VK_ENTER);
//    }
//
//    public void espera() {
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private String getDataAtual() {
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//        return dateFormat.format(date);
//    }
//
//    public String dataHoje = getDataAtual();
//
//
//    public void recuperarNumeroDeId(String ids) throws IOException {
//        if (ids.equals("XPTO")) {
//            web().sleep(4);
//            Path id = Paths.get("src\\main\\resources\\casoId.properties");
//            String ct = utilsPage.getDiv().getText();
//            byte[] ctId = ct.getBytes();
//            Files.write(id, ctId);
//        }
//    }
//
//    public String recuperarCts() throws IOException {
//        web().sleep(4);
//        Path id = Paths.get("src\\main\\resources\\casoId.properties");
//        String ct = utilsPage.getDivList().get(3).getText();
//        byte[] ctId = ct.getBytes();
//        Files.write(id, ctId);
//
//        return ct;
//    }
//
//    private static Properties prop = null;
//
//    private static Properties getPropities() throws IOException {
//        if (prop == null) {
//            InputStream inp = PropertiesUtil.class.getResourceAsStream("/casoId.properties");
//            prop = new Properties();
//            prop.load(inp);
//            inp.close();
//        }
//        return prop;
//    }
//
//    public String getProperty(String valor) {
//        try {
//            return getPropities().getProperty(valor);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public String leraquivo() {
//        File id = new File("src/main/resources/casoId.properties");
//        String MeuId = id.getAbsolutePath();
//        FileInputStream fis = null;
//
//        try {
//            fis = new FileInputStream(MeuId);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//
//        String cts = null;
//        try {
//            cts = br.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return cts;
//    }
//
//    public void clicoNaLupa() {
//        web().sleep(2);
//        web().clickSelenium(utilsPage.getClicarLupa());
//        rGen().registerStep(web().getScreenshot(), " Clicando na lupa ");
//    }
//
//    public void visualizoPopUp(String popUp) {
//        switch (popUp) {
//            case "Alertas do Cliente":
//                web().sleep(10);
//                Assert.assertTrue(utilsPage.getPopUpAlertadoCliente().isDisplayed());
//                rGen().registerStep(web().getScreenshot(), " Visualizo o PopUp Alertas do Cliente ");
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponível");
//        }
//    }
//
//    public void fechoPopUp(String fechoPopUp) {
//        switch (fechoPopUp) {
//            case "fecho popUp":
//                web().sleep(3);
////                web().moveToElement(homePage.getTelaCarregando());
////                web().sleep(10);
////                web().moveToElement(utilsPage.getFecharPopUp());
////                web().clickSelenium(utilsPage.getFecharPopUp());
////                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponível");
//        }
//
//    }
//
//    public void validarCpf(String cpf) throws InterruptedException {
//        switch (cpf) {
//            case "42676134000":
//                Assert.assertTrue(utilsPage.getCpf().isDisplayed());
//                // Assert.assertEquals(cpf, utilsPage.getCpf().getAttribute("value"));
//                rGen().registerStep(web().getScreenshot(), " Visualizo o CPF 426.761.340-00 inserido no Campo");
//                break;
//            default:
//                throw new IllegalArgumentException("CPF não foi visualizado");
//        }
//    }
//
//    public void clicarOpcaoNaTela(String opcao, String tela) {
//        switch (opcao) {
//            case "Investimentos do Cliente":
//                if (tela.equals("Menus")) {
//                    web().sleep(20);
//                    rGen().registerStep(web().getScreenshot(), " Clico na opção Investimentos do Cliente ");
//                    web().clickSelenium(homePage.getInvestimentoCliente());
//                    web().sleep(10);
//                }
//                break;
//            case "PREVIDÊNCIA":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(60);
//                    web().scroll(500);
//                    web().scroll(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(1));
//                    rGen().registerStep(web().getScreenshot(), " Clico na opção PREVIDÊNCIA ");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(1));
//
//                } else if (tela.equals("Resgate")) {
//                    web().sleep(30);
////                    web().scroll(700);
//                    web().moveToElement(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(1));
//                    rGen().registerStep(web().getScreenshot(), " Clico na opção PREVIDÊNCIA ");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(1));
//                }
//                break;
//            case "Patrimonio":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(20);
//                    web().clickSelenium(utilsPage.getPatrimonio().get(1));
//                    web().sleep(3);
//                    rGen().registerStep(web().getScreenshot(), " Clico na opção Patrimônio ");
//
//                }
//                break;
//            case "Rentabilidade":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(30);
//                    web().clickSelenium(utilsPage.getPatrimonio().get(2));
//                    web().sleep(3);
//                    rGen().registerStep(web().getScreenshot(), " Clico na opção Rentabilidade ");
//                }
//                break;
//            case "Santander Prev PGBL":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(60);
//                    web().scroll(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(3));
//                    rGen().registerStep(web().getScreenshot(), " Clico na opção Santander Prev PGBL ");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(3));
//                }
//                break;
//            case "SantanderPrev VGBL - AFINIDADES ":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(60);
////                    web().scroll(utilsPage.getBotaoExpandirOpcoesDeProdutos().get());
//                    rGen().registerStep(web().getScreenshot(), " Clico na opção SantanderPrev VGBL - AFINIDADES ");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(4));
//                }
//                break;
//            case "CLASSE DE ATIVOS":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(30);
//                    web().moveToElement(utilsPage.getBotaoClasseDeAtivos());
//                    web().sleep(10);
//                    web().clickSelenium(utilsPage.getBotaoClasseDeAtivos());
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção Classe de Ativos");
//                }
//                break;
//            case "RENDA VARIAVEL":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(30);
//                    web().scroll(400);
////                    web().moveToElement(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(0));
//                    web().sleep(20);
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção Renda Variavel");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(0));
//                }
//                break;
//            case "Fundos":
//                if (tela.equals("Resgate")) {
//                    web().sleep(15);
//                    web().moveToElement(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(0));
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção Fundos da tela Resgate");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(0));
//                }
//                break;
//            case "PREV E ALTERNATIVOS":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(30);
//                    web().scroll(400);
////                    web().moveToElement(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(1));
//                    web().sleep(20);
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção PREV E ALTERNATIVOS");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(1));
//                }
//                break;
//            case "INFLACAO":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(30);
//                    web().scroll(400);
////                    web().moveToElement(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(2));
//                    web().sleep(20);
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção INFLACAO");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(2));
//                }
//                break;
//            case "DI":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(10);
//                    web().scroll(400);
////                    web().moveToElement(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(3));
//                    web().sleep(10);
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção DI");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(3));
//                }
//                break;
//            case "Renda Fixa PRE ":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(10);
//                    web().scroll(400);
//                    web().moveToElement(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(4));
//                    web().sleep(10);
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção Renda Fixa PRE");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(4));
//                }
//                break;
//            case "CREDITO PRIVADO ":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(10);
//                    web().scroll(400);
////                    web().moveToElement(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(4));
//                    web().sleep(10);
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção CREDITO PRIVADO");
//                    web().clickSelenium(utilsPage.getBotaoExpandirOpcoesDeProdutos().get(5));
//                }
//                break;
//            case "Conta Corrente":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(20);
//                    web().moveToElement(utilsPage.getContaCorrente());
//                    web().clickSelenium(utilsPage.getContaCorrente());
//                    web().sleep(10);
//                    rGen().registerStep(web().getScreenshot(), "Clico em Conta Corrente");
//                }
//                break;
//            case "Agencia e conta":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(40);
//                    web().scroll(100);
//                    web().moveToElement(utilsPage.getOpcoesContaCorrente());
//                    web().clickSelenium(utilsPage.getOpcoesContaCorrente());
//                    web().sleep(20);
//                    rGen().registerStep(web().getScreenshot(), "Clico em uma Agência e Conta disponível em Conta Corrente");
//                }
//                break;
//            case "Agencia e Conta Destino":
//                if (tela.equals("Resgatar Previdencia")){
//                    web().sleep(40);
//                    web().scroll(300);
//                    web().moveToElement(utilsPage.getAgenciaContaDestino());
//                    web().clickSelenium(utilsPage.getAgenciaContaDestino());
//                    web().sleep(20);
//                    rGen().registerStep(web().getScreenshot(), "Clico em uma Agência e conta Destino na tela Resgatar Previdencia ");
//                }
//                break;
//            case "Sim":
//                if (tela.equals("Resgatar Previdencia")) {
//                    web().sleep(20);
//                    web().scroll(-300);
//                    web().click(utilsPage.getRadioButtonSim().get(0));
//                    web().sleep(5);
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção SIM para a questão É RESIDENTE FISCAL EM ALGUM PAÍS QUE NÃO SEJA O BRASIL");
//                }
//                break;
//            case "Não":
//                if (tela.equals("Resgatar Previdencia")) {
//                    web().sleep(20);
//                    web().scroll(-300);
//                    web().click(utilsPage.getRadioButtonNao().get(0));
//                    web().sleep(5);
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção NÃO para a questão É RESIDENTE FISCAL EM ALGUM PAÍS QUE NÃO SEJA O BRASIL");
//                }
//                break;
//            case "Posição":
//                if(tela.equals("Investimentos do Cliente")){
//                    web().sleep(30);
//                    rGen().registerStep(web().getScreenshot(), "Clico na opção Posição na tela Investimento do Cliente");
//                    web().moveToElement(utilsPage.getBotaoPosicao());
//                    web().sleep(5);
//                    web().click(utilsPage.getBotaoPosicao());
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//
//    public void clicarBotaoNaTela(String botao, String tela) {
//        switch (botao) {
//            case "Aplicar":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(60);
//                    web().scroll(utilsPage.getBotaoResgatarAplicar().get(1));
//                    rGen().registerStep(web().getScreenshot(), " Clico no botão Aplicar ");
//                    web().clickSelenium(utilsPage.getBotaoResgatarAplicar().get(1));
//                }
//                break;
//            case "Voltar":
//                if (tela.equals("Investimentos")) {
//                    web().sleep(60);
//                    web().scroll(utilsPage.getBotaoVoltar());
//                    rGen().registerStep(web().getScreenshot(), " Clico na botão Voltar ");
//                    web().clickSelenium(utilsPage.getBotaoVoltar());
//
//                } else if (tela.equals("Resgate")) {
//                    web().sleep(30);
//                    web().moveToElement(utilsPage.getBotaoVoltarResgate());
//                    rGen().registerStep(web().getScreenshot(), " Clico na botão Voltar ");
//                    web().clickSelenium(utilsPage.getBotaoVoltarResgate());
//                }
//                break;
//            case "Resgatar":
//                if (tela.equals("Resgate")) {
//                    web().sleep(10);
//                    web().scroll(500);
//                    rGen().registerStep(web().getScreenshot(), " Clico no botão Resgatar ");
//                    web().clickSelenium(utilsPage.getBotaoResgatarResgate());
//                }
//                break;
//            case "Escolher":
//                if (tela.equals("Investimentos")) {
//                    web().sleep(30);
//                    web().moveToElement(utilsPage.getBotaoEscolherContinuar().get(0));
//                    rGen().registerStep(web().getScreenshot(), " Clico na botão Escolher ");
//                    web().clickSelenium(utilsPage.getBotaoEscolherContinuar().get(0));
//                }
//                break;
//            case "ALÍQUOTA IRPF":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(60);
//                    rGen().registerStep(web().getScreenshot(), " Clico na botão ALÍQUOTA IRPF ");
//                    web().clickSelenium(utilsPage.getBotaoAliquotaIrpf());
//                }
//                break;
//            case "Continuar":
//                if (tela.equals("Resgatar Previdencia")){
//                    web().sleep(30);
//                    rGen().registerStep(web().getScreenshot(), " Clico no botão Continuar na tela Resgatar Previdencia");
//
//                }break;
//            case "Grafico":
//                if (tela.equals("Investimentos do Cliente")){
//                    web().sleep(30);
//                    rGen().registerStep(web().getScreenshot(), " Clico no Grafico Evolucao da Carteira na tela Investimento");
//                    web().clickSelenium(utilsPage.getGraficoEvolucaoDaCarteira());
//                }break;
//
//            case "CLASSE DE ATIVOS":
//                if(tela.equals("Investimentos do Cliente")){
//                    web().sleep(40);
//                    web().scroll(50);
//                    rGen().registerStep(web().getScreenshot(), "Clico no botao Classe de Ativos");
//                    web().clickSelenium(utilsPage.getBotaoClasseDeAtivos());
//                }break;
//
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//
//    public void visualizoOpcaoNaTela(String opcao, String tela) {
//        switch (opcao) {
//            case "CONSOLIDADO":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(30);
//                    rGen().registerStep(web().getScreenshot(), "Visualizo a opção CONSOLIDADO na tela  Investimento do Cliente");
//                    Assert.assertTrue(utilsPage.getConsolidado().isDisplayed());
//                }
//                break;
//            case "Escolher um produto":
//                if (tela.equals("Investimentos")) {
//                    web().sleep(60);
//                    Assert.assertTrue(utilsPage.getEscolherProduto().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo a opção Escolher um produto");
//                }
//                break;
//            case "Participar de uma reserva":
//                if (tela.equals("Investimentos")) {
//                    web().sleep(5);
//                    Assert.assertTrue(utilsPage.getParticiparReserva().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo a opção Participar de uma reserva");
//                }
//                break;
//            case "Santander Prev PGBL":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(5);
//                    web().moveToElement(utilsPage.getSantanderPrevPgbl());
//                    Assert.assertTrue(utilsPage.getSantanderPrevPgbl().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo a opção Santander Prev PGBL");
//                }
//                break;
//            case "Produto":
//                if (tela.equals("Resgate")) {
//                    web().sleep(15);
//                    web().moveToElement(utilsPage.getResgate());
//                    web().scroll(200);
//                    Assert.assertTrue(utilsPage.getResgate().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo na tela Resgate investimentos disponíveis da opção Previdência");
//                }
//                break;
//            case "Evolução do Patrimônio":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(15);
//                    web().moveToElement(utilsPage.getEvolucaoPatrimonio());
//                    Assert.assertTrue(utilsPage.getEvolucaoPatrimonio().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo as opções de Evolução do Patrimônio ");
//                }
//                break;
//            case "Evolução da Carteira":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(15);
//                    web().moveToElement(utilsPage.getEvolucaoCarteira());
//                    Assert.assertTrue(utilsPage.getEvolucaoCarteira().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo as rentabilidades de Evolução da Carteira");
//                }
//                break;
//            case "Agencia e conta":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(15);
//                    web().scroll(200);
////                    web().clickSelenium(utilsPage.getOpcoesContaCorrente());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo as opções de agências e contas disponíveis em Conta Corrente ");
//                    Assert.assertTrue(utilsPage.getOpcoesContaCorrente().isDisplayed());
//                }
//                break;
//            case "API - Análise de Perfil de Investidor do Cliente":
//                if(tela.equals("Investimentos")){
//                    web().sleep(10);
//                    web().scroll(-250);
//                    rGen().registerStep(web().getScreenshot(), "Visualizo o formulário  API - Análise de Perfil de Investidor do Cliente");
//                    Assert.assertTrue(utilsPage.getTituloQuestionarioInvestimentos().isDisplayed());
//                }break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponível");
//        }
//    }
//
//    public void insiroOValorNoCampoNaTela(String valor, String campo, String tela) {
//        switch (valor) {
//            case "100.00":
//                if (campo.equals("Informe o valor")) {
//                    if (tela.equals("Resgatar Previdencia")) {
//                        web().sleep(20);
//                        web().scroll(200);
////                        web().moveToElement(utilsPage.getCampoInserirvalor());
//                        web().click(utilsPage.getCampoInserirvalor());
//                        web().sleep(05);
//                        web().insertText(utilsPage.getCampoInserirvalor(), valor);
//                        web().sleep(05);
//                        web().click(utilsPage.getCampoInserirvalor());
//                        rGen().registerStep(web().getScreenshot(), "Insiro o valor no campo Informe o valor");
//
//                    }
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponível");
//        }
//    }
//
//    public void validadarTirulo(String titulo, String opcao, String tela) {
//        switch (titulo) {
//            case "Posição Consolidada dos Investimentos":
//                if (opcao.equals("CONSOLIDADO")) {
//                    if (tela.equals("Investimentos do Cliente")) {
//                        web().sleep(60);
//                        Assert.assertTrue(utilsPage.getPosicaoConsolidadaDosInvestimentos().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Visualizo Posição Consolidada dos Investimentos");
//                    }
//                }break;
//            case "Descrição e Valor":
//                if (opcao.equals("Extrato")) {
//                    if (tela.equals("Investimentos do Cliente")) {
//                        web().sleep(10);
//                        web().scroll(700);
//                        rGen().registerStep(web().getScreenshot(), "Visualizo Descrição e Valor da opção Extrato na tela investimento do cliente ");
//                        web().sleep(20);
//                        Assert.assertTrue(utilsPage.getDescricaoExtratoPatrimonio().isDisplayed());
//                    }
//                }break;
//            default:
//                throw new IllegalArgumentException("Titulo não visualizado");
//        }
//    }
//
//    public void visualizoNoCampoNaTela(String opcao, String campo, String tela) {
//        switch (opcao) {
//            case "Agencia e conta":
//                if (campo.equals("Conta Corrente")) {
//                    if (tela.equals("Investimentos do Cliente")) {
//                        web().sleep(10);
//                        Assert.assertTrue(utilsPage.getOpcaoAgenciaConta().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Visualizo Agência e conta escolhida no campo Conta Corrente");
//                    }
//                }break;
//            case "100.00":
//                if (campo.equals("VALOR A SER CREDITADO EM CONTA")) {
//                    if (tela.equals("Resgatar Previdencia")) {
//                        web().sleep(10);
//                        web().scroll(300);
//                        web().moveToElementAndClick(utilsPage.getValorASerCreditadoConta());
//                        web().sleep(10);
//                        rGen().registerStep(web().getScreenshot(), "Visualizo o valor 100,00 no campo Valor a ser creditado em conta");
//                        Assert.assertTrue(utilsPage.getVisualizoValorCreditadoConta().isDisplayed());
//                    }
//                }break;
//            case "valor":
//                if (campo.equals("VALOR TOTAL/SALDO BRUTO")) {
//                    if (tela.equals("Resgatar Previdencia")) {
//                        web().sleep(10);
//                        web().scroll(250);
//                        rGen().registerStep(web().getScreenshot(), "Visualizo valor total no campo VALOR TOTAL/SALDO BRUTO");
//                        Assert.assertTrue(utilsPage.getCampoValorTotalValorBruto().get(3).isDisplayed());
//                    }
//                }
//                else if (campo.equals("DISPONÍVEL PARA RESGATE")) {
//                    if (tela.equals("Resgatar Previdencia")) {
//                        web().sleep(10);
//                        web().scroll(300);
//                        rGen().registerStep(web().getScreenshot(), "Visualizo o valor disponível  no campo DISPONÍVEL PARA RESGATE");
//                        Assert.assertTrue(utilsPage.getCampoValorTotalValorBruto().get(4).isDisplayed());
//                    }
//                }break;
//            case "AGÊNCIA E CONTA DESTINO":
//                if (campo.equals("Dados para Recebimento")) {
//                    if (tela.equals("Resgatar Previdencia")) {
//                        web().sleep(10);
//                        web().scroll(500);
//                        Assert.assertTrue(utilsPage.getCampoAgenciaContaDestino().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Visualizo AGÊNCIA E CONTA DESTINO no campo Dados para Recebimento");
//                    }
//                }break;
//            case "Produtos":
//                if(campo.equals("Evolução do Patrimônio")){
//                    if (tela.equals("Investimentos do Cliente")){
//                        web().sleep(10);
//                        web().scroll(700);
//                        rGen().registerStep(web().getScreenshot(), "Visualizo Produtos da opção Posição na Evolução Patrimonial do cliente ");
//                        web().sleep(20);
//                        Assert.assertTrue(utilsPage.getProdutosPosicaoPatrimonio().isDisplayed());
//                    }
//                }break;
//            case "Valor Total":
//                if (campo.equals("Evolução do Patrimônio")){
//                    if (tela.equals("Investimentos do Cliente")){
//                        web().sleep(10);
//                        rGen().registerStep(web().getScreenshot(), "Visualizo o Valor Total no campo Evolução Patrimonial do cliente ");
//                        web().sleep(20);
//                        Assert.assertTrue(utilsPage.getValorTotalPatrimonio().isDisplayed());
//
//                    }
//                }break;
//            case "Ganhos no mês":
//                if(campo.equals("Evolução do Patrimônio")){
//                    if(tela.equals("Investimentos do Cliente")){
//                        web().sleep(20);
//                        Assert.assertTrue(utilsPage.getValorGanhoMesPatrimonio().isDisplayed());
//                    }
//                }break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponível");
//        }
//    }
//
//    public void validarContratos(String opcao) {
//        switch (opcao) {
////            case "Santander Prev PGBL":
////                web().sleep(60);
////                web().scroll(utilsPage.getContratos().get(0));
////                Assert.assertEquals(utilsPage.getContratos().get(0).getText(),opcao);
////                Assert.assertTrue(utilsPage.getContratos().get(0).isDisplayed());
////                rGen().registerStep(web().getScreenshot(), "Visualizo os contratos da opção Santander Prev PGBL");
////                break;
//
//            default:
//                throw new IllegalArgumentException("A opção não está disponível");
//        }
//    }
//
//    public void selecionarCertificado() {
//        web().sleep(5);
//        web().clickSelenium(utilsPage.getExpandirCertificados().get(0));
//        rGen().registerStep(web().getScreenshot(), "Selecionando certificado");
//    }
//
//    public void visualizarNaTela(String texto, String tela) {
//        switch (texto) {
//            case "Tributação: PROGRESSIVA":
//                web().sleep(30);
//                if (tela.equals("Posição Consolidada de Alíquotas - Santander Prev PGBL")) {
//                    rGen().registerStep(web().getScreenshot(), " Visualizo Tributação: PROGRESSIVA - Santander Prev PGBL ");
//                    Assert.assertEquals(utilsPage.getTributacaoProgressiva().getText(), texto);
//                    Assert.assertTrue(utilsPage.getTributacaoProgressiva().isDisplayed());
//                }
//                break;
//            case "CERTIFICADO":
//                if (tela.equals("Santander Prev PGBL")) {
//                    web().sleep(30);
////                web().scroll(utilsPage.getContratos().get(0));
//                    Assert.assertEquals(utilsPage.getCertificadosTelaPrevPGBL().getText(), texto);
//                    Assert.assertTrue(utilsPage.getCertificadosTelaPrevPGBL().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo os certificados da opção Santander Prev PGBL");
//                }
//                break;
//            case "Tributação: REGRESSIVA":
//                if (tela.equals("Posição Consolidada de Alíquotas - SantanderPrev VGBL - AFINIDADES")) {
//                    web().sleep(30);
//                    rGen().registerStep(web().getScreenshot(), " Visualizo Tributação: REGRESSIVA - Santander Prev VGBL - AFINIDADES ");
//                    Assert.assertEquals(utilsPage.getTributacaoRegressiva().getText(), texto);
//                    Assert.assertTrue(utilsPage.getTributacaoRegressiva().isDisplayed());
//                }
//                break;
//            case "Produto e certificado do cliente":
//                if (tela.equals("Resgatar Previdencia")) {
//                    web().sleep(10);
//                    rGen().registerStep(web().getScreenshot(), " Visualizo o Produto que foi selecionado na tela Resgate e certificado do cliente");
//                    Assert.assertTrue(utilsPage.getProdutoEcertificadoDocliente().get(2).isDisplayed());
//                }break;
//            case "Detalhamento do Resgate na tela":
//                if (tela.equals("Resgatar Previdencia")){
//                    web().sleep(10);
//                    rGen().registerStep(web().getScreenshot(), " Visualizo Detalhamento do Resgate ");
//                    Assert.assertTrue(utilsPage.getDetalahamentoDoResgate().isDisplayed());
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//
//    public void visualizarNaTela(String tela) {
//        switch (tela) {
//            case "Posição Consolidada de Alíquotas - Santander Prev PGBL":
//                web().sleep(50);
//                Assert.assertEquals(utilsPage.tituloPosicaoConsolidadaDeAliquotasPrevPgbl.getText(), tela);
//                Assert.assertTrue(utilsPage.getTituloPosicaoConsolidadaDeAliquotasPrevPgbl().isDisplayed());
//                rGen().registerStep(web().getScreenshot(), "Visualizo Posição Consolidada de Alíquotas - Santander Prev PGBL");
//                break;
//            case "Resgatar Previdência":
//                web().sleep(25);
//                Assert.assertEquals(utilsPage.getTelaResgatarPrevidencia().getText(), tela);
//                Assert.assertTrue(utilsPage.getTelaResgatarPrevidencia().isDisplayed());
//                rGen().registerStep(web().getScreenshot(), "Visualizo tela Resgatar Previdência");
//                break;
//            case "Resgates que necessitam apresentar documentos do Procurador, Tutor, Curador, devem seguir o fluxo através de formulário.":
//                web().sleep(25);
//                Assert.assertEquals(utilsPage.getMensagemTelaResgatarPrevidencia().getText(), tela);
//                Assert.assertTrue(utilsPage.getMensagemTelaResgatarPrevidencia().isDisplayed());
//                rGen().registerStep(web().getScreenshot(), "Visualizo mensagem Resgates que necessitam apresentar documentos do Procurador, Tutor, Curador, devem seguir o fluxo através de formulário");
//                break;
//            case "Para não residente fiscal no Brasil, o resgate deve seguir o fluxo através de formulário.":
//                web().sleep(25);
//                Assert.assertEquals(utilsPage.getMensagem2TelaResgatePrevidencia().getText(), tela);
//                Assert.assertTrue(utilsPage.getMensagem2TelaResgatePrevidencia().isDisplayed());
//                rGen().registerStep(web().getScreenshot(), "Visualizo mensagem Para não residente fiscal no Brasil, o resgate deve seguir o fluxo através de formulário.");
//                break;
//            case "Para Pessoa Politicamente Exposta (PEP), o resgate deve seguir o fluxo através de formulário.":
//                web().sleep(25);
//                Assert.assertEquals(utilsPage.getMensagem1EPessoaPoliticamenteExposta().getText(), tela);
//                Assert.assertTrue(utilsPage.getMensagem1EPessoaPoliticamenteExposta().isDisplayed());
//                rGen().registerStep(web().getScreenshot(), "Visualizo mensagem Para Pessoa Politicamente Exposta (PEP), o resgate deve seguir o fluxo através de formulário.");
//                break;
//            case "Atenção: a Evolução Patrimonial abaixo exibe a totalidade de investimentos do CPF/CNPJ do Cliente.":
//                web().sleep(20);
//                rGen().registerStep(web().getScreenshot(), "Visualizo mensagem Atenção a Evolução Patrimonial abaixo exibe a totalidade de investimentos do CPF/CNPJ do Cliente.");
////                Assert.assertEquals(utilsPage.getMensagemTotalInvestimento().getText(), tela);
//                Assert.assertTrue(utilsPage.getMensagemTotalInvestimento().isDisplayed());
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//
//    public void visualizoAOpcaoDeInvestimentoNaTela(@NotNull String opcao, String tela) {
//        switch (opcao) {
//            case "SANT FIQ DI SUPREMO":
//                if (tela.equals("RENDA VARIAVEL")) {
//                    web().sleep(60);
//                    rGen().registerStep(web().getScreenshot(), "Visualizo as opções de investimentos da opção Renda Variavel");
//                    Assert.assertEquals(utilsPage.getSantFiqDiSupremo().getText(), opcao);
//                    Assert.assertTrue(utilsPage.getSantFiqDiSupremo().isDisplayed());
//                }
//                break;
//            case "Santander Prev PGBL - AFINIDADES":
//                if (tela.equals("PREV E ALTERNATIVOS")) {
//                    web().sleep(3);
//                    Assert.assertEquals(utilsPage.getOpcaoSantanderPrevPGBLAfinidades().getText(), opcao);
//                    web().scroll(200);
//                    rGen().registerStep(web().getScreenshot(), "Visualizo as opções de investimentos do Produto PREV E ALTERNATIVOS");
//                    Assert.assertTrue(utilsPage.getOpcaoSantanderPrevPGBLAfinidades().isDisplayed());
//                }
//                break;
//            case "SANT INTELIGENTE 3530 ":
//                if (tela.equals("INFLACAO")) {
//                    web().sleep(30);
//                    web().scroll(200);
//                    Assert.assertEquals(utilsPage.getOpcaoSaintInteligente350().getText(), opcao);
//                    rGen().registerStep(web().getScreenshot(), "Visualizo as opções de investimentos da opção INFLAÇÃO");
//                    Assert.assertTrue(utilsPage.getOpcaoSaintInteligente350().isDisplayed());
//                }
//                break;
//
//            case "SANT MASTER RF R42 DI ":
//                if (tela.equals("CREDITO PRIVADO ")) {
//                    web().sleep(50);
//                    rGen().registerStep(web().getScreenshot(), "Visualizo as opções de investimentos da opção CREDITO PRIVADO");
//                    Assert.assertEquals(utilsPage.getOpcaoSantMasterRF42DI().getText(), opcao);
//                    Assert.assertTrue(utilsPage.getOpcaoSantMasterRF42DI().isDisplayed());
//                }
//                break;
//            case "POUPANCA ESPECIAL PESSOA FISICA":
//                if (tela.equals("DI")) {
//                    web().scroll(200);
//                    web().sleep(50);
//                    rGen().registerStep(web().getScreenshot(), "Visualizo as opções de investimentos da opção DI");
//                    Assert.assertEquals(utilsPage.getOpcaoPoupancaEspecial().getText(), opcao);
//                    Assert.assertTrue(utilsPage.getOpcaoPoupancaEspecial().isDisplayed());
//                }
//                break;
//            case "SANTANDER SENIOR RF 407":
//                if (tela.equals("Renda Fixa PRE")){
//                    web().sleep(50);
//                    web().scroll(200);
//                    rGen().registerStep(web().getScreenshot(), "Visualizo as opções de investimentos da opção Renda Fixa PRE");
//                    Assert.assertEquals(utilsPage.getOpcaoSantanderSeniorRf407().getText(), opcao);
//                    Assert.assertTrue(utilsPage.getOpcaoSantanderSeniorRf407().isDisplayed());
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//
//    public void validarBotao(String botao, String tela) {
//        switch (botao) {
//            case "Resgatar":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(60);
//                    web().scroll(700);
//                    web().moveToElement(utilsPage.getBotaoResgatarAplicar().get(0));
//                    rGen().registerStep(web().getScreenshot(), "O Botão Resgatar esta visivel e clicavel");
//                    Assert.assertTrue(utilsPage.getBotaoResgatarAplicar().get(0).isDisplayed());
//
//                } else if (tela.equals("Resgate")) {
//                    web().scroll(50);
//                    web().sleep(3);
////                    Assert.assertEquals(utilsPage.getBotaoResgatarResgate(),botao);
//                    Assert.assertTrue(utilsPage.getBotaoResgatarResgate().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "O Botão Resgatar esta visível e clicavel");
//                }
//                break;
//            case "PRODUTOS":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(30);
//                    web().scroll(100);
//                    Assert.assertTrue(utilsPage.getBotaoProdutos().isDisplayed(), botao);
//                    rGen().registerStep(web().getScreenshot(), "O botão Produtos esta visível e clicavel");
//                }
//                break;
//            case "CLASSE DE ATIVOS":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(30);
//                    web().scroll(100);
//                    web().clickSelenium(utilsPage.getBotaoClasseDeAtivos());
//                    Assert.assertTrue(utilsPage.getBotaoClasseDeAtivos().isDisplayed(), botao);
//                    rGen().registerStep(web().getScreenshot(), "O botão Classe de Ativos está visível e clicável");
//                }
//                break;
//            case "Voltar":
//                if (tela.equals("Resgatar Previdência")) {
//                    web().sleep(60);
//                    web().scroll(100);
//                    Assert.assertTrue(utilsPage.getBotaoVoltarResgatarPrevidencia().isDisplayed(), botao);
//                    rGen().registerStep(web().getScreenshot(), "O botão Voltar está visível e clicável");
//                }else if (tela.equals("Investimentos do Cliente")){
//                    web().sleep(20);
//                    web().scroll(900);
//                    Assert.assertTrue(utilsPage.getBotaoVoltarTelaInvestimento().isDisplayed(), botao);
//                    rGen().registerStep(web().getScreenshot(), "O botão Voltar está visível e clicável");
//                }
//                break;
//            case "Aplicar":
//                if (tela.equals("Investimentos do Cliente")) {
//                    web().sleep(20);
//                    web().scroll(600);
//                    web().moveToElement(utilsPage.getBotaoAplicar());
//                    Assert.assertTrue(utilsPage.getBotaoAplicar().isDisplayed(), botao);
//                    rGen().registerStep(web().getScreenshot(), "O botão Aplicar esta visível e clicavel");
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//
//    public void clicarComJS(WebElement psElemento) {
//        JavascriptExecutor jsDriver = ((JavascriptExecutor) web().getWebDriver());
//        jsDriver.executeScript("document.querySelector(argmunts[0], before.click)", psElemento);
//    }
//
//    public void selecionoUmProdutoNaTela(String opcao, String tela) {
//        switch (opcao) {
//            case "PRODUTO":
//                if (tela.equals("Resgate")) {
//                    web().sleep(3);
//                    web().scroll(400);
//                    web().sleep(2);
//                    rGen().registerStep(web().getScreenshot(), " Seleciono um produto da tela Resgate");
//                    web().click(utilsPage.getExpandirProdutoResgate());
//                    web().sleep(1);
//                }
//                break;
//            case "Fundo":
//                if (tela.equals("Resgatar Previdencia")) {
//                    web().sleep(3);
//                    rGen().registerStep(web().getScreenshot(), " Seleciono um Fundo da tela Resgatar Previdencia");
////                    web().click(utilsPage.getExpandirResgate().get(1));
//                    web().sleep(1);
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//
//    public void clicarBotaoNaOpcao(String botao, String opcao) {
//        switch (botao) {
//            case "Resgatar":
//                if (opcao.equals("Investimentos do Cliente")) {
//                    web().sleep(30);
//                    web().scroll(100);
//                    web().moveToElement(utilsPage.getBotaoResgatarAplicar().get(0));
//                    web().scroll(500);
//                    web().sleep(10);
//                    rGen().registerStep(web().getScreenshot(), " Clico no botão Resgatar ");
//                    web().click(utilsPage.getBotaoResgatarAplicar().get(0));
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//    public void clicoNoBotaoNaOpcaoNaTela(String botao, String opcao, String tela){
//        switch (botao){
//            case "Voltar":
//                if (opcao.equals("Patrimonio")){
//                    if (tela.equals("Investimentos do Cliente"));
//                    web().sleep(20);
//                    web().scroll(950);
//                    rGen().registerStep(web().getScreenshot(), "Clico no botão Voltar na opção Patrimonio");
//                    web().sleep(10);
//                    web().clickSelenium(utilsPage.getBotaoVoltarPatrimonio());
//                    web().sleep(3);
//                }break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//    public void clicoNaOpçãoDaQuestãoNaTela(String opcao, String questao, String tela) {
//        switch (opcao) {
//            case "Sim":
//                if (questao.equals("É PESSOA POLITICAMENTE EXPOSTA")) {
//                    if (tela.equals("Resgatar Previdencia")) {
//                        web().sleep(30);
////                        web().scroll(-200);
//                        web().clickSelenium(utilsPage.getRadioButtonSim().get(1));
//                        rGen().registerStep(web().getScreenshot(), " Clico na opção Sim para a questão É PESSOA POLITICAMENTE EXPOSTA? ");
//                    }
//                }
//                break;
//            case "Não":
//                if (questao.equals("É PESSOA POLITICAMENTE EXPOSTA")) {
//                    if (tela.equals("Resgatar Previdencia")) {
//                        web().sleep(10);
////                        web().scroll(-200);
//                        rGen().registerStep(web().getScreenshot(), " Clico na opção Não para a questão É PESSOA POLITICAMENTE EXPOSTA? ");
//                        web().clickSelenium(utilsPage.getRadioButtonNao().get(1));
//                    }
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//    public void visualizoQuestãoEstaVisivelEClicavelNaTela(String questao, String tela) {
//        switch (questao) {
//            case "É PESSOA POLITICAMENTE EXPOSTA?":
//                if (tela.equals("Resgatar Previdencia")) {
//                    web().sleep(3);
//                    rGen().registerStep(web().getScreenshot(), " Visualizo questão É PESSOA POLITICAMENTE EXPOSTA visível e clicável");
//                    Assert.assertTrue(utilsPage.getQuestaoEPessoaPoliticamenteExposta().isDisplayed());
//                    web().sleep(1);
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//    public void visualizoQueOBotãoEstaVisivelNaTela(String botao, String tela) {
//        switch (botao) {
//            case "Valor Parcial":
//                if (tela.equals("Resgatar Previdencia")) {
//                    web().sleep(3);
//                    rGen().registerStep(web().getScreenshot(), " Visualizo que o botão Valor Parcial está visível");
//                    Assert.assertTrue(utilsPage.getBotãoValorParcial().isDisplayed());
//                    web().sleep(1);
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//    public void clicoNaMensagemNaTela(String mensagem, String tela){
//        switch (mensagem){
//            case "O cliente não possui Perfil de Investidor Clique aqui para responder":
//                if (tela.equals("Investimentos do Cliente")){
//                    web().sleep(40);
//                    rGen().registerStep(web().getScreenshot(), " Clico na mensagem O cliente não possui Perfil de Investidor Clique aqui para responder ");
//                    web().clickSelenium(utilsPage.getMensagemCliqueAquiParaResponder());
//                }break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//    public void clicoNoMêsDoNaTela(String mes, String campo, String tela){
//        switch (mes){
//            case "Abril/21":
//                if (campo.equals("Grafico Evolucao do Patrimonio")){
//                    if (tela.equals("Investimentos do Cliente")){
//                        web().sleep(10);
//                        web().scroll(300);
//                        web().sleep(1);
//                        rGen().registerStep(web().getScreenshot(), " Clico no mês de Abril/21 do Grafico na tela Investimento do cliente");
//                        web().moveToElement(utilsPage.getOpcaoGrafico().get(3));
//                        web().click(utilsPage.getOpcaoGrafico().get(3));
//                    }break;
//                }
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//    }
//    public void visualizoReferenteAoMesNaTela(String valores, String campo,String tela){
//        switch (valores){
//            case "Abril/21":
//                if (tela.equals("Investimentos do Cliente")){
//                    web().sleep(3);
//                    rGen().registerStep(web().getScreenshot(), " Visualizo VALOR TOTAL e GANHOS NO MÊS referente ao mês Abril/21 do Grafico");
////                    Assert.assertTrue(utilsPage.getBotãoValorParcial().isDisplayed());
//                    web().sleep(1);
//                }break;
//            default:
//                throw new IllegalArgumentException("A opção não está disponivel");
//        }
//        public void acessarsite() throws AWTException {
//            web().navigateToUrl();
//            rGen().registerStep(web().getScreenshot(), " Inserindo login e senha ");
//            web().sleep(2);
//            Robot robot = new Robot();
//            robot.keyPress(KeyEvent.VK_T);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_6);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_3);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_2);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_9);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_9);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_3);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_TAB);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_SHIFT);
//            robot.keyPress(KeyEvent.VK_S);
//            robot.keyRelease(KeyEvent.VK_SHIFT);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_A);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_N);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_T);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_A);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_N);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_D);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_E);
//            robot.delay(100);
//            robot.keyPress(KeyEvent.VK_R);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_SHIFT);
//            robot.keyRelease(KeyEvent.VK_SHIFT);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_2);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_0);
//            robot.delay(500);
//            robot.keyPress(KeyEvent.VK_SHIFT);
//            robot.keyRelease(KeyEvent.VK_SHIFT);
//            robot.keyPress(KeyEvent.VK_ENTER);
//            //robot.delay(30000);
//            //robot.keyPress(KeyEvent.VK_ENTER);
////        web().sleep(5);
////        web().clickSelenium(homePage.getBotaoIniciarpaginainicial());
////        web().sleep(5);
////        web().clickSelenium(homePage.getIconeFecharPaginaInicial().get(7));
//        }
//
//        public void insiroLoginDoUsuarioNaPopUp(String valor, String popUp) {
//            switch (valor) {
//                case "T599555":
//                    if (popUp.equals("Fazer login")) {
//                        web().sleep(2);
//                        rGen().registerStep(web().getScreenshot(), " Clicando em Cancelar ");
//                    }break;
//                default:
//                    throw new IllegalArgumentException("A opção não está disponível");
//            }
//        }
//        public void insiroOCPFNoCampoNaTela(String valor, String campo, String tela) {
//            switch (valor) {
//                case "42676134000":
//                    if (campo.equals("Busca por CPF/CNPJ ou Agência e Conta")) {
//                        if (tela.equals("PÁGINA INICIAL")) {
//                            web().elementIsVisible(homePage.getPaginaInicial(),40);
//                            web().insertText(homePage.getInserirCPF(), valor);
//                            web().sleep(10);
//                            rGen().registerStep(web().getScreenshot(), " Inserindo o CPF");
//                            web().clickSelenium(utilsPage.getClicarLupa());
//                            web().clickSelenium(homePage.getInserirCPF());
//                            web().clickSelenium(utilsPage.getClicarLupa());
//                            //web().elementIsVisible(homePage.getTelaCarregando(),30);
//                            web().sleep(20);
//                            web().clickSelenium(utilsPage.getPopUpAlertadoCliente());
//                        }break;
//                    }
//                default:
//                    throw new IllegalArgumentException("A opção não está disponível");
//            }
//        }
//        public void clicoNaPopUp(String valor) {
//            switch (valor) {
//                case "Alertas do Cliente":
//                    web().clickSelenium(homePage.getFecharPopUp());
//                    rGen().registerStep(web().getScreenshot(), " Clico para fechar a popUp");
//                    break;
//                default:
//                    throw new IllegalArgumentException("A opção não está disponível");
//            }
//        }
//        public void clicoNoIconeIniciaisDoClienteNaTelaInicial(String valor) {
//            switch (valor) {
//                case "PP":
//                    web().sleep(10);
//                    rGen().registerStep(web().getScreenshot(), "Clico no ícone Iniciais do Cliente ");
//                    web().clickSelenium(homePage.getIniciaisCliente());
//                    break;
//                default:
//                    throw new IllegalArgumentException("A opção não está disponível");
//            }
//        }
//        public void visualizoATela(String tela) {
//            switch (tela) {
//                case "Fique Ligado":
//                    web().clearElement(homePage.telaCarregando);
//                    Assert.assertTrue(homePage.getTelaFiqueLigado().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo a tela Fique Ligado");
//                    break;
//                case "PÁGINA INICIAL":
//                    web().elementIsVisible(homePage.getPaginaInicial(),60);
//                    //Assert.assertEquals(tela, homePage.getPaginaInicial().getAttribute("value"));
//                    Assert.assertTrue(homePage.getPaginaInicial().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo a tela Pagina Inicial");
//                    break;
//                case "Investimentos do Cliente":
//                    web().sleep(30);
////                web().clearElement(homePage.telaCarregando);
//                    Assert.assertEquals(homePage.getTituloInvestimentosDoCliente().getText(),tela);
//                    rGen().registerStep(web().getScreenshot(), "Visualizo a tela Investimentos do Cliente");
//                    Assert.assertTrue(homePage.getTituloInvestimentosDoCliente().isDisplayed());
//
//                    break;
//                case "Investimento por produto":
//                    web().sleep(30);
////                web().clearElement(homePage.telaCarregando);
//                    Assert.assertEquals(utilsPage.getTituloInvestimentoPorProduto().getText(),tela);
//                    Assert.assertTrue(utilsPage.getTituloInvestimentoPorProduto().isDisplayed());
//                    rGen().registerStep(web().getScreenshot(), "Visualizo a tela Investimento por produto");
//                    break;
//                default:
//                    throw new IllegalArgumentException("A opção não está disponível");
//            }
//        }
//        public void visualizoOpcaoNaTabela(String opcao, String tabela) {
//            switch (opcao) {
//                case "Investimentos do Cliente":
//                    if (tabela.equals("INVESTIMENTOS")) {
//                        web().sleep(30);
//                        Assert.assertTrue(utilsPage.getTituloInvestimentosDoCliente().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Visualizo a opção Investimento do Cliente");
//                    }
//                    break;
//                default:
//                    throw new IllegalArgumentException("A opção não está disponível");
//
//            }
//        }
//
//
//        @Log4j2
//        public class UtilsLogic {
//
//            private ProdutividadePorProfissionalPage produtividadePorProfissionalPage;
//            private LoginPage loginPage;
//            private IBData IBData;
//            private UtilsPage utilsPage;
//            private DetalhePage detalhePage;
//            private OutlierPage outlierPage;
//            private InicioDiaPage inicioDiaPage;
//            private HomePage homePage;
//            private ProdutividadeDoDiaPage produtividadeDoDiaPage;
//            private ConectividadeTrabalhoRemotoPage conectividadeTrabalhoRemotoPage;
//            private PerfilParametrizavelPage perfilParametrizavelPage;
//            private AutomacaoRHPage automacaoRHPage;
//            WebDriverWait aguarde = new WebDriverWait(web().getWebDriver(), 30);
//
//
//            public UtilsLogic() throws IOException {
//                conectividadeTrabalhoRemotoPage = PageMaker.getInstanceWeb(ConectividadeTrabalhoRemotoPage.class);
//                produtividadeDoDiaPage = PageMaker.getInstanceWeb(ProdutividadeDoDiaPage.class);
//                homePage = PageMaker.getInstanceWeb(HomePage.class);
//                inicioDiaPage = PageMaker.getInstanceWeb(InicioDiaPage.class);
//                outlierPage = PageMaker.getInstanceWeb(OutlierPage.class);
//                detalhePage = PageMaker.getInstanceWeb(DetalhePage.class);
//                produtividadePorProfissionalPage = PageMaker.getInstanceWeb(ProdutividadePorProfissionalPage.class);
//                loginPage = PageMaker.getInstanceWeb(LoginPage.class);
//                utilsPage = PageMaker.getInstanceWeb(UtilsPage.class);
//                perfilParametrizavelPage = PageMaker.getInstanceWeb(PerfilParametrizavelPage.class);
//                automacaoRHPage = PageMaker.getInstanceWeb(AutomacaoRHPage.class);
//                IBData = (IBData) Context.testData();
//            }
//
//            public void validarTela(String tela) {
//                switch (tela) {
//                    case "Produtividade por Profissional":
//                        web().sleep(5);
//                        web().moveToElement(produtividadePorProfissionalPage.getTituloProdutividadePorProfissional());
//                        Assert.assertTrue(produtividadePorProfissionalPage.getTituloProdutividadePorProfissional().isDisplayed());
//                        web().elementIsVisible(produtividadePorProfissionalPage.getBotaoExportarPdf());
//                        web().sleep(3);
//                        rGen().registerStep(web().getScreenshot(), "Tela Produtividade por Profissional");
//                        break;
//                    case "Detalhe":
//                        web().isDisplayed(detalhePage.getTituloDetalhe());
//                        //web().scroll(detalhePage.getTituloDetalhe());
//                        rGen().registerStep(web().getScreenshot(), "Tela Detalhe");
//                        break;
//                    case "Outlier":
//                        web().sleep(4);
//                        web().isDisplayed(outlierPage.getTituloOutlier());
//                        rGen().registerStep(web().getScreenshot(), "Tela Outlier");
//                        break;
//                    case "Início de Dia":
//                        web().sleep(4);
//                        Assert.assertTrue(inicioDiaPage.getTituloInicioDeDia().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Tela Inicio Dia");
//                        break;
//                    case "Home":
//                        web().sleep(4);
//                        Assert.assertTrue(homePage.getTituloHome().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Tela Home");
//                        break;
//                    case "Produtividade do Dia":
//                        web().sleep(5);
//                        web().moveToElement(produtividadeDoDiaPage.getTituloProdutividadeDoDia());
//                        Assert.assertTrue(produtividadeDoDiaPage.getTituloProdutividadeDoDia().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Tela Produtividade do Dia");
//                        break;
//                    case "Conectividade - Trabalho Remoto":
//                        web().sleep(5);
//                        web().moveToElement(conectividadeTrabalhoRemotoPage.getTelaConectividadeTrabalhoRemoto());
//                        Assert.assertTrue(conectividadeTrabalhoRemotoPage.getTelaConectividadeTrabalhoRemoto().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Tela Conectividade - Trabalho Remoto");
//                        break;
//                    case "Perfil Parametrizavel":
//                        web().sleep(5);
//                        web().moveToElement(perfilParametrizavelPage.getTelaPerfilParametrizavel());
//                        Assert.assertTrue(perfilParametrizavelPage.getTelaPerfilParametrizavel().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Tela Perfil Parametrizável");
//                        break;
//                    case "Aderência por Profissional":
//                        web().sleep(5);
//                        web().scroll(-300);
////                web().moveToElement(utilsPage.getTituloAderenciaPorProfissional());
//                        Assert.assertTrue(utilsPage.getTituloAderenciaPorProfissional().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Tela Aderência por Profissional");
//                        break;
//                    default:
//                        throw new IllegalArgumentException("A pagina não está visivel");
//                }
//            }
//
//            public void enterRobbot() {
//                Robot robot = null;
//                try {
//                    robot = new Robot();
//                } catch (AWTException e) {
//                    e.printStackTrace();
//                }
//                robot.keyPress(KeyEvent.VK_ENTER);
//            }
//
//            public void espera() {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            private String getDataAtual() {
//                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                Date date = new Date();
//                return dateFormat.format(date);
//            }
//
//            public String dataHoje = getDataAtual();
//
//
//            public void recuperarNumeroDeId(String ids) throws IOException {
//                if (ids.equals("BNDU")) {
//                    web().sleep(4);
//                    Path idImovel = Paths.get("src\\main\\resources\\casoId.properties");
//            /*String ct = loginPage.getElemntoRecuprado.getText();
//            byte[] ctId = ct.getBytes();
//            Files.write(idImovel, ctId); */
//                }
//            }
//
//            public String recuperarCts() throws IOException {
//                web().sleep(4);
//                Path idImovel = Paths.get("src\\main\\resources\\casoId.properties");
//      /*  String ct = loginPage.getRecurar.getText();
//        byte[] ctId = ct.getBytes();
//        Files.write(idImovel, ctId);
//        return ct; */
//                return "slkslsdk";
//            }
//
//            private static Properties prop = null;
//
//            private static Properties getPropities() throws IOException {
//                if (prop == null) {
//                    InputStream inp = PropertiesUtil.class.getResourceAsStream("/casoId.properties");
//                    prop = new Properties();
//                    prop.load(inp);
//                    inp.close();
//                }
//                return prop;
//            }
//
//            public String getProperty(String valor) {
//                try {
//                    return getPropities().getProperty(valor);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                return null;
//            }
//
//            public String leraquivo() {
//                File idImovel = new File("src/main/resources/casoId.properties");
//                String MeuImovel = idImovel.getAbsolutePath();
//                FileInputStream fis = null;
//
//                try {
//                    fis = new FileInputStream(MeuImovel);
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//                InputStreamReader isr = new InputStreamReader(fis);
//                BufferedReader br = new BufferedReader(isr);
//
//                String cts = null;
//                try {
//                    cts = br.readLine();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                return cts;
//            }
//
//            public void acessarLink(String link) {
//                if (link.equals("https://s2m.santanderbr.pre.corp/analyzer/#/connectivity")) {
//                    web().getWebDriver().get(link);
//                    rGen().registerStep(web().getScreenshot(), "Acessando link Conectividade");
//                } else if (link.equals("https://s2m.santanderbr.pre.corp/analyzer/#/parameterizable-profile")) {
//                    web().sleep(10);
//                    web().getWebDriver().get(link);
//                    rGen().registerStep(web().getScreenshot(), "Acessando link Perfil Parametrizável");
//                } else if (link.equals("https://s2m.santanderbr.pre.corp/analyzer/#/outlier")) {
//                    web().sleep(8);
//                    web().getWebDriver().get(link);
//                    web().elementIsVisible(outlierPage.getTituloOutlier());
//                    rGen().registerStep(web().getScreenshot(), "Acessando link Outlier");
//                } else if (link.equals("https://s2m.santanderbr.pre.corp/analyzer/#/start-day")) {
//                    web().getWebDriver().get(link);
//                    web().elementIsVisible(inicioDiaPage.getBotaoAplicarFiltros());
//                    rGen().registerStep(web().getScreenshot(), "Acessando link Inicio de Dia");
//                } else if (link.equals("https://s2m.santanderbr.pre.corp/analyzer/#/outlier/detail")) {
//                    web().getWebDriver().get(link);
//                    web().elementIsVisible(detalhePage.getTituloDetalhe());
//                    rGen().registerStep(web().getScreenshot(), "Acessando link Detalhe");
//                } else if (link.equals("https://s2m.santanderbr.pre.corp/analyzer/#/outlier/remote-profile?type=0&idPerson=13185")) {
//                    web().getWebDriver().get(link);
//                    web().elementIsVisible(detalhePage.getTituloDetalhe());
//                    rGen().registerStep(web().getScreenshot(), "Acessando link Produtividade por Profissional");
//                } else if (link.equals("https://s2m.santanderbr.pre.corp/analyzer/#/daily-productivity")) {
//                    web().getWebDriver().get(link);
//                    web().elementIsVisible(detalhePage.getTituloDetalhe());
//                    rGen().registerStep(web().getScreenshot(), "Acessando link Produtividade do Dia");
//                }else if (link.equals("https://s2m.santanderbr.pre.corp/analyzer/#/automation")) {
//                    web().sleep(10);
//                    web().getWebDriver().get(link);
//                    // web().elementIsVisible(detalhePage.getTituloDetalhe());
//                    web().sleep(6);
//                    rGen().registerStep(web().getScreenshot(), "Acessando link Automação RH");
//                } else
//                {
//                    throw new IllegalArgumentException("O link não foi implementado");
//                }
//
//            }
//
//            public void inserirValornoCampoDaTela(String valor, String campo, String tela) {
//                switch (valor) {
//                    case "2062021":
//                        if (campo.equals("Periodo")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                web().sleep(4);
//                                web().insertText(produtividadeDoDiaPage.getCampoPeriodo(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor 20/06/2021 no campo Periodo");
//                            } else if (tela.equals("Conectividade - Trabalho Remoto")) {
//                                web().insertText(conectividadeTrabalhoRemotoPage.getSelecioneUmaData(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor 20/06/2021 no campo Selecione uma Data");
//                            }
//                        }
//                        break;
//                    case "201":
//                        if (campo.equals("Periodo")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                web().sleep(4);
//                                web().insertText(produtividadeDoDiaPage.getCampoPeriodo(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor 20/01/2022 no campo Periodo");
//                            } else if (tela.equals("Conectividade - Trabalho Remoto")) {
//                                web().insertText(conectividadeTrabalhoRemotoPage.getSelecioneUmaData(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor 20/01/2022 no campo Selecione uma Data");
//                            }
//                        }
//                        break;
//                    case "6":
//                        if (campo.equals("Periodo")) {
//                            if (tela.equals("Outlier")) {
//                                web().sleep(5);
//                                web().insertText(outlierPage.getCampoPeriodo(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor Junho no campo Periodo");
//                            } else if (tela.equals("Produtividade por Profissional")) {
//                                web().sleep(5);
//                                web().clickSelenium(produtividadePorProfissionalPage.getCampoMeseAno());
//                                web().insertText(produtividadePorProfissionalPage.getCampoMeseAno(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor Junho no campo Mês e Ano");
//                            }
//                        }
//                        break;
//                    case "1":
//                        if (campo.equals("Periodo")) {
//                            if (tela.equals("Produtividade por Profissional")) {
//                                web().insertText(produtividadePorProfissionalPage.getCampoMeseAno(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor Janeiro no campo Mês e Ano");
//                            } else if (tela.equals("Outlier")) {
//                                web().insertText(outlierPage.getCampoPeriodo(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor Janeiro no campo Mês e Ano");
//                            } else if (tela.equals("Detalhe")) {
//                                web().insertText(outlierPage.getCampoPeriodo(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor Janeiro no campo Mês e Ano");
//                            }
//                        }
//                        break;
//                    case "7":
//                        if (campo.equals("Periodo")) {
//                            if (tela.equals("Detalhe")) {
//                                web().sleep(5);
//                                web().insertText(outlierPage.getCampoPeriodo(), valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor Julho no campo Periodo");
//                            }
//                        }
//                        break;
//                    case "244666":
//                        if (campo.equals("Matricula ou Nome")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                //web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), valor);
//                                web().sleep(4);
//                                web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), "2");
//                                web().sleep(1);
//                                web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), "4");
//                                web().sleep(1);
//                                web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), "4");
//                                web().sleep(1);
//                                web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), "6");
//                                web().sleep(1);
//                                web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), "6");
//                                web().sleep(1);
//                                web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), "6");
//                                web().sleep(5);
//                                web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), " ");
//                                rGen().registerStep(web().getScreenshot(), "inserindo valor 244666 no campo Matricula ou Nome");
//                            }
//                        }else if (campo.equals("Busque por nome matricula")){
//                            if (tela.equals("Perfil Parametrizavel")){
//                                web().sleep(4);
//                                web().insertText(perfilParametrizavelPage.getDashboardBusquePorNomeMatricula(),valor);
//                                web().sleep(5);
//                                web().insertText(perfilParametrizavelPage.getDashboardBusquePorNomeMatricula(), " ");
//                                web().clickSelenium(perfilParametrizavelPage.getNomeAllanCaetano());
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor 244666 no campo Matricula ou Nome");
//                            }
//                        }
//                        break;
//                    case "Allan Caetano":
//                        if (campo.equals("Matricula ou Nome")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                web().sleep(4);
//                                web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), valor);
//                                web().sleep(5);
//                                web().insertText(produtividadeDoDiaPage.getCampoMatriculaOuNome(), " ");
//                                rGen().registerStep(web().getScreenshot(), "inserindo valor Allan Caetano no campo Matricula ou Nome");
//                            }
//                        }else if (campo.equals("Busque por nome matricula")){
//                            if (tela.equals("Perfil Parametrizavel")){
//                                web().sleep(4);
//                                web().insertText(perfilParametrizavelPage.getDashboardBusquePorNomeMatricula(),valor);
//                                web().sleep(5);
//                                web().insertText(perfilParametrizavelPage.getDashboardBusquePorNomeMatricula()," ");
//                                web().clickSelenium(perfilParametrizavelPage.getNomeAllanCaetano());
//                                rGen().registerStep(web().getScreenshot(), "Inserindo nome Allan Caetano no campo Busque por nome/matrícula");
//                            }
//                        }
//                        break;
//                    case "Yaman":
//                        if (campo.equals("Empresa / Fornecedor")) {
//                            if (tela.equals("Detalhe")) {
//                                web().insertText(detalhePage.getFiltroEmpresaFornecedor(), valor);
//                                web().sleep(5);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo o valor Yaman no campo Empresa / Fornecedor");
//
//                            }
//                        }
//                        break;
//                    case "Denise Risae Okuma":
//                        if (campo.equals("Buscar na tabela")){
//                            if(tela.equals("Modal Funcionarios")){
//                                web().sleep(5);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo nome Denise Risae Okuma no campo Buscar na tabela funcionários");
//                                web().insertText(conectividadeTrabalhoRemotoPage.getBuscartabelaModalFuncionario(),valor);
//                            }
//
//                        }break;
//                    case "Daniela Arruda Ramos Da Silva":
//                        if (campo.equals("Buscar na tabela")){
//                            if (tela.equals("Modal Prestadores")){
//                                web().sleep(5);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo nome Daniela Arruda da Silva no campo Buscar na tabela prestadores");
//                                web().insertText(conectividadeTrabalhoRemotoPage.getBuscartabelaModalFuncionario(),valor);
//                            }
//                        }break;
//                    case "SERVICOS CENTRAIS&SEGUROS-SBT":
//                        if (campo.equals("Busque por uma Área")){
//                            if (tela.equals("Perfil Parametrizavel")){
//                                web().insertText(perfilParametrizavelPage.getDashboardBusquePorUmaArea(), valor);
//                                web().sleep(2);
//                                web().insertText(perfilParametrizavelPage.getDashboardBusquePorUmaArea(), " ");
//                                web().sleep(2);
//                                web().clickSelenium(perfilParametrizavelPage.getOpcaoServicosCentraisESegurosSbt());
//                                web().sleep(2);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo opção SERVICOS CENTRAIS&SEGUROS-SBT no campo Busque por uma Área ");
//
//                            }
//                        }break;
//                    default:
//                        throw new IllegalArgumentException("O campo não foi implementado");
//                }
//            }
//
//
//            public void clicarBotaoNaTela(String botao, String tela) {
//                switch (botao) {
//                    case "Aplicar filtros":
//                        if (tela.equals("Produtividade do Dia")) {
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Aplicar filtros");
//                            web().clickSelenium(produtividadeDoDiaPage.getBotaoAplicarFiltros());
//                        } else if (tela.equals("Outlier")) {
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Aplicar filtros");
//                            web().clickSelenium(outlierPage.getBotaoAplicarFiltros());
//                        } else if (tela.equals("Detalhe")) {
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Aplicar filtros");
//                            web().clickSelenium(detalhePage.getBotaoAplicarFiltros());
//                        } else if (tela.equals("Conectividade - Trabalho Remoto")) {
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Aplicar filtros");
//                            web().clickSelenium(conectividadeTrabalhoRemotoPage.getBotaoAplicarFiltros());
//                            web().sleep(2);
//                        }else if (tela.equals("Perfil Parametrizavel")){
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Aplicar filtros");
//                            web().clickSelenium(perfilParametrizavelPage.getAplicarFiltrosTelaParametrizavel());
//                            web().sleep(2);
//                        }
//                        break;
//                    case "Limpar Filtros":
//                        if (tela.equals("Outlier")) {
//                            web().sleep(4);
//                            web().moveToElement(outlierPage.getBotaoLimparFiltros());
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Limpar Filtros");
//                            web().clickSelenium(outlierPage.getBotaoLimparFiltros());
//                        } else if (tela.equals("Produtividade do Dia")) {
//                            web().sleep(4);
//                            web().moveToElement(produtividadeDoDiaPage.getBotaoLimparFiltros());
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Limpar Filtros");
//                            web().clickSelenium(produtividadeDoDiaPage.getBotaoLimparFiltros());
//                        } else if (tela.equals("Detalhe")) {
//                            web().sleep(4);
//                            web().moveToElement(detalhePage.getBotaoLimparFiltros());
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Limpar Filtros");
//                            web().clickSelenium(produtividadeDoDiaPage.getBotaoLimparFiltros());
//                        } else if (tela.equals("Conectividade - Trabalho Remoto")){
//                            web().sleep(4);
//                            web().moveToElement(conectividadeTrabalhoRemotoPage.getBotaoLimparFiltros());
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Limpar Filtros");
//                            web().clickSelenium(conectividadeTrabalhoRemotoPage.getBotaoLimparFiltros());
//                        }
//                        break;
//                    case "N1":
//                        if (tela.equals("Outlier")) {
//                            web().moveToElement(outlierPage.getFiltrosOutlier().get(2));
//                            web().clickSelenium(outlierPage.getFiltrosOutlier().get(2));
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão N1");
//                        } else if (tela.equals("Produtividade do Dia")) {
//                            web().moveToElement(produtividadeDoDiaPage.getFiltrosProdutividadeDoDia().get(2));
//                            web().clickSelenium(produtividadeDoDiaPage.getFiltrosProdutividadeDoDia().get(2));
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão N1");
//                        } else if (tela.equals("Detalhe")) {
//                            web().moveToElement(detalhePage.getFiltrosDetalhe().get(2));
//                            web().clickSelenium(detalhePage.getFiltrosDetalhe().get(2));
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão N1");
//                        }else if (tela.equals("Conectividade - Trabalho Remoto")){
//                            web().moveToElement(conectividadeTrabalhoRemotoPage.getFiltrosConectividadeTrabalhoRemoto().get(2));
//                            web().clickSelenium(conectividadeTrabalhoRemotoPage.getFiltrosConectividadeTrabalhoRemoto().get(2));
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão N1");
//                        }
//                        break;
//                    case "N2":
//                        if (tela.equals("Outlier")) {
//                            web().moveToElement(outlierPage.getFiltrosOutlier().get(3));
//                            web().clickSelenium(outlierPage.getFiltrosOutlier().get(3));
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão N2");
//                        } else if (tela.equals("Produtividade do Dia")) {
//                            web().moveToElement(produtividadeDoDiaPage.getFiltrosProdutividadeDoDia().get(3));
//                            web().clickSelenium(produtividadeDoDiaPage.getFiltrosProdutividadeDoDia().get(3));
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão N2");
//                        } else if (tela.equals("Detalhe")) {
//                            web().moveToElement(detalhePage.getFiltrosDetalhe().get(3));
//                            web().clickSelenium(detalhePage.getFiltrosDetalhe().get(3));
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão N2");
//                        }else if (tela.equals("Conectividade - Trabalho Remoto")){
//                            web().moveToElement(conectividadeTrabalhoRemotoPage.getFiltrosConectividadeTrabalhoRemoto().get(3));
//                            web().clickSelenium(conectividadeTrabalhoRemotoPage.getFiltrosConectividadeTrabalhoRemoto().get(3));
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão N2");
//                        }
//                        break;
//
//                    case "Fechar modal":
//                        if (tela.equals("Modal Funcionarios")){
//                            web().moveToElement(conectividadeTrabalhoRemotoPage.getBotaoFecharModal());
//                            web().clickSelenium(conectividadeTrabalhoRemotoPage.getBotaoFecharModal());
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Fechar Modal");
//                        }else if (tela.equals("Modal Prestadores")){
//                            web().moveToElement(conectividadeTrabalhoRemotoPage.getBotaoFecharModal());
//                            web().clickSelenium(conectividadeTrabalhoRemotoPage.getBotaoFecharModal());
//                            rGen().registerStep(web().getScreenshot(), "Clicando no botão Fechar Modal");
//                        }
//                        break;
//                    case "Conceder acessos":
//                        if (tela.equals("Perfil Parametrizavel")){
//                            web().sleep(5);
//                            rGen().registerStep(web().getScreenshot(),"Clicando no botão Conceder acessos");
//                            web().clickSelenium(perfilParametrizavelPage.getBotaoConcederAcessos());
//                        }
//                        break;
//                    case "Remover acesso":
//                        if (tela.equals("Perfil Parametrizavel")){
//                            web().sleep(5);
//                            rGen().registerStep(web().getScreenshot(),"Clicando no botão Remover acessos");
//                            web().clickSelenium(perfilParametrizavelPage.getBotaoRemoverAcesso());
//                        }
//                        break;
//                    case "Cancelar Processo":
//                        if (tela.equals("Automação RH")){
//                            web().sleep(5);
//                            rGen().registerStep(web().getScreenshot(),"Clicando no botão Cancelar Processo");
//                            web().clickSelenium(automacaoRHPage.getBotaoCancelarProcesso());
//                        }
//                        break;
//                    case "Gerar Arquivo":
//                        if (tela.equals("Automação RH")){
//                            web().sleep(5);
//                            web().clickSelenium(automacaoRHPage.getBotaoGerarArquivo());
//                            rGen().registerStep(web().getScreenshot(),"Clicando no botão Gerar Arquivo");
//                            web().sleep(2);
//
//                        } break;
//                    case "Modalidade":
//                        if (tela.equals("Inicio de Dia")){
//                            web().sleep(5);
//                            web().clickSelenium(inicioDiaPage.getCamposInicioDia().get(2));
//                            web().sleep(5);
//                            rGen().registerStep(web().getScreenshot(),"Clicando no botão Modalidade");
//                        }else if (tela.equals("Outlier")){
//                            web().sleep(4);
//                            web().moveToElement(outlierPage.getBotaoAplicarFiltros());
//                            web().clickSelenium(inicioDiaPage.getCamposInicioDia().get(6));
//                            web().sleep(5);
//                            rGen().registerStep(web().getScreenshot(),"Clicando no botão Modalidade");
//                        }else if (tela.equals("Detalhe")){
//                            web().sleep(5);
//                            web().moveToElement(detalhePage.getTituloDetalhe());
//                            web().clickSelenium(inicioDiaPage.getCamposInicioDia().get(5));
//                            web().sleep(4);
//                            rGen().registerStep(web().getScreenshot(),"Clicando no botão Modalidade");
//                        }
//                        break;
//
//                    default:
//                        throw new IllegalArgumentException("O botão não foi implementado");
//                }
//            }
//
//            public void selecionarOpcaoNoCampoDaTela(String opcao, String campo, String tela) {
//                switch (opcao) {
//                    case "Ambos":
//                        if (campo.equals("Funcionario / Prestador")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                web().sleep(4);
//                                web().selectElementByText(produtividadeDoDiaPage.getCampoFuncionarioPrestador(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção Ambos");
//                            } else if (tela.equals("Outlier")) {
//                                web().sleep(4);
//                                web().selectElementByText(outlierPage.getCampoFuncionarioPrestador(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção Ambos");
//                            } else if (tela.equals("Detalhe")) {
//                                web().sleep(4);
//                                web().selectElementByText(detalhePage.getCampoFuncionarioPrestador(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção Ambos");
//                            }
//                        }
//                        break;
//                    case "Funcionário":
//                        if (campo.equals("Funcionario / Prestador")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                web().sleep(4);
//                                web().selectElementByText(produtividadeDoDiaPage.getCampoFuncionarioPrestador(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção Funcionário");
//                            } else if (tela.equals("Outlier")) {
//                                web().sleep(4);
//                                web().selectElementByText(outlierPage.getCampoFuncionarioPrestador(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção Funcionário");
//                            } else if (tela.equals("Detalhe")) {
//                                web().sleep(4);
//                                web().selectElementByText(detalhePage.getCampoFuncionarioPrestador(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção Funcionário");
//                            }
//                        }
//                        break;
//                    case "Prestador":
//                        if (campo.equals("Funcionario / Prestador")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                web().sleep(4);
//                                web().selectElementByText(produtividadeDoDiaPage.getCampoFuncionarioPrestador(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção Prestador");
//                            } else if (tela.equals("Outlier")) {
//                                web().sleep(4);
//                                web().selectElementByText(outlierPage.getCampoFuncionarioPrestador(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção Prestador");
//                            } else if (tela.equals("Detalhe")) {
//                                web().sleep(4);
//                                web().selectElementByText(detalhePage.getCampoFuncionarioPrestador(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção Prestador");
//                            }
//                        }
//                        break;
//                    case " TECNOLOGIA & OPERACOES ":
//                        if (campo.equals("VP")) {
//                            if (tela.equals("Outlier")) {
//                                web().sleep(10);
//                                web().clickSelenium(outlierPage.getOpcaoVPTecnologiaEOperacoes());
//                                web().selectElementByValue(outlierPage.getOpcaoVPTecnologiaEOperacoes(),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção TECNOLOGIA & OPERACOES`no campo VP");
//                            } else if (tela.equals("Conectividade - Trabalho Remoto")){
//                                web().sleep(5);
//                                web().clickSelenium(conectividadeTrabalhoRemotoPage.getCampoVP());
//                                web().sleep(2);
//                                web().selectElementByValue(conectividadeTrabalhoRemotoPage.getOpcaoTecnologiaEOperacoes().get(0),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção TECNOLOGIA & OPERACOES no campo VP");
//
//                            }
//                        }break;
//                    case " TECNOLOGIA E INOVACAO ":
//                        if (campo.equals("Diretoria")){
//                            if (tela.equals("Outlier")){
//                                web().sleep(1);
//                                web().clickSelenium(outlierPage.getOpcaoDiretoriaTecnologiaEInovacao());
//                                web().selectElementByValue(outlierPage.getOpcaoDiretoriaTecnologiaEInovacao(),opcao);//
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção TECNOLOGIA E INOVACAO no campo Diretoria");
//                            }else if (tela.equals("Conectividade - Trabalho Remoto")){
//                                web().sleep(2);
//                                web().clickSelenium(outlierPage.getOpcaoDiretoriaTecnologiaEInovacao());
//                                web().sleep(2);
//                                web().selectElementByValue(outlierPage.getOpcaoDiretoriaTecnologiaEInovacao(),opcao);//
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção TECNOLOGIA E INOVACAO no campo Diretoria");
//
//                            }
//                        }break;
//                    case " AGILIDADE E QUALIDADE ":
//                        if (campo.equals("N1")){
//                            if (tela.equals("Outlier")){
//                                web().sleep(2);
//                                web().clickSelenium(outlierPage.getOpcaoOutlierAgilidadeQualidade());
//                                web().selectElementByValue(outlierPage.getOpcaoOutlierAgilidadeQualidade(),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção AGILIDADE E QUALIDADE");
//                            }
//                            else if (tela.equals("Inicio de Dia")) {
//                                web().sleep(2);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção AGILIDADE E QUALIDADE");
//                                web().clickSelenium(inicioDiaPage.getAreaN1AgilidadeQualidade());
//                            }
//                        }break;
//                    case " QUALIDADE DA ENTREGA ":
//                        if (campo.equals("N2")){
//                            if (tela.equals("Outlier")){
//                                web().sleep(2);
//                                web().clickSelenium(outlierPage.getOpcaoN2QualidadeDaEntrega());
//                                web().selectElementByValue(outlierPage.getOpcaoN2QualidadeDaEntrega(),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção QUALIDADE DA ENTREGA");
//                            }
//                        } else if (campo.equals(" área ")){
//                            if (tela.equals("Inicio de Dia")){
//                                web().sleep(2);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção QUALIDADE DA ENTREGA na tabela Área");
//                                web().clickSelenium(inicioDiaPage.getAreaN2QualidadeEntrega());
//                            }
//
//                        }break;
//                    case "n3 - qualidade da entrega-sbt":
//                        if (campo.equals(" área ")){
//                            if (tela.equals("Inicio de Dia")){
//                                web().sleep(2);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção QUALIDADE DA ENTREGA na tabela Área");
//                                web().clickSelenium(inicioDiaPage.getAreaN3QualidadeEntregaSBT());
//
//                            }
//
//                        }break;
//                    case " SERVICOS CENTRAIS&SEGUROS-SBT ":
//                        if (campo.equals("N1")){
//                            if(tela.equals("Conectividade - Trabalho Remoto")){
//                                web().sleep(5);
//                                web().clickSelenium(conectividadeTrabalhoRemotoPage.getOpcaoServicosCentraisESegurosSBT());
//                                web().sleep(2);
//                                web().selectElementByValue(conectividadeTrabalhoRemotoPage.getOpcaoServicosCentraisESegurosSBT(),opcao);//
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção SERVICOS CENTRAIS&SEGUROS-SBT no campo N1");
//
//                            }
//                        }break;
//                    case " SOLUCOES DE SISTEMAS INT-SBT ":
//                        if(campo.equals("N2")){
//                            if (tela.equals("Conectividade - Trabalho Remoto")){
//                                web().sleep(5);
//                                web().clickSelenium(conectividadeTrabalhoRemotoPage.getOpcaoSolucoesDeSistemasIntSbt());
//                                web().sleep(2);
//                                web().selectElementByValue(conectividadeTrabalhoRemotoPage.getOpcaoSolucoesDeSistemasIntSbt(),opcao);//
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção SERVICOS CENTRAIS&SEGUROS INT-SBT no campo N2");
//
//                            }
//                        }break;
//                    case " PLATAFORMA NI & FINANCEIRA ":
//                        if (campo.equals("Diretoria")){
//                            if (tela.equals("Outlier")){
//                                web().sleep(5);
//                                web().clickSelenium(outlierPage.getOpcaoDiretoriaPlataformaNiFinanceira());
//                                web().sleep(2);
//                                web().selectElementByValue(outlierPage.getOpcaoDiretoriaPlataformaNiFinanceira(),opcao);//
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção PLATAFORMA NI & FINANCEIRA");
//                            } else if (tela.equals("Conectividade - Trabalho Remoto")){
//                                web().sleep(5);
//                                web().clickSelenium(outlierPage.getOpcaoDiretoriaPlataformaNiFinanceira());
//                                web().sleep(2);
//                                web().selectElementByValue(outlierPage.getOpcaoDiretoriaPlataformaNiFinanceira(),opcao);//
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção PLATAFORMA NI & FINANCEIRA");
//                            }
//                        }break;
//                    case " SOLUCOES E PROJETOS FINANCEIRA ":
//                        if (campo.equals("N1")){
//                            if (tela.equals("Outlier")){
//                                web().sleep(5);
//                                web().clickSelenium(outlierPage.getOpcaoN1SolucoesProjetoFinanceira());
//                                web().sleep(4);
//                                web().selectElementByValue(outlierPage.getOpcaoN1SolucoesProjetoFinanceira(),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção SOLUCOES E PROJETOS FINANCEIRA");
//                            } else if (tela.equals("Conectividade - Trabalho Remoto")){
//                                web().sleep(5);
//                                web().clickSelenium(outlierPage.getOpcaoN1SolucoesProjetoFinanceira());
//                                web().sleep(4);
//                                web().selectElementByValue(outlierPage.getOpcaoN1SolucoesProjetoFinanceira(),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção SOLUCOES E PROJETOS FINANCEIRA");
//                            }
//                        }break;
//                    case " MONITORIA DE SISTEMAS ":
//                        if (campo.equals("N2")){
//                            if (tela.equals("Outlier")){
//                                web().sleep(5);
//                                web().clickSelenium(outlierPage.getOpcaoN2MonitoriaSistema());
//                                web().sleep(4);
//                                web().selectElementByValue(outlierPage.getOpcaoN2MonitoriaSistema(),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção MONITORIA DE SISTEMAS");
//                            } else if (tela.equals("Conectividade - Trabalho Remoto")){
//                                web().sleep(5);
//                                web().clickSelenium(outlierPage.getOpcaoN2MonitoriaSistema());
//                                web().sleep(4);
//                                web().selectElementByValue(outlierPage.getOpcaoN2MonitoriaSistema(),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção MONITORIA DE SISTEMAS");
//                            }
//                        }break;
//                    case " QUALIDADE E CANAIS FINANC ":
//                        if (campo.equals("N3")){
//                            if (tela.equals("Outlier")){
//                                web().sleep(5);
//                                web().clickSelenium(outlierPage.getOpcaoN3QualidadeCanaisFinanc());
//                                web().sleep(4);
//                                web().selectElementByValue(outlierPage.getOpcaoN3QualidadeCanaisFinanc(),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção QUALIDADE E CANAIS FINANC");
//                            }
//                        }break;
//                    case " PLATAFORMA INVESTIMENTOS ":
//                        if (campo.equals("Diretoria")){
//                            if (tela.equals("Conectividade - Trabalho Remoto")){
//                                web().sleep(5);
//                                web().clickSelenium(conectividadeTrabalhoRemotoPage.getOpcaoPlataformaInvestimentos());
//                                web().sleep(4);
//                                web().selectElementByValue(conectividadeTrabalhoRemotoPage.getOpcaoPlataformaInvestimentos(),opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção PLATAFORMA INVESTIMENTOS");
//                            }
//                        }break;
//                    case " QUALIDADE E GOVERNANCA ":
//                        if (campo.equals("N1")) {
//                            if (tela.equals("Conectividade - Trabalho Remoto")) {
//                                web().sleep(5);
//                                web().clickSelenium(conectividadeTrabalhoRemotoPage.getOpcaoQualidadeEGovernanca());
//                                web().sleep(4);
//                                web().selectElementByValue(conectividadeTrabalhoRemotoPage.getOpcaoQualidadeEGovernanca(), opcao);
//                                rGen().registerStep(web().getScreenshot(), "Selecionando a opção QUALIDADE E GOVERNANCA");
//                            }break;
//                        }
//                    default:
//                        throw new IllegalArgumentException("O opção não foi implementado");
//                }
//            }
//
//            public void selecionoOColaboradorNoCampoNaTela(String valor, String campo, String tela) {
//                switch (valor) {
//                    case "244666":
//                        if (campo.equals("Matricula ou Nome")) {
//                            if (tela.equals("Produtividade por Profissional")) {
//                                web().insertText(produtividadePorProfissionalPage.getCampoMatriculaOuNome(), "2");
//                                web().sleep(1);
//                                web().insertText(produtividadePorProfissionalPage.getCampoMatriculaOuNome(), "4");
//                                web().sleep(1);
//                                web().insertText(produtividadePorProfissionalPage.getCampoMatriculaOuNome(), "4");
//                                web().sleep(1);
//                                web().insertText(produtividadePorProfissionalPage.getCampoMatriculaOuNome(), "6");
//                                web().sleep(1);
//                                web().insertText(produtividadePorProfissionalPage.getCampoMatriculaOuNome(), "6");
//                                web().sleep(1);
//                                web().insertText(produtividadePorProfissionalPage.getCampoMatriculaOuNome(), "6");
//                                web().sleep(5);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo valor 244666 no campo Matricula ou Nome");
//                                web().sleep(5);
//                                web().clickSelenium(produtividadePorProfissionalPage.getAllanCaetano());
//                            }
//
//
//                        }break;
//                    case "Allan Caetano":
//                        if (campo.equals("Matricula ou Nome")) {
//                            if (tela.equals("Produtividade por Profissional")) {
//                                web().insertText(produtividadePorProfissionalPage.getCampoMatriculaOuNome(),valor);
//                                rGen().registerStep(web().getScreenshot(), "Inserindo Allan Caetano no campo Matricula ou Nome");
//                                web().sleep(5);
//                                web().insertText(produtividadePorProfissionalPage.getCampoMatriculaOuNome(), " ");
//                                web().clickSelenium(produtividadePorProfissionalPage.getAllanCaetano());
//
//                            }
//                        }else if (campo.equals("Área do acesso concedido")){
//                            if (tela.equals("Perfil Parametrizavel")){
//                                web().clickSelenium(perfilParametrizavelPage.checkboxSelecionarColaborador.get(0));
//                                rGen().registerStep(web().getScreenshot(), "Selicionando Allan Caetano no campo Área do acesso concedido");
//                            }
//                        }break;
//                    default:
//                        throw new IllegalArgumentException("O opção não foi selecionada");
//                }
//            }
//
//            public void visualizarFiltroNaTela(String filtro, String tela) {
//                switch (filtro) {
//                    case "Ambos":
//                        if (tela.equals("Produtividade do Dia")) {
//                            Assert.assertTrue(produtividadeDoDiaPage.getOpcaoAmbos().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "A opção Ambos foi selecionada");
//                        } else if (tela.equals("Outlier")) {
//                            Assert.assertTrue(outlierPage.getOpcaoAmbos().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "A opção Ambos foi selecionada");
//                        } else if (tela.equals("Detalhe")) {
//                            Assert.assertTrue(detalhePage.getOpcaoAmbos().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "A opção Ambos foi selecionada");
//                        }
//                        break;
//                    case "Funcionário":
//                        if (tela.equals("Produtividade do Dia")) {
//                            Assert.assertTrue(produtividadeDoDiaPage.getOpcaoFuncionario().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "A opção Funcionáro foi selecionada");
//                        } else if (tela.equals("Outlier")) {
//                            Assert.assertTrue(outlierPage.getOpcaoFuncionario().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "A opção Funcionáro foi selecionada");
//                        } else if (tela.equals("Detalhe")) {
//                            Assert.assertTrue(detalhePage.getOpcaoFuncionario().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "A opção Funcionáro foi selecionada");
//                        }
//                        break;
//                    case "Prestador":
//                        if (tela.equals("Produtividade do Dia")) {
//                            Assert.assertTrue(produtividadeDoDiaPage.getOpcaoPrestador().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "A opção Prestador foi selecionada");
//                        } else if (tela.equals("Outlier")) {
//                            Assert.assertTrue(outlierPage.getOpcaoPrestador().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "A opção Prestador foi selecionada");
//                        } else if (tela.equals("Detalhe")) {
//                            Assert.assertTrue(detalhePage.getOpcaoPrestador().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "A opção Prestador foi selecionada");
//                        }
//                        break;
//                    case "Yaman":
//                        if (tela.equals("Detalhe")) {
//                            Assert.assertTrue(detalhePage.getFiltroEmpresaFornecedor().isDisplayed());
//                            web().sleep(2);
//                            rGen().registerStep(web().getScreenshot(), "O filtro Yaman foi aplicado");
//                        }
//                        break;
//                    case " AGILIDADE E QUALIDADE ":
//                        if (tela.equals("Outlier")){
//                            Assert.assertTrue(outlierPage.getOpcaoOutlierAgilidadeQualidade().isDisplayed());
//                            web().sleep(2);
//                            rGen().registerStep(web().getScreenshot(), "O filtro AGILIDADE E QUALIDADE  foi aplicado");
//                        }break;
//                    case " QUALIDADE DA ENTREGA ":
//                        if (tela.equals("Outlier")){
//                            Assert.assertTrue(outlierPage.getOpcaoN2QualidadeDaEntrega().isDisplayed());
//                            web().sleep(2);
//                            rGen().registerStep(web().getScreenshot(), "O filtro QUALIDADE DA ENTREGA foi aplicado");
//                        }break;
//                    case "QUALIDADE E CANAIS FINANC":
//                        if (tela.equals("Outlier")){
//                            web().sleep(2);
//                            web().scroll(100);
//                            web().moveToElement(outlierPage.getTableAreaEventoN3());
//                            Assert.assertTrue(outlierPage.getTableAreaEventoN3().isDisplayed());
//                            web().sleep(2);
//                            rGen().registerStep(web().getScreenshot(), "O filtro QUALIDADE E CANAIS FINANC foi aplicado na tabela Área/Evento");
//                        }break;
//
//                    default:
//                        throw new IllegalArgumentException("A opção não foi visualizada");
//                }
//            }
//
//            public void botaoHabilitadoNaTela(String botao, String tela) {
//                switch (botao) {
//                    case "Aplicar filtros":
//                        if (tela.equals("Produtividade do Dia")) {
//                            web().sleep(4);
//                            Assert.assertTrue(produtividadeDoDiaPage.getBotaoAplicarFiltros().isDisplayed());
//                            Assert.assertTrue(produtividadeDoDiaPage.getBotaoAplicarFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Aplicar filtros está visível e clicável");
//                        } else if (tela.equals("Outlier")) {
//                            web().sleep(5);
//                            web().moveToElement(outlierPage.getBotaoAplicarFiltros());
//                            Assert.assertTrue(outlierPage.getBotaoAplicarFiltros().isDisplayed());
//                            Assert.assertTrue(outlierPage.getBotaoAplicarFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Aplicar filtros está visível e clicável");
//                        } else if (tela.equals("Detalhe")) {
//                            web().sleep(5);
//                            web().moveToElement(outlierPage.getBotaoAplicarFiltros());
//                            Assert.assertTrue(outlierPage.getBotaoAplicarFiltros().isDisplayed());
//                            Assert.assertTrue(outlierPage.getBotaoAplicarFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Aplicar filtros está visível e clicável");
//                        } else if (tela.equals("Conectividade - Trabalho Remoto")){
//                            web().sleep(5);
//                            web().moveToElement(conectividadeTrabalhoRemotoPage.getBotaoAplicarFiltros());
//                            Assert.assertTrue(conectividadeTrabalhoRemotoPage.getBotaoAplicarFiltros().isDisplayed());
//                            Assert.assertTrue(conectividadeTrabalhoRemotoPage.getBotaoAplicarFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Aplicar filtros está visível e clicável");
//                        }else if (tela.equals("Perfil Parametrizavel")){
//                            web().sleep(5);
//                            web().moveToElement(perfilParametrizavelPage.getBotaoAplicarFiltros());
//                            Assert.assertTrue(perfilParametrizavelPage.getBotaoAplicarFiltros().isDisplayed());
//                            Assert.assertTrue(perfilParametrizavelPage.getBotaoAplicarFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Aplicar filtros está visível e clicável");
//                        }
//                        break;
//                    case "Limpar Filtros":
//                        if (tela.equals("Produtividade do Dia")) {
//                            web().sleep(5);
//                            Assert.assertTrue(produtividadeDoDiaPage.getBotaoLimparFiltros().isDisplayed());
//                            Assert.assertTrue(produtividadeDoDiaPage.getBotaoLimparFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Limpar Filtros está visível e clicável");
//                        } else if (tela.equals("Outlier")) {
//                            web().sleep(5);
//                            web().moveToElementAndClick(outlierPage.getBotaoLimparFiltros());
//                            Assert.assertTrue(outlierPage.getBotaoLimparFiltros().isDisplayed());
//                            Assert.assertTrue(outlierPage.getBotaoLimparFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Limpar Filtros está visível e clicável");
//                        } else if (tela.equals("Detalhe")) {
//                            web().sleep(5);
//                            web().moveToElementAndClick(outlierPage.getBotaoLimparFiltros());
//                            Assert.assertTrue(outlierPage.getBotaoLimparFiltros().isDisplayed());
//                            Assert.assertTrue(outlierPage.getBotaoLimparFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Limpar Filtros está visível e clicável");
//                        } else if(tela.equals("Conectividade - Trabalho Remoto")){
//                            web().sleep(5);
//                            Assert.assertTrue(conectividadeTrabalhoRemotoPage.getBotaoLimparFiltros().isDisplayed());
//                            Assert.assertTrue(conectividadeTrabalhoRemotoPage.getBotaoLimparFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Limpar Filtros está visível e clicável");
//                        }else if(tela.equals("Perfil Parametrizavel")){
//                            web().sleep(5);
//                            Assert.assertTrue(perfilParametrizavelPage.getBotaoLimparFiltros().isDisplayed());
//                            Assert.assertTrue(perfilParametrizavelPage.getBotaoLimparFiltros().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Limpar Filtros está visível e clicável");
//                        }break;
//                    case "Exportar PDF":
//                        if (tela.equals("Produtividade por Profissional")){
//                            web().sleep(5);
//                            Assert.assertTrue(produtividadePorProfissionalPage.getBotaoExportarPdf().isDisplayed());
//                            Assert.assertTrue(produtividadePorProfissionalPage.getBotaoExportarPdf().isEnabled());
//                            rGen().registerStep(web().getScreenshot(), "O botão Exportar PDF está visível e clicável");
//                        }else if (tela.equals("Conectividade - Trabalho Remoto")){
//                            web().sleep(5);
//                            rGen().registerStep(web().getScreenshot(), "O botão Exportar PDF está visível e clicável");
//                            Assert.assertTrue(conectividadeTrabalhoRemotoPage.getBotaoExportarPdf().isDisplayed());
//                            Assert.assertTrue(conectividadeTrabalhoRemotoPage.getBotaoExportarPdf().isEnabled());
//                        }break;
//                    case "Remover Acesso":
//                        if (tela.equals("Perfil Parametrizavel")){
//                            Assert.assertTrue(perfilParametrizavelPage.getBotaoRemoverAcesso().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "O botão Remover Acesso está visível e clicável");
//                        }break;
//
//                    case"Gerar Arquivo":
//                        if (tela.equals("Automação RH")){
//                            Assert.assertTrue(automacaoRHPage.getBotaoGerarArquivo().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "O botão Gerar Arquivo está visível e clicável");
//                        }break;
//
//                    case "Modalidade":
//                        if (tela.equals("Inicio de Dia")){
//                            Assert.assertTrue(inicioDiaPage.getModalidadeInicioDia().isDisplayed());
//                            web().sleep(2);
//                            rGen().registerStep(web().getScreenshot(), "O botão Modalidade está visível e clicável");
//                        }else if (tela.equals("Outlier")){
//                            rGen().registerStep(web().getScreenshot(), "O botão Modalidade está visível e clicável");
//                            Assert.assertTrue(outlierPage.getModalidadeOutlier().isDisplayed());
//                        }else if (tela.equals("Detalhe")){
//                            rGen().registerStep(web().getScreenshot(), "O botão Modalidade está visível e clicável");
//                            Assert.assertTrue(inicioDiaPage.getModalidadeInicioDia().isDisplayed());
//                            web().sleep(2);
//                        }break;
//                    default:
//                        throw new IllegalArgumentException("O botão não esta Habilitado");
//                }
//            }
//
//            public void validarValorNaTela(String valor, String campo, String tela) {
//                switch (valor) {
//                    case "2021-06-20":
//                        if (campo.equals("Periodo")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                Assert.assertTrue(produtividadeDoDiaPage.getCampoPeriodo().isDisplayed());
//                                Assert.assertEquals(valor, produtividadeDoDiaPage.getCampoPeriodo().getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando a data 20/06/2021 do campo Periodo");
//                            }
//                            if (tela.equals("Conectividade - Trabalho Remoto")) {
//                                Assert.assertTrue(conectividadeTrabalhoRemotoPage.getSelecioneUmaData().isDisplayed());
//                                Assert.assertEquals(valor, conectividadeTrabalhoRemotoPage.getSelecioneUmaData().getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando a data 20/06/2021 do campo Selecione uma Data");
//                            }
//                        }
//                        break;
//                    case "2022-06":
//                        if (campo.equals("Periodo")) {
//                            if (tela.equals("Outlier")) {
//                                Assert.assertTrue(outlierPage.getCampoPeriodo().isDisplayed());
//                                Assert.assertEquals(valor, outlierPage.getCampoPeriodo().getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando a data junho de 2021 do campo Periodo");
//                            } else if (tela.equals("Produtividade por Profissional")) {
//                                Assert.assertTrue(produtividadePorProfissionalPage.getCampoMeseAno().isDisplayed());
//                                Assert.assertEquals(valor, produtividadePorProfissionalPage.getCampoMeseAno().getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando a data Junho de 2021 no campo Mês e Ano");
//                            }
//                        }
//                        break;
//                    case "2022-02":
//                        if (campo.equals("Periodo")) {
//                            if (tela.equals("Outlier")) {
//                                web().sleep(5);
//                                Assert.assertTrue(outlierPage.getCampoPeriodo().isDisplayed());
//                                Assert.assertEquals(valor, outlierPage.getCampoPeriodo().getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando a data junho de 2021 do campo Periodo");
//                            } else if (tela.equals("Produtividade por Profissional")) {
//                                web().sleep(5);
//                                Assert.assertTrue(produtividadePorProfissionalPage.getCampoMeseAno().isDisplayed());
//                                Assert.assertEquals(valor, produtividadePorProfissionalPage.getCampoMeseAno().getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando a data Junho de 2021 no campo Mês e Ano");
//                            }
//                        }
//                        break;
//                    case "2022-07":
//                        if (campo.equals("Periodo")) {
//                            if (tela.equals("Detalhe")) {
//                                Assert.assertTrue(detalhePage.getCampoPeriodo().isDisplayed());
//                                Assert.assertEquals(valor, detalhePage.getCampoPeriodo().getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando a data julho de 2022 do campo Periodo");
//                            }
//                        }
//                        break;
//                    case "244666 ":
//                        if (campo.equals("Matricula ou Nome")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                Assert.assertTrue(produtividadeDoDiaPage.getCampoMatriculaOuNome().isDisplayed());
//                                Assert.assertEquals(valor, produtividadeDoDiaPage.getCampoMatriculaOuNome().getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando a matricula 244666 no campo Matricula ou Nome");
//                            }
//                        }
//                        break;
//                    case "X244666":
//                        if (campo.equals("Busque por nome matricula")){
//                            if (tela.equals("Perfil Parametrizavel")){
//                                web().sleep(5);
//                                Assert.assertTrue(perfilParametrizavelPage.getMatriculaComAcessoConcedido().isDisplayed());
//                                web().scroll(100);
//                                rGen().registerStep(web().getScreenshot(), "Validando matrícula  X244666 no campo Busca por Matricula ou nome");
//                            }
//                        }
//                        break;
//                    case "Allan Caetano ":
//                        if (campo.equals("Matricula ou Nome")) {
//                            if (tela.equals("Produtividade do Dia")) {
//                                Assert.assertTrue(produtividadeDoDiaPage.getCampoMatriculaOuNome().isDisplayed());
//                                Assert.assertEquals(valor, produtividadeDoDiaPage.getCampoMatriculaOuNome().getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando o nome Allan Caetano no campo Matreicula ou Nome");
//                            }
//                        }
//                        break;
//                    case "ALLAN CAETANO":
//                        if (campo.equals("Nome")) {
//                            if (tela.equals("Produtividade por Profissional")) {
//                                web().sleep(5);
//                                Assert.assertEquals(valor, produtividadePorProfissionalPage.getCamposProdutividadePorProfissional().get(3).getAttribute("value"));
//                                rGen().registerStep(web().getScreenshot(), "Validando o nome Allan Caetano no campo Nome");
//                            }
//                        }else if (campo.equals("Busque por nome matricula")){
//                            if (tela.equals("Perfil Parametrizavel")){
//                                web().sleep(5);
//                                Assert.assertTrue(perfilParametrizavelPage.getUsuarioComAcessoConcedido().isDisplayed());
//                                rGen().registerStep(web().getScreenshot(), "Validando o usuário Allan Caetano no campo Busque por nome/matricula");
//                            }
//                        }
//                        break;
//                    case "Denise Risae Okuma":
//                        if (campo.equals("Buscar na tabela")){
//                            if (tela.equals("Modal Funcionarios")){
//                                web().sleep(5);
//                                Assert.assertTrue(conectividadeTrabalhoRemotoPage.getBuscarNomeTabelaModalFuncionario().isDisplayed());
//                                rGen().registerStep(web().getScreenshot(), "Validando o nome Denise Risae Okumano no campo Buscar na tabela de funcionários");
//
//                            }
//                        }break;
//                    case "Daniela Arruda Ramos Da Silva":
//                        if (campo.equals("Buscar na tabela")){
//                            if (tela.equals("Modal Prestadores")){
//                                Assert.assertTrue(conectividadeTrabalhoRemotoPage.getBuscarNomeTabelaModalPrestadores().isDisplayed());
//                                web().sleep(5);
//                                rGen().registerStep(web().getScreenshot(),"Validando o nome Daniela Arruda Ramos Da Silva no campo Buscar na tabela de prestadores");
//                            }
//                        }break;
//
//                    case "SERVICOS CENTRAIS&SEGUROS-SBT":
//                        if (campo.equals("Busque por uma Área")) {
//                            if (tela.equals("Perfil Parametrizavel")) {
//                                Assert.assertTrue(perfilParametrizavelPage.getAreasConcedidas().isDisplayed());
//                                web().sleep(5);
//                                rGen().registerStep(web().getScreenshot(), "Validando opção SERVICOS CENTRAIS&SEGUROS-SBT no campo Busque por uma Área");
//                            }
//                        }break;
//                    case " QUALIDADE DA ENTREGA ":
//                        if (campo.equals(" área ")){
//                            if(tela.equals("Inicio de Dia")){
//                                Assert.assertTrue(inicioDiaPage.getAreaN2QualidadeEntrega().isDisplayed());
//                                web().sleep(5);
//                                rGen().registerStep(web().getScreenshot(), "Validando a opção N2 - QUALIDADE DA ENTREGA na tabela Área está visível");
//
//                            }
//                        }break;
//                    case "n3 - qualidade da entrega-sbt":
//                        if (campo.equals(" área ")){
//                            if (tela.equals("Inicio de Dia")){
//                                Assert.assertTrue(inicioDiaPage.getAreaN3QualidadeEntregaSBT().isDisplayed());
//                                web().sleep(5);
//                                rGen().registerStep(web().getScreenshot(), "Validando as opções de níveis na tabela Área estão visíveis para o usuário N1 ");
//                            }
//                        }break;
//                    case "03:01hs":
//                        if (campo.equals("Por dias úteis no mês")){
//                            if (tela.equals("Detalhe")){
//                                web().sleep(8);
//                                web().moveToElement(detalhePage.getMediaProdutividadeArea().get(0));
//                                web().sleep(4);
//                                Assert.assertTrue(detalhePage.getMediaProdutividadeArea().get(0).isDisplayed());
////                        Assert.assertEquals(detalhePage.getMediaProdutividadeArea().get(1).getAttribute("value"), valor);
//                                rGen().registerStep(web().getScreenshot(), "Validando Média de produtividade Por dias úteis no mês:");
//                            }
//                        }break;
//                    case "04:39hs":
//                        if (campo.equals("Por dias úteis trabalhados no mês")){
//                            if (tela.equals("Detalhe")){
//                                web().sleep(8);
//                                web().moveToElement(detalhePage.getMediaProdutividadeArea().get(1));
//                                web().sleep(4);
//                                Assert.assertTrue(detalhePage.getMediaProdutividadeArea().get(1).isDisplayed());
////                        Assert.assertEquals(detalhePage.getMediaProdutividadeArea().get(2).getAttribute("value"), valor);
//                                rGen().registerStep(web().getScreenshot(), "Validando Média de produtividade Por dias úteis no mês:");
//                            }
//                        }break;
//
//                    default:
//                        throw new IllegalArgumentException("O valor não foi validado");
//                }
//            }
//
//            public void selecionarNomeNaTabela(String nome, String tela) {
//                switch (nome) {
//                    case "Allan Caetano":
//                        if (tela.equals("Produtividade do Dia")) {
//                            web().scroll(200);
//                            rGen().registerStep(web().getScreenshot(), "Selecionando Allan Caetano");
//                            web().clickSelenium(produtividadeDoDiaPage.getSelecionarAllan());
//                            break;
//                        }
//                    case "Gustavo Sirol":
//                        if (tela.equals("Detalhe")) {
//                            web().moveToElement(detalhePage.getSelecionarGustavo());
//                            rGen().registerStep(web().getScreenshot(), "Selecionando Gustavo Sirol");
//                            web().clickSelenium(detalhePage.getSelecionarGustavo());
//                            break;
//                        }
//                    case "HIGOR CREVELARO LUCIANO":
//                        if (tela.equals("Detalhe")) {
//                            web().sleep(5);
//                            web().scroll(300);
////                    web().moveToElement(detalhePage.getSelecionarHigor());
//                            rGen().registerStep(web().getScreenshot(), "Selecionando HIGOR CREVELARO LUCIANO");
//                            web().clickSelenium(detalhePage.getSelecionarHigor());
//                            break;
//                        }
//                        else {
//                            throw new IllegalArgumentException("O nome não foi implementado");
//                        }
//                }
//            }
//
//            public void visualizoMensagem(String mensagem){
//                switch (mensagem) {
//                    case "Selecione uma opção para realizar o cancelamento":
//                        web().sleep(1);
//                        Assert.assertTrue(automacaoRHPage.getMsgSelecioneOpcaoCancelamento().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Selecione uma opção para realizar o cancelamento");
//                        break;
//                    case "Processo cancelado com sucesso":
//                        web().sleep(1);
//                        Assert.assertTrue(automacaoRHPage.getMsgProcessoCanceladoComSucesso().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Mensagem Processo cancelado com sucesso");
//                        break;
//                    case "Selecione uma opção para ver o log":
//                        web().sleep(1);
//                        Assert.assertTrue(automacaoRHPage.getMsgSelecioneUmaOpcaoParaVerLog().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Mensagem Selecione uma opção para ver o log");
//                        break;
//                    case "Você não tem permissão de acesso à essa área. Por favor, limpe os filtros.":
//                        web().sleep(1);
//                        Assert.assertEquals(conectividadeTrabalhoRemotoPage.getVoceNaoTemPermicaoDeAcesso().getText(), mensagem);
//                        Assert.assertTrue(conectividadeTrabalhoRemotoPage.getVoceNaoTemPermicaoDeAcesso().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Mensagem Você não tem permissão de acesso à essa área. Por favor, limpe os filtros.");
//                        break;
//                    default:
//                        throw new IllegalArgumentException("A mensagem não foi implementada");
//                }
//            }
//            public void visualizoPopUp(String PopUp){
//                switch (PopUp){
//                    case "Processo VPN iniciado":
//                        web().sleep(3);
//                        Assert.assertTrue(automacaoRHPage.getPopUpProcessoVpnIniciado().isDisplayed());
//                        rGen().registerStep(web().getScreenshot(), "Visualizo a PopUp Processo VPN iniciado ");
//                        break;
//                    default:
//                        throw new IllegalArgumentException("A PopUp não está visivel");
//                }
//            }
//            public void visualizoOValorNaTela (String valor, String tela){
//                switch (valor) {
//                    case " Painel de Controle  ":
//                        if (tela.equals("Detalhe do Dia")){
//                            Assert.assertTrue(detalhePage.getDetalheDoDia().isDisplayed());
//                            web().sleep(2);
//                            rGen().registerStep(web().getScreenshot(), "Visualizo a tabela Painel de Controle ");
//
//                        }break;
//                    default:throw new IllegalArgumentException("A opção não foi visualizada");
//                }
//            }
//
//            public void validarOpcoesDoFiltro(String filtro, String tela) {
//                switch (filtro) {
//                    case "N1":
//                        if (tela.equals("Outlier")) {
//                            rGen().registerStep(web().getScreenshot(), "As opções do filtro N1 estão visíveis");
//                            Assert.assertTrue(outlierPage.getServicosCentraisSegurosSbt().isDisplayed());
//                        } else if (tela.equals("Produtividade do Dia")) {
//                            rGen().registerStep(web().getScreenshot(), "As opções do filtro N1 estão visíveis");
//                            Assert.assertTrue(produtividadeDoDiaPage.getServicosCentraisSegurosSbt().isDisplayed());
//                        } else if (tela.equals("Detalhe")) {
//                            rGen().registerStep(web().getScreenshot(), "As opções do filtro N1 estão visíveis");
//                            Assert.assertTrue(detalhePage.getServicosCentraisSegurosSbt().isDisplayed());
//                        } else if (tela.equals("Conectividade - Trabalho Remoto")){
//                            rGen().registerStep(web().getScreenshot(), "As opções do filtro N1 estão visíveis");
//                            Assert.assertTrue(conectividadeTrabalhoRemotoPage.getServicosCentraisSegurosSbt().isDisplayed());
//                        }
//                        break;
//                    case "N2":
//                        if (tela.equals("Outlier")) {
//                            Assert.assertTrue(outlierPage.getOpcaoSolucoesDeSistemasINT().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao1N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao2N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao3N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao4N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao5N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao6N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao7N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao8N2().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "As opções do filtro N2 estão visíveis");
//                        } else if (tela.equals("Produtividade do Dia")) {
//                            Assert.assertTrue(outlierPage.getOpcaoSolucoesDeSistemasINT().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao1N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao2N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao3N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao4N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao5N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao6N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao7N2().isDisplayed());
////                    Assert.assertTrue(outlierPage.getOpcao8N2().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "As opções do filtro N2 estão visíveis");
//                        } else if (tela.equals("Detalhe")) {
//                            Assert.assertTrue(outlierPage.getOpcaoSolucoesDeSistemasINT().isDisplayed());
//                            // Assert.assertTrue(detalhePage.getOpcao1N2().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "As opções do filtro N2 estão visíveis");
//                        }else if (tela.equals("Conectividade - Trabalho Remoto")){
//                            Assert.assertTrue(conectividadeTrabalhoRemotoPage.getOpcao1N2().isDisplayed());
//                            rGen().registerStep(web().getScreenshot(), "As opções do filtro N2 estão visíveis");
//                        }
//                        break;
//                    default:
//                        throw new IllegalArgumentException("A opção não foi visualizada");
//                }
//
//            }
//    }
//


                }
