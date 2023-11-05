package dev.italoseara.Ex06;

public class SimpleRobot {
    private String name;
    private int x;
    private int y;
    private String direction;

    public SimpleRobot(String name, int x, int y, String direction) {
        if (!validate(name, x, y, direction)) throw new IllegalArgumentException("Invalid robot");

        this.name = name;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public boolean validate(String name, int x, int y, String direction) {
        return name != null && !name.isEmpty() && x >= 0 && y >= 0 && (
                direction.equals("N") || direction.equals("S") || direction.equals("E") || direction.equals("W") ||
                        direction.equals("NE") || direction.equals("NO") || direction.equals("SE") || direction.equals("SO"));
    }

    public void move(int n) {
        switch (this.direction) {
            case "N":
                this.y += n;
                break;
            case "S":
                this.y -= n;
                break;
            case "E":
                this.x += n;
                break;
            case "W":
                this.x -= n;
                break;
            case "NE":
                this.x += n;
                this.y += n;
                break;
            case "NO":
                this.x -= n;
                this.y += n;
                break;
            case "SE":
                this.x += n;
                this.y -= n;
                break;
            case "SO":
                this.x -= n;
                this.y -= n;
                break;
        }
    }

    public void move() {
        this.move(1);
    }

    public void setDirection(String direction) {
        if (!validate(this.name, this.x, this.y, direction)) throw new IllegalArgumentException("Invalid direction");

        this.direction = direction;
    }

    public void printRobot() {
        System.out.printf("Robot %s at (%d, %d) facing %s\n", this.name, this.x, this.y, this.direction);
    }
}
