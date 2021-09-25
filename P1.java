/*
Variationer:
Hvad nu hvis der ingen tal er?
Tal kan være negative.
Der står i opgaven, at det er decimal digits, så det er vel også kommatal
*/

public class P1 {
    public static void main(String[] args) {
        System.out.print(check("3475"));
    }

    public static boolean check (String number) {
        String[] lolcat = number.split("");                                                     //Turn string into an array

        int[] array_new = ReverseStringToArray(lolcat);
        for (int i = 1; i < array_new.length; i=i+2){
            array_new[i]=array_new[i]*2;
            if (array_new[i]>= 10){
                array_new[i] = (array_new[i]%10)+1;
            }
        }
        int crossSum = 0;
        for (int i = 0; i < array_new.length; i++){
            crossSum += array_new[i];
        }
        if (crossSum%10 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static int[] ReverseStringToArray(String[] input){
        int[] bufferArray = new int [input.length];
        for (int i = 0; i < input.length; i++){
            bufferArray[(input.length-1)-i] = Integer.parseInt(input[i]);
        }
        return bufferArray;
    }
}