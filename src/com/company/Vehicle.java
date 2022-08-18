package com.company;
/* Task 5: Vehicle
// Create a base class of a Vehicle,
// then create a Car class which inherits from the Vehicle class.
// Also, create another class, a specific type of Car that inherits from the Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.

 */
public class Vehicle {
    private String name;
    private int engine;
    private int doors;
    private double weight;

    public Vehicle(String name, int engine, int doors, double weight) {
        this.name = name;
        this.engine = engine;
        this.doors = doors;
        this.weight = weight;
    }


    public void startVehicle() {
        System.out.println("Vehicle.startVehicle() called. Vehicle is now on!");
    }

    public String getName() {
        return name;
    }

    public int getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }

    public double getWeight() {
        return weight;
    }


}
