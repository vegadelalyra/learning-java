package com.lyradeperseo.switchStatement;

public class SwitchStatement {
    public static void example() {
        String GENDER = "da";

        // Without switch statement
        if (GENDER.equals("FEMALE")) {

        } else if (GENDER.equals("PREFER_NOT_SAY")) {

        } else if (GENDER.equals("MALE")) {

        } else {

        }

        // With switch statement (looks kinda neater)
        switch (GENDER) {
            case "FEMALE":
                System.out.println("I am a girl");
                break;
            case "MALE":
                System.out.println("I am a boy");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("why u care");
                break;
            default:
                System.out.println("I am an unicorn!");
        }
    }
}
