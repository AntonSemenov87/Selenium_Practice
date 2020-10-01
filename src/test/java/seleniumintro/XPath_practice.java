package seleniumintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath_practice {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        boolean deleteIsPresent = deleteButton.isDisplayed();
        System.out.println(deleteIsPresent);

        deleteButton.click();



        try{
            WebElement deleteButtonAfterClick = driver.findElement(By.xpath("//button[@class='added-manually']"));
            if (!deleteButtonAfterClick.isDisplayed()) {
                System.out.println("Pass");
            } else {
                System.out.println("Failed");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Delete button is not present");
        }


        driver.quit();

    }
}
