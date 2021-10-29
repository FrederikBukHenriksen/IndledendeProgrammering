import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class TextAnalysis {

    // Declarations

    private String SourceFileName;
    private int maxNoOfWords = 0;

    // Constuctor
    public TextAnalysis(String SourceFileName, int maxNoOfWords) {
        this.SourceFileName = SourceFileName;
        this.maxNoOfWords = maxNoOfWords; // this is not used...but code jugde deosn't run, if we don't declare it
    }

    // Methods start here:

    // Method: Read file as string.
    public String readFileAsString() {
        String text = ""; // default 
        try {
            text = new String(Files.readAllBytes(Paths.get(this.SourceFileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    // Method: Print the text as an Array.
    public void printText() {
        String[] tempTokens = tokens(); // make a temporaily array which we can modify. run the tokens array.

        for (int i = 0; i < tempTokens.length; i++) {
            System.out.println(tempTokens[i]);
        }
    };

    // Method: Create an array for each word in the text.
    public String[] tokens() {
        String[] tokens = readFileAsString().split("[^a-zA-Z]+");

        // convert all letters to lowercase:
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = tokens[i].toLowerCase();
        }
        return tokens;
    }

    // Method: Word count

    public int wordCount() {
        String[] tempTokens = tokens(); // temporaily array

        int wordCount = tempTokens.length;
        if (readFileAsString().isEmpty()) {
            return 0;
        }
        return wordCount;
    }

    // Method: GetNoOfRepetitions()
    public int getNoOfRepetitions() {
        int count = 0; // count starts at 0.

        String[] tempTokens = tokens(); // temporaily array

        int i = 0;
        int j = i + 1;
        while (j < tempTokens.length) { // inner while loop
            if (tempTokens[i].equals(tempTokens[j])) { // we remove the first word in the sequence to avoid it gets
                                                       // counted again.
                count++;
            }
            tempTokens[i] = "";
            j++;
            i++;
        }
        // }
        return count; // returns the number of immediate repetitions as an integer.
    }


    // Method geNoOfDifferntWords 
    public int getNoOfDifferentWords() {
        if (readFileAsString().isEmpty()) { // if the file is empty, return 0. 
            return 0;
        } else {

            String[] tempTokens = tokens(); // make a temp array.
            List<String> data = new ArrayList<String>(); // create a list to add Unique words into. 
            int i = 0;
            while (tempTokens.length > i) {
                if (data.contains(tempTokens[i])) { // if the list contains the word in the temp array
                // Do nothing. 
                } else {
                    data.add(tempTokens[i]); // Add the word to the list, if it doesn't exsit in temp array
                }
                i++; 
            }
            return data.size(); // returns the size (length) of the data list of unique words. 
        }
    }

}
