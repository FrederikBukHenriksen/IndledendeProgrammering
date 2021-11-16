import java.awt.Point;
import java.awt.Color;

public class Flower extends Plant {

    // public static final Color FLOWER_COLOR =
    // PeberholmConstantsAndUtilities.FLOWER_COLOR;
    public static final int FLOWER_SEED_NO = PeberholmConstantsAndUtilities.FLOWER_SEED_NO;
    public static final int FLOWER_RANGE = PeberholmConstantsAndUtilities.FLOWER_RANGE;

    public Flower(Point position) {
        // super();

        // super(position, FLOWER_COLOR, FLOWER_SEED_NO, FLOWER_RANGE);

        this.position = position;
        this.color = PeberholmConstantsAndUtilities.FLOWER_COLOR;
        // this.seed = FLOWER_SEED_NO;
        // this.range = FLOWER_RANGE;

    }

    public Plant[] spreadSeeds() {
        Flower[] lol = { new Flower(newPosition()) };
        return lol;
    }
}