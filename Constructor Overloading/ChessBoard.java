class ChessBoard{
	String material;
	String color;
	int squares;
	double size;
	double price;
	
	ChessBoard()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	ChessBoard(String material)
    {
        this.material = material;
    }
	
	ChessBoard(String material,double price)
	{
		this.material=material;
		this.price=price;
	}
	
	ChessBoard(String color,int squares)
	{
		this.color=color;
		this.squares=squares;
	}
	
	ChessBoard(String material,String color,double size)
	{
		this.material=material;
		this.color=color;
		this.size=size;
	}
	
	ChessBoard(int squares,double size,double price)
	{
		this.squares=squares;
		this.size=size;
		this.price=price;
	}
	
	ChessBoard(String material,String color,int squares,double size,double price)
	{
		this.material=material;
		this.color=color;
		this.squares=squares;
		this.size=size;
		this.price=price;
	}
}