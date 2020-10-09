package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class Alert_handling {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test (priority = 1)
    public void infoAlert (){
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement msg = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedText = "You successfuly clicked an alert";
        String actualText = msg.getText();

        Assert.assertEquals(expectedText, actualText);

        SeleniumUtils.pause(3);
    }

    @Test (priority = 2)
    public void confirmAlert(){
        WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confirmAlertBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement msg = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedText = "You clicked: Cancel";
        String actualtext = msg.getText();

        Assert.assertEquals(expectedText, actualtext);

        confirmAlertBtn.click();
        alert.accept();
        String expectation = "You clicked: Ok";
        String actualInText = msg.getText();

        Assert.assertEquals(expectation, actualInText);


        SeleniumUtils.pause(3);
    }

    @Test (priority = 3)
    public void promptAlert () {
        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        promptAlert.click();
        Alert alert = driver.switchTo().alert();
        String messageToSend = "Test";
        alert.sendKeys(messageToSend);
        alert.accept();

        WebElement msg = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedText = "You entered: " + messageToSend;
        String actualText = msg.getText();

        Assert.assertEquals(expectedText, actualText);

        SeleniumUtils.pause(3);
    }

}
