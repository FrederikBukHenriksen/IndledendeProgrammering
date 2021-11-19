
// Import nessecary librarlies
import java.awt.Point;
import java.awt.Color;
import java.util.Random;

// This class is an extension of the abritary class, Plant.
public class Bush extends Plant {

    // Define the class' constants
    protected static final int range = PeberholmConstantsAndUtilities.BUSH_RANGE;
    protected static final int seed = PeberholmConstantsAndUtilities.BUSH_SEED_NO;
    protected static final Color col = PeberholmConstantsAndUtilities.BUSH_COLOR;

    // Create random object for later use
    private static Random rand = new Random();

    // Class constructor for the bush
    public Bush(Point position) {
        this.position = position;
        this.color = col;
    }

    // Define the abstract class' method, spreadSeeds
    public Plant[] spreadSeeds() {
        // Initialize a Plant-object array with the length according to the seeds number
        Plant[] list = new Plant[seed];
        // Iterate over the number of seeds
        for (int i = 0; i < list.length; i++) {
            // Establish a new point [-r;r] away from the motherplants position
            Point newPoint = new Point((rand.nextInt(range * 2 + 1) - range) + this.position.x,
                    (rand.nextInt(range * 2 + 1) - range) + this.position.y);
            // Save the plant to the list of new plants
            list[i] = new Bush(newPoint);
        }
        return list;
    }

    // Overwrite the abstract class' method, toString
    public String toString() {
        // Returning the class type along with it's posisiton
        return "Bush, position [" + position.x + ";" + position.y + "]";
    }
}