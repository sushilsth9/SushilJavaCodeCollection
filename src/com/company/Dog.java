package com.company;

public class Dog {
    //declare attributes
    private int dogSpaceNumber;
    private double dogWeight;
    private boolean grooming;

    //Creating Constructor
    public Dog(int dogSpaceNumber, double dogWeight, boolean grooming) {
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }

    //getter for dogSpaceNumber
    public int getdogSpaceNumber() {
        return dogSpaceNumber;
    }

    //setter for dogSpaceNumber
    public void setdogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    //  getter for DogWeight
    public double getdogWeight() {
        return dogWeight;
    }

    //setter for DogWeight
    public void setdogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    //  getter for grooming
    public boolean getgrooming() {
        return grooming;
    }

    //setter for Grooming
    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}
