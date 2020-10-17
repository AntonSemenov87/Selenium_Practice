package pageObjectModelTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.smartbear_pages.LoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class SmartBearLoginTests {

    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void setup (){
        Driver.getDriver().get(Config.getProperty("smartbearURL"));
    }


    @Test (priority = 1)
    public void wrongUsernameTest(){
        // 1 - get the page
        //Driver.getDriver().get(Config.getProperty("smartbearURL"));

        // 2 - enter wrong username
        String wrongUsername = Config.getProperty("wrongSmartbearUsername");
        loginPage.usernameInput.sendKeys(wrongUsername);

        // 3 -enter correct password
        loginPage.passwordInput.sendKeys(Config.getProperty("correctSmartbearPassword"));

        // 4 - click login button
        loginPage.loginButton.click();

        // 5 - verify error message
        Assert.assertTrue(loginPage.statusMessage.isDisplayed(), "error message is NOT displayed");
        Assert.assertTrue(loginPage.statusMessage.getText().equals("Invalid Login or Password."), "error message is not equal to expected");

        SeleniumUtils.pause(5);
    }


    @Test (priority = 2)
    public void wrongPasswordTest(){

        loginPage.usernameInput.sendKeys(Config.getProperty("correctSmartbearUsername"));
        loginPage.passwordInput.sendKeys(Config.getProperty("wrongSmartbearPassword"));
        loginPage.loginButton.click();
        Assert.assertTrue(loginPage.statusMessage.isDisplayed(), "error message is NOT displayed");
        Assert.assertTrue(loginPage.statusMessage.getText().equals("Invalid Login or Password."), "error message is not equal to expected");

        SeleniumUtils.pause(5);
    }


    @Test (priority = 3)
    public void noUsernameTest() {

        loginPage.passwordInput.sendKeys(Config.getProperty("correctSmartbearPassword"));
        loginPage.loginButton.click();
        Assert.assertTrue(loginPage.statusMessage.isDisplayed(), "error message is NOT displayed");
        Assert.assertTrue(loginPage.statusMessage.getText().equals("Invalid Login or Password."), "error message is not equal to expected");

        SeleniumUtils.pause(5);
    }


    @Test (priority = 4)
    public void noPasswordTest () {

        loginPage.usernameInput.sendKeys(Config.getProperty("correctSmartbearUsername"));
        loginPage.loginButton.click();
        Assert.assertTrue(loginPage.statusMessage.isDisplayed(), "error message is NOT displayed");
        Assert.assertTrue(loginPage.statusMessage.getText().equals("Invalid Login or Password."), "error message is not equal to expected");

        SeleniumUtils.pause(5);
    }

}
