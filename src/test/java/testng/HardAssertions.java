package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertions {

    @Test
    public void test1() {
        System.out.println("Test1 starting");
        Assert.assertEquals(4, 5);

        System.out.println("Test1 middle");
        Assert.assertTrue(false);

        System.out.println("Test1 ending");
    }

    @Test
    public void test2(){
        System.out.println("Test2 is starting");
    }

    @Test
    public void test3(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("test3 is starting");
        softAssert.assertEquals(4, 5);

        System.out.println("test3 middle");
        softAssert.assertTrue(false);

        System.out.println("test3 ending");
        softAssert.assertAll();

    }


}
