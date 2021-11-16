import java.awt.Point;
import java.awt.Color;

public class Moss extends Plant {

    // public static final Color MOSS_COLOR =
    // PeberholmConstantsAndUtilities.MOSS_COLOR;
    public static final int MOSS_SEED_NO = PeberholmConstantsAndUtilities.MOSS_SEED_NO;
    public static final int MOSS_RANGE = PeberholmConstantsAndUtilities.MOSS_RANGE;

    public Moss(Point position) {
        // super();

        // super(position, MOSS_COLOR, MOSS_SEED_NO, MOSS_RANGE);
        this.position = position;
        this.color = PeberholmConstantsAndUtilities.MOSS_COLOR;
        // this.seed = MOSS_SEED_NO;
        // this.range = MOSS_RANGE;

    }

    public Plant[] spreadSeeds() {
        Moss[] lol = { new Moss(newPosition()) };
        return lol;
    }
}