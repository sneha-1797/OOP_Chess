package Chess;
import Chess.King;
import Chess.Queen;
import Chess.Bishop;
import Chess.Rook;
import Chess.Knight;
import Chess.Pawn;
import Chess.Piece;
import Chess.Player;

public class Board
{
	Piece[][] board;
		public Board()
		{
			board=new Piece[8][8];
			initialize();
		}
		public void initialize()
		{
			for(int i=0;i<8;i++)
			{
				for(int j=0;j<8;j++)
				{
					board[i][j]=null;
				}
			}
		}
		public void setPiece(Piece piece,int x,int y)
		{
			this.board[x][y]=piece;
		}
		public Piece getPiece(int x,int y)
		{
			return board[x][y];
		}
		public int getPieceColor(int x,int y)
		{
			return board[x][y].getColor();
		}
}