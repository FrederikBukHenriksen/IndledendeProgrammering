// Approaches:
// Initialiser et tomt array 2D.
//Lav enkelte 1D arrays, og append dem til sidst.
//// setDefaultCloseOperationfs

public class TrianglePattern {

    private int n;
    private int h;
    private int[] initail;

    // Mappet skal retunerers som
    public TrianglePattern(int n, int h, int[] initial) {
        this.n = n;
        this.h = h;
        this.initail = initial;

        // Initaliser en 2d matrix på h*n.
        int[][] map = new int[h][n];
        // Løb hvert array og fyld det med 0
        for (int i = 0; i < map.length; i++)
            Arrays.fill(map[i], 0);

        // Smid inital-værderine ind på deres plads på øverste række.
        for (int i = 0; i < initial.length; i++) {
            map[0][i] = initial[i];
        }
        // Lav den akutelle linje, ved at evaluere linjen over.
        // gangen.
        for (int i = 1; i < h; i++) {// Evaluer hvér linje, pånær den som initialiseres.
            for (int j = 1; j < n - 1; j++) { // Evaluer hvér position hvor der er plads til cursoren.
                // Man kunne skrive dét som kursoren aflæser, og sende det over til en
                // switchcase.

            }

        }

    }
}
