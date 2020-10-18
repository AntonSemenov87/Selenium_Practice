package synchronization_tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.practice_pages.DynamicLoading1Page;
import utilities.Driver;

public class ExplicitWaitTest {

    @Test
    public void waitForInputBoxTest (){
        DynamicLoading1Page dl1 = new DynamicLoading1Page();
        Driver.getDriver().get("practice.cybertekschool.com/dynamic_loading/1");
        dl1.startButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(dl1.usernameField));

        dl1.usernameField.sendKeys("tomsmith");

    }

}
