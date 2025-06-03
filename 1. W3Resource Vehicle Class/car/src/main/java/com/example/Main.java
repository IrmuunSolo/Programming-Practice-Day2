package com.example;

// run command: java -cp target/car-1.0-SNAPSHOT.jar com.example.Main

public class Main {
    
    public static void main(String[] args) {
        
        Car car = new Car("Ferrari", "Purosangue", 2012, 1520, 2, 80.0f);
        Truck truck = new Truck("Tesla", "Cybertruck", 2022, 3020, 4989, 300.0f);

        System.out.println("Car Model: " + car.getModel() + ", Creator: " + car.getCreator() + ".");
        System.out.println("Car's total weight: " + car.getTotalWeight() + "kg");
        System.out.println("Car's max speed: " + car.getMaxSpeed() + "kph");
        System.out.println("Car's age: " + car.getAge());
        car.refuel(50.5f);
        System.out.println("Current fuel level: " + car.getFuelLevel() + " liters\n"); // Түлшийн хэмжээг буцаана

        System.out.println("Truck: " + truck.getModel() + ", Creator: " + truck.getCreator() + ".");
        System.out.println("Truck's total weight: " + truck.getTotalWeight() + "kg");
        System.out.println("Truck's max speed: " + truck.getMaxSpeed() + "kph");
        System.out.println("Truck's age: " + truck.getAge());
        truck.refuel(200.0f);  // Түлш цэнэглэх
        truck.refuel(150.0f);  // Багтаамжаас хэтэрсэн тохиолдол
        System.out.println("Current fuel level: " + truck.getFuelLevel() + " liters");
    }
}