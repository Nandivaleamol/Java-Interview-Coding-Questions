package practice.string;

public class StringReverse {
    public static void main(String[] args) {

        // first approach using StringBuilder/StringBuffer class
//        System.out.println(reverse("Java Programming"));

        // second approach using char[]
//        rev("java");

        // 3rd approach
//        String reverseWord = reverseWord("Java");
//        System.out.println(reverseWord);
        String s ="java";

        String revByRecursion = revByRecursion(s, "",s.length()-1);
        System.out.println(revByRecursion);
    }

    // first approach using StringBuilder/StringBuffer class
    public static StringBuilder reverse(String str){
        if (str==null){
            throw new IllegalArgumentException("Null is not valid argument");
        }else{
            StringBuilder builder = new StringBuilder(str);
            return builder.reverse();
        }
    }

    // second approach using char[]
    public static void rev(String str){

        if (str==null){
            throw new IllegalArgumentException("Null is not valid argument");
        }else{
            char[] charArr = str.toCharArray();

            for (int i=charArr.length-1; i>=0; i--){
                System.out.print(charArr[i]);
            }
        }
    }

    // 3rd approach
    public static String reverseWord(String str){
        String str1 = str.trim();
        String reverseString = "";
        if (str1.isEmpty()){
            throw new IllegalArgumentException("Null is not valid argument");
        }else {
            String[] strArr = str1.split("");

            for (int i= strArr.length-1; i>=0; i--){
                reverseString = reverseString + strArr[i];
            }
        }
        return reverseString;
    }

    // 4th approach - recursion
    public static String revByRecursion(String str1, String str2, int n){
        if (n<0){
            return str2;
        }else {
            str2 += str1.charAt(n);
            return revByRecursion(str1,str2,n-1);
        }
    }
}
