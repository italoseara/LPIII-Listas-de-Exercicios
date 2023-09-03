package dev.italoseara;

import dev.italoseara.exercises.Battleship;
import dev.italoseara.exercises.Craps;
import dev.italoseara.exercises.Multimeter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[ 1 ] Craps");
        System.out.println("[ 2 ] Multimeter");
        System.out.println("[ 3 ] Battleship");
        System.out.print("Choose an option: ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> Craps.main(args);
            case 2 -> Multimeter.main(args);
            case 3 -> Battleship.main(args);
            default -> System.out.println("Invalid option.");
        }
    }
}