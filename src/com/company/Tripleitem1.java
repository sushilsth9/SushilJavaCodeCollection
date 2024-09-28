package com.company;

public class Tripleitem1 {
    // A generic class that can manage three items of any comparable type
    public class TripleItem1<TheType1 extends Comparable<TheType1>> {
        private TheType1 item1;
        private TheType1 item2;
        private TheType1 item3;

        //parametrized constructor
        public TripleItem1(TheType1 i1, TheType1 i2, TheType1 i3) {
            item1 = i1;
            item2 = i2;
            item3 = i3;
        }

        // Method to print all data member values
        public void printAll() {
            System.out.println(item1 + ", " + item2 + ", " + item3);//why if we remove double
        }

        //method to find the minimum value

        public TheType1 minValue() {
            TheType1 minValue = item1;
            if (item2.compareTo(minValue) > 0) {
                minValue = item2;
            }
            if (item3.compareTo(minValue) > 0) {
                minValue = item3;
            }
            return minValue;
        }}}




























