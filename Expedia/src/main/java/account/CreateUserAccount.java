package account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Created by Shakir on 9/4/2016.
 */
public class CreateUserAccount {
    WebDriver driver;

    public CreateUserAccount(WebDriver driver)
    {
        this.driver = driver;
    }
        By firstname = By.xpath("./*//*[@id='create-account-firstname']");
        By lastname = By.xpath("./*//*[@id='create-account-lastname']");
        By email = By.xpath("./*//*[@id='create-account-emailId']");
        By password = By.xpath(".//*[@id='create-account-password']");
        By confirmpwd = By.xpath(".//*[@id='create-account-confirm-password']");

    public WebElement FirstName()
    {
        return driver.findElement(firstname);
    }

    public WebElement LastName()
    {
        return driver.findElement(lastname);
    }
    public WebElement Email()
    {
        return driver.findElement(email);
    }
    public WebElement Password()
    {
        return driver.findElement(password);
    }
    public WebElement ConfirmPWD()
    {
        return driver.findElement(confirmpwd);
    }
}

