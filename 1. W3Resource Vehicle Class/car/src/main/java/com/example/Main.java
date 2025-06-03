package com.example;

// run command: java -cp target/car-1.0-SNAPSHOT.jar com.example.Main

public class Main {
    
    public static void main(String[] args) {
        
        Car car = new Car("Ferrari", "Purosangue", 2012, 1520, 2);
        Truck truck = new Truck("Tesla", "cypertruck", 2022, 3020, 4989);

        System.out.println("Car Model: " + car.getModel() + ", Creator: " + car.getCreator() + ".");
        System.out.println("Car's total weight: " + car.getTotalWeight() + "kg");
        System.out.println("Car's max speed: " + car.getMaxSpeed() + "kph");
        System.out.println("Car's age: " + car.getAge() + "\n");

        System.out.println("Truck: " + truck.getModel() + ", Creator: " + truck.getCreator() + ".");
        System.out.println("Truck's total weight: " + truck.getTotalWeight() + "kg");
        System.out.println("Truck's max speed: " + truck.getMaxSpeed() + "kph");
        System.out.println("Truck's age: " + truck.getAge());

    }
}
