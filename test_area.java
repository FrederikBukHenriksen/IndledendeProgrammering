
//Import libraries
import java.awt.*; //Point
import java.util.Random; //Random

public class test_area {

    public static void main(String[] args) {
        runSimulation(20, 2, 100);
    }

    public static void runSimulation(int n, int s, int t) {
        // Check paramters validity

        // Init random positions
        Random random = new Random(); // Declare random object from the library
        Point prey = new Point(random.nextInt(n) + 1, random.nextInt(n) + 1); // Random range [0;n] by offset
        Point predator = new Point(random.nextInt(n) + 1, random.nextInt(n) + 1); // Random range [0;n] by offset

        movePredator(s, prey, predator);
    }

    public static void movePredator(int s, Point prey, Point predator) {
        int distanceX = prey.x - predator.x;
        if (distanceX >= -s && distanceX <= s) {
            predator.translate(distanceX, 0);
        } else {
            if (distanceX > 0) {
                predator.translate(s, 0);
            } else {
                predator.translate(-s, 0);
            }
        }
        int distanceY = prey.y - predator.y;
        if (distanceY >= -s && distanceY <= s) {
            predator.translate(distanceX, 0);
        } else {
            if (distanceY > 0) {
                predator.translate(s, 0);
            } else {
                predator.translate(-s, 0);
            }
        }
    }

}