package com.lyradeperseo.ourOwnClass;

public class OurOwnClass {
    public static void main(String[] args) {
        System.out.println("====== Classes & Objects =======");

        Lens lensOne = new Lens("sony", "85mm", true);
        Lens lensTwo = new Lens("sony", "30mm", false);
        Lens lensThree = new Lens("canon", "24-70mm", false);

        /*
        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println();

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println();

        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
        */

        lensOne.showcase();
        lensTwo.showcase();
        lensThree.showcase();
    }

    static class Lens {
        String name;
        String brand;
        String focalLength;
        boolean isPrime;

        static int count = 1;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
            this.name = "Lens " + count;
            count++;
        }

        public void showcase() {
            System.out.println(this.name);
            System.out.println(this.brand);
            System.out.println(this.focalLength);
            System.out.println(this.isPrime ? "Is Prime!" : "Is not prime");
            System.out.println();
        }
    }
}
