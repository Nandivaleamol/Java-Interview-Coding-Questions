package practice.string;

// Problem Statement:- Write a java program reverse the given string sentence word wise.
// Input:- String str = "I Love Java Programming";
//Output:- Programming Java Love I

import java.util.Arrays;

public class StringWordReverse {
    public static void main(String[] args) {

        String str = "I Love Java Programming";

        String[] strArr = str.trim().split(" ");

        for (int i= strArr.length-1; i>=0; i--){
            System.out.print(strArr[i]+" ");
        }

        System.out.println();

        ////////////////////////////////////////////

        // iterating string array using stream api
       Arrays.stream(strArr).distinct().forEach(s->System.out.print(s+" "));


        // Problem Statement:- Write a java program reverse the given string sentence character wise and remove whitespaces.

        char[] strCharArr = str.trim().toCharArray();
        System.out.println();
       for (int i=strCharArr.length-1; i>=0; i--){
           if (!Character.isWhitespace(strCharArr[i])){
               System.out.print(strCharArr[i]+" ");
           }
       }

       ////////////////////////////////////////////////////////////
    }
}
