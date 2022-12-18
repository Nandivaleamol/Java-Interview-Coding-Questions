package practice.collection.map;

import java.util.*;
import java.util.stream.Collectors;

public class HashtableExample {
    public static void main(String[] args) {

        //create Hashtable object
        Hashtable<String,String> hashtable = new Hashtable<String,String>();
        //add key value pairs to Hashtable
        hashtable.put("1","Java Interview Questions");
        hashtable.put("2","Java Interview Programs");
        hashtable.put("3","Concept and exampe program");
        hashtable.put("4","Concept and interview Questions");
        hashtable.put("5","Java Quiz");
        hashtable.put("6","Real time examples");

        boolean b = hashtable.containsKey("5");
        System.out.println(b);

        System.out.println(hashtable);

        Set<Map.Entry<String, String>> entries = hashtable.entrySet();
        System.out.println(entries);

    }

}
