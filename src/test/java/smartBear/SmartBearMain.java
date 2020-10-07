package smartBear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SmartBearMain {

    public static void login (WebDriver driver) {
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
    }

    public static void verifyOrder (WebDriver driver, String givenName) {
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for (WebElement name: allNames) {
            if (name.getText().equalsIgnoreCase(givenName)) {
                System.out.println(givenName + " exists in the list - PASS");
                return;
            }
        }
        System.out.println(givenName + " was not found - FAIL");
    }

    public static void printNamesAndCities(WebDriver driver) {
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        List<WebElement> allCities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[7]"));

        for (int i = 0; i < allNames.size(); i++) {
            System.out.println(allNames.get(i).getText() + " <--name, city --> " + allCities.get(i).getText());
        }
    }


}
