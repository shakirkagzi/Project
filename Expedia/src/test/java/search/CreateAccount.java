package search;
import common.Base;
import account.CreateUserAccount;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Shakir on 9/2/2016.
 */
public class CreateAccount extends Base{
    @Test
    public void CreatingAccount()throws InterruptedException
    {
        clickByXpath(".//*[@id='header-account-menu']");
        sleepFor(1);
        clickByXpath(".//*[@id='header-account-register']/span");
        sleepFor(1);
        CreateUserAccount newusr = new CreateUserAccount(driver);
        newusr.FirstName().sendKeys("Mike");
        //typeByXpath(".//*[@id='create-account-firstname']","Mike");
        newusr.LastName().sendKeys("Andrew");
        //typeByXpath(".//*[@id='create-account-lastname']","Andrew");
        newusr.Email().sendKeys("Andrew444@gmail.com");
        //typeByXpath(".//*[@id='create-account-emailId']","Andrew444@gmail.com");
        newusr.Password().sendKeys("Andrew1234");
       // typeByXpath(".//*[@id='create-account-password']","Andrew1234");
        newusr.ConfirmPWD().sendKeys("Andrew1234");
        //typeByXpath(".//*[@id='create-account-confirm-password']","Andrew1234");
        sleepFor(2);
        scrollDown();

        clickByXpath(".//*[@id='create-account-expedia-policy-label']/span");
        sleepFor(1);
        clickByXpath(".//*[@id='create-account-submit-button']");
        sleepFor(15);


    }
}
