public class TestTextAnalysis {
    public static void main(String[] args) {
        TextAnalysis ta = new TextAnalysis("text17_00.txt");
        // System.out.println("word count = " + ta.readFileAsString());

        ta.printText();

        // Print all the words.

        // for (int i = 0; i < ta.tokens().length; i++) {
        // System.out.println(ta.tokens()[i]);
        // }

        System.out.println(ta.wordCount());
        System.out.println("Repetions: " + ta.GetNoOfRepetitions());

        // System.out.println("different words = " + ta.getNoOfDifferentWords());
        // System.out.println("repetitions = " + ta.getNoOfRepetitions());
    }

}
