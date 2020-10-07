package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import smartBear.SmartBearMain;
import utilities.SeleniumUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear_deleteAll {

    WebDriver driver;

    @BeforeMethod
    public void setup () {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void deleteAllTest () throws InterruptedException {
        SmartBearMain.login(driver);
        SeleniumUtils.pause(2);

        WebElement checkAllLocatorID = driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        checkAllLocatorID.click();
        SeleniumUtils.pause(2);

        List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));

        for (WebElement checkbox : checkboxes) {
            Assert.assertTrue(checkbox.isSelected());
        }

        SeleniumUtils.pause(2);

        WebElement deleteAll = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteAll.click();

        Assert.assertTrue(driver.findElement(By.id("ctl00_MainContent_orderMessage")).getText().contains("List of orders is empty."));

    }

    @AfterMethod
    public void logout(){
        driver.quit();
    }

}
