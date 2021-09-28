public class IntervalSearch {
    public static void main(String[] args) {
       // System.out.print(intervalContains(1, 11, 3));
     //  System.out.print(powerOf(3,2));
       System.out.print(intervalContains(2, 11, 3));

        
    }    

    public static boolean intervalContains(int g1, int g2, int b) {
        // Calculate the power of
        
        
        // Condition: 
        int i = 0; // we 
        while (b < g2) {
        b = powerOf(b, i);

        if (g1 <= b && b <= g2) { // If b is greater than g2, it will never be in the interval
            System.out.print("b>g2");
            return false;
        }
        i++;
        System.out.print(b);
        
        
        }
        return true;
    }
    // calculate the power of number method: 
    public static int powerOf(int base, int exponent) {
        int result = 1;
        for (; exponent != 0; --exponent) {
            result *= base;
        }
        return result;


    }

}
