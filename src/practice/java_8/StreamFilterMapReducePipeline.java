package practice.java_8;

import java.util.*;

//Use the Stream API and lambda expressions to implement a simple "filter-map-reduce"
// pipeline to compute the sum of squares of even numbers in a list.
public class StreamFilterMapReducePipeline {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,1);

        Integer sumOfEvenNumberSqr = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .map(m -> m * m)
                .reduce(Integer::sum)
                .get();

        System.out.println(sumOfEvenNumberSqr);
    }
}
