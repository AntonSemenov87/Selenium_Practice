package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.SeleniumUtils;
import utilities.VytrackUtils;

public class Calendar_createCalendarEventButton {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa2.vytrack.com/user/login");

        String createCalendarButtonLocatorCSS = "a[title = 'Create Calendar Event']";

        // logging in using method from Utils
        VytrackUtils.login(driver, "storemanager85", "UserUser123");

        // clicking on tab and module using utils
        VytrackUtils.navigateToModule(driver, "Activities", "Calendar Events");

        if (driver.findElement(By.cssSelector(createCalendarButtonLocatorCSS)).isDisplayed()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

    }
}
