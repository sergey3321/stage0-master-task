package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        if (power == 1) {
            System.out.println(numberToPrint);
        } else if (power == 2) {
            System.out.println(numberToPrint * numberToPrint);
        } else if (power == 3) {
            System.out.println(numberToPrint * numberToPrint * numberToPrint);
        } else if (power == 4) {
            System.out.println(numberToPrint * numberToPrint * numberToPrint * numberToPrint);
        } else if (power == 5) {
            System.out.println(numberToPrint * numberToPrint * numberToPrint * numberToPrint * numberToPrint);
        }
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
