package com.xworkz.runtimepolymorphism.food;

public class Runner {

    public static void main(String[] args) {

        Burger burger= new Burger();
        burger.getTaste();

        Food food= new Food();
        food.getTaste();
    }
}
