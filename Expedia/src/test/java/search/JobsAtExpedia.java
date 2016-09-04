package search;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by Shakir on 9/3/2016.
 */
public class JobsAtExpedia extends Base {
    @Test
    public void Career() throws InterruptedException {
        clickByXpath(".//*[@id='expedia-corp-links']/li[2]/a");
        mouseHoverByXpath(".//*[@id='menu-item-37']/a");
        sleepFor(5);
      //  selectOptionByVisibleText(".//*[@id='menu-item-37']/a","Technology");
        sleepFor(5);
    }
}
