package dev.italoseara.Ex01;

public class Example {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime(1, 1, 2020, 12, 0, 0);
        System.out.println(dateTime);

        DateTime dateTime2 = new DateTime(13, 10, 2021, 15, 2, 0);
        System.out.println(dateTime2);

        System.out.println(dateTime.isEqual(dateTime2));
        System.out.println(dateTime.isGreater(dateTime2));
        System.out.println(dateTime.isLess(dateTime2));
    }
}
