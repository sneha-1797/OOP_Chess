package Chess;
public abstract class Piece
{
	 int x;
	 int y;
	 int color;
	
 public Piece(int x, int y, int color)
	{
		this.x=x;
		this.y=y;
		this.color=color;
	}
	public int getColor()
	{
		return color;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public abstract boolean isAvailable();
    public abstract boolean isValidMove();
	public abstract void movement();
}
