package pages.cybertekschool_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hover_page {
    public Hover_page () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//div[@class='figure']/img)[1]")
    public WebElement firstProfile;

    @FindBy (xpath = "(//div[@class='figure']/img)[2]")
    public WebElement secondProfile;

    @FindBy (xpath = "(//div[@class='figure']/img)[3]")
    public WebElement thirdProfile;

    @FindBy (xpath = "(//div[@class='figcaption']/h5)[1]")
    public WebElement firstProfileTitle;

    @FindBy (xpath = "(//div[@class='figcaption']/h5)[2]")
    public WebElement secondProfileTitle;

    @FindBy (xpath = "(//div[@class='figcaption']/h5)[3]")
    public WebElement thirdProfileTitle;
}
