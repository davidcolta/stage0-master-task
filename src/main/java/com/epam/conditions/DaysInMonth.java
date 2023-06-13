package com.epam.conditions;

import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int daysInMonth;

        switch (month) {
            case 2 -> { // February
                if (isLeapYear(year))
                    daysInMonth = 29;
                else
                    daysInMonth = 28;
            } // April
            // June
            // September
            case 4, 6, 9, 11 -> // November
                    daysInMonth = 30;
            default -> daysInMonth = 31;
        }

        System.out.println(daysInMonth);
    }

    private boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 != 0)
            return true;
        else return year % 400 == 0;
    }
}