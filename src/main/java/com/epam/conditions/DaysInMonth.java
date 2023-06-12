package com.epam.conditions;

import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("Invalid date: Negative year");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Invalid date: Month should be between 1 and 12");
            return;
        }

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        System.out.println("Number of days in the month: " + daysInMonth);
    }
}