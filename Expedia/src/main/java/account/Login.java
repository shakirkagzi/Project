package account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    /**
     * Created by Shakir on 9/2/2016.
     */
    public class Login {

        WebDriver driver;

        public Login(WebDriver driver) {
            this.driver = driver;
        }

        By userName = By.xpath("./*//*[@id='signin-loginid']");
        By Password = By.xpath("./*//*[@id='signin-password']");
        By submit = By.xpath("./*//*[@id='submitButton']");

        public WebElement EmailID()
        {
            return driver.findElement(userName);
        }

        public WebElement password()
        {
            return driver.findElement(Password);
        }

        public WebElement Submit() {
            return driver.findElement(submit);
        }

    }

