package dev.italoseara.Ex03;

public class Example {
    public static void main(String[] args) {
        Date birthday = new Date(13, 10, 2004);
        System.out.println(Date.dayOfWeek(birthday)); // Wednesday
        System.out.println(Date.dayToPrintLong(birthday)); // 13 of October 2004
        System.out.println(Date.dayToPrintShort(birthday)); // 13/10/2004
        System.out.println(Date.howManyDaysUntilEndYear(birthday)); // 79
        System.out.println(Date.howManyDaysUntilNextMonth(birthday)); // 19
    }
}
