package com.xworkz.runtimepolymorphism.app;

public class Runner {

    public static void main(String[] args) {
        Instagram instagram= new Instagram();
        instagram.send();

        Application application= new Application();
        application.send();
    }
}
