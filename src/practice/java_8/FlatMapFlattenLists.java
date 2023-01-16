package practice.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//Use the flatMap method of the Stream API to flatten a list of lists of integers into a single list of integers.
public class FlatMapFlattenLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(6,7,8,9);

       List<List<Integer>> list4 = Arrays.asList(list1,list2,list3);

        System.out.println("ORIGINAL LIST: "+list4);

        List<Integer> flattenList = list4.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("AFTER FLATTEN LIST: "+flattenList);


    }
}
