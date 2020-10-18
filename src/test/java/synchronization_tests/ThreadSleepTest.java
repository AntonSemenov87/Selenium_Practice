package synchronization_tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.practice_pages.DynamicLoading2Page;
import utilities.Driver;


public class ThreadSleepTest {

    @BeforeMethod
    public void setup () {
        Driver.getDriver().get("practice.cybertekschool.com/dynamic_loading/2");
    }

    @Test
    public void threadSleepTest () throws InterruptedException {
        DynamicLoading2Page dl = new DynamicLoading2Page();
        dl.startButton.click();
        Thread.sleep(5000);

        Assert.assertTrue(dl.helloWorldText.isDisplayed(), "text is NOT displayed");

    }

}
