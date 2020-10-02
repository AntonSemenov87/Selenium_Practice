package selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetValueOfAttribute {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        String attributeValue = driver.findElement(By.id("hplogo")).getAttribute("src");
        System.out.println(attributeValue);

        driver.quit();

    }
}
