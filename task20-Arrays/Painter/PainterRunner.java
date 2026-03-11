class PainterRunner
{
    public static void main(String[] args)
    {
        double[] paintingCosts = {1500.50,2000.75,3000.25};

        Brush[] brushes = new Brush[3];
        brushes[0] = new Brush(10,true);
        brushes[1] = new Brush(12,false);
        brushes[2] = new Brush(15,true);

        Painter painter = new Painter(paintingCosts,brushes);
        painter.display();
    }
}