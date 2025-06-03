package com.example;

public abstract class Vehicle {
    
    private String creator;
    private String model;
    private int year;
    private float ownWeight;

    public Vehicle(String creator, String model, int year, float ownWeight){

        this.creator = creator;
        this.model = model;
        this.year = year;
        this.ownWeight = ownWeight;
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
