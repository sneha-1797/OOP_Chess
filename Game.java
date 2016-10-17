import Chess.King;
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
	
	public static void main(String args[])
	{
		Board obj=new Board();
		
		Player p1=new Player();
		Player p2=new Player();
		obj.initialize();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the initial positon  : ");
		int xi=scan.nextInt();
		int yi=scan.nextInt();
		System.out.println("Enter the final position  : ");
		int xf=scan.nextInt();
		int yf=scan.nextInt();


	}
}