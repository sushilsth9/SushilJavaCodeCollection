package com.company;

public class Book1{

    private String bookTitle;
    private String bookAuthor;
    private long bookISBN;

    public Book1() {
        bookTitle = "";
        bookAuthor = "";
        bookISBN = 0;
    }

    public Book1(String userBookTitle, String userBookAuthor, long userBookISBN) {
        bookTitle = userBookTitle;
        bookAuthor = userBookAuthor;
        bookISBN = userBookISBN;
    }

    public long getBookISBN() {
        return bookISBN;
    }

    public void printInfo(){
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("ISBN: " + bookISBN);
    }
}