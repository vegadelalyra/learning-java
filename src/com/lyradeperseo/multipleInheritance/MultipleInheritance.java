package com.lyradeperseo.multipleInheritance;

public class MultipleInheritance {
    static class Vehicle {
        public void start() {
            System.out.println("Vehicle is starting");
        }
    }

    public interface MusicPlayer {
        void playMusic();
    }

    static class Car extends Vehicle implements Runnable, MusicPlayer {
        @Override
        public void run() {
            System.out.println("Car's run method is executed by a thread");
        }

        @Override
        public void playMusic() {
            System.out.println("Car is playing music");
        }

        public static void main(String[] args) {
            Car myCar = new Car();

            // Call methods from Vehicle class
            myCar.start();

            // Call method from MusicPlayer interface
            myCar.playMusic();

            // Create a thread to execute the run method
            Thread thread = new Thread(myCar);
            thread.start();
        }
    }

}
