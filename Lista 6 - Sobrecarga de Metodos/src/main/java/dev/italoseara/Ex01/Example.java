package dev.italoseara.Ex01;

public class Example {
    public static void main(String[] args) {
        Time time = new Time(23, 59, 59);
        time.addTime(1);
        System.out.println(time);

        Time time2 = new Time(23, 59, 59);
        time2.addTime(2, 10);
        System.out.println(time2);

        Time time3 = new Time(23, 59, 59);
        time3.addTime(0, 10, 1);
        System.out.println(time3);

        Time time4 = new Time(23, 59, 59);
        time4.addTime(new Time(1, 1, 1));
        System.out.println(time4);
    }
}
