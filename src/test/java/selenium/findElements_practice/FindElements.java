package selenium.findElements_practice;

public class FindElements {
    public static void main(String[] args) {

        // findElements() --> return List of WebElements
        // if it doesn't find elements - it will NOT throw any exception, WILL return empty List
        // to store what is returned - need to create List of WebElements
        // List <WebElement> list = driver.findElements();

// All links are stored in <a> tag, so: xpath will be: //body//a     --> skipping links from header though

        // Syntax: List <WebElement> list = driver.findElements(By.xpath("//body//a"));




    }
}
