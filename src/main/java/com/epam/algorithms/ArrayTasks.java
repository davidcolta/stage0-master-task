package com.epam.algorithms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    public int[] generateNumbers(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0.");
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
        return -1; // Number not found
    }

    public String[] reverseArray(String[] arr) {
        String[] reversedArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
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
                positiveNumbers[index] = num;
                index++;
            }
        }

        return positiveNumbers;
    }


    public int[][] sortRaggedArray(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a.length));

        for (int[] innerArray : arr) {
            Arrays.sort(innerArray);
        }

        return arr;
    }


}
