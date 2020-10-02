package utilities;

import java.beans.IntrospectionException;

public class SeleniumUtils {

    // method to pause activity
    public static void pause(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

    }
}
