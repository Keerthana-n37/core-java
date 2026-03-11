class CarpenterRunner
{
    public static void main(String[] args)
    {
        long[] woodSizes = new long[3];
		woodSizes[0]= 100L;
		woodSizes[1] = 200L;
		woodSizes[2] = 300L;

        Tool[] tools = new Tool[3];
        tools[0] = new Tool("Hammer", 1.5f);
        tools[1] = new Tool("Saw", 2.0f);
        tools[2] = new Tool("Chisel", 0.8f);

        Carpenter carpenter = new Carpenter(woodSizes, tools);
        carpenter.display();
    }
}