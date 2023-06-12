package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && firstSide + thirdSide > secondSide) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("It's not a triangle");
        }
    }

}
