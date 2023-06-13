package com.epam.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTasks {
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    public int[] generateNumbers(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public String[] reverseArray(String[] arr) {
        String[] reversedArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
        return reversedArr;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        int[] positiveNumbers = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers[index++] = num;
            }
        }
        return positiveNumbers;
    }

    public int[][] sortRaggedArray(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a.length));
        for (int[] subArray : arr) {
            Arrays.sort(subArray);
        }
        return arr;
    }
}