package com.company;



public class product {
    public static void main(String[] args) {
        //Create a new Product instance /Object
        ABC obj =new ABC();

        //set properties using setters
        obj.setName("Laptop");
       // System.out.println(obj.getName());
        obj.setPrice(1000.0);
       // System.out.println(obj.getPrice());
        obj.setQuantity(50);
       // System.out.println(obj.getQuantity());
        obj.setInStock(true);
       //System.out.println(obj.getInStock());
        // Display obj details
         obj.displayProductDetails();
        // Example usage of the methods
        // Example usage of methods
        obj.increaseQuantity(30);
         System.out.println("Quantity after increase: " + obj.getQuantity());

        obj.decreaseQuantity(49);
        System.out.println("Quantity after decrease: " + obj.getQuantity());

        // Check if obj is low in stock
        System.out.println("Low in stock: " + obj.isLowInStock());



    }
}
//Data fields or Instance Variable
class ABC {
    private String name;    //Name of the obj
    private double price;   // Price of the obj
    private int quantity;   // Available quantity in stock
    private boolean InStock; //Indicates if the obj is in stock

    // Getter for name
    public String getName(){
        return name;
    }
    // Setter for name
    public void setName(String name){
        this.name=name;
    }
    //Getter for price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    //Getter for quantity
    public int getQuantity(){
        return quantity;
    }
    //setter for quantity
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public boolean getIInStock(){
        return InStock;
    }
    public void  setInStock(boolean inStock){
        this.InStock=InStock;
    }


    public boolean getInStock() {
        return InStock;
    }
    //Method to increase the quantity of the obj

    public  void increaseQuantity(int amount) {
        this.quantity += amount;
        // int a=10;
        // you have to increase this value by a certain amount say x.
        // Step 1: a=a+x; // old way of programming but still we can use it it does not give errors.
        // Step 2: a+=x; // new way
    }
    // Method to decrease the quantity of the obj
    public void decreaseQuantity(int amount) {
        if (amount <= this.quantity) {
            this.quantity -= amount; // this.quantity=this.quanity-amount;
        } else {
            System.out.println("Insufficient quantity!");
        }
    }
    // Method to check if the obj is low in stock
    public boolean isLowInStock() {
        return quantity < 10;   // Example threshold for low stock
    }
    // Method to display obj details
    public void displayProductDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("In Stock: " + InStock);
    }

}


