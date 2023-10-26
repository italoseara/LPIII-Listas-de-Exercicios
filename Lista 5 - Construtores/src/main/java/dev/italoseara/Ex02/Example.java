package dev.italoseara.Ex02;

public class Example {
    public static void main(String[] args) {
        Date d = new Date(31, 12, 2023);
        System.out.println(d); // 31/12/2023, Sunday

        Date d2 = new Date(1, 1, 2024);
        d2.printDate(); // 1st of January 2024, Monday

        System.out.println(d.isPrevious(d2)); // true
        System.out.println(d2.isPrevious(d)); // false

        System.out.println(d.howManyDays(d2)); // 1

        Date d3 = new Date(13, 10, 2023); // Meu aniversário :D
        System.out.println(d3.getDayOfWeek()); // Friday
    }
}
