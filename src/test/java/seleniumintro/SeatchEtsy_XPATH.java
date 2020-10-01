package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeatchEtsy_XPATH {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.etsy.com");

        WebElement searchFiled = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchFiled.sendKeys("wooden spoon");

        WebElement searchButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        searchButton.click();

        if (driver.getTitle().contains("Wooden spoon")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        driver.quit();
    }
}
