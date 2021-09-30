import java.awt.*; //Point
import java.util.Random; //Random

public class Predatorprey {

    public static void main(String[] args) {
        runSimulation(20, 2, 100);
    }

    public static void runSimulation(int n, int s, int t) {
        checkParameters(n, -s, t);

        // Init random positions
        Random random = new Random();
        Point prey = new Point(random.nextInt(n), random.nextInt(n));
        Point predator = new Point(random.nextInt(n), random.nextInt(n));
        displayPositions(prey, predator);

        while (predator.distance(prey) != 0) {
            prey.translate(random.nextInt(2 * s + 1) - s, random.nextInt(2 * s + 1) - s); // Normalt kører den fra 0-(s-1).
            outOfBoundsCorrection(prey, n); 
            PredatorpreyTeleport(prey,  s,  n);


            // Hvad er forskellen i afstand fra pred. til prey?

            movePredator(prey, predator, s);
            outOfBoundsCorrection(prey, n);
            displayPositions(prey, predator);
            checkIfChaught(prey, predator);

        }

    }

    public static void checkParameters(int n, int s, int t) {
        if (n > 0 && s > 0 && t >= 0) {
            System.out.println("n=" + n + " s=" + s + " t=" + t);
        } else {
            System.out.print("Illegal Parameters!");
            System.exit(0);
        }
    }

    public static void displayPositions(Point prey, Point predator) {
        System.out.print("[" + prey.x + ";" + prey.y + "]");
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

    public static void movePredator(Point prey, Point predator, int s) {
        if (prey.x - predator.x < 0) {
            predator.translate(-s, 0);
        } else if (prey.x - predator.x > 0) {
            predator.translate(s, 0);
        }

        if (prey.y - predator.y < 0) {
            predator.translate(0, -s);
        } else if (prey.y - predator.y > 0) {
            predator.translate(0, s);
        }
    }

    public static void checkIfChaught(Point prey, Point predator) {
        if (predator.distance(prey) == 0) {
            System.out.print("Catch!");
        }
    }

    public static void PredatorpreyTeleport(Point prey, int s, int n){
        if (prey.x % s == 0 && prey.x % s == 0){
            Random random = new Random();
            prey = new Point(random.nextInt(n), random.nextInt(n));
            System.out.println("TELEPORT");

        }
    }






}