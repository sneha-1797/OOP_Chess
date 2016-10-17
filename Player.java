package Chess;
import Chess.King;
import Chess.Queen;
import Chess.Bishop;
import Chess.Rook;
import Chess.Knight;
import Chess.Pawn;
import Chess.Piece;
public class Player
{
	int color;
	King king;
	Queen queen;
	Bishop bishop[];
	Rook rook[];
	Pawn pawn[];
	Knight knight[];

	public Player(int color, Board board)
	{
		this.color=color;
		bishop=new Bishop[2];
		rook=new Rook[2];
		knight=new Knight[2];
		pawn=new Pawn[8];
		initialize(board);
	}
	

	public void initialize(Board board)
	{
		switch(color)
		{
			case 0:rook[0]=new Rook(0,0,color);// x,y,color
					board.setPiece(rook[0],rook[0].getX(),rook[0].getY());
					rook[1]=new Rook(7,0,color);
					board.setPiece(rook[1],rook[1].getX(),rook[1].getY());
					bishop[0]=new Bishop(2,0,color);
					board.setPiece(bishop[0],bishop[0].getX(),bishop[0].getY());
					bishop[1]=new Bishop(5,0,color);
					board.setPiece(bishop[1],bishop[1].getX(),bishop[1].getY());
					knight[0]=new Knight(1,0,color);
					board.setPiece(knight[0],knight[0].getX(),knight[0].getY());
					knight[1]=new Knight(6,0,color);
					board.setPiece(knight[1],knight[1].getX(),knight[1].getY());
					king=new King(3,0,color);
					board.setPiece(king,king.getX(),king.getY());
					queen=new Queen(4,0,color);
					board.setPiece(queen,queen.getX(),queen.getY());
					for(int i=0;i<8;i++)
					{
						pawn[i]=new Pawn(i,1,color);
						board.setPiece(pawn[i],pawn[i].getX(),pawn[i].getY());
					}


			case 1: rook[0]=new Rook(0,7,color);// x,y,color
					board.setPiece(rook[0],rook[0].getX(),rook[0].getY());
					rook[1]=new Rook(7,7,color);
					board.setPiece(rook[1],rook[1].getX(),rook[1].getY());
					bishop[0]=new Bishop(2,7,color);
					board.setPiece(bishop[0],bishop[0].getX(),bishop[0].getY());
					bishop[1]=new Bishop(5,7,color);
					board.setPiece(bishop[1],bishop[1].getX(),bishop[1].getY());
					knight[0]=new Knight(1,7,color);
					board.setPiece(knight[0],knight[0].getX(),knight[0].getY());
					knight[1]=new Knight(6,7,color);
					board.setPiece(knight[1],knight[1].getX(),knight[1].getY());
					king=new King(3,7,color);
					board.setPiece(king,king.getX(),king.getY());
					queen=new Queen(4,7,color);
					board.setPiece(queen,queen.getX(),queen.getY());
					for(int i=0;i<8;i++)
					{
						pawn[i]=new Pawn(i,6,color);
						board.setPiece(pawn[i],pawn[i].getX(),pawn[i].getY());
					}
		}

	}

}
