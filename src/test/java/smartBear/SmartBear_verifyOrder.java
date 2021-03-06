package smartBear;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmartBear_verifyOrder {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearMain.login(driver);

        SmartBearMain.verifyOrder(driver, "Bob Feather");
        SmartBearMain.verifyOrder(driver, "Anton Semenov");



    }

}
