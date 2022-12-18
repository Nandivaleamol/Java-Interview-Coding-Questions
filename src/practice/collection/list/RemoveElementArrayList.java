package practice.collection.list;

import java.util.List;
import java.util.ArrayList;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(14);
        list.add(29);
        list.add(20);
        list.add(30);

        list.remove(3);
        System.out.println(list);
    }
}
