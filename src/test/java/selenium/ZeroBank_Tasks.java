package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZeroBank_Tasks {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        String headerText = driver.findElement(By.className("page-header")).getText();

        if (headerText.equalsIgnoreCase("Log in to ZeroBank")) {
            System.out.println("Header verification PASSED");
        } else {
            System.out.println("Header verification FAILED!!!");
        }

        String hrefForForgotPassword = driver.findElement(By.partialLinkText("Forgot")).getAttribute("href");
        System.out.println(hrefForForgotPassword);




        Thread.sleep(3000);

        driver.quit();
    }
}
