package com.workz.inner;

public class PublicLibrary implements Library{

    @Override
    public void issueBook() {
        System.out.println("executing issueBook in PublicLibrary");
    }


    @Override
    public void returnBook() {
        System.out.println("Executing returnBook in PublicLibrary");
    }
}
