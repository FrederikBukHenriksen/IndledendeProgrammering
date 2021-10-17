public class text {
    public static void main(String[] args) {
        String line = " This is , a test 123 Line ; or not ? b12 ";
        // String regex = "[^a-zA -Z]+";
        String[] tokens = line.split("[^a-zA-Z]+");
        System.out.println(tokens.length);

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
