package practice.string;

import java.util.Arrays;
import java.util.stream.Stream;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {

        String s = removeWhiteSpaces("java prog ra m in   g");
        System.out.println(s);

        String s1 = removeWhiteWithoutUsingInbuiltMethod("Ja va C o  di ng World ");
        System.out.println(s1);

    }

    public static String removeWhiteSpaces(String str){
        StringBuilder builder = new StringBuilder();
        if (str == null)
            throw new IllegalArgumentException("Null is not valid argument");
        else{
            char[] charArr = str.toCharArray();
            for (char c : charArr)
                if (!Character.isWhitespace(c))
                    builder.append(c);
        }
        return builder.toString();
    }


    // without using inbuilt methods
    public static String removeWhiteWithoutUsingInbuiltMethod(String str){

        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<charArr.length; i++){
            if (charArr[i] !=' ' && charArr[i]!='\t' ){
                sb.append(charArr[i]);
            }
        }
        return sb.toString();
    }



}
