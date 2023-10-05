package dev.italoseara.Ex01;

public class Example {
    public static void main(String[] args) {
        Date date = new Date();
        date.initializeDate(5, 10, 2023);
        date.printDate(); // 05/10/2023

        date.setMonth(12);
        System.out.println(date.getMonthName()); // Dezembro

        date.initializeDate(31, 2, 2020);
        date.printDate(); // 00/00/0000

        date.initializeDate(29, 2, 2020);
        date.printDate(); // 29/02/2020

        date.setDay(100); // Não altera o dia, pois é inválido
        date.printDate(); // 29/02/2020

        System.out.println(date.getMonth()); // 2
        System.out.println(date.getMonthName()); // Fevereiro
    }
}
