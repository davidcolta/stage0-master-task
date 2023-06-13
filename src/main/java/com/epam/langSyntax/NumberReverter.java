package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        String numberStr = String.valueOf(number);
        String reversedStr = new StringBuilder(numberStr).reverse().toString();
        int reversedNumber = Integer.parseInt(reversedStr);
        System.out.println(reversedNumber);
    }
}
