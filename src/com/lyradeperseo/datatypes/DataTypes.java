package com.lyradeperseo.datatypes;

public class DataTypes {
    public static void types() {
        byte theByte = -128; // from -128 to 127
        short theShort = -32_768; // from -32,678 to 32.767
        int theInt = 1_996_565_195; // from -2'147.483.648 to 2'147.483.647
        long theLong = -4_931_996_565_195L; // from -9,223,372,036.854.775.808 to 9,223,372,036.854.775.807

        float pi = 3.14F; // stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double doublePi = 3.1415342424F; // stores fractional numbers. Sufficient for storing 15 decimal digits

        boolean isAdult = true; // true or false
        char nameInitial = 'A'; // for single char; must be declared inside '' instead of "" which is exclusive of strings

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(isAdult);
        System.out.println(nameInitial);
    }
}
