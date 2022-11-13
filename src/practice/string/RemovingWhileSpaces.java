package practice.string;

public class RemovingWhileSpaces {
    public static void main(String[] args) {

        String s = removeWhiteSpaces("java prog ra mn in");
        System.out.println(s);
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
}
