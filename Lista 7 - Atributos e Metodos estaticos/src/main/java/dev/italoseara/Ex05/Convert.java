package dev.italoseara.Ex05;

public class Convert {
    public static double gramsToKilograms(double grams) {
        return grams / 1000;
    }

    public static double gramsToOunces(double grams) {
        return kilogramsToOunces(gramsToKilograms(grams));
    }

    public static double gramsToPounds(double grams) {
        return kilogramsToPounds(gramsToKilograms(grams));
    }

    public static double kilogramsToGrams(double kilograms) {
        return kilograms * 1000;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double kilogramsToOunces(double kilograms) {
        return poundsToOunces(kilogramsToPounds(kilograms));
    }

    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }

    public static double poundsToOunces(double pounds) {
        return pounds * 16;
    }

    public static double poundsToGrams(double pounds) {
        return kilogramsToGrams(poundsToKilograms(pounds));
    }

    public static double ouncesToPounds(double ounces) {
        return ounces / 16;
    }

    public static double ouncesToGrams(double ounces) {
        return kilogramsToGrams(ouncesToKilograms(ounces));
    }

    public static double ouncesToKilograms(double ounces) {
        return poundsToKilograms(ouncesToPounds(ounces));
    }
}
