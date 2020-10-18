package synchronization_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practice_pages.DynamicLoading2Page;
import utilities.Driver;

public class ImplicitWaitTest {

    @Test
    public void implicitWaitTest (){
        Driver.getDriver().get("practice.cybertekschool.com/dynamic_loading/2");
        DynamicLoading2Page dl = new DynamicLoading2Page();
        dl.startButton.click();

        // implicit wait is going to line 17 (next), element not found, it goes back and checks again implicitly from Driver class
        Assert.assertTrue(dl.helloWorldText.isDisplayed(), "Text is NOT displayed");
    }

}
