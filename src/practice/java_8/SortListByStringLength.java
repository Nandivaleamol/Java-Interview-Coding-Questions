package practice.java_8;

import java.util.Arrays;
import java.util.List;

//Use a lambda expression to sort a list of strings by their length.
public class SortListByStringLength {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("java","programming","coding","hello","world","jdk","core");

        stringList.stream().sorted((s1,s2)->s1.length() - s2.length()).forEach(System.out::println);
    }
}
