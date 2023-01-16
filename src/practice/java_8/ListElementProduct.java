package practice.java_8;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

//Use the reduce method of the Stream API to find the product of all elements in a list of integers.
public class ListElementProduct {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int product = numbers.stream().reduce((i, i2) -> i * i2).get();
        System.out.println("Product is "+product);

    }
}
