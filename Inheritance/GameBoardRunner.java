class GameBoardRunner 
{
    public static void main(String[] args)
	{

        System.out.println("Subclass Object Same Type");

        DigitalGameBoard board = new DigitalGameBoard();
        board.name = "SuperChess";
        board.size = 12;
        board.maxPlayers = 2;
        board.onlineMode = true;
        board.batteryLife = 8;
        board.displayType = "LED";
        board.numberOfLevels = 5;
        board.soundEnabled = true;

        System.out.println("Name : " + board.name);
        System.out.println("Size : " + board.size + " inches");
        System.out.println("Max Players : " + board.maxPlayers);
        System.out.println("Online Mode : " + board.onlineMode);
        System.out.println("Battery Life : " + board.batteryLife + " hours");
        System.out.println("Display Type : " + board.displayType);
        System.out.println("Number of Levels : " + board.numberOfLevels);
        System.out.println("Sound Enabled : " + board.soundEnabled);
        board.startGame();
        board.endGame();
        board.connectToInternet();
        board.updateFirmware();


        System.out.println("Parent Reference Subclass Object");

        GameBoard basicBoard = new DigitalGameBoard();
        basicBoard.name = "MegaCheckers";
        basicBoard.size = 10;
        basicBoard.maxPlayers = 2;

        System.out.println("Name : " + basicBoard.name);
        System.out.println("Size : " + basicBoard.size + " inches");
        System.out.println("Max Players : " + basicBoard.maxPlayers);
        basicBoard.startGame();
        basicBoard.endGame();


        System.out.println("Parent Class Object");

        GameBoard classicBoard = new GameBoard();
        classicBoard.name = "OldChess";
        classicBoard.size = 14;
        classicBoard.maxPlayers = 2;

        System.out.println("Name : " + classicBoard.name);
        System.out.println("Size : " + classicBoard.size + " inches");
        System.out.println("Max Players : " + classicBoard.maxPlayers);
        classicBoard.startGame();
        classicBoard.endGame();
    }
}