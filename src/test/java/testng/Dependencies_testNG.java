package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies_testNG {

    @Test
    public void login () {
        System.out.println("Logging in");
        Assert.fail("Failing on purpose");
    }

    @Test (dependsOnMethods = "login")
    public void makePurchase(){
        System.out.println("Making purchase");

    }

    @Test
    public void homePage(){
        System.out.println("Home page is tested");
    }

}
