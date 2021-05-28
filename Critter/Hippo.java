import java.awt.*;

public class Hippo extends Critter {

	private int hunger;
	private int iteration = 5;
	private Direction dir = Direction.CENTER;

	public Hippo(int hunger) {
		this.hunger = hunger;
	}

	public Color getColor() {
		return hunger > 0 ? Color.GRAY : Color.WHITE;
	}

		public Direction getMove() {
		if (iteration == 5) {
			iteration = 0;
			int r = (int)(Math.random() * 4);
			switch (r) {
				case 0:
					dir = Direction.NORTH;
					break;
				case 1:
					dir = Direction.SOUTH;
					break;
				case 2:
					dir = Direction.EAST;
					break;
				case 3:
					dir = Direction.WEST;
					break;
			}
		}
		++iteration;
		return dir;
	}
   
   public boolean eat() {
		hunger -= hunger > 0 ? 1 : 0;
		return hunger > 0;
	}

		public Attack fight(String opponent) {
		return hunger > 0 ? Attack.SCRATCH : Attack.POUNCE;
	}


		public String toString() {
		return Integer.toString(hunger);
	}

}