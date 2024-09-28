package com.company;
//Example of non generics classes with repetitive code

public class TripleInt {
    private Integer item1;
    private Integer item2;
    private Integer item3;
    //constructor to initialize three integer values

    public TripleInt(Integer item1,Integer item2,Integer item3){
        this.item1=item1;
        this.item2=item2;
        this.item3=item3;
    }

    //method to print all data value

    public void printAll() {
        System.out.println("(" + item1 + ", " + item2 + ", " + item3 + ")");
    }

    //method to find and written the minimum value of three integer
    public Integer minItem() {
        Integer minVal = item1; // Holds minimum item value, init to first item

        if (item2.compareTo(minVal) < 0) {
            minVal = item2;
        }
        if (item3.compareTo(minVal) < 0) {
            minVal = item3;
        }
        return minVal; // Return the minimum value
    }





}
