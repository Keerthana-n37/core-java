package com.workz.inner;

public class GymRunner {

    public static void main(String[] args) {

        Gym gym=new FitnessCenter();

        gym.cardio();
        gym.rest();
        gym.workout();
        gym.yoga();
        Gym.gymInfo();
    }
}
