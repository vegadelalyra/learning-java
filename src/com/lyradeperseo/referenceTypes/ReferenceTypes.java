package com.lyradeperseo.referenceTypes;

import java.time.LocalDate;

public class ReferenceTypes {
    public static void nonPrimitiveType() {
        System.out.println("======= DATA TYPES ========");

        // Non-primitive data types AKA reference types
        String name = new String("Lyra de Perseo");
        System.out.println(name.toLowerCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfWeek());
        /*
        * REFERENCE TYPES START WITH UPPERCASE LETTER
        * You can access methods from the object instead of the class
        * with referenced or non-primitive data types, ex. name.toUpperCase()
        * */
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " - b = " + b);

        Person alex = new Person("alex");
        Person mariam = alex;
        System.out.println("before changing alex");
        System.out.println(alex.name + ' ' + mariam.name);

        alex.name = "Alexander";

        System.out.println("after changing alex");
        System.out.println(alex.name + ' ' + mariam.name);

        System.out.println("======= REFERENCE TYPES ========");
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}


