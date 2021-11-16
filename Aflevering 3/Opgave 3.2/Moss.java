import java.awt.Point;
import java.awt.Color;

public class Moss extends Plant {

    int range;
    int seed;

    // public static final Color MOSS_COLOR =
    // PeberholmConstantsAndUtilities.MOSS_COLOR;
    // public static final int MOSS_SEED_NO =
    // PeberholmConstantsAndUtilities.MOSS_SEED_NO;
    // public static final int MOSS_RANGE =
    // PeberholmConstantsAndUtilities.MOSS_RANGE;

    public Moss(Point position) {
        // super();

        // super(position, MOSS_COLOR, MOSS_SEED_NO, MOSS_RANGE);
        this.position = position;
        this.color = PeberholmConstantsAndUtilities.MOSS_COLOR;
        this.seed = PeberholmConstantsAndUtilities.MOSS_SEED_NO;
        this.range = PeberholmConstantsAndUtilities.MOSS_RANGE;
    }

    public Plant[] spreadSeeds() {
        Moss[] lol = { new Moss(newPosition()) };
        return lol;
    }
}