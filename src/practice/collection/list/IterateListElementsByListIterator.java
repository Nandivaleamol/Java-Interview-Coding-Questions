package practice.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class IterateListElementsByListIterator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,38,19,10,35,25,40,45,50);

        ListIterator listIterator = list.listIterator();

        // forward iteration
        System.out.println("-----------By using listIterator------------");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //reverse iteration
        System.out.println("------reverse iteration-------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("-----------By Advanced for loop------------");
        // for loop
        for (Integer integer : list){
            System.out.println(integer);
        }

    }
}
