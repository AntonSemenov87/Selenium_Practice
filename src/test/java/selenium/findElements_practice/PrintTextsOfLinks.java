package selenium.findElements_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class PrintTextsOfLinks {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.openxcell.com");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//a"));
        for (int i = 0; i < listOfLinks.size(); i++) {
            System.out.println(listOfLinks.get(i).getText());
        }

    }
}
