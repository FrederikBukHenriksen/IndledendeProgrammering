import java.util.Arrays;

public class TrianglePattern {

    // Declaring class fields.
    private int n;
    private int h;
    private int[] initail;
    private int[][] map;

    // Constructor with arguments.
    public TrianglePattern(int n, int h, int[] initial) {
        this.n = n;
        this.h = h;
        this.initail = initial;

        this.map = new int[h][n]; // Declare a 2d array for the object, acting as the map

        // Write the initial values into the first row of the 2d array
        for (int i = 0; i < initial.length; i++) { // Run thorugh the number(s) in the initial array
            map[0][initial[i]] = 1;
        }

        // Run the simulation by running through the 2d array
        for (int i = 1; i < h; i++) { // Evaluate every row, expect the initilsed row.
            for (int j = 1; j < n - 1; j++) { // Run though every coloumn, expect the first and last
                map[i][j] = cursor(map[i - 1][j - 1], map[i - 1][j], map[i - 1][j + 1]); // From the row above, evaluate
                                                                                         // the value to the
                                                                                         // left, itself, and to the
                                                                                         // right, to
                                                                                         // determent the current
                                                                                         // posistion's value.
            }
        }
    }

    // Determent value by examing the three values in the row above.
    private int cursor(int r1, int r2, int r3) {

        // Turn the three values into a single string.
        String read = String.valueOf(r1) + String.valueOf(r2) + String.valueOf(r3);

        // Return the value which corresponds to the three above values
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
        default: // Default is used for good practice, but won't be utilized
            return 0;
        }
    }

    public int getValueAt(int r, int c) {
        return map[r][c];
    }

    public int getN() {
        return n;
    }

    public int getH() {
        return h;
    }

    public int[] getInitial() {
        return initail;
    }
}