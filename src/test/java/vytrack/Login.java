package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.text.Utilities;

public class Login {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa2.vytrack.com/user/login");

        String username = "storemanager85";
        String password = "UserUser123";
        WebElement usernameField = driver.findElement(By.id("prependedInput"));
        usernameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("prependedInput2"));
        passwordField.sendKeys(password);

        WebElement submitButton = driver.findElement(By.id("_submit"));
        submitButton.click();


    }
}
