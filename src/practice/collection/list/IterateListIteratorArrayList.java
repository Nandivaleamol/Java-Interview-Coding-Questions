package practice.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateListIteratorArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(19);
        list.add(18);

        ListIterator<Integer> listIterator = list.listIterator();
        listIterator.add(20);
        listIterator.add(24);
        listIterator.add(40);

        System.out.println(list);
    }
}
