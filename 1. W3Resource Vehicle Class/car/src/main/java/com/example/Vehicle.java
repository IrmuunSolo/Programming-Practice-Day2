package com.example;

public abstract class Vehicle {
    
    private String creator;
    private String model;
    private int year;
    private float ownWeight;
    private float fuelLevel;  // Шинээр нэмэгдсэн fuel атрибут
    private float fuelCapacity;  // Шинээр нэмэгдсэн fuel багтаамж

    public Vehicle(String creator, String model, int year, float ownWeight, float fuelCapacity){
        this.creator = creator;
        this.model = model;
        this.year = year;
        this.ownWeight = ownWeight;

        this.fuelCapacity = fuelCapacity; // new
        this.fuelLevel = 0;  // new
    }

    // Түлш нэмэх функц
    public void refuel(float amount) {
        if (amount <= 0) {
            System.out.println("Fuel level must be greater than 0");
            return;
        }
        
        float newFuelLevel = fuelLevel + amount;
        if (newFuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity;
            System.out.println("Fuel is full. " + (newFuelLevel - fuelCapacity) + " extra fuel");
        } else {
            fuelLevel = newFuelLevel;
        }
        System.out.println("Fueled. Current level: " + fuelLevel + " litr");
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public String getCreator(){
        return creator;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public float getOwnWeight(){
        return ownWeight;
    }

    public abstract float getTotalWeight();
    public abstract int getMaxSpeed();
    public abstract int getAge();
}