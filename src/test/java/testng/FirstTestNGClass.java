package testng;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class FirstTestNGClass {

    @BeforeClass
    public void setUp () {
        System.out.println("BeforeClass is running...");
    }

    @Test
    public void firstTest () {
        System.out.println("First test is running...");

        Assert.assertEquals("123", "1234", "First test is FAILED!!!");
    }

    @Test
    public void secondTest() {
        System.out.println("Second test is running...");
        Assert.assertTrue("sentence".contains("e"), "Sentence doesn't contain given letter!");
    }

    @BeforeMethod
    public void beforeMethod () {
        System.out.println("BeforeMethod is running...");
    }

    @AfterMethod
    public void afterMethod () {
        System.out.println("AfterMethod is running...");
    }

    @AfterClass
    public void afterClass () {
        System.out.println("AfterClass is running...");
        // logout
        // driver.close()
        //driver.quit()
        // etc
    }

}
