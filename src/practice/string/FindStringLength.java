package practice.string;

public class FindStringLength {
    public static void main(String[] args) {

        // using in-built length()
        String str = "java";
        System.out.println("Using in-built length() method : "+str.length());

        // custom logic to finding String length
        int length = findLength("java");
        System.out.println("Using char[] : "+length);
    }

    public static int findLength(String str){
        int length=0;
        if (str==null)
            throw new IllegalArgumentException("Null is not valid argument");
        else{
            char [] charArr = str.trim().toCharArray();
           for (char c : charArr){
               length++;
           }
        }
        return length;
    }
}
