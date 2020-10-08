package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import smartBear.SmartBearMain;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear_deleteOrder_editOrder {

    WebDriver driver;

    @BeforeClass
    public void setUp (){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @BeforeMethod
    public void landOnHomePageAndLogin(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        SmartBearMain.login(driver);
    }

    @Test
    public void deleteOrder() {
        String checkboxForMarkSmithLocatorXpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='Mark Smith']/../td[1]";
        driver.findElement(By.xpath(checkboxForMarkSmithLocatorXpath)).click();

        String deleteSelectedBtnLocatorID = "ctl00_MainContent_btnDelete";
        driver.findElement(By.id(deleteSelectedBtnLocatorID)).click();

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for (WebElement name: allNames) {
                Assert.assertFalse(name.getText().equals("Mark Smith"), "This TC failed, it has name in the list");
        }
    }

    @Test
    public void editOrder() {
        SmartBearMain.login(driver);
        String editForSteveJohnsLocatorXpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='Steve Johns']/../td[13]";
        driver.findElement(By.xpath(editForSteveJohnsLocatorXpath)).click();
        String customerNameFieldLocatorID = "ctl00_MainContent_fmwOrder_txtName";
        driver.findElement(By.id(customerNameFieldLocatorID)).sendKeys("Michael Jordan");
        String updateBtnLocatorID = "ctl00_MainContent_fmwOrder_UpdateButton";
        driver.findElement(By.id(updateBtnLocatorID)).click();

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for (WebElement name : allNames) {
            System.out.println(name.getText());
            if (name.getText().equals("Micahel Jordan")) {
                Assert.assertTrue(name.getText().equals("Michael Jordan"), "This name is not in the list");
            }
        }
    }

    @Test
    public void deleteName () {
        SmartBearMain.deleteName(driver, "Bob Feather");
    }

    @AfterClass
    public void exit () {
        driver.quit();
    }
}
