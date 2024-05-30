package com.lyradeperseo.nestedClasses;

public class LocalClass {
    void myMethod() {
        // Local class inside myMethod
        class TheLocalClass {
            void display() {
                System.out.println("This is a local class.");
            }
        }

        // Create an instance of LocalClass and call its method
        TheLocalClass local = new TheLocalClass();
        local.display();
    }

    public static void main(String[] args) {
        // Create an instance of OuterClass and call myMethod
        LocalClass outer = new LocalClass();
        outer.myMethod();
    }
}
