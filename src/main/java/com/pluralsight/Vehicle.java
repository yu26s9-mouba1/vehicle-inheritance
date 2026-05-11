package com.pluralsight;

/**
 * Parent Class
 */

public class Vehicle {

    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;


    /**
     * setters and getters
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    /**
     *
     * @param args constructors 
     */

    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(10);

        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setFuelCapacity(15);
        familyCar.setNumberOfPassengers(5);
        familyCar.setCargoCapacity(300);

        SemiTruck bigTruck = new SemiTruck();
        bigTruck.setColor("White");
        bigTruck.setFuelCapacity(100);
        bigTruck.setNumberOfPassengers(2);
        bigTruck.setCargoCapacity(20000);

        Hovercraft waterRide = new Hovercraft();
        waterRide.setColor("Silver");
        waterRide.setFuelCapacity(50);
        waterRide.setNumberOfPassengers(8);
        waterRide.setCargoCapacity(1000);


        System.out.println("Moped: " + slowRide.getColor());
        System.out.println("Car: " + familyCar.getColor());
        System.out.println("SemiTruck: " + bigTruck.getColor());
        System.out.println("Hovercraft: " + waterRide.getColor());




    }



}


