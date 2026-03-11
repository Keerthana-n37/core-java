class HammerRunner 
{
    public static void main(String[] args)
	{
        boolean[] isHeavy = {true, false, true};

        Handle[] handles = new Handle[3];
        handles[0] = new Handle("Wood", 30.5f);
        handles[1] = new Handle("Steel", 25.0f);
        handles[2] = new Handle("Fiberglass", 28.2f);

        Hammer hammer = new Hammer(isHeavy, handles);
        hammer.display();
    }
}