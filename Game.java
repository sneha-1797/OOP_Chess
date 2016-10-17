import Chess.King;
import Chess.Board;
import Chess.Queen;
import Chess.Bishop;
import Chess.Rook;
import Chess.Knight;
import Chess.Pawn;
import Chess.Piece;
import Chess.Player;

import java.util.Scanner;

public class Game
{
	static final int BLACK=0;
		static final int WHITE=1;
	
	public static void main(String args[])
	{
		Board obj=new Board();
		
		Player p1=new Player(BLACK,obj);
		Player p2=new Player(WHITE,obj);
		display(obj);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the initial positon  : ");
		int xi=scan.nextInt();
		int yi=scan.nextInt();
		System.out.println("Enter the final position  : ");
		int xf=scan.nextInt();
		int yf=scan.nextInt();


	}
	public static void display(Board board)
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if(board.getPiece(i,j) instanceof King)
				{
					if(board.getPieceColor(i,j)==BLACK)
						System.out.print(" Bking ");
					else
						System.out.print(" Wking ");
				}
				if(board.getPiece(i,j) instanceof Queen)
				{
					if(board.getPieceColor(i,j)==BLACK)
						System.out.print(" Bqueen ");
					else
						System.out.print(" Wqueen ");
				}
				if(board.getPiece(i,j) instanceof Pawn)
				{
					if(board.getPieceColor(i,j)==BLACK)
						System.out.print(" Bpawn ");
					else
						System.out.print(" Wpawn ");
				}
				if(board.getPiece(i,j) instanceof Bishop)
				{
					if(board.getPieceColor(i,j)==BLACK)
						System.out.print(" Bbishop ");
					else
						System.out.print(" Wbishop ");
				}
				if(board.getPiece(i,j) instanceof Rook)
				{
					if(board.getPieceColor(i,j)==BLACK)
						System.out.print(" Brook ");
					else
						System.out.print(" Wrook ");
				}
				if(board.getPiece(i,j) instanceof Knight)
				{
					if(board.getPieceColor(i,j)==BLACK)
						System.out.print(" Bknight ");
					else
						System.out.print(" Wknight ");
				}
				if(board.getPiece(i,j)==null)
				{
					System.out.print(" # ");
				}
			}
			System.out.println();
		}
	}
}