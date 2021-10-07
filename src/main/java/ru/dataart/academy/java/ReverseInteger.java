package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        long reversedNumber = 0;
        while (inputNumber != 0) {
            reversedNumber = reversedNumber * 10 + inputNumber % 10;
            inputNumber /= 10;
        }

        if (reversedNumber < Integer.MIN_VALUE || reversedNumber > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("reversedNumber is too big");
        }
        return (int) reversedNumber;
    }

    /* Solution with Math.*Exact methods, but now they are undesirable(

    public int reverse(int inputNumber) {
        int reversedNumber = 0;
        while (inputNumber != 0) {
            reversedNumber = Math.addExact(Math.multiplyExact(reversedNumber, 10), inputNumber % 10);
            inputNumber /= 10;
        }
        return reversedNumber;
    }
    */
}
