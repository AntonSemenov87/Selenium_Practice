package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Iframe_practice {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void iframe(){
        // Option 1 - by index
        //driver.switchTo().frame(0);

        // Option 2
        // look for iframe by id
        WebElement frame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frame);
        WebElement paragraph = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(paragraph.isDisplayed());

        driver.switchTo().parentFrame();
        // OR
        // driver.switchTo().defaultContent();
        WebElement header = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(header.isDisplayed());

    }

}
