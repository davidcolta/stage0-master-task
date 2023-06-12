package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Wrong month number";
        };

        System.out.println(season);
    }
}
