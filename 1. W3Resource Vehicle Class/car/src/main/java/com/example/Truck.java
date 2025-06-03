package com.example;

import java.time.Year;

public class Truck extends Vehicle {
    
    private float cargoCapacity; // kg

    public Truck(String creator, String model, int year, float ownWeight, float capacity, float fuelCapacity){
        super(creator, model, year, ownWeight, fuelCapacity);
        this.cargoCapacity = capacity;
    }

    public float getCargoCapacity(){
        return cargoCapacity;
    }

    @Override
    public float getTotalWeight(){
        return cargoCapacity + getOwnWeight();
    }
    
    @Override
    public int getMaxSpeed(){
        return 100;
    }

    @Override
    public int getAge(){
        return Year.now().getValue() - getYear();
    }
}