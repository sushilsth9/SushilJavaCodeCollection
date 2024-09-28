package com.company;

public class ConstructorOverloading {
    public static void main(String[] args) {
        MyBook book1 =new MyBook();//Default constructor
        book1.displayinfo();
        MyBook book2= new MyBook("abc","xyz",5,1990);
        book2.displayinfo();
        MyBook book3=new MyBook("cde","efg",1);
        book3.displayinfo();
        MyBook book4= new MyBook("aaa","bbb");
        book4.displayinfo();


    }

}

class MyBook{
    private String Tittle;
    private String Author;
    private double price;
    private int yearpublished;
    //default constructor
    MyBook(){
        this.Tittle="unkown";
        this.Author="unkown";
        this.price=0.0;
        this.yearpublished =0;


    }
    //Parametrized Constructor
    MyBook(String Tittle,String Author,double price,int yearpublished){
        this.Tittle=Tittle;
        this.Author=Author;
        this.price=price;
        this.yearpublished=yearpublished;

    }
    //Parametrized Constructor
    MyBook(String Tittle,String Author,double price){
        this.Tittle=Tittle;
        this.Author=Author;
        this.price=price;
        this.yearpublished=0;

    }
    //Parametrized Constructor
    MyBook(String Tittle,String Author){
        this.Tittle=Tittle;
        this.Author=Author;
        this.price=0.0;
        this.yearpublished=0;

    }
    //Method to display book details
 public void displayinfo(){
     System.out.println("Tittle is "+ Tittle);
     System.out.println("Author is "+Author);
     System.out.println("Price is "+ price);
     System.out.println("Yearpublished is "+ yearpublished);
 }



}
