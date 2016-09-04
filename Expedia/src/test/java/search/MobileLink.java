package search;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by Shakir on 9/3/2016.
 */
public class MobileLink extends Base
{
    @Test
    public void SendingMobileLink() throws InterruptedException
    {
        clickByXpath(".//*[@id='primary-header-mobile']");
        scrollDown();
       // typeByXpath(".//*[@id='appDLphoneNumber']","3479815427");
        clickByXpath(".//*[@id='appDL-btn-action']");
        sleepFor(5);
    }

}
