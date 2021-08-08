package com.bealdung;/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 1:11 AM
*/

public class Rules {
//    Let's now look at some rules/techniques concerning method signatures, invariants, preconditions,
//    and post conditions that we can follow and use to ensure we create well-behaved subtypes.
public static void main(String[] args) {

}
}

abstract class Parent {
    public abstract Number generateNumber();
    // precondition: 0 < num <= 5
    public void doStuff(int num) {
        if (num <= 0 || num > 5) {
            throw new IllegalArgumentException("Input out of range 1-5");
        }
        // some logic here...
    }
}

class Child extends Parent {

    @Override
    public Integer generateNumber() {
        // Change the return type from "Number" to subtype "Integer"
        return 10;
    }

    @Override
    // subtype can weaken (but not strengthen) the precondition for a method it overrides.
    // precondition: 0 < num <= 10 (Weaken)
    // precondition: 0 < num <= 4 (strengthen - not valid for com.com.example.one.Child.doStuff)
    public void doStuff(int num) {
        if (num <= 0 || num > 10) {
            throw new IllegalArgumentException("Input out of range 1-10");
        }
        // some logic here...
    }

    // Other Methods
}

abstract class Car {
    protected int limit;
    // invariant: speed < limit;
    protected int speed;

    // post-condition: speed < limit;
    protected  abstract void accelerate();

    // Other methods...
}

class HybridCar extends Car {
    // invariant: charge >= 0;
    private int charge;

    @Override
    // post-condition: speed < limit;
    protected void accelerate() {
        // Accelerate com.com.example.one.HybridCar ensuring speed < limit
    }

    // Other methods...
}

abstract class Truck {
    // Allowed to be set once at the time of creation.
    // Value can only increment thereafter.
    // Value cannot be reset.
    protected int mileage;

    public Truck(int mileage) {
        this.mileage = mileage;
    }

    // Other properties & methods
}

class ToyTruck extends Truck {

    public ToyTruck(int mileage) {
        super(mileage);
    }

    public void reset() {
//        com.com.example.one.ToyTruck isn't substitutable for com.com.example.one.Truck.
//        Because it changes mileage (break the rule defined in com.com.example.one.Truck class)
        mileage = 0;
    }

    // Other properties & methods
}

abstract class Bike {
//    The subtype can strengthen (but not weaken) the post-condition for a method it overrides
    protected int speed;

    // post-condition: speed must reduce
    protected abstract void brake();

    // Other methods...
}

class HybridBike extends Bike {
    // Some properties and other methods...
    @Override
    // post-condition: speed must reduce
    // post-condition: charge must increase
    protected void brake() {
        // Apply com.com.example.one.HybridCar brake
    }
}


