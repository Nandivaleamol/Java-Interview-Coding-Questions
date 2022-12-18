package practice.collection.list;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class RemoveDuplicatesInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(10);
        list.add(12);
        list.add(18);
        list.add(10);
        list.add(18);

        //by using HashSet() constructor
        Set<Integer> removedDups = new HashSet<>(list);
        System.out.println(removedDups);

        // by using stream api
        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);

        // getting duplicate element
        Set set = new HashSet();
        List<Integer> collect = list.stream().filter(a -> !set.add(a)).collect(Collectors.toList());

        System.out.println(collect);
    }
}
