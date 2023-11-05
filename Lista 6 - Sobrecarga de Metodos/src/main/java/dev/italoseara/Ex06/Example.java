package dev.italoseara.Ex06;

public class Example {
    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot("R2D2", 0, 0, "N");
        robot.printRobot(); // R2D2 at (0, 0) facing N

        robot.move(5);
        robot.printRobot(); // R2D2 at (0, 5) facing N

        robot.setDirection("S");
        robot.move(5);
        robot.printRobot(); // R2D2 at (0, 0) facing S

        robot.setDirection("NE");
        robot.move(5);
        robot.printRobot(); // R2D2 at (5, 5) facing NE
    }
}
