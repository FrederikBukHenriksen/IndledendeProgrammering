import java.awt.Color;
import java.awt.Point;
import java.util.Random;

public abstract class Plant {
	protected Point position;
	protected Color color;

	protected static Random rand = new Random();

	public abstract Plant[] spreadSeeds();

	public Color getColor() {
		return color;
	}

	public Point getPosition() {
		return position;
	}

	public String toString() {
		return "position [" + position.x + ";" + position.y + "]";
	}

}
