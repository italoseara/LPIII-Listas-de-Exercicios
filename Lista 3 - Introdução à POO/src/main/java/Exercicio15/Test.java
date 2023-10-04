package Exercicio15;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        date.initializeDate(29, 2, 2020); // Válido
        date.printDate();

        date.initializeDate(29, 2, 2021); // Inválido
        date.printDate();

        date.initializeDate(31, 4, 2021); // Inválido
        date.printDate();
    }
}
