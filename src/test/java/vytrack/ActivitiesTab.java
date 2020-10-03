package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.SeleniumUtils;

public class ActivitiesTab {
    public static void main(String[] args) throws Exception {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa2.vytrack.com/user/login");

        String usernameLocatorID = "prependedInput";
        String passwordLocatorID = "prependedInput2";
        String tabLocatorXpath = "//span[contains(text(), 'Activities') and @class = 'title title-level-1']";
        String moduleLocatorXpath = "//span[.='Calls']";
        String logCallButtonLocatorCSS = "a[title='Log call']";

        driver.findElement(By.id(usernameLocatorID)).sendKeys("storemanager85");
        driver.findElement(By.id(passwordLocatorID)).sendKeys("UserUser123" + Keys.ENTER);

        // using created method from utilities.SeleniumUtilities class
        SeleniumUtils.pause(4);

        driver.findElement(By.xpath(tabLocatorXpath)).click();

        SeleniumUtils.pause(3);
        driver.findElement(By.xpath(moduleLocatorXpath)).click();

        SeleniumUtils.pause(2);
        if (driver.findElement(By.cssSelector(logCallButtonLocatorCSS)).isDisplayed()) {
            System.out.println("Log Call button is displayed");
        } else {
            System.out.println("Log Call button is not displayed");
        }





    }
}
