import java.awt.Point;
import java.awt.Color;

public class Bush extends Plant {

    int range;
    int seed;

    // public static final Color BUSH_COLOR =
    // PeberholmConstantsAndUtilities.BUSH_COLOR;
    // public static final int BUSH_SEED_NO =
    // PeberholmConstantsAndUtilities.BUSH_SEED_NO;
    // public static final int BUSH_RANGE =
    // PeberholmConstantsAndUtilities.BUSH_RANGE;

    public Bush(Point position) {
        // super(position, BUSH_COLOR, BUSH_SEED_NO, BUSH_RANGE);
        this.position = position;
        this.color = PeberholmConstantsAndUtilities.BUSH_COLOR;
        this.seed = PeberholmConstantsAndUtilities.BUSH_SEED_NO;
        range = PeberholmConstantsAndUtilities.BUSH_RANGE;
    }

    public Plant[] spreadSeeds() {
        Bush[] list = { new Bush(newPosition()) };
        return list;
    }
}