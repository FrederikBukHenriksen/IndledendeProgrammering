public class IntervalSearch_v2 {
    public static void main(String[] args) {
       // System.out.print(intervalContains(1, 11, 3));
     //  System.out.print(powerOf(3,2));
       System.out.print(intervalContains(3, 4, 3));

        
    }    

    public static boolean intervalContains(int g1, int g2, int b) {

        if (g1 >= 1 && g2 >= 1 && b <= g2) { // lidt i tivl om 1 må tælle med.  
            
            int i = 1;
            while (g1 >= b && b <= g2) {
                b = powerOf(b, i);
                System.out.println(b);

                if (b > g2) {
                    System.out.println("Could not find a integer with power >= 1 wihtin the range");
                    return false; 
                }
                i++;
                } 
            System.out.print("outside loop " + b);
            return true; // (g1 <= b && b <= g2)
        }
        else {
            return false;
        }

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
