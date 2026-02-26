class ChessBoardRunner
{
    public static void main(String[] args)
    {
        ChessBoard board1 = new ChessBoard();
        System.out.println("----------------");

        ChessBoard board2 = new ChessBoard("Wood");
        System.out.println("Chess Board material: " + board2.material);
        System.out.println("----------------");

        ChessBoard board3 = new ChessBoard("Wood", 2500.0);
        System.out.println("Chess Board material: " + board3.material);
        System.out.println("Chess Board price: " + board3.price);
        System.out.println("----------------");

        ChessBoard board4 = new ChessBoard("Black & White", 64);
        System.out.println("Chess Board color: " + board4.color);
        System.out.println("No of squares in Chess Board: " + board4.squares);
        System.out.println("----------------");

        ChessBoard board5 = new ChessBoard("Wood", "Brown", 18.5);
        System.out.println("Chess Board material: " + board5.material);
        System.out.println("Chess Board color: " + board5.color);
        System.out.println("Chess Board size: " + board5.size);
        System.out.println("----------------");

        ChessBoard board6 = new ChessBoard(64, 20.0, 3000.0);
        System.out.println("No of squares in Chess Board: " + board6.squares);
        System.out.println("Chess Board size: " + board6.size);
        System.out.println("Chess Board price: " + board6.price);
        System.out.println("----------------");

        ChessBoard board7 = new ChessBoard("Wood", "Brown", 64, 20.0, 3500.0);
        System.out.println("Chess Board material: " + board7.material);
        System.out.println("Chess Board color: " + board7.color);
        System.out.println("No of squares in Chess Board: " + board7.squares);
        System.out.println("Chess Board size: " + board7.size);
        System.out.println("Chess Board price: " + board7.price);
    }
}