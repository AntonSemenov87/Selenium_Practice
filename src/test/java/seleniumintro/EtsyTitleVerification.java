package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.etsy.com");
        String actualInTitle = driver.getTitle();
        String expectedInTitle = "Etsy";

        if (actualInTitle.contains(expectedInTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("Fail");
        }

        driver.findElement(By.linkText("Cart")).click();

    }
}
