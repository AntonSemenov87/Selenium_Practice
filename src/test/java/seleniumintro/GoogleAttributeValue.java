package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleAttributeValue {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        String imagesLink = driver.findElement(By.linkText("Images")).getAttribute("href");
        System.out.println(imagesLink);

        String data_pid = driver.findElement(By.linkText("Images")).getAttribute("data-pid");
        System.out.println(data_pid);

        driver.quit();
    }
}
