import java.util.Arrays; //Array

public class TrianglePattern {

    private int n;
    private int h;
    private int[] initail;
    private int[][] map;

    // Mappet skal retunerers som
    public TrianglePattern(int n, int h, int[] initial) {
        this.n = n;
        this.h = h;
        this.initail = initial;
        this.map = new int[h][n];
        // Initaliser en 2d matrix på h*n.
        this.map = new int[h][n];

        // Smid inital-værderine ind på deres plads på øverste række.
        for (int i = 0; i < initial.length; i++) {
            map[0][initial[i]] = 1;
        }

        for (int i = 1; i < h; i++) {// Evaluer hvér linje, pånær den som initialiseres.
            for (int j = 1; j < n - 1; j++) { // Evaluer hvér position hvor der er plads til cursoren.
                map[i][j] = cursor(map[i - 1][j - 1], map[i - 1][j], map[i - 1][j + 1]);
            }

        }
        // System.out.println(Arrays.deepToString(map).replace("],", "]\n"));

    }

    private int cursor(int r1, int r2, int r3) {
        // Construer de tre aflæsninger
        String read = String.valueOf(r1) + String.valueOf(r2) + String.valueOf(r3);
        switch (read) {
            case "000":
                return 0;
            case "001":
                return 1;
            case "010":
                return 1;
            case "011":
                return 1;
            case "100":
                return 1;
            case "101":
                return 0;
            case "110":
                return 0;
            case "111":
                return 0;
            default:
                return 0;
        }
    }

    public int getValueAt(int r, int c) {
        return map[r][c];
    }

    public int getN() {
        return this.n;
    }

    public int getH() {
        return this.h;
    }

    public int[] getInitial() {
        return this.initail;
    }
}