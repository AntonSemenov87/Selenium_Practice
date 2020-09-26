package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup(); // creates connection between driver and selenium, sets up driver

        WebDriver driver = new FirefoxDriver(); // instantiating FireFoxDriver instance
        driver.manage().window().maximize();
        driver.get("http://www.netflix.com");
        Thread.sleep(5000);

        String title = driver.getTitle();
        System.out.println(title);
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);


        driver.quit();

    }

}
