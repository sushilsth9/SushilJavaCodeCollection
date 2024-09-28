package com.company;

public class Pet {
    private String petType;
    private String petName;
    private int petAge;
    private int daysStay;
    private double amountDue;
    private int dogSpaces;
    private int catSpaces;

    public Pet(String petType, String petName, int petAge, int daysStay, double amountDue, int dogSpaces, int catSpaces) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }
}
