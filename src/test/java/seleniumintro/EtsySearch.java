package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EtsySearch {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.etsy.com");

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon");
        driver.findElement(By.className("wt-input-btn-group__btn")).click();

    }
}
