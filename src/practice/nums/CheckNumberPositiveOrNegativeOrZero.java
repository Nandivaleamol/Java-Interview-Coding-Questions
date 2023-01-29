package practice.nums;

//Problem statement: Write a java program to check given input number is positive or negative or zero.

import java.util.Scanner;

public class CheckNumberPositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();

        String str = num>0? num+" is Positive Number" : num<0? num+" is Negative Number" : num+" is Zero Number";
        System.out.println(str);

    }
}
