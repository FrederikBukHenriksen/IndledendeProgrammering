public class IntervalSearch {
    public static void main(String[] args) {   
        System.out.println(IntervalSearch.intervalContains(5, 11, 3));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(5, 11, 4));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(17, 17, 17));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(17, 17, 5));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(12, 18, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(18, 12, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(18, 24, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(18, 144, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(18, 14403434, 12));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(5, 11, 1));
		//@ Test
		System.out.println(IntervalSearch.intervalContains(1, 5, 1));
		//@ End
    }    

    public static boolean intervalContains(int g1, int g2, int b) {

        if (g1 >= 1 && g2 >= 1 && b >= 1) { // check if g1, g2 & b are positive integers. 
        
        int i = 1;
        int mat = b; // b^1 = b. 
        while (mat <= g2 || mat <= g1) { // if mat is larger than either of g1 & g2, stop & return false. 
        mat = powerOf(b, i); // Call poweOf function to return the power of b^i 

        if (g1 <= mat && mat <= g2) { // Check if mat is in the interval
            return true;
        }

        else if (g2 <= mat && mat <= g1) { // Check if mat is in the interval
            return true; 
        }

        else if (mat == 1) { // Check if mat is = 1, after checked if it is inbetween the intervals. the loop must return false. becase 1^x = 1
            return false;
        }

        i++;
        }
        return false;
    }
    else {
        return false; 
    }
} 
    // Function to return the power of first argument as second argument as exponent
     public static int powerOf(int base, int exponent) {
        int result = 1;
        for (; exponent != 0; --exponent) {
            result *= base;
        }
        return result;


    }

}
