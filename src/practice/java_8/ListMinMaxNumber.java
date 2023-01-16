package practice.java_8;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

//Use the Stream API to find the maximum and minimum element in a list of integers, using the reduce method
public class ListMinMaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,6,9,3,2,8,7);

        int min = numbers.stream().reduce(Integer::min).get();
        System.out.println("Min number is "+min);

        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("Max number is "+max);

        // other way
        Integer min1 = numbers.stream().min((i1, i2) -> i1 - i2).get();
        System.out.println(min1);

        Integer max1 = numbers.stream().max(Comparator.comparingInt(i -> i)).get();
        System.out.println(max1);
    }
}
