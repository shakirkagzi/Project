package search;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by Shakir on 9/2/2016.
 */
public class HotelBook extends Base {
    @Test
    public void HotelBooking() throws InterruptedException
    {
        clickByXpath(".//*[@id='primary-header-hotel']");
        /*typeByXpath("./*//*[@id='hotel-destination']","New York");
        typeByXpath("./*//*[@id='hotel-checkin']","10/21/2016");
        typeByXpath("./*//*[@id='hotel-checkout']","./*//*[@id='hotel-checkout']");*/
        clickByXpath(".//*[@id='hotel-1-guests']");
        mouseHoverByCSS("#hotel-1-guests");
        sleepFor(1);
        clickByXpath(".//*[@id='search-button']");
        sleepFor(3);
        clickByXpath(".//*[@id='hotel1']/div[1]/div/a");
    }

}
