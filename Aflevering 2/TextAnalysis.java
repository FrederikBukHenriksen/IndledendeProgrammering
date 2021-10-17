import java.io.IOException;
import java.nio.file.*;

public class TextAnalysis {

    // Declarations

    private String SourceFileName;
    // private int maxNoOfWords;

    // Constuctor
    public TextAnalysis(String SourceFileName) {
        this.SourceFileName = SourceFileName;
        // this.maxNoOfWords = maxNoOfWords;
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

    // Method: Print the text.
    public void printText() {
        System.out.println(readFileAsString());
    };

    // Method: Create an array for each word in the text.
    public String[] tokens() {
        String[] tokens = readFileAsString().split("[^a-zA-Z]+");
        return tokens;
    }

    // Method: Word count

    public int wordCount() {
        int wordCount = tokens().length;
        return wordCount;
    }

    // Method: Number of different words

    // public int numberOfDifferentWords() {
    // int repitions - length.
    // }

    // Method: GetNoOfRepetitions()
    public int GetNoOfRepetitions() {
        int repetitions = 0;
        for (int i = 0; i < tokens().length; i++) {
            for (int j = i + 1; j < tokens().length; j++) {
                if (tokens()[i].equals(tokens()[j])) {
                    repetitions = repetitions + 1;
                }
            }
        }
        return repetitions;
    }

}
