package Func;

import core.DriverFactory;
import core.Propiedades;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.TestPage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestFunc extends Propiedades {
    WebDriverWait aguarde = new WebDriverWait(DriverFactory.getDriver(), 20);
    TestPage testPage = new TestPage(DriverFactory.getDriver());
    private String key;

    public void acessarWeb() throws Throwable {
          initialCreate();
          addEvidencie();
    }

    public void digitoNoCampo(String campo, String valor){
            if(campo.equals("First Name")){
                aguarde.until(ExpectedConditions.visibilityOf(testPage.getFirstName()));
                testPage.getFirstName().sendKeys(valor);
                addEvidencie();
            }else if(campo.compareTo("Last Name") == 0){
                testPage.getLastName().sendKeys(valor);
                addEvidencie();
            }
    }
    public void insiroNoCampo(String valor, String campo){
        switch (valor){
            case "nome":
                if (campo.equals("First Name")){
                    testPage.getFirstName().click();
                    testPage.getFirstName().sendKeys("Irana");

                }
        }
    }

    public void clicarNoBotao(String botao) throws InterruptedException {
        switch (botao){
            case  "Sign Up":
                testPage.getClicarButtonSignUp().click();
                testPage.wait(100);
                break;
        }

    }

   //para ler a planilha
    public void leitura() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File ("meu.txt"));
        key = scanner.nextLine();
        scanner.useDelimiter(",");
        scanner.close();
        aguarde.until(ExpectedConditions.elementToBeClickable(testPage.getProcurar()));
        testPage.getProcurar().sendKeys(key);
        addEvidencie();
    }

    //para acessar uma planilha do excel com
    public void acessarExel() throws Exception {
            Workbook workbook = Workbook.getWorkbook(new File("arquivo.xls"));
            Sheet sheet = workbook.getSheet(0);

            Cell cell1 = sheet.getCell(0,0);
            Cell cell2 = sheet.getCell(1,1);
            String user = cell1.getContents();
            String passwor = cell2.getContents();

            int linhas =  sheet.getRows();

            for(int i = 0; i < linhas; i++){
                Cell colA = sheet.getCell(0, i);
                Cell colB = sheet.getCell(1, i);

                String item = colA.getContents();
                String item2 = colB.getContents();
            }
            workbook.close();
    }

    // para recuperar elemento da web adicionando a file.properties //  substituir pelos getText desejado
    public void dado() throws Exception {
        Thread.sleep(3000);
        Path caminho  = Paths.get("src/main/resources/files.properties");
    //    String txt = testPage.getTxt().getText();
    //    byte[] texByte = txt.getBytes();
    //    Files.write(caminho, texByte);
       // testPage.getMeuElemento().sendKeys(txt);
    }
}




