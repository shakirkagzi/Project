package search;
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Shakir on 9/1/2016.
 */
public class FlightBook extends Base
{
    @Test
    public void FlightBooking() throws InterruptedException
    {
       clickByXpath("//*[@id='tab-flight-tab']/span[1]");
       //sleepFor(3);
       /* typeByXpath("./*//*[@id='flight-origin']","New York");
        typeByXpath("./*//*[@id='flight-destination']","Mumbai");
        typeByXpath("./*//*[@id='flight-departing']","09/09/2016");
        typeByXpath("./*//*[@id='flight-returning']","09/15/2016");*/
        new Select(driver.findElement(By.id("flight-adults"))).selectByVisibleText("4");
        clickByXpath(".//*[@id='flight-add-hotel-checkbox']");
        clickByXpath(".//*[@id='search-button']");
        sleepFor(4);
        clickByXpath(".//*[@id='sbarprice']");
        clickByXpath(".//*[@id='hotelName_0']");
        sleepFor(5);

    }
}
