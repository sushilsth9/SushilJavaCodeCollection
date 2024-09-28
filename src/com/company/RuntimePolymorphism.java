package com.company;//overriding
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }

}
class Cat extends Animal{
    void sound(){
        System.out.println("cat meow meow");
    }
}

class Doggy extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }

}
class Lion extends Animal{
    void sound(){
        System.out.println("lion roars");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal obj= new Animal();
        Animal mydog= new Doggy();
        Animal mycat= new Cat();
        Animal mylion=new Lion();
        obj.sound();
        mydog.sound();
        mycat.sound();
        mylion.sound();


    }
}
