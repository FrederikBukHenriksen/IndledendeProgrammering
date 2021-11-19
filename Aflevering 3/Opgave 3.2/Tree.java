import java.awt.Point;
import java.awt.Color;
import java.util.Random;

public class Tree extends Plant {

    protected static final int range = PeberholmConstantsAndUtilities.TREE_RANGE;
    protected static final int seed = PeberholmConstantsAndUtilities.TREE_SEED_NO;
    protected static final Color col = PeberholmConstantsAndUtilities.TREE_COLOR;

    private static Random rand = new Random();

    public Tree(Point position) {
        this.position = position;
        this.color = col;
    }

    public Plant[] spreadSeeds() {
        Plant[] lolcat = new Plant[seed];
        for (int i = 0; i < seed; i++) {
            Point newPoint = new Point((rand.nextInt(range * 2 + 1) - range) + this.position.x,
                    (rand.nextInt(range * 2 + 1) - range) + this.position.y);
            lolcat[i] = new Tree(newPoint);

        }
        return lolcat;
    }

    public String toString() {
        return "Tree, position [" + position.x + ";" + position.y + "]";
    }
}