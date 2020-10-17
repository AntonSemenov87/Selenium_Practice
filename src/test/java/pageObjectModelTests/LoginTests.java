package pageObjectModelTests;

import org.testng.annotations.Test;
import pages.vytrack_pages.VytrackLoginPage;
import testng.VytrackLogin;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;
import utilities.VytrackUtils;

public class LoginTests {

    @Test
    public void positiveLoginScenarioTest() {
        String username = Config.getProperty("storemanagerUsername");
        String password = Config.getProperty("storemanagerPassword");

        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        Driver.getDriver().get(Config.getProperty("vytrackURL"));
        vytrackLoginPage.usernameInput.sendKeys(username);
        vytrackLoginPage.passwordInput.sendKeys(password);
        vytrackLoginPage.loginButton.click();

    }
}
