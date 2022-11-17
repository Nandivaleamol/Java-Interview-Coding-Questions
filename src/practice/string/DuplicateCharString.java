package practice.string;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharString {
    public static void main(String[] args) {
        boolean rep = checkRepeatingCharsFromMap("programming");
       // System.out.println(rep);

    }
    public static boolean checkRepeatingCharsFromMap(String str){
        boolean repeat = false;

        if (str !=null && str.length()>0){
            char[] chars = str.toCharArray();

            Set<Character> set = new TreeSet<>();
            Set<Character> repeatChar = new TreeSet<>();

            for (char c : chars){
                if (!set.add(c)){
                    //if you want to print each occurance of the repeating character
                    //System.out.println(c +" ");

                    repeatChar.add(c);
                    repeat = true;
                }
            }
            System.out.println(repeatChar);
        }
        return repeat;
    }
}
