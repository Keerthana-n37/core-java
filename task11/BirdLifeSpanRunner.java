class BirdLifeSpanRunner {

    public static void main(String[] args) {

        int lifeSpan = BirdLifeSpan.getLifeSpanByName("Parrot");
        System.out.println("Life span of Parrot:"+lifeSpan+ "years");

        lifeSpan= BirdLifeSpan.getLifeSpanByName("Eagle");
        System.out.println("Life span of Eagle:" +lifeSpan+ "years");

        lifeSpan= BirdLifeSpan.getLifeSpanByName("Penguin");
        System.out.println("Life span of Penguin:" +lifeSpan+ "years");
    }
}
