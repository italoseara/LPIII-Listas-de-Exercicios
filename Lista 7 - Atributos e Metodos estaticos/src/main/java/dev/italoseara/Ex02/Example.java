package dev.italoseara.Ex02;

public class Example {
    public static void main(String[] args) {
        Time time = new Time(13, 59, 59);
        Time time2 = new Time(11, 0);

        System.out.println(Time.diffTime(time, time2)); // 2:59:59
        System.out.println(Time.diffTime(time2, time)); // 21:00:01

        System.out.println(Time.diffTime(time2));

        System.out.println(Time.isAm(time2)); // true
        System.out.println(Time.isPm(time)); // true
    }
}
