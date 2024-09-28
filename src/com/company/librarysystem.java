//package com.company;
//
//import java.util.Scanner;
//
//public class librarysystem {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the tittle");
//        Book obj = new Book();
//        obj.title = input.next();
//        System.out.println("enter the author name");
//        obj.author = input.next();
//        System.out.println("enter the year Published");
//        obj.yearPublished = input.nextInt();
//        obj.displayBookinfo();
//
//        Librarian obj1 = new Librarian();
//        obj1.name = "xyz";
//        obj1.EmployeeId =456;
//        obj1.displayLibrarianinfo();
//
//        library obj2= new library();
//        obj2.libraryname= "abc";
//        obj2.location= "def";
//        obj2.displaylibraryinfo();
//
//
//
//
//
//
//
//
//
//    }
//    {
//
//
//    }
//
//}
////Objective:*
////Develop a simple library system consisting of three classes: Book, Librarian, and Library. Each class should have relevant data fields and methods to display information. User input will be used to set the values of these fields directly.
////
////*Classes to Implement:*
////
////        1. *Book*
////        - *Data Fields:*
////        - title (String): The title of the book.
////     - author (String): The author of the book.
////     - yearPublished (int): The year the book was published.
////        - *Method:*
////        - displayBookInfo(): Prints the title, author, and year of publication of the book.
////
////2. *Librarian*
////        - *Data Fields:*
////        - name (String): The name of the librarian.
////     - employeeId (int): The ID of the librarian.
////   - *Method:*
////        - displayLibrarianInfo(): Prints the name and ID of the librarian.
////
////        3. *Library*
////        - *Data Fields:*
////        - libraryName (String): The name of the library.
////     - location (String): The location of the library.
////   - *Method:*
////        - displayLibraryInfo(): Prints the name and location of the library.
////
////        *Task:*
////Write a Java program with these three classes. In your main class (you can name it LibrarySystem), use Scanner to take user input to set the values for each data field in all three classes, and then call the display methods to show the data.