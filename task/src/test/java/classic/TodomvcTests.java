package classic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Tonya on 3/24/2018.
 */
public class TodomvcTests extends BaseTest{
    @Test
    public void todoTests() throws Exception {
        driver.get("http://todomvc.com/examples/angularjs/#/");
        driver.findElement(By.id("new-todo"));

    }

}
