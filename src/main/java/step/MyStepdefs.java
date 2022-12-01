package step;

import Func.TestFunc;
import core.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class MyStepdefs extends BaseTest {
    TestFunc testFunc = new TestFunc();

    @Dado("acesso o site")
    public void acessoOSite() throws Throwable {
        testFunc.acessarWeb();
    }

    @E("digito no campo {string} o valor {string}")
    public void digitoNoCampoOValor(String campo, String valor) {
        testFunc.digitoNoCampo(campo, valor);
    }

    @Quando("clico no botao {string}")
    public void clicoNoBotao(String botao) throws InterruptedException {
        testFunc.clicarNoBotao(botao);
    }

    @Entao("visualizo a mesnagem {string}")
    public void visualizoAMesnagem(String arg0) {
    }

    @E("insiro {string} no campo {string}")
    public void insiroNoCampo(String valor, String campo) {
        testFunc.insiroNoCampo(valor, campo);
    }
}
