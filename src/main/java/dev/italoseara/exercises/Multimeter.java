package dev.italoseara.exercises;

import java.util.Scanner;

public class Multimeter {
    public static void main(String[] args) {
        double total = 0;
        final double[] measurement = new double[10];

        Scanner scanner = new Scanner(System.in);

        // Scan the measurements
        for (int i = 0; i < measurement.length; i++) {
            System.out.printf("Measurement %d: ", i);
            double read = scanner.nextDouble();

            measurement[i] = read;
            total += read;
        }

        // Calculate average
        final double average = total / measurement.length;

        // Calculate variance
        double variance = 0;
        for (double v : measurement) variance += Math.pow(v - average, 2);
        variance /= measurement.length;

        // Calculate standard deviation
        double std = Math.sqrt(variance);

        System.out.println("Average: " + average);
        System.out.println("Standard Deviation: " + std);

        if (std > average * 0.1) {
            System.out.println("The multimeter has a defect.");
        } else {
            System.out.println("The multimeter is working fine.");
        }
    }
}