package practice.java_8;

import java.util.List;
import java.util.Arrays;

//Use the Stream API to filter a list of integers and print out only the even numbers.
public class PrintEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
