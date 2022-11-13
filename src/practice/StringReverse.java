package practice;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println(reverse("Java Programming"));

        rev("java");

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
}
