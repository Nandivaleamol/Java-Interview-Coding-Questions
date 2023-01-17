package practice.strings_imp;

import java.util.HashMap;

//Write a Program to find 2nd non-repeating character in any string
public class FindSecondNonRepeatingChar {

    public static char secondNonRepeating(String str) {
        // create a HashMap to store the count of each character
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.get(c) == 1) {
                str = str.replace(String.valueOf(c), "");
                break;
            }
        }

        // find the second non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
//        String str = "abcabcdefgh";
        String str = "PREPARED";
        System.out.println(secondNonRepeating(str));
    }
}
