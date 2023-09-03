package dev.italoseara.exercises;

import java.util.Scanner;

public class Battleship {
    public enum Piece {
        BLANK("-"), PLAYER("@"), MISS("O"), HIT("X");

        private final String ch;

        Piece(String s) {
            this.ch = s;
        }

        public String getChar() {
            return this.ch;
        }
    }

    public static void main(String[] args) {
        Piece[][] player1 = newBoard();
        Piece[][] player2 = newBoard();
        Piece[][] player1Attack = newBoard();
        Piece[][] player2Attack = newBoard();

        System.out.println("Welcome to Battleship!!!");

        System.out.println("\nPLAYER 1, ENTER YOUR SHIPS' COORDINATES.");
        getShipCoords(player1);
        printBoard(player1);

        System.out.println("\nPLAYER 2, ENTER YOUR SHIPS' COORDINATES.");
        getShipCoords(player2);
        printBoard(player2);

        int turn = 1;
        while (true) {
            if (turn == 1) {
                getAttackCoords(player1Attack, player2, 1);
                turn = 2;
            } else {
                getAttackCoords(player2Attack, player1, 2);
                turn = 1;
            }

            int winner = checkWinner(player1, player2);

            if (winner != 0) {
                System.out.println("PLAYER " + winner + " WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
                break;
            }
        }

        System.out.println("\nFinal boards:");
        printBoard(player1);
        printBoard(player2);
    }

    private static int checkWinner(Piece[][] board1, Piece[][] board2) {
        int board1Pieces = 0;
        for (Piece[] row : board1) {
            for (Piece col : row) {
                if (col == Piece.PLAYER) board1Pieces++;
            }
        }
        if (board1Pieces == 0) return 2;

        int board2Pieces = 0;
        for (Piece[] row : board2) {
            for (Piece col : row) {
                if (col == Piece.PLAYER) board2Pieces++;
            }
        }
        if (board2Pieces == 0) return 1;

        return 0;
    }

    private static Piece[][] newBoard() {
        Piece[][] board = new Piece[5][5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                board[i][j] = Piece.BLANK;

        return board;
    }

    private static void printBoard(Piece[][] board) {
        StringBuilder builder = new StringBuilder();

        builder.append("  0  1  2  3  4\n");
        for (int i = 0; i < 5; i++) {
            builder.append(i).append(" ");
            for (int j = 0; j < 5; j++) {
                builder.append(board[i][j].getChar())
                       .append("  ");
            }
            builder.append("\n");
        }

        System.out.println(builder);
    }

    private static void getShipCoords(Piece[][] board) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter ship " + (i + 1) + " location:");

            while (true) {
                x = scanner.nextInt();
                y = scanner.nextInt();

                if (x < 0 || x >= 5 || y < 0 || y >= 5) {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    continue;
                }

                if (board[x][y] != Piece.BLANK) {
                    System.out.println("You already have a ship there. Choose different coordinates.");
                    continue;
                }

                break;
            }

            board[x][y] = Piece.PLAYER;
        }
    }

    private static void getAttackCoords(Piece[][] attackingBoard, Piece[][] enemyBoard, int attacker) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.println("Player " + attacker + ", enter hit row/column:");

        while (true) {
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (x < 0 || x >= 5 || y < 0 || y >= 5) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }

            if (attackingBoard[x][y] != Piece.BLANK) {
                System.out.println("You already fired on this spot. Choose different coordinates.");
                continue;
            }

            break;
        }

        if (enemyBoard[x][y] == Piece.PLAYER) {
            attackingBoard[x][y] = Piece.HIT;
            enemyBoard[x][y] = Piece.HIT;
            System.out.println("PLAYER " + attacker + " HIT PLAYER " + (attacker == 1 ? 2 : 1) + "'s SHIP!");
        } else {
            attackingBoard[x][y] = Piece.MISS;
            enemyBoard[x][y] = Piece.MISS;
            System.out.println("PLAYER " + attacker + " MISSED!");
        }

        printBoard(attackingBoard);
    }
}
