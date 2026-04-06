package com.xworkz.library;

public class Book {

    String title;

    Book(String title)
    {
        this.title=title;
    }

    public void read()
    {
        System.out.printf("Reading book: "+title);
    }
}
