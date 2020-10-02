package selenium.findElements_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import selenium.WebElements;

import java.util.List;

public class NumberOfLinks {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.openxcell.com");

        int expectedNumber = 147;
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//a"));
        int actualNumber = listOfLinks.size();

        if (expectedNumber == actualNumber) {
            System.out.println("Number of links - PASS");
        } else {
            System.out.println("Number of links - FAILED");
        }

        System.out.println(actualNumber);

        driver.quit();

    }
}
