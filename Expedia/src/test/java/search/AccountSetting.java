package search;
import account.UserAccountSetting;
import account.Login;
import common.Base;
import org.testng.annotations.Test;

/**
 * Created by Shakir on 9/4/2016.
 */
public class AccountSetting extends Base {
    @Test
    public void UserSetting() throws InterruptedException {

        sleepFor(1);
        clickByXpath("./*//*[@id='header-account-menu']");
        sleepFor(2);
        clickByXpath("./*//*[@id='header-account-signin-button']");
        sleepFor(2);
        Login log = new Login(driver); // creating object of main login class
        log.EmailID().sendKeys("johnfrances@yahoo.com");
        // typeByXpath("./*//*[@id='signin-loginid']", "johnfrances@yahoo.com");
        sleepFor(1);
        log.password().sendKeys("john123");
        //typeByXpath("./*//*[@id='signin-password']", "john123");
        log.Submit().click();
        // clickByXpath("./*//*[@id='submitButton']");
        sleepFor(7);
        clickByXpath("./*//*[@id='header-account-menu']");
        clickByXpath(".//*[@id='header-account-myaccount']");
        clickByXpath(".//*[@id='emailSeg']/article/div");
        UserAccountSetting usrsetting = new UserAccountSetting(driver);
        usrsetting.NewEmailAdd().clear();
        usrsetting.NewEmailAdd().sendKeys("Johny0071@yahoo.com");
        usrsetting.RetypeEmailAdd().sendKeys("Johny0071@yahoo.com");
        clickByXpath(".//*[@id='saveUpdatePasswordButton']");
    }
}

