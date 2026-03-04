class PenguinRunner{

    public static void main(String[] args) {

        Penguin pengium1 = new Penguin();
        pengium1.swim();
        pengium1.walk();
        pengium1.slide();
        pengium1.eat();
        pengium1.hunt();
        pengium1.dive();
        pengium1.rest();
        pengium1.protectEgg();
        pengium1.buildNest();
        pengium1.huddle();
        pengium1.flapWings();
        pengium1.makeSound();
        pengium1.migrate();
        pengium1.floatWater();
        pengium1.cleanFeathers();
        System.out.println("-------------------");
        
		Penguin pengium2 = new Penguin();
        pengium2.swim();
        pengium2.walk();
        pengium2.slide();
        pengium2.eat();
        pengium2.hunt();
        pengium2.dive();
        pengium2.rest();
        pengium2.protectEgg();
        pengium2.buildNest();
        pengium2.huddle();
        pengium2.flapWings();
        pengium2.makeSound();
        pengium2.migrate();
        pengium2.floatWater();
        pengium2.cleanFeathers();
        System.out.println("-------------------");

        Penguin.species();
        Penguin.habitat();
        Penguin.lifeSpan();
        Penguin.color();
        Penguin.type();
    }
}