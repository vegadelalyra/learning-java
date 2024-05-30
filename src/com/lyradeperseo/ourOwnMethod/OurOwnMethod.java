package com.lyradeperseo.ourOwnMethod;

import java.util.Arrays;
import java.util.Scanner;

public class OurOwnMethod {
    static Scanner scanner = new Scanner(System.in);

    public static int countOccurrences(char[] letters, char searchLetter) {
        System.out.println("Method \"countOccurrences\" was invoked.");
        System.out.println("Searched letter: " + searchLetter);

        int count = 0;

        for (char letter : letters) {
            if (letter != searchLetter) continue;

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        System.out.println(Arrays.toString(letters));

        System.out.println("Which char are you searching for?");
        char searchedLetter = scanner.nextLine().charAt(0);
        searchedLetter = Character.isLetter(searchedLetter)
                ? Character.toUpperCase(searchedLetter) : 'D';

        int count = countOccurrences(letters, searchedLetter);
        System.out.println(searchedLetter + " is present " + count + " times.");
    }
}
