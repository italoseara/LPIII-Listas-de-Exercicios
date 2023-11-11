package dev.italoseara.Ex02;

import dev.italoseara.other.Date;
import dev.italoseara.other.Time;

public class Example {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime(new Date(1, 1, 2020), new Time(12, 0, 0));
        System.out.println(dateTime);

        DateTime dateTime2 = new DateTime(new Date(13, 10, 2021), new Time(15, 2, 0));
        System.out.println(dateTime2);

        System.out.println(dateTime.isEqual(dateTime2));
        System.out.println(dateTime.isGreater(dateTime2));
        System.out.println(dateTime.isLess(dateTime2));
    }
}
