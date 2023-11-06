package dev.italoseara.Ex05;

public class Example {
    public static void main(String[] args) {
        double grams = 1000;
        double kilograms = Convert.gramsToKilograms(grams);
        double ounces = Convert.gramsToOunces(grams);
        double pounds = Convert.gramsToPounds(grams);

        System.out.println(grams + " grams = " + kilograms + " kilograms");
        System.out.println(grams + " grams = " + ounces + " ounces");
        System.out.println(grams + " grams = " + pounds + " pounds");

        System.out.println();

        kilograms = 1;
        grams = Convert.kilogramsToGrams(kilograms);
        ounces = Convert.kilogramsToOunces(kilograms);
        pounds = Convert.kilogramsToPounds(kilograms);

        System.out.println(kilograms + " kilograms = " + grams + " grams");
        System.out.println(kilograms + " kilograms = " + ounces + " ounces");
        System.out.println(kilograms + " kilograms = " + pounds + " pounds");

        System.out.println();

        pounds = 1;
        kilograms = Convert.poundsToKilograms(pounds);
        ounces = Convert.poundsToOunces(pounds);
        grams = Convert.poundsToGrams(pounds);

        System.out.println(pounds + " pounds = " + kilograms + " kilograms");
        System.out.println(pounds + " pounds = " + ounces + " ounces");
        System.out.println(pounds + " pounds = " + grams + " grams");

        System.out.println();

        ounces = 1;
        pounds = Convert.ouncesToPounds(ounces);
        kilograms = Convert.ouncesToKilograms(ounces);
        grams = Convert.ouncesToGrams(ounces);

        System.out.println(ounces + " ounces = " + pounds + " pounds");
        System.out.println(ounces + " ounces = " + kilograms + " kilograms");
        System.out.println(ounces + " ounces = " + grams + " grams");

        System.out.println();
    }
}
