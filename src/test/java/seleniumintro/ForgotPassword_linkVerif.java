package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForgotPassword_linkVerif {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
        driver.findElement(By.id("form_submit")).click();
        String expectedTextInURL = "email_sent";
        String actualTextInURL = driver.getCurrentUrl();

        if (actualTextInURL.contains(expectedTextInURL)) {
            System.out.println("URL verification PASSED");
        } else {
            System.out.println("URL verification FAILED");
        }

        boolean textIsDisplayed = driver.findElement(By.id("content")).isDisplayed();
        if (textIsDisplayed) {
            System.out.println("Text is displayed");
        } else {
            System.out.println("Text is NOT displayed");
        }

        driver.quit();

    }
}
