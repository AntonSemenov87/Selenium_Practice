package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmartBearPage {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectedInTitle = "Web Orders Login";
        String actualInTitle = driver.getTitle();
        if (actualInTitle.equalsIgnoreCase(expectedInTitle)) {
            System.out.println("title verification PASSED");
        } else {
            System.out.println("Title verification FAILED!!!");
        }

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        String expectedTitle = "Web Orders";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("FAILED!");
        }


        driver.quit();


    }
}
