package practice.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapValueToList {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("IND","INDIA");
        countries.put("USA","UNITED STATES OF AMERICA");
        countries.put("PAK","PAKISTAN");
        countries.put("RS","RUSSIA");
        countries.put("CN","CHINA");

        ArrayList<String> values = new ArrayList<>(countries.values());
        System.out.println(values);

    }
}
