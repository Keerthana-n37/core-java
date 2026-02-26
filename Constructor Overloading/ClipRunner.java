class ClipRunner
{
    public static void main(String[] args)
    {
        Clip clip1 = new Clip();
        System.out.println("----------------");

        Clip clip2 = new Clip("Paper Clip", 10.0);
        System.out.println("Clip type: " + clip2.type);
        System.out.println("Clip price: " + clip2.price);
        System.out.println("----------------");

        Clip clip3 = new Clip(5.5, "Hair Clip");
        System.out.println("Clip size: " + clip3.size);
        System.out.println("Clip type: " + clip3.type);
        System.out.println("----------------");

        Clip clip4 = new Clip("Binder Clip", "Black", 4.0);
        System.out.println("Clip type: " + clip4.type);
        System.out.println("Clip color: " + clip4.color);
        System.out.println("Clip size: " + clip4.size);
        System.out.println("----------------");

        Clip clip5 = new Clip("Paper Clip", "Metal", 3.0, 15.0);
        System.out.println("Clip type: " + clip5.type);
        System.out.println("Clip material: " + clip5.material);
        System.out.println("Clip size: " + clip5.size);
        System.out.println("Clip price: " + clip5.price);
        System.out.println("----------------");

        Clip clip6 = new Clip("Hair Clip", "Red", 6.5, "Plastic", 25.0);
        System.out.println("Clip type: " + clip6.type);
        System.out.println("Clip color: " + clip6.color);
        System.out.println("Clip size: " + clip6.size);
        System.out.println("Clip material: " + clip6.material);
        System.out.println("Clip price: " + clip6.price);
    }
}