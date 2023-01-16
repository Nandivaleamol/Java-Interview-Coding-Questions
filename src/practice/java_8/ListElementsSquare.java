package practice.java_8;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

//Use the map method of the Stream API to square each element of a list of integers.
public class ListElementsSquare {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List<Integer> squareElements = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squareElements);
    }
}
