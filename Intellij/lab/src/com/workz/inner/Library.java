package com.workz.inner;

public interface Library {

    String name="City Library";
    int books= 5000;
    String librarianName="Arun";

    void issueBook();
    void returnBook();

    default void readingRoom()
    {
        System.out.println("Reading room is available and executing in Library");
    }

    default void newspaperSection()
    {
        System.out.println("newspaper section is opened");
    }

    static void libraryInfo()
    {
        System.out.println("Executing LibraryInfo in Library");
    }
}
