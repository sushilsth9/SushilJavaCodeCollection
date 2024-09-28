package com.company;

public class itemminimum1 {
    //generic method to find the minimum of threee
    public static<TheType extends Comparable<TheType>> TheType tripleMin(TheType item1, TheType item2, TheType item3){
        TheType minVal=item1;//initialize to first item
        if (item2.compareTo(minVal)>0){
            minVal=item2;
        }
        if(item3.compareTo(minVal)>0){
            minVal=item3;
        }
        return minVal;

    }

    public static void main(String[] args) {
        Integer num1=45,num2=45,num3=46;
        System.out.println("Min"+tripleMin(num1,num2,num3));

        Character letter1 = 'a',letter2 = 'b',letter3 = 'c';
        System.out.println("Min"+tripleMin(letter1,letter2,letter3));

        String str1="zzz",str2="aaa",str3="ddd";
        System.out.println( );
    }
}
