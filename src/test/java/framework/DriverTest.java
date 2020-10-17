package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

import javax.swing.text.Utilities;

public class DriverTest {

    @Test
    public void simpleTest(){

        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("apple" + Keys.ENTER);
        SeleniumUtils.pause(3);
        Driver.getDriver().close();

    }

}
