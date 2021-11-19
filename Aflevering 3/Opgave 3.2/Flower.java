import java.awt.Point;
import java.awt.Color;
import java.util.Random;

public class Flower extends Plant {

    protected static final int range = PeberholmConstantsAndUtilities.FLOWER_RANGE;
    protected static final int seed = PeberholmConstantsAndUtilities.FLOWER_SEED_NO;
    protected static final Color col = PeberholmConstantsAndUtilities.FLOWER_COLOR;

    private static Random rand = new Random();

    public Flower(Point position) {
        this.position = position;
        this.color = col;
    }

    public Plant[] spreadSeeds() {
        Plant[] lolcat = new Plant[seed];
        for (int i = 0; i < seed; i++) {
            Point newPoint = new Point((rand.nextInt(range * 2 + 1) - range) + this.position.x,
                    (rand.nextInt(range * 2 + 1) - range) + this.position.y);
            lolcat[i] = new Flower(newPoint);

        }
        return lolcat;
    }

    public String toString() {
        return "Flower, position [" + position.x + ";" + position.y + "]";
    }
}