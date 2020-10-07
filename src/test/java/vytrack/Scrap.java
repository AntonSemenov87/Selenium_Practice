package vytrack;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Scrap {
    public static void main(String[] args) {

        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("MMM d yyy"));

        System.out.println(date);

        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("h:mm"));

        System.out.println(time);
    }
}
