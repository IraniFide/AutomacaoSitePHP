package core;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Propiedades extends BaseTest {
    public static boolean FECHAR_BROWSER = false;

    Properties prop = new Properties();
    File file = new File("src/main/resources");

    public void initialCreate() throws Exception {
        prop.load(Files.newInputStream(Paths.get(file.getAbsolutePath() + "/acesso.properties")));
        DriverFactory.getDriver().get(prop.getProperty("URL_AUT"));

        try{
            System.out.println("Acesso site ");
        }catch (Exception e){
            System.out.println("Valor não encontrado");
            try {

            }catch (Exception ed){

            }
        }
    }



}
