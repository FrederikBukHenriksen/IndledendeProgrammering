public class TestTextAnalysis {
    public static void main(String[] a) {
        TextAnalysis ta = new TextAnalysis("text17_00.txt", 50);
        System.out.println("word count = " + ta.wordCount());
        System.out.println("dubplicates = " + ta.getNoOfDuplicates());
        System.out.println("different words = " + ta.getNoOfDifferentWords());
        System.out.println("Immediate repetitions = " + ta.getNoOfRepetitions());
        ta.printText();
    }
}