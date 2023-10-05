package dev.italoseara.Ex03;

public class Example {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.turnOn();
        lamp.printState(); // A lâmpada está 100.0% acesa.

        lamp.turnOff();
        lamp.printState(); // A lâmpada está 0.0% acesa.

        lamp.setBrightness(0.5);
        lamp.printState(); // A lâmpada está 50.0% acesa.

        System.out.println(lamp.isOn()); // true

        lamp.turnOff();
        System.out.println(lamp.isOn()); // false

        lamp.turnOn();
        System.out.println(lamp.getState()); // 1.0
    }
}
