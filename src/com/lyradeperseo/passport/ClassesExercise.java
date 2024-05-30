package com.lyradeperseo.passport;

import java.time.LocalDate;

public class ClassesExercise {
    public static void main(String[] args) {
        Passport ukPassport = new Passport(
                "1234",
                "England (UK)",
                LocalDate.of(2025, 1, 1)
        );

        Passport usPassport = new Passport(
                "12399",
                "USA",
                LocalDate.of(2030, 1, 1)
        );
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
