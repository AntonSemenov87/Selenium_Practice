package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchAmazon_CSS_Selectors {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com");
        String searchWord = "Akai midi";
        WebElement searchField = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        searchField.sendKeys(searchWord);
        WebElement searchButton = driver.findElement(By.cssSelector("input[value='Go']"));
        searchButton.click();

        if (driver.getTitle().contains(searchWord)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        driver.quit();


    }
}
