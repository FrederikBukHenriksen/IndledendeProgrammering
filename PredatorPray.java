import java.awt.*; //Point
import java.util.Random; //Random

public class PredatorPray {

    public static void main(String[] args) {
        runSimulation(20, 2, 100);
    }

    public static void runSimulation(int n, int s, int t) {
        checkParameters(n, s, t);

        Random random = new Random();

        // Init random positions
        Point pray = new Point(random.nextInt(n), random.nextInt(n));
        Point predator = new Point(random.nextInt(n), random.nextInt(n));
        displayPositions(pray, predator);

        while (predator.distance(pray) != 0) {
            pray.translate(random.nextInt(2 * s + 1) - s, random.nextInt(2 * s + 1) - s); // Normalt kører den fra 0-(s-1).
            outOfBoundsCorrection(pray, n); 

            // Hvad er forskellen i afstand fra pred. til prey?

            if (pray.x - predator.x < 0) {
                predator.translate(-s, 0);
            } else if (pray.x - predator.x > 0) {
                predator.translate(s, 0);
            }

            if (pray.y - predator.y < 0) {
                predator.translate(0, -s);
            } else if (pray.y - predator.y > 0) {
                predator.translate(0, s);
            }
            outOfBoundsCorrection(pray, n);
            displayPositions(pray, predator);
            checkIfChaught(pray, predator);

        }

    }

    public static void checkParameters(int n, int s, int t) {
        if (n > 0 && s > 0 && t >= 0) {
            System.out.println("n=" + n + " s=" + s + " t=" + t);
        } else {
            System.out.print("Illegal Parameters!");
        }
    }

    public static void displayPositions(Point pray, Point predator) {
        System.out.print("[" + pray.x + ";" + pray.y + "]");
        System.out.print(" ");
        System.out.print("[" + predator.x + ";" + predator.y + "]");
        System.out.println();
    }

    public static void outOfBoundsCorrection(Point point, int n) { // Kan jeg komme udenom at skulle indsætte n?
        if (point.x < 0) {
            point.setLocation(0, point.y);
        }
        if (point.x > n - 1) {
            point.setLocation(n - 1, point.y);
        }
        if (point.y < 0) {
            point.setLocation(point.x, 0);
        }
        if (point.y > n - 1) {
            point.setLocation(point.x, n - 1);
        }
    }

    public static void checkIfChaught(Point pray, Point predator) {
        if (predator.distance(pray) == 0) {
            System.out.print("Catch!");
        }

    }


}