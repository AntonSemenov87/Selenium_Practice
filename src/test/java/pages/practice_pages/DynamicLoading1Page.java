package pages.practice_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DynamicLoading1Page {
    public DynamicLoading1Page () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "start")
    public WebElement startButton;

    @FindBy (id = "username")
    public WebElement usernameField;

    @FindBy ()
    public WebElement passwordField;
}
