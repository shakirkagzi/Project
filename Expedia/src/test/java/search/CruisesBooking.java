package search;

import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Shakir on 9/3/2016.
 */
public class CruisesBooking extends Base
{
    @Test
    public void BookCruise() throws InterruptedException
    {
        clickByXpath(".//*[@id='primary-header-cruise']");
        sleepFor(2);
        clickByXpath(".//*[@id='cruise-destination']");
        sleepFor(2);
        //selectOptionByVisibleText("cruise-destination","Bermuda");
        selectByValue("cruise-destination","bermuda");
        // new Select(driver.findElement(By.id("#cruise-destination"))).selectByVisibleText("Bermuda");

       // typeByXpath("..//*[@id='cruise-departing']","09/04/2016");
       // typeByXpath(".//*[@id='cruise-returning']","09/17/2016");
        clickByXpath(".//*[@id='search-button']");
        sleepFor(7);
        clickByXpath(".//*[@id='search-results']/div[1]/div[1]/div[2]/div[2]/div/button");
        sleepFor(5);
        clickByXpath(".//*[@id='17096-28-month-details']/div/div[2]/div[2]/a");
        sleepFor(5);
        clickByXpath(".//*[@id='17096-28-month-details']/div/div[2]/div[2]/a");
        clickByXpath(".//*[@id='card-data-table']/tbody/tr[1]/td[5]/button");
        sleepFor(5);


    }
}
