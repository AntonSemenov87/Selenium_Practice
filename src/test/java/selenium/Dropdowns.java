package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) throws Exception {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        // locate dropdown:
        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select select = new Select(stateDropdown);

        // get default text
        String defaultOption = select.getFirstSelectedOption().getText();
        System.out.println(defaultOption);

        Thread.sleep(2000);
        select.selectByVisibleText("Illinois");

        Thread.sleep(2000);
        select.selectByIndex(5);

        Thread.sleep(2000);
        select.selectByValue("WI");

        String expectedOption = "Wisconsin";
        String actualOption = select.getFirstSelectedOption().getText();

        if (expectedOption.equalsIgnoreCase(actualOption)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        driver.quit();

    }
}
