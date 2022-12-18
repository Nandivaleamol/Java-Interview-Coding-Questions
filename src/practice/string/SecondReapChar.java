package practice.string;

import java.util.*;

public class SecondReapChar {
    public static void main(String[] args) {
        String str = "PREPARED";
        String intitialString = "statistic non";
        secondReapChar(intitialString);
//        secondReapChar(str);
    }

    public static void secondReapChar(String str){
        StringBuffer stringBuffer = new StringBuffer();
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count > 1) {
                count = 0;
            } else
                stringBuffer.append(ch[i]);
                //System.out.println(ch[i]);
        }
        System.out.println("2nd non repeating char: "+stringBuffer.charAt(1));

    }
}
