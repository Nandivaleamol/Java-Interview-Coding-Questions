package practice.java_8;

import java.util.Arrays;
import java.util.List;

//Use the Optional class to write a function that returns the first even number in a list of integers.
public class ListFirstEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,3,5,6,4,1);

        Integer firstEvenNum = numbers.stream().filter(n -> n % 2 == 0).findFirst().orElseThrow(() -> new RuntimeException("Even value not present in given list"));
        System.out.println(firstEvenNum);


    }
}
