import java.awt.Color;
import java.awt.Point;
import java.awt.Color;
import java.util.Random;

public abstract class Plant {
	protected Point position;
	protected Color color;
	// protected int seed;
	// protected int range;

	private static Random rand = new Random();

	// public Plant(Point position, final Color color, final int seed, final int
	// range) {
	// this.position = position;
	// this.color = color;
	// this.seed = seed;
	// this.range = range;
	// }

	// public Plant() {
	// Point nein = new Point(1, 1);
	// this.position = nein;
	// }

	// public Plant(Point position) {
	// this.position = position;
	// }

	public abstract Plant[] spreadSeeds();

	// public Point newPosition() {
	// return new Point((rand.nextInt(this.range * 2 + 1) - this.range) +
	// this.position.x,
	// (rand.nextInt(this.range * 2 + 1) - this.range) + this.position.y);
	// }

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
