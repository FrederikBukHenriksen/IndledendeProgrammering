/*
Variationer:
Hvad nu hvis der ingen tal er?
Tal kan være negative.
Der står i opgaven, at det er decimal digits, så det er vel også kommatal
test af commits
*/

import java.math.BigInteger;

public class NumberCheck {
    // public static void main(String[] args) {
    //     System.out.print(check("165546168632215835423155415435"));
    //     // System.out.print(check("3475"));

    //     // System.out.print(check("3.475E3"));
    //     // System.out.print(check("-3475"));       //DEN KAN IKKE KLARE NEGATIVE TAL.

    // }

    public static boolean check (String number) {
        int[] array_new = ReverseStringToIntArray(number);
        return checkProcedure(array_new);
    }

    public static boolean checkProcedure(int[] input){
        //Double every digit
        for (int i = 1; i < input.length; i=i+2){
            input[i]=(input[i]*2);
            
            //If 10 or greater, replace digit with its mod 10 plus 1
            if (input[i]>= 10){
                input[i] = (input[i]%10)+1;
            }
        }

        long crossSum = 0;
        for (int i = 0; i < input.length; i++){
            crossSum += input[i];
        }

        //Check if cross sum mod 10 is correct.
        if (crossSum%10 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static int[] ReverseStringToIntArray(String input){
        //Convert into string for easy split.
        String[] stringArray = input.split(""); 

        
        //Parse characters one-by-one to int in reverse order.
        int[] stringArrayBuffer = new int [stringArray.length];
        for (int i = 0; i < stringArray.length; i++){
            stringArrayBuffer[(stringArray.length-1)-i] = Integer.parseInt(stringArray[i]);
        }
        return stringArrayBuffer;
    }

}