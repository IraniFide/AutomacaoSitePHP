package core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class BaseTest {

    @After
    public void addEvidencie() {
        TakesScreenshot screen = (TakesScreenshot) DriverFactory.getDriver();
        File arquivo = screen.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
               File.separator + arquivo.getName() +  ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(Propiedades.FECHAR_BROWSER) {
            DriverFactory.killDriver();
        }
    }

}
