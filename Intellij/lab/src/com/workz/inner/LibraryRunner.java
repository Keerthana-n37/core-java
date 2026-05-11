package com.workz.inner;

public class LibraryRunner {

    public static void main(String[] args) {

        Library library= new PublicLibrary();

        library.issueBook();
        library.newspaperSection();
        library.returnBook();
        library.readingRoom();
        Library.libraryInfo();
    }
}
