package selenium.findElements_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown_select_deselect {
    public static void main(String[] args) throws Exception {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select multipleSelectDropdown = new Select(driver.findElement(By.name("Languages")));
        List<WebElement> options = multipleSelectDropdown.getOptions();

        for (WebElement option: options) {
            Thread.sleep(1000);
            multipleSelectDropdown.selectByVisibleText(option.getText());
        }

        // print all selected options
        List <WebElement> selectedOptions = multipleSelectDropdown.getAllSelectedOptions();
        for (WebElement selectedOption: selectedOptions) {
            System.out.println(selectedOption.getText());
        }

        //deselect all values
        Thread.sleep(1000);
        multipleSelectDropdown.getAllSelectedOptions();


        // select Facebook from non-select Dropdown !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        WebElement socialDropdown = driver.findElement(By.id("dropdownMenuLink"));
        socialDropdown.click();
        WebElement facebookOption = driver.findElement(By.linkText("Facebook"));
        facebookOption.click();

        driver.quit();


    }
}
