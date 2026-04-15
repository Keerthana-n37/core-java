package com.xworkz.override.actor;

public class ActorRunner {

    public static void main(String[] args) {
        int[] scores = {10, 20, 30};

        Agency agency = new Agency("Talent Hub", "Mumbai");

        Actor actor= new Actor("Actor A", 35, 5000000, scores, ActorType.HERO, agency);
        StarActor starActor = new StarActor("Actor B", 40, 10000000, scores, ActorType.HERO, agency, true, "National Award");

        actor.act();
        actor.rest();
        System.out.println(actor);

        starActor.act();
        starActor.rest();
        starActor.showAward();
        System.out.println(starActor);
    }
}
