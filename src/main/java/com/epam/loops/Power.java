package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= numberToPrint;
        }

        System.out.println(numberToPrint + " raised to the power of " + power + " is: " + result);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
