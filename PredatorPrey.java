import java.awt.*; //Point
import java.util.Random; //Random


public class PredatorPrey{

    public static void main(String[] args) {
        runSimulation(5, 2, 100);
    }

    public static void runSimulation(int n, int s, int t) {
        checkParameters(n, s, t);

        // Init random positions
        Random random = new Random();
        Point prey = new Point(random.nextInt(n)+1, random.nextInt(n)+1);
        Point predator = new Point(random.nextInt(n)+1, random.nextInt(n)+1);
        displayPositions(prey, predator);

        int iterationCounter = 0;

        do {
            //Move prey
            prey.translate(random.nextInt(2 * s + 1) - s, random.nextInt(2 * s + 1) - s); // Normalt kører den fra 0-(s-1).
            outOfBoundsCorrection(prey, n); 
            //PredatorpreyTeleport(prey,  s,  n);

            //Move predator
            movePredator(prey, predator, s);
            outOfBoundsCorrection(predator, n);

            //Display and evaluate positions
            displayPositions(prey, predator);
            displayMap(prey, predator, n);
            checkIfChaught(prey, predator);

            iterationCounter++;
        }while (predator.distance(prey) != 0 && iterationCounter <= t);

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

    public static void outOfBoundsCorrection(Point point, int n) {
        if (point.x < 1) {
            point.setLocation(1, point.y);
        }
        if (point.x > n) {
            point.setLocation(n, point.y);
        }

        if (point.y < 1) {
            point.setLocation(point.x, 1);
        }
        if (point.y > n) {
            point.setLocation(point.x, n);
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
            prey = new Point(random.nextInt(n)+1, random.nextInt(n)+1);
            System.out.println("TELEPORT");

        }
    }

    public static void displayMap(Point prey, Point predator, int n){
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= n; j++){
                if (predator.distance(j,i) == 0 && prey.distance(j,i) == 0){
                    System.out.print("X");
                } else {
                    if (predator.distance(j,i) == 0){
                        System.out.print("R");
                    }
                    if (prey.distance(j,i) == 0){
                        System.out.print("B");
                    }
                    if (predator.distance(j,i) != 0 && prey.distance(j,i) != 0){
                        System.out.print(".");
                    }
                }
                System.out.print("\t");
            }
            System.out.println("");
        }
    }




}