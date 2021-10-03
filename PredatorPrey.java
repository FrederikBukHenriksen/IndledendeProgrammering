//Import libraries
import java.awt.*; //Point
import java.util.Random; //Random
import java.util.Arrays; //Array

public class PredatorPrey {

    public static void main(String[] args) {
        runSimulation(20, 2, 100);
    }

    public static void runSimulation(int n, int s, int t) {
        // Check paramters validity
        checkParameters(n, s, t);

        // Init random positions
        Random random = new Random(); // Declare random object from the library
        Point prey = new Point(random.nextInt(n) + 1, random.nextInt(n) + 1); // Random range [0;n] by offset
        Point predator = new Point(random.nextInt(n) + 1, random.nextInt(n) + 1); // Random range [0;n] by offset

        // Display inital positions
        displayPositions(prey, predator);
        displayMap(prey, predator, n);

        // Iterational loop for moving prey and predator
        while (!checkIfChaught(prey, predator) && t > 0) { //Active while pray has not been caught and the maximum number of iterations is not met.
            // Move prey
            prey.translate(random.nextInt(2 * s + 1) - s, random.nextInt(2 * s + 1) - s); // Random range [-2;2] by offset
            outOfBoundsCorrection(prey, n); // Check if prey is out of bounds after move
            PredatorpreyTeleport(prey, random, s, n);

            // Move predator
            movePredator(s, prey, predator);
            outOfBoundsCorrection(predator, n); // Check if predator is out of bounds after move

            // Print and Display positions for the iteration
            displayPositions(prey, predator);
            displayMap(prey, predator, n); 

            //Print catch-message if the prey has been caught
            if (checkIfChaught(prey, predator))
                System.out.println("Catch!");

            t--; // Decrement number of maximum iterations
        }
        System.exit(0); // Terminates program when while-loop becomes inactive
    }

    private static void movePredator(int s, Point prey, Point predator) {
        // Decide if predator should move in x-direction
        if (prey.x - predator.x < 0) {
            predator.translate(-s, 0);
        } else if (prey.x - predator.x > 0) {
            predator.translate(s, 0);
        }
        // Decide if predator should move in y-direction
        if (prey.y - predator.y < 0) {
            predator.translate(0, -s);
        } else if (prey.y - predator.y > 0) {
            predator.translate(0, s);
        }
    }

    public static void checkParameters(int n, int s, int t) {
        if (n > 0 && s > 0 && t >= 0) {
            System.out.println("n=" + n + " s'=" + s + " t=" + t);
        } else {
            System.out.print("Illegal Parameters!");
            System.exit(0); // Terminates program
        }
    }

    public static void displayPositions(Point prey, Point predator) {
        System.out.print("[" + prey.x + ";" + prey.y + "]");
        System.out.print(" ");
        System.out.print("[" + predator.x + ";" + predator.y + "]");
        System.out.println();
    }

    public static void outOfBoundsCorrection(Point point, int n) {
        // If the position exceeds the area, return the position it to the valid area
        if (point.x < 1)
            point.setLocation(1, point.y);
        if (point.x > n)
            point.setLocation(n, point.y);
        if (point.y < 1)
            point.setLocation(point.x, 1);
        if (point.y > n)
            point.setLocation(point.x, n);
    }

    public static boolean checkIfChaught(Point prey, Point predator) {
        if (predator.distance(prey) == 0)
            return true;
        return false;
    }

    public static void PredatorpreyTeleport(Point prey, Random random, int s, int n) {
        //Check whether the prey's position is divisible.
        if (prey.x % s == 0 && prey.x % s == 0) {
            //Set a random position for the prey
            prey.setLocation(random.nextInt(n) + 1, random.nextInt(n) + 1);
            System.out.println("TELEPORT");
        }
    }

    public static void displayMap(Point prey, Point predator, int n) {
        // Declare a 2D array the size of the area
        String[][] map = new String[n][n];

        //Insert '/t' in every element. Fill only works in 1D, hence why running though the array
        for (int i = 0; i < map.length; i++)
            Arrays.fill(map[i], "\t");

        //Decide whether they are indivudally present or on the same position.    
        if (checkIfChaught(prey, predator)) {
            map[predator.x - 1][predator.y - 1] = "CATCH\t"; // Insert catch position into the array
        } else {
            map[prey.x - 1][prey.y - 1] = "PREY\t"; // Insert prey position into the array
            map[predator.x - 1][predator.y - 1] = "PRED\t"; // Insert predator position into the array
        }
        //Turn the 2D array into a single string. Afterwards return it properly line-by-line
        System.out.println(Arrays.deepToString(map).replace("],", "]\n"));
    }

}