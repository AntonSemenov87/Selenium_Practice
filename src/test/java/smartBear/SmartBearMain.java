package smartBear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.yaml.snakeyaml.error.Mark;

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

    public static void deleteName (WebDriver driver, String nameToBeDeleted) {
        String dynamicCheckboxForUserLocatorXpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='" + nameToBeDeleted + "']/../td[1]";
        driver.findElement(By.xpath(dynamicCheckboxForUserLocatorXpath)).click();

        String deleteSelectedBtnLocatorID = "ctl00_MainContent_btnDelete";
        driver.findElement(By.id(deleteSelectedBtnLocatorID)).click();

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for (WebElement name: allNames) {
            Assert.assertFalse(name.getText().equals(nameToBeDeleted), "This TC failed, it has name in the list");
        }
    }


}
