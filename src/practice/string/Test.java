package practice.string;

public class Test {
    public static void main(String[] args) {

        String str = new String();
        System.out.println(str);

        //String s=new String(char ch[])

        char[] ch ={'a','b','c','d'};
        String s = new String(ch);
        System.out.println(s);

        byte[] bt = {100,88,99};
        String a = new String(bt);
        System.out.println(a);

        StringBuffer sb = new StringBuffer("Java");
        String b = new String(sb);
        System.out.println(b);
    }
}
