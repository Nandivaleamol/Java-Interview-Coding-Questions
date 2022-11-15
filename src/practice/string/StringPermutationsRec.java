package practice.string;

public class StringPermutationsRec {
    public static void main(String args[]) {
        permutation("123");
    }
    /*
     * A method exposed to client to calculate permutation of String in Java.
     */
    public static void permutation(String input) {
        permutation("", input);
    }
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);

        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i)
                        + word.substring(i + 1, word.length()));
            }
        }

    }
}
