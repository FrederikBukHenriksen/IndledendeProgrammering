import java.awt.Point;
import java.awt.Color;

public class Tree extends Plant {

    // public static final Color TREE_COLOR =
    // PeberholmConstantsAndUtilities.TREE_COLOR;
    public static final int TREE_SEED_NO = PeberholmConstantsAndUtilities.TREE_SEED_NO;
    public static final int TREE_RANGE = PeberholmConstantsAndUtilities.TREE_RANGE;

    public Tree(Point position) {
        // super();

        // super(position, TREE_COLOR, TREE_SEED_NO, TREE_RANGE);

        this.position = position;
        this.color = PeberholmConstantsAndUtilities.TREE_COLOR;
        // this.seed = TREE_SEED_NO;
        // this.range = TREE_RANGE;
    }

    public Plant[] spreadSeeds() {
        Tree[] list = { new Tree(newPosition()) };
        return list;
    }

}