package com.lyradeperseo.arrayStructure;

import java.util.Arrays;

public class ArrayStructure {
    public static void example() {
        // Arrays
        int zero = 0;
        int one = 1;

        System.out.println("boolean [] booleans = new boolean[len]");
        boolean [] booleans = new boolean[3];
        System.out.println(Arrays.toString(booleans));

        System.out.println("int [] numbers = new int[len]");
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int [] nums = { 2, 0, 1 };
        System.out.println(Arrays.toString(numbers));
        System.out.println("int [] nums = {...} === " + Arrays.toString(nums));

        System.out.println("String [] strings = new String[len]");
        String [] strings = new String[3];
        System.out.println(Arrays.toString(strings));

        System.out.println("Arrays.stream(nums).forEach(System.out::println)");
        Arrays.stream(nums).forEach(System.out::println); // REFERENCED METHOD
        Arrays.stream(nums).forEach(x -> System.out.println(x)); // LAMBDA FUNCTION

        System.out.println("======= ARRAYS =======");
    }
}
