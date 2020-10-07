package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.VytrackUtils;

public class Calendar_DropDowns {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa2.vytrack.com/user/login");

        String createCalendarButtonLocatorCSS = "a[title = 'Create Calendar Event']";

        VytrackUtils.login(driver, "storemanager85", "UserUser123");

        VytrackUtils.navigateToModule(driver, "Activities", "Calendar Events");

        driver.findElement(By.cssSelector(createCalendarButtonLocatorCSS)).click();



    }
}
