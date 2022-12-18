package practice.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringListAlphabatecally {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("b");
        list.add("x");
        list.add("c");
        list.add("s");

        // by steam api
        System.out.println("by using stream api");
        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        //by using Collections.sort() method
        System.out.println("by using Collections.sort() method");
        Collections.sort(list);
        System.out.println(list);

    }
}
