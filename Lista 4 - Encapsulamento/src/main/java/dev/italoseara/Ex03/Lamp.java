package dev.italoseara.Ex03;

public class Lamp {
    private double state; // 0% a 100%

    public void turnOn() {
        this.state = 1;
    }

    public void turnOff() {
        this.state = 0;
    }

    public void setBrightness(double state) {
        this.state = state;
    }

    public double getState() {
        return this.state;
    }

    public boolean isOn() {
        return this.state > 0;
    }

    public void printState() {
        System.out.println("A lâmpada está " + (this.state * 100) + "% acesa.");
    }
}
