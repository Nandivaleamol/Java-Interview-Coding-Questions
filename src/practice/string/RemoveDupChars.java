package practice.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChars {
    public static void main(String[] args) {
        String str = "programming";

        // Approach - 1: Using java 8 - distinct() method
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c->sb1.append((char) c));
        System.out.println(sb1);

        // Approach - 2: using String - charAt() method
        StringBuilder sb2 = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int index = str.indexOf(ch, i + 1);
            if (index==-1)
                sb2.append(ch);
        }
        System.out.println(sb2);

        // Approach - 3: using char[] array
        StringBuilder sb3 = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i=0; i<chars.length; i++){
            boolean repeated = false;
            for (int j=i+1; j<chars.length; j++){
                if (chars[i]==chars[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                sb3.append(chars[i]);
            }
        }
        System.out.println(sb3);

        // Approach - 4: using Set interface
        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
        for (Character c : set){
            sb4.append(c);
        }
        System.out.println(sb4);
    }
}
