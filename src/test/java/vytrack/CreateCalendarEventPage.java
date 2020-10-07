package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.SeleniumUtils;
import utilities.VytrackUtils;

public class CreateCalendarEventPage {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://qa2.vytrack.com/user/login");

        String createCalendarBtnLocatorCss = "a[title = 'Create Calendar event']";
        String saveAndCloseBtnLocatorXpath = "//div/button[contains(text(), 'Save and Close')]";
        String saveAndCloseDropdownLocatorXpath = "//a[@class='btn-success btn dropdown-toggle']";

        String saveAndCloseOptionLocatorXpath = "//li/button[contains(text(), 'Save and Close')]";
        String saveAndNewOptionLocatorXpath = "//li/button[contains(text(), 'Save and New')]";
        String saveOptionLocatorXpath = "(//li/button[contains(text(), 'Save')])[3]";

        VytrackUtils.login(driver, "storemanager85", "UserUser123");

        VytrackUtils.navigateToModule(driver, "Activities", "Calendar Events");

        driver.findElement(By.cssSelector(createCalendarBtnLocatorCss)).click();

        SeleniumUtils.pause(3);

        if(driver.findElement(By.xpath(saveAndCloseBtnLocatorXpath)).isDisplayed()) {
            System.out.println("Save and Close button - Pass");
        } else {
            System.out.println("Save and Close button - Fail");
        }



    }
}
