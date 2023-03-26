package org.example;

public class Calculator {

    public void turnOn() {
        System.out.println("Starting...");
    }

    public void turnOff() {
        System.out.println("Shutting down...");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }
}
