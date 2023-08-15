package com.workintech.polymorphism.rnd;

import com.workintech.polymorphism.pasific.Car;
import com.workintech.polymorphism.skeleton.CarSkeleton;

public class RNDMain {

    public static void main(String[] args) {
        CarSkeleton car1 = new ElectricCar("Tesla", "Tesla Model 3", 652, 82);
        CarSkeleton car2 = new GasPoweredCar("Mercedes", "c180", 12, 4);
        CarSkeleton car3 = new HybridCar("Toyota", "Prius", 23, 9, 4);
        car1.drive();
        car2.drive();
        car3.drive();
    }
}
