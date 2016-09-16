package search;
import account.Login;
import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Shakir on 9/2/2016.
 */
public class LoginToAccount extends Base {

    @Test
    public void LoginAccount() throws InterruptedException {
        sleepFor(1);
        clickByXpath("./*//*[@id='header-account-menu']");
        sleepFor(2);
        clickByXpath("./*//*[@id='header-account-signin-button']");
        sleepFor(2);
        Login log = new Login(driver); // creating object of main login class
        log.EmailID().sendKeys("johnfrances@yahoo.com");
       //typeByXpath("./*//*[@id='signin-loginid']", "johnfrances@yahoo.com");
        sleepFor(1);
        log.password().sendKeys("john123");
        //typeByXpath("./*//*[@id='signin-password']", "john123");
         log.Submit().click();
        // clickByXpath("./*//*[@id='submitButton']");
        sleepFor(7);
    }
}
