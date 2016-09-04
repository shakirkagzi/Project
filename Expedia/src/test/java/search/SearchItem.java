package search;
import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
//import page_factory.SearchObjects;

/**
 * Created by Shakir on 9/1/2016.
 */
public class SearchItem extends Base {
    @Test
    public void searchItems() throws InterruptedException {

        clickByCss(".icon.icon-search");
        sleepFor(5);
        typeByCssNEnter("#opensearch-searchQuery","New York");
        sleepFor(5);
        clickByCss(".flex-link");
    }

}