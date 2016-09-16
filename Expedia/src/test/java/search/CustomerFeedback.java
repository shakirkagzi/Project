package search;
import common.Base;
import org.testng.annotations.Test;

/**
 * Created by Shakir on 9/4/2016.
 */
public class CustomerFeedback extends Base{

    @Test
    public void Feedback() throws InterruptedException {
        sleepFor(1);

        clickByXpath(".//*[@id='header-support-menu']");
        clickByXpath(".//*[@id='header-support-feedback']");
        clickByXpath(".//*[@id='headerFeedback']/div[3]");
        clickByXpath(".//*[@id='altGrayButtonId']/span");
    }
}
