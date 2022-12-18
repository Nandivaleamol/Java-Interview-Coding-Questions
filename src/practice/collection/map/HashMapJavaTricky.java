package practice.collection.map;

import java.util.HashMap;

public class HashMapJavaTricky {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<Integer, String>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        System.out.println(hm.size());

        for (Integer name : hm.keySet()){
                System.out.println(name +" "+hm.get(name));
        }
    }
}
