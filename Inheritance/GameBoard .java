class GameBoard 
{
    String name;
    int size;
    int maxPlayers;

    GameBoard()
	{
        System.out.println("GameBoard constructor...");
    }

    void startGame() 
	{
        System.out.println("Game has started on the board...");
    }

    void endGame() 
	{
        System.out.println("Game has ended on the board...");
    }
}