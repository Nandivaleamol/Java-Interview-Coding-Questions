package practice.string;

public class ReveresStringWords {
    public static void main(String[] args) {
        String s = reverseWord("java is a high level programming language");
        System.out.println(s);
    }
    // reversing string sentence by words
    public static String reverseWord(String str){
        String str1=null;
        if (str==null){
            throw new IllegalArgumentException("Null is not valid argument");
        }else{
            String [] strArr = str.trim().split("");

            for (int i= strArr.length-1; i>=0; i--){
                //System.out.print(strArr[i]+" ");
                str1 = str1+ strArr[i];
            }
            return str1;
        }
    }
}
