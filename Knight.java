package Chess;
import Chess.Piece;
public class Knight extends Piece
{
	public Knight(int x,int y, int color)
	{
		super(x,y,color);
	}
	@Override
	public boolean isAvailable()
	{
		return false;
	}
    public boolean isValidMove()
    {
    	return false;
    }
	public void movement()
	{

	}

}
