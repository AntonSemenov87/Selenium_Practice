package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox_practice {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if (!checkbox1.isSelected()) {
            System.out.println("Checkbox1 is NOT selected - Pass");
        } else {
            System.out.println("Checkbox 1 IS selected - FAIL!!!");
        }

        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if (checkbox2.isSelected()) {
            System.out.println("Checkbox 2 IS selected - PASS");
        } else {
            System.out.println("Checkob 2 is NOT selected - FAIL");
        }

        checkbox1.click();
        checkbox2.click();

        if (checkbox1.isSelected()) {
            System.out.println("Checkbox1 is selected - Pass");
        } else {
            System.out.println("Checkbox 1 is NOT selected - FAIL!!!");
        }

        if (!checkbox2.isSelected()) {
            System.out.println("Checkbox 2 is NOT selected - Pass");
        } else {
            System.out.println("Checkbox 2 IS selected - Fail");
        }

        driver.quit();

    }
}
