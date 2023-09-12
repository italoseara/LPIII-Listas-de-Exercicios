package dev.italoseara.exercises;

import java.util.List;

public class Craps {
    public static void main(String[] args) {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int points = dice1 + dice2;

        System.out.printf("Dice 1: %d, Dice 2: %d\n", dice1, dice2);
        System.out.printf("Points: %d\n", points);

        if (List.of(7, 11).contains(points)) {
            System.out.println("You won!");
            return;
        }

        if (List.of(2, 3, 12).contains(points)) {
            System.out.println("You lost.");
            return;
        }

        System.out.println("Next stage!");

        int count = 0;
        while (true) {
            count++;

            dice1 = rollDice();
            dice2 = rollDice();
            int sum = dice1 + dice2;

            System.out.printf("Dice 1: %d, Dice 2: %d\n", dice1, dice2);
            System.out.printf("Play %d: %d\n", count, sum);

            if (sum == 7) {
                System.out.println("You lost.");
                return;
            }

            if (sum == points) {
                System.out.println("You won!");
                return;
            }
        }
    }

    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
