package Exercicio16;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        date.initializeDate(29, 2, 2020);
        date.printDate(); // 29/02/2020, Saturday

        date.initializeDate(30, 2, 2020);
        date.printDate(); // 00/00/0000, Invalid

        date.initializeDate(13, 10, 2023); // Meu aniversário (quero presente)
        date.printDate(); // 13/10/2023, Friday
    }
}
