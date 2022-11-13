package practice.string;

public class CharsOccurrences {
    public static void main(String[] args) {
        String str = "Today is Monday"; //count number of "a" on this String.

        // using traditional for loop
        int countChar = countChar(str);
        System.out.println(countChar);

        // using java 1.5 enhanced for loop
        int charsCount = charsCount(str);
        System.out.println(charsCount);
    }

    // using traditional for loop
    public static int countChar(String str){
        int count=0;
        if (str==null)
            throw new IllegalArgumentException("Null is not valid argument");
        else{
            char[] charArr = str.toCharArray();
            for (int i=0; i<charArr.length; i++)
                if (charArr[i] =='a')
                    count++;
            return count;
        }
    }

    // using java 1.5 enhanced for loop
    public static int charsCount(String str){
        int count=0;

        if (str==null)
            throw new IllegalArgumentException("Null is not valid argument");
        else{
            char [] charArr = str.toCharArray();
            for (char c : charArr)
                if (c=='a')
                    count++;
            return count;
        }
    }
}
