class BirdRunner {

    public static void main(String[] args) {

        String color = Bird.getColorByName("Parrot");
        System.out.println("Color of Parrot: " + color);

        color= Bird.getColorByName("Penguin");
        System.out.println("Color of Penguin: " + color);

        color= Bird.getColorByName("Owl");
        System.out.println("Color of Owl: " + color);
    }
}
