package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OrderOfThings_priority_ignore {

    @Test // priority = 0
    public void firstTest(){
        System.out.println("Test one is running");
    }

    @Test (priority = 2)
    public void secondTest () {
        System.out.println("Test two is running");
    }

    @Test (priority = 1)
    public void thirdTest () {
        System.out.println("Test three is running");
    }

    @Ignore
    @Test
    public void fourthTest(){
        System.out.println("Test four is running");
    }






}
