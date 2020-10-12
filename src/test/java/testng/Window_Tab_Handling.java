package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Window_Tab_Handling {

    WebDriver driver;

    @Test
    public void setUp () {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test (dependsOnMethods = "setUp")
    public void newWindowHandle(){

        // Option 1:
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

        WebElement newWindow = driver.findElement(By.xpath("//a[.='Click Here']"));
        newWindow.click();

        for (String handle : driver.getWindowHandles()) {
            if(!handle.equals(mainWindow)){
                driver.switchTo().window(handle);
            }
        }

        System.out.println(driver.getTitle());



        // Option 2
//        WebElement newWindow = driver.findElement(By.xpath("//a[.='Click Here']"));
//        newWindow.click();
//
//        Set<String> ids = driver.getWindowHandles();
//        Iterator<String> it = ids.iterator();
//        String parentWindow = it.next();
//        String childWindow = it.next();
//
//        driver.switchTo().window(childWindow);
//
//        String title = driver.getTitle();
//        System.out.println(title);
    }
}
