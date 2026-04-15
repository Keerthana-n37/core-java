package com.xworkz.override.actor;

public class StarActor extends Actor{

    boolean isPanIndia;
    String award;

    StarActor(String name, int age, double salary, int[] scores, ActorType type, Agency agency, boolean isPanIndia, String award) {
        super(name, age, salary, scores, type, agency);
        this.isPanIndia = isPanIndia;
        this.award = award;
    }

    void act() {
        System.out.println("Star actor " + name + " is acting");
    }

    void rest() {
        System.out.println("Star actor " + name + " is resting");
    }

    void showAward() {
        System.out.println("Award: " + award);
    }

    public String toString() {
        return "StarActor{isPanIndia=" + isPanIndia +
                ", award='" + award + "'} " + super.toString();
    }
}
