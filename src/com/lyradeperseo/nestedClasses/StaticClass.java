package com.lyradeperseo.nestedClasses;

public class StaticClass {
    private static String outerField = "Outer Field";

    // Static nested class
    static class StaticNestedClass {
        void display() {
            // Accessing the outer class's static field
            System.out.println("Outer field: " + outerField);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the static nested class
        StaticClass.StaticNestedClass nestedInstance = new StaticClass.StaticNestedClass();

        // Call the display method of the static nested class
        nestedInstance.display();
    }
}
