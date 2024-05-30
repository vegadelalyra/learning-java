package com.lyradeperseo;

import com.lyradeperseo.arrayStructure.ArrayStructure;
import com.lyradeperseo.datatypes.DataTypes;
import com.lyradeperseo.referenceTypes.ReferenceTypes;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        System.out.println("Math.pow without (int) casting: 5^2 = " + Math.pow(5, 2));
        System.out.println("Math.pow with (int) casting: 5^2 = " + (int) Math.pow(5, 2));

        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        DataTypes.types();
        ReferenceTypes.nonPrimitiveType();
        ArrayStructure.example();
    }
}