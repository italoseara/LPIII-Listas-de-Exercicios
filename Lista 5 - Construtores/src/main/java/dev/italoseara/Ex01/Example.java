package dev.italoseara.Ex01;

public class Example {
    public static void main(String[] args) {
        Time t = new Time(23, 59, 59);
        System.out.println(t); // 23:59:59

        t.setHour(0);
        System.out.println(t); // 00:59:59

        System.out.println(t.getMinute()); // 59

        // t.setMinute(-1); // throws IllegalArgumentException

        t.addSeconds(1);
        System.out.println(t); // 01:00:00

        t.addSeconds(60);
        System.out.println(t); // 01:01:00

        t.addSeconds(-30);
        System.out.println(t); // 01:00:30

        Time t2 = new Time(2, 1, 1);
        System.out.println(t.cron(t2)); // 3601

        System.out.println(t2.getTimestamp()); // 7261
    }
}
