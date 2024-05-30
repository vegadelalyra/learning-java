package com.lyradeperseo.scanner;

import java.time.LocalDate;

public class Scanner {
    static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        // ask username
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, master " + userName + "! :D");

        // ask user age
        System.out.println("How old are you?");
        int age = scanner.nextByte();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("So you were born in " + year + '!');

        // is user adult?
        String warning = age >= 21
                ? "It seems you are an adult for this world."
                : "Dear child, stop working, go out and play!";

        System.out.println(warning);
    }
}
