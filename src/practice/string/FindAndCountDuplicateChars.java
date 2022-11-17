package practice.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindAndCountDuplicateChars {
    public static void main(String[] args) {
        printDuplicateChars("programming    ");
        printDuplicateChars("Combination");
        printDuplicateChars("java");
    }

    public static void printDuplicateChars(String str){

        char[] chars = str.strip().toCharArray();
//        char[] chars = str.toCharArray();

        //build HashMap with character and number of time the appear in string
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch: chars){
            if (charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch)+1);
            }else{
                charMap.put(ch,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicates characters in string '%s' %n ", str);
        for (Map.Entry<Character, Integer> entry : entrySet){
            if (entry.getValue() > 1){
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
