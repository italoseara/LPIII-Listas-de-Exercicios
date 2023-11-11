package dev.italoseara.Ex03;

import dev.italoseara.other.Date;
import dev.italoseara.other.Time;

public class Example {
    public static void main(String[] args) {
        Date date = new Date(1, 1, 2020);
        Time time = new Time(12, 0, 0);

        DateTime dateTime = new DateTime(date, time);
        System.out.println(date + " " + time);

        Date date2 = new Date(13, 10, 2021);
        Time time2 = new Time(15, 2, 0);

        DateTime dateTime2 = new DateTime(date2, time2);
        System.out.println(date2 + " " + time2);

        System.out.println(dateTime.isEqual(dateTime2));
        System.out.println(dateTime.isGreater(dateTime2));
        System.out.println(dateTime.isLess(dateTime2));
    }
}
