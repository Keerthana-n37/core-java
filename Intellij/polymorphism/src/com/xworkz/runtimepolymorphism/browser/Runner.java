package com.xworkz.runtimepolymorphism.browser;

public class Runner {

    public static void main(String[] args) {

        ChromeBrowser browser = new ChromeBrowser();
        browser.browse();

        Browser browser1= new ChromeBrowser();
        browser1.browse();

        Browser browser2= new Browser();
        browser2.browse();
    }
}
