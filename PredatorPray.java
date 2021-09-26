import java.awt.*;
import java.util.Random;



public class PredatorPray{

    public static void main(String[] args){
        runSimulation(20, 2, 100);
    }

    public static void runSimulation(int n, int s, int t){
        checkParameters(n,s,t);

        Random random = new Random();

        Point pray = new Point(random.nextInt(n+1),random.nextInt(n+1));
        Point predator = new Point(random.nextInt(n+1),random.nextInt(n+1));
        








    }
    public static void checkParameters(int n, int s, int t){
        if (n>0 && s>0 && t >= 0){
            System.out.println("n="+n+" s="+s+" t="+t);
        }else{ 
            System.out.print("Illegal Parameters!");
        }
    }
    public static void displayPositions(){
        System.out.print("["+pray.x+";"+pray.y+"]");
        System.out.print(" ");
        System.out.print("["+predator.x+";"+predator.y+"]");
        System.out.println();

    }

}