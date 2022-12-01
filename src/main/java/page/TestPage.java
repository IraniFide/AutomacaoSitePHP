package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage {
   public TestPage(WebDriver driver ) {
       PageFactory.initElements(driver, this);
   }

    @FindBy(xpath = "//input[@id='search']")
    private WebElement procurar;
    public WebElement getProcurar() {
        return procurar;
    }

    @FindBy(xpath = "[id='inputFirstName']")
    private WebElement firstName;
    public WebElement getFirstName() {
        return firstName;
    }

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastName;
    public WebElement getLastName() {
        return lastName;
    }
    @FindBy(xpath = "//li[.='Sign Up']")
    private WebElement clicarButtonSignUp;

    public WebElement getClicarButtonSignUp() {
        return clicarButtonSignUp;
    }
}
