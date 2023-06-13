package com.epam.algorithms;

public class AlgorithmComplexity {
    public static Complexity badLinerSearch() {
        // Linear search complexity if the element is at the end of the array
        // Complexity: O(N)
        return Complexity.O_N;
    }

    public static Complexity arrayIndexItemAccess() {
        // Complexity of accessing an array element by index
        // Complexity: O(1)
        return Complexity.O_1;
    }

    public static Complexity binarySorting() {
        // Complexity of binary search
        // Complexity: O(log N)
        return Complexity.O_LOG_N;
    }

    public static Complexity twoCycleSorting() {
        // Complexity of the Two Cycle Sorting algorithm
        // Complexity: O(N^2)
        return Complexity.O_N_2;
    }

    // Constants representing the Big-O estimates
    public enum Complexity {
        O_LOG_N, O_N_2, O_FACTORIAL_N, O_2_N, O_N_LOG_N, O_1, O_N
    }
}
