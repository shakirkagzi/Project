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
        newusr.FirstName().sendKeys("waseem");
        newusr.LastName().sendKeys("Kagzi");
        newusr.Email().sendKeys("waseem123@gmail.com");
        newusr.Password().sendKeys("waseem1234");
        newusr.ConfirmPWD().sendKeys("waseem1234");
        sleepFor(2);
        scrollDown();
        sleepFor(5);

        //clickByCss("#create-account-expedia-policy");
        //clickByXpath(".//*[@id='create-account-submit-button']");
        sleepFor(15);
        clickByXpath(".//*[@id='create-account-submit-button']");


    }
}
