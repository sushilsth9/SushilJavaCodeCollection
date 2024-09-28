package com.company;
class vehicle{
    void honk (){
        System.out.println("Pom Pom");

    }
    String colorvehicle;
    int lengthvehicle;

}

// Create a class sportsCar dependent on Vehicle
// Inheritance -- > extends keyword

// format child or derived or subclass nameOfClass extends Base class or Parent class or Super class

class SportsCar extends vehicle{
    void nitro(){
        System.out.println("The nitro has been activated");

    }
}

class SuperCar extends SportsCar{
    void fly(){
        System.out.println("cars has started flying");
    }
}




public class Testinheritance {
    public static void main(String[] args) {
        vehicle obj = new vehicle();
        System.out.println("These are characteristics of Grand Father");
        obj.honk();
        obj.colorvehicle="red";
        obj.lengthvehicle= 7;

        System.out.println("The color of the vehicle is : "+ obj.colorvehicle);
        System.out.println("The color of the veicle is :"+ obj.lengthvehicle);

        SportsCar obj1 = new SportsCar();
        System.out.println("These are the characteristics of Son");
        obj1.nitro();
        obj1.honk();
        obj1.colorvehicle="Blue";
        obj1.lengthvehicle=8;

        System.out.println("The color of the vehicle is : "+obj1.colorvehicle);
        System.out.println("The color of the vehicle is :"+ obj1.lengthvehicle);

        SuperCar obj2= new SuperCar();
        System.out.println("These are the features of GrandSon");
        obj2.honk();
        obj2.nitro();
        obj2.fly();
        obj2.colorvehicle="blue";
        obj2.lengthvehicle=8;

        System.out.println("The color of the vehicle "+obj2.colorvehicle);
        System.out.println("The length of the vehicle " + obj2.lengthvehicle);









    }




}
