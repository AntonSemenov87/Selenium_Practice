package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.VytrackUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void test1 () throws IOException {
        // 1) Create path of the file
        String path = "test.properties";

        // 2) Properties Object
        Properties properties = new Properties();

        // 3) Open file using FileInputStream
        FileInputStream file = new FileInputStream(path);

        // 4) Load properties file into properties Object
        properties.load(file);

        // 5) Read values using getProperty() method
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
    }

    @Test
    public void testWithUtil() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get(Config.getProperty("vytrackURL"));

        VytrackUtils.login(driver, Config.getProperty("storemanagerUsername"), Config.getProperty("storemanagerPassword"));


    }

}
