package com.example;

import java.time.Year;

public class Car extends Vehicle{

    private int seatNum;

    public Car(String creator, String model, int year, float ownWeight, int seatNum){
        super(creator, model, year, ownWeight);

        this.seatNum = seatNum;
    }

    public float getSeatNum(){
        return seatNum;
    }

    @Override
    public float getTotalWeight(){
        return seatNum * 70.0f + getOwnWeight();
    }
    
    @Override
    public int getMaxSpeed(){
        return 150;
    }

    @Override
    public int getAge(){
        return Year.now().getValue() - getYear();
    }
    
}
