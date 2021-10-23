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
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(this.SourceFileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    // Method: Print the text as an Array.
    public void printText() {
        String[] tempTokens = tokens(); // make a temporaily array which we can modify. rom the tokens array.

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

        for (int i = 0; i < tempTokens.length - 1; i++) { // outer for loop. We minus tempTokens.length with - 1 becasue
                                                          // j starts with i + 1. Otherwise we would get out of bounds
                                                          // error.
            int j = i + 1;
            while (j < tempTokens.length) { // inner while loop
                if (tempTokens[i].equals(tempTokens[j])) { // we remove the first word in the sequence to avoid it gets
                                                           // counted again.
                    count++;
                }
                tempTokens[i] = "";
                j++;
            }
        }
        return count; // returns the number of immediate repetitions as an integer.
    }

    // Method: GetNoOfRepetitions()
    public int getNoOfDuplicates() {
        int count = 0; // count starts at 0.
        String[] tempTokens = tokens(); // make a temp array.
        for (int i = 0; i < tempTokens.length; i++) { // outer loop
            for (int j = i + 1; j < tempTokens.length; j++) { // inner loop
                if (tempTokens[i].equals(tempTokens[j])) {
                    count++; // increase count by 1 for each match.
                    tempTokens[i] = ""; // we delete the duplicate word, so it doesn't get counted again.

                }
            }
        }
        return count; // returns the number of dupicates as an integer.
    }

    // Method: Number of different words

    public int getNoOfDifferentWords() { // WordCount - Different words.
        return this.wordCount() - this.getNoOfDuplicates();

    }

}
