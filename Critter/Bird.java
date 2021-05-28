import java.awt.*;
public class Bird extends Critter
{

	private int moveCounter;

	private int move;

	private int lastMove;

	public Bird()
	{
		move = 1;
		lastMove = 1;
		moveCounter = 1;
	}

	public Attack fight(String opponent)
	{
		Attack a = Attack.POUNCE;
		if(opponent.equals("%"))//roars against ants, otherwise pounces
		{
			a = Attack.ROAR;
		}
		return a;
	}

	public String toString()//appearance depends on what direction the bird last moved in
	{
		String s = "";
		if(lastMove == 1)
		{
			s = "^" + "";
		}
		if(lastMove == 2)
		{
			s = ">" + "";
		}
		if(lastMove == 3)
		{
			s = "V" + "";
		}
		if(lastMove == 4)
		{
			s = "<" + "";
		}
		return s;
	}

	public boolean eat()
	{
		return false;//never eats
	}
   
   public Color getColor()
	{
		return Color.BLUE;//always blue
	}

	public Direction getMove()
	{
		if(moveCounter > 3)//moves in a clockwise square
		{
			moveCounter = 1;
			move++;
			if(move > 4)
			{
				move = 1;
			}
		}
		Direction d = Direction.CENTER;
		if(moveCounter <= 3)
		{
			if(move == 1)
			{
				d = Direction.NORTH;
				lastMove = 1;
			}
			if(move == 2)
			{
				d = Direction.EAST;
				lastMove = 2;
			}
			if(move == 3)
			{
				d = Direction.SOUTH;
				lastMove = 3;
			}
			if(move == 4)
			{
				d = Direction.WEST;
				lastMove = 4;
			}
		}
	moveCounter++;
	return d;
	}
}
  