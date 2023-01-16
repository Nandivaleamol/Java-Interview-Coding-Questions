package practice.string;

//Statement:- Write a Java Program to remove all white spaces from a string with using replace().
public class RemoveWhiteSpacesByUsingReplaceAllMethod {
    public static void main(String[] args) {
        String str1 = "Java Pro  gram ing Worl d  ";

        System.out.println("Input string: "+str1);

        // 1st Approach by replaceAll() method
        String str2 = str1.replaceAll("\\s","");
        System.out.println("Output by replaceAlL() method: "+str2);

        System.out.println();

        //2nd Approach by replace() method
        String str3 = str1.replace(" ","");
        System.out.println("Output by replace() method: "+str3);
    }
}
