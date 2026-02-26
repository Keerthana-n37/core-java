class PawnRunner
{
    public static void main(String[] args)
    {
        Pawn pawn1 = new Pawn();
        System.out.println("----------------");

        Pawn pawn2 = new Pawn("White", 4.5);
        System.out.println("Pawn color: " + pawn2.color);
        System.out.println("Pawn height: " + pawn2.height);
        System.out.println("----------------");

        Pawn pawn3 = new Pawn(150.0, "Wood");
        System.out.println("Pawn material: " + pawn3.material);
        System.out.println("Pawn price: " + pawn3.price);
        System.out.println("----------------");

        Pawn pawn4 = new Pawn(5.0, 0.2);
        System.out.println("Pawn height: " + pawn4.height);
        System.out.println("Pawn weight: " + pawn4.weight);
        System.out.println("----------------");

        Pawn pawn5 = new Pawn("Black", "Plastic", 0.3);
        System.out.println("Pawn color: " + pawn5.color);
        System.out.println("Pawn material: " + pawn5.material);
        System.out.println("Pawn weight: " + pawn5.weight);
        System.out.println("----------------");

        Pawn pawn6 = new Pawn("White", "Wood", 4.5, 0.25, 200.0);
        System.out.println("Pawn color: " + pawn6.color);
        System.out.println("Pawn material: " + pawn6.material);
        System.out.println("Pawn height: " + pawn6.height);
        System.out.println("Pawn weight: " + pawn6.weight);
        System.out.println("Pawn price: " + pawn6.price);
    }
}