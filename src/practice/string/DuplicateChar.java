package practice.string;

import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char d = 0;
        int count = 0;

        for (int i=0; i<str.length(); i++){
            for (int j=i+1; j<str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    if (d!=str.charAt(i)){
                        count++;
                        d = str.charAt(i);
                        System.out.println("Duplicate Character is : "+ d);
                        break;
                    }
                }
            }
        }
        System.out.println("Number of duplicate character is: "+count);
    }
}
