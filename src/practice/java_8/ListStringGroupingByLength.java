package practice.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Use the groupingBy method of the Collectors class to group a list of strings by their length.
public class ListStringGroupingByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
