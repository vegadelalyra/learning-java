package com.lyradeperseo.nestedClasses;

public class AnonymousClass {
    void myMethod() {
        // Anonymous class implementing Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous class implementing Runnable.");
            }
        };

        // Create a thread with the anonymous class and start it
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args) {
        // Create an instance of OuterClass and call myMethod
        AnonymousClass outer = new AnonymousClass();
        outer.myMethod();
    }
}
