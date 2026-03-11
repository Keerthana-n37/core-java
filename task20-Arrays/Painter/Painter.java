class Painter
{
	double[] paintingCosts;
	Brush[] brushes;
	
	Painter(double[] paintingCosts,Brush[] brushes)
	{
		this.paintingCosts=paintingCosts;
		this.brushes=brushes;
	}
	
	void display()
	{
		System.out.println("Display Painter Information");
		
		if(this.paintingCosts!=null)
		{
			System.out.println("Total painting costs:"+this.paintingCosts.length);
			for(double cost: this.paintingCosts)
			{
				System.out.println("Painting cost:"+cost);
			}
		}
		else{
			System.out.println("Painting cost are empty");
		}
		
		if(this.brushes!=null)
		{
			System.out.println("Total brushes:"+this.brushes.length);
			for(Brush brush: this.brushes){
				System.out.println("Brush Type:"+brush.brushSize);
				System.out.println("Price:"+brush.available);
			}
		}
	}
}