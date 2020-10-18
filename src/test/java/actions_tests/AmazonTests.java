package actions_tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.amazon_pages.AmazonLandingPage;
import utilities.Driver;

public class AmazonTests {

    @Test
    public void signInLinkHoverTest () {
        AmazonLandingPage alp = new AmazonLandingPage();
        Driver.getDriver().get("https://www.amazon.com");
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(alp.signInLink).perform();
    }
}
