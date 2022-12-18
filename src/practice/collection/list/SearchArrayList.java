package practice.collection.list;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(19);
        list.add(38);
        list.add(20);
        list.add(25);
        list.add(10);
        list.add(15);
        list.add(18);

        //find
        boolean contains = list.contains(18);
        System.out.println(contains);

        Set<Integer> collect = list.stream().filter(i -> i == 18).collect(Collectors.toSet());
        System.out.println(collect);

    }
}
