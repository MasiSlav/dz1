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
        boolean vsp = false;
        int r1;
        int reversed = 0;
        if (inputNumber < 0) {
            vsp = true;
            inputNumber *= -1;
        }
        while (inputNumber > 0) {
            r1 = inputNumber % 10;
            reversed = reversed * 10 + r1;
            inputNumber /= 10;
        }
        if (vsp)
            reversed *= -1;
        inputNumber = reversed;
        return inputNumber;
    }
}
