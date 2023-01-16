package practice.java_8;

import java.util.*;
import java.util.stream.Collectors;

//Use the Collectors.joining method to concatenate a list of strings, separated by a comma.
public class ConcatenatingStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("coding","java","hello","world","love");

        String concatenateString = strings.stream().collect(Collectors.joining(","));
        System.out.println(concatenateString);

        String joinString = String.join(" ", strings);
        System.out.println(joinString);
    }
}
