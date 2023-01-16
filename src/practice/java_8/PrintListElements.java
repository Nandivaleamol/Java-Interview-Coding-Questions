package practice.java_8;

import java.util.Arrays;
import java.util.List;

//Use the forEach method of the Stream API to print out the elements of a list of integers.
public class PrintListElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,5,6,9,0,11,7);

        numbers.stream().forEach(System.out::println);
    }
}
