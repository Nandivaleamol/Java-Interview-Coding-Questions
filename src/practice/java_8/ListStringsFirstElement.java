package practice.java_8;
import java.util.Arrays;
import java.util.List;

//Use the filter method of the Stream API to find the first element in a list of strings that has a length greater than 5.
public class ListStringsFirstElement {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("java","coding","world","programming","Hello");

        String s1 = stringList.stream().filter(s -> s.length() > 5).findFirst().get();
        System.out.println(s1);

    }
}
