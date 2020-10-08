package selenium.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
    // HTML alerts - locate X or OK and click to close
    // JS alerts - pop up, blocks the page. User Accepts or Cancels, not part of HTML
            // Warning Alert - Accept button only
            // Confirmation Alert - Accept or Decline
            // Prompt Alert - need to provide some info, cancel and/or accept

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("practice.cybertekschool.com/javascript_alerts");

        WebElement JSAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        JSAlertBtn.click();

        Alert alert = (Alert) driver.switchTo().alert();
        alert.acc




    }

}
