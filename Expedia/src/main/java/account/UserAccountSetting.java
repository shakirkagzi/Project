package account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Shakir on 9/4/2016.
 */
public class UserAccountSetting {

    WebDriver driver;

    public UserAccountSetting(WebDriver driver) {
        this.driver = driver;
    }

    By NewEmail = By.xpath(".//*[@id='new_email']");
    By RetypeEmail = By.xpath(".//*[@id='retype_new_email']");

    public WebElement NewEmailAdd()
    {
        return driver.findElement(NewEmail);
    }
    public WebElement RetypeEmailAdd()
    {
        return driver.findElement(RetypeEmail);
    }

}
