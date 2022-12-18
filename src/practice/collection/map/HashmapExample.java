package practice.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");

        boolean b = map.containsKey(3);
        System.out.println(b);
    }
}
