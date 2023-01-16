package practice.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Use the distinct method of the Stream API to remove duplicate elements from a list of integers.
public class ListRemoveDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,3,5,6,4,1);

        List<Integer> uniqueElementList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueElementList);
    }
}
