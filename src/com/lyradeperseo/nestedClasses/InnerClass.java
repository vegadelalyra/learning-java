package com.lyradeperseo.nestedClasses;

public class InnerClass {
    private String outerField = "Outer Field";

    // Inner class
    class TheInnerClass {
        void display() {
            System.out.println("Outer field: " + outerField);
        }
    }

    public static void main(String[] args) {
        // Create an instance of OuterClass
        InnerClass outer = new InnerClass();

        // Create an instance of InnerClass
        InnerClass.TheInnerClass inner = outer.new TheInnerClass();

        // Call the display method of InnerClass
        inner.display();
    }
}
