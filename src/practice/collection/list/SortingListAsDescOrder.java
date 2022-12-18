package practice.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListAsDescOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 29, 38, 98, 38, 33, 22, 18);

        // stream api(java 8)
        System.out.println("----by stream api----");
        List<Integer> integerList = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println(integerList);

        // collection sort() method
        System.out.println("----by collection sort method----");
        list.sort((a,b)->b-a);
        System.out.println(list);

    }
}
