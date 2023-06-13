package com.epam.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmComplexityTest {

    private final List<String> encodedComplexities = List.of(
            "O_N_2",
            "O_N",
            "O_LOG_N",
            "O_1"
    );

    private final AlgorithmComplexity algorithmComplexity = new AlgorithmComplexity();

    @Test
    public void badLinerSearch() {
        assertEquals(1, encodedComplexities.indexOf(algorithmComplexity.badLinearSearch(0).name()));
    }

    @Test
    public void twoCycleSorting() {
        assertEquals(0, encodedComplexities.indexOf(algorithmComplexity.twoCycleSorting(0).name()));
    }

    @Test
    public void binarySorting() {
        assertEquals(2, encodedComplexities.indexOf(algorithmComplexity.binarySorting(0).name()));
    }

    @Test
    public void arrayItemAccess() {
        assertEquals(3, encodedComplexities.indexOf(algorithmComplexity.arrayIndexItemAccess().name()));
    }
}
