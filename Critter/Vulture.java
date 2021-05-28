import java.awt.*;
public class Vulture extends Bird
{

	private boolean hunger;

	public Vulture()
	{
		hunger = true;
	}
   

	public String toString()
	{
		return super.toString();	}
   
	public boolean eat()
	{
		boolean eat = hunger;
      if(eat)
		{
			hunger = false;
		}
		return eat;
	}
   
   public Attack fight(String opponent)
	{
		hunger = true;
		return super.fight(opponent);
	}
   

	public Color getColor()
	{
		return Color.BLACK;//always black
	}

   
	public Direction getMove()
	{
		return super.getMove();//same as bird
	}

}