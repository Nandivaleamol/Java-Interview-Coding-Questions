package practice.string;

public class RemovingLeadingAndTrailingWhitespaces {
    public static void main(String[] args) {
        String str = "  java programming        \t";

        // using trim() method
        String trim = str.trim();
        System.out.println(trim);

        System.out.println();
        // since java 11 - strip() method is used to remove trailing and leading whitespaces
        String strip = str.strip();
        System.out.println(strip);
    }

}
