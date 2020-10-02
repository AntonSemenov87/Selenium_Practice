package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
    public static void main(String[] args) throws Exception {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa2.vytrack.com/user/login");

        String usernameLocatorID = "prependedInput";
        String passwordLocatorID = "prependedInput2";
        String tabLocatorXpath = "//span[contains(text(), 'Activities') and @class = 'title title-level-1']";
        String moduleLocatorXpath = "//span[.='Calls']";

        driver.findElement(By.id(usernameLocatorID)).sendKeys("storemanager85");
        driver.findElement(By.id(passwordLocatorID)).sendKeys("UserUser123" + Keys.ENTER);


        driver.findElement(By.xpath(tabLocatorXpath)).click();
        driver.findElement(By.xpath(moduleLocatorXpath)).click();





    }
}
