package practice.string;

//problem statement:- Write a Java program to swap 2 strings without using temp variable

public class SwapStrings {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Programming";

        System.out.println("First string before swapping: "+str1);
        System.out.println("Second string before swapping: "+str2);

        str1 = str1+str2; // JavaProgramming

        str2 = str1.substring(0,str1.length()-str2.length()); // 0, (15-11)=3 --> Java
        str1 = str1.substring(str2.length()); // 3  --> Programming

        System.out.println("First string after swapping: "+str1);
        System.out.println("Second string after swapping: "+str2);

    }
}
