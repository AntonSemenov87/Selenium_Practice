package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsIntro {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        // By LINKED TEXT

        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Store")).click();


        // BY PARTIAL LINKED TEXT
        driver.get("http://www.etsy.com");
        driver.findElement(By.partialLinkText(" Finds")).click();
        String linkText = driver.findElement(By.id("catnav-primary-link-10923")).getText();
        System.out.println(linkText);









        driver.close();

    }
}
