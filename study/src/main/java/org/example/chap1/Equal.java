package org.example.chap1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Equal {

    static void print(Object... obj) {
        System.out.println("Object...: " + obj[0]);
    }
    public static void main(String[] args) {
        int month = 4; // Giả sử tháng 4
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> {
                System.out.println("abc");
                yield "Unknown";
            }
        };
        System.out.println("The season is: " + season);
    }


}
