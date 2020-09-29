package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);


        Thread.sleep(3000);

        String expectedInTitle = "apple";
        if (driver.getTitle().contains(expectedInTitle)) {
            System.out.println("Apple is present - PASS");
        } else {
            System.out.println("TC FAILED!!!");
        }
        driver.close();

    }
}
