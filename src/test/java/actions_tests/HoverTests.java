package actions_tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cybertekschool_pages.Hover_page;
import utilities.Driver;
import utilities.SeleniumUtils;

public class HoverTests {

    @Test
    public void hoverOverProfilesTest () {

        Hover_page hover_page = new Hover_page();
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(hover_page.firstProfile).perform();
        Assert.assertTrue(hover_page.firstProfileTitle.isDisplayed());

        SeleniumUtils.pause(3);

        actions.moveToElement(hover_page.secondProfile).perform();
        Assert.assertTrue(hover_page.secondProfileTitle.isDisplayed());

        SeleniumUtils.pause(3);

        actions.moveToElement(hover_page.thirdProfile).perform();
        Assert.assertTrue(hover_page.thirdProfileTitle.isDisplayed());

        SeleniumUtils.pause(3);

        Driver.closeDriver();

    }
}
