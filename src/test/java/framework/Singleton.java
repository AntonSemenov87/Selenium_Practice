package framework;

public class Singleton {

    private static String word;

    public static String getWord(){
        if (word == null) {
            System.out.println("First setup");
            word = "I have a value now";
        } else {
            System.out.println("Already has a value");
        }
        return word;
    }

}
