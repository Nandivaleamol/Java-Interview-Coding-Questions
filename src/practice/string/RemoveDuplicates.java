package practice.string;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String[] s = {"sasi", "sai", "nag", "sasi", "nag", "babu", "babu", "sai"};
        int k = 0;
        /*String[] s=new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
        s[i]=sc.next();
        }*/
        Arrays.sort(s);
        k = duplicates(s);
        System.out.println("total duplicates:" + k);
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] == s[j]) {
                    copy(s, i, j);
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(s[i]);
        }
    }

    public static void copy(String[] s, int i, int j) {
        for (int k = j; k < s.length - 1; k++) {
            s[k] = s[k + 1];

        }

    }

    public static int duplicates(String[] s) {
        int k = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] == s[j]) {
                    k++;
                }
            }
        }
        return k;
    }
}
