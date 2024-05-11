
//Objects-> Pieces->X, 0
///Board->NXM
///Model.Player

/*
Playing Piece
    Piece Type
    Playing Piece(Model.PieceType x);
  |                 |
  |                 |
Piece X         Piece 

*/
public class TicTacToe {
    public static void main(String []args){
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        //System.out.println("Game Winner is: "+game.startGame());
    }
}
