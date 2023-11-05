package dev.italoseara.Ex02;

public class Example {
    public static void main(String[] args) {
        Date data = new Date();
        Date data2 = new Date(data);
        Date data3 = new Date(13, 10, 2004);

        System.out.println(data.howManyDays(13, 10, 2004));
        System.out.println(data.howManyDays(data3));

        System.out.println(data2.howManyDays(13, 10, 2004));
        System.out.println(data2.howManyDays(data3));

        data2.setDate(13, 10, 2003);
        System.out.println(data2.howManyDays(13, 10, 2004));
    }
}
