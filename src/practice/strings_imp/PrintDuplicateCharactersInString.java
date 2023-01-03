package practice.strings_imp;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateCharactersInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        String str = sc.nextLine();

        for (char c : str.toCharArray()){
            if (set.contains(c)){
                System.out.print(c+" ");
            }else{
                set.add(c);
            }
        }

    }
}
