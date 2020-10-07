package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import smartBear.SmartBearMain;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear_deleteOrder {

    WebDriver driver;

    @BeforeClass
    public void setUp (){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void deleteOrder() {
        SmartBearMain.login(driver);
        String checkboxForMarkSmithLocatorXpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='Mark Smith']/../td[1]";
        driver.findElement(By.xpath(checkboxForMarkSmithLocatorXpath)).click();

        String deleteSelectedBtnLocatorID = "ctl00_MainContent_btnDelete";
        driver.findElement(By.id(deleteSelectedBtnLocatorID)).click();

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for (WebElement name: allNames) {
                Assert.assertFalse(name.getText().equals("Mark Smith"), "This TC failed, it has name in the list");

        }


    }
}
