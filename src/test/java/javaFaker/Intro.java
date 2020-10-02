package javaFaker;

import com.github.javafaker.Faker;

public class Intro {
    public static void main(String[] args) {

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        System.out.println("So name is: " + firstName + " " + lastName);

    }
}
