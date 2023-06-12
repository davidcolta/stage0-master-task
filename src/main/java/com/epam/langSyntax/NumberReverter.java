package com.epam.langSyntax;

public class NumberReverter {

    int reverse = 0;
    public int revert(int number) {
        int reversedNumber = 0;

        reversedNumber += (number % 10) * 100;
        number /= 10;
        reversedNumber += (number % 10) * 10;
        number /= 10;
        reversedNumber += number;

        return reversedNumber;
    }

}
