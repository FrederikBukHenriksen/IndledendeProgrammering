import java.awt.Point;
import java.awt.Color;
import java.util.Random;

public class Moss extends Plant {

    protected static final int range = PeberholmConstantsAndUtilities.MOSS_RANGE;
    protected static final int seed = PeberholmConstantsAndUtilities.MOSS_SEED_NO;
    protected static final Color col = PeberholmConstantsAndUtilities.MOSS_COLOR;

    private static Random rand = new Random();

    public Moss(Point position) {
        this.position = position;
        this.color = col;
    }

    public Plant[] spreadSeeds() {
        Plant[] lolcat = new Plant[seed];
        for (int i = 0; i < seed; i++) {
            Point newPoint = new Point((rand.nextInt(range * 2 + 1) - range) + this.position.x,
                    (rand.nextInt(range * 2 + 1) - range) + this.position.y);
            lolcat[i] = new Moss(newPoint);

        }
        return lolcat;
    }

    public String toString() {
        return "Moss, position [" + position.x + ";" + position.y + "]";
    }

}