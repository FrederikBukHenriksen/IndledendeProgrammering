// test af git terminal.

public class NumberCheck {

    public static boolean check(String number) {
        return checkProcedure(ReverseStringToIntArray(number));
    }

    public static boolean checkProcedure(int[] input) {

        // Double every digit
        for (int i = 1; i < input.length; i = i + 2) {
            input[i] *= 2;

            // If 10 or greater, replace digit with its mod 10 plus 1
            if (input[i] >= 10) {
                input[i] = (input[i] % 10) + 1;
            }
        }

        // Calculate crosssum
        long crossSum = 0;
        for (int i = 0; i < input.length; i++) {
            crossSum += input[i];
        }

        // Check if cross sum mod 10 is correct.
        if (crossSum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] ReverseStringToIntArray(String input) {
        // Only utilize everything before a period period, in case of a float/double.
        // If no period (input is an int), catch error and continue the program.
        try {
            input = input.split(".")[0];
        } catch (Exception e) {
        }
        // Convert into string for easy split.
        String[] stringArray = input.split("");

        // Parse characters one-by-one to int in reverse order.
        int[] stringArrayBuffer = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            stringArrayBuffer[(stringArray.length - 1) - i] = Integer.parseInt(stringArray[i]);
        }
        return stringArrayBuffer;
    }

}