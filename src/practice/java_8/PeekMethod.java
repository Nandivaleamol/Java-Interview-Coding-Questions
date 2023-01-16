package practice.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Use the peek method of the Stream API to print out the elements of a stream as they are processed.
public class PeekMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,3,5,6,4,1);

        numbers.stream().distinct().peek(s-> System.out.println("After distinct method: "+s)).filter(n -> n % 2 == 1).peek(s -> System.out.println("After Filtering elements: " + s)).collect(Collectors.toList());


    }
}
