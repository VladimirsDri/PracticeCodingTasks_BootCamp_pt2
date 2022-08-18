package com.company;

public class Car extends Vehicle {
    private int wheels;
    private int headlights;

    public Car(String name, int engine, int doors, double weight, int wheels, int headlights) {
        super(name, engine, doors, weight);
        this.wheels = wheels;
        this.headlights = headlights;
    }

    public void carRadio() {
        System.out.println("Car Radio called");
    }

    public void handSteering(char direction) {
        switch (direction) {
            case 'R':
            case 'r':
                System.out.println("This vehicle is a Car and it is turning right");
                break;
            case 'L':
            case 'l':
                System.out.println("This vehicle is a Car and it is turning left");
                break;
            default:
                System.out.println("This vehicle is a Car and it is not turning");
                break;
        }
    }

    public void gearChange(char gear) {
        switch (gear) {
            case 'R':
            case 'r':
                System.out.println("This Car is in reverse.");
                break;
            case '1':
                System.out.println("This Car is in first gear.");
                break;
            case '2':
                System.out.println("This Car is in second gear.");
                break;
            case 'N':
            case 'n':
                System.out.println("This Car is in neutral.");
                break;
            case 'D':
            case 'd':
                System.out.println("This car is in drive.");
                break;

            default:
                System.out.println("No change in gear due to invalid input.");
                break;
        }
    }

    public void Accelerate(int initialSpeed) {
        initialSpeed = initialSpeed + 5;
        System.out.println("Speed is now " + initialSpeed);
    }

    public void Decelerate(int initialSpeed) {
        initialSpeed = initialSpeed - 5;
        System.out.println("Speed is now " + initialSpeed);
    }


    private void combustionEngine() {
        System.out.println("Car.combustionEngine() called");
        String carPowerSource = "Internal Combustion activated!";
        System.out.println(carPowerSource);
    }


    public void startVehicle() {
        System.out.println("Car.startVehicle called");
        combustionEngine();
        super.startVehicle();
    }
}

