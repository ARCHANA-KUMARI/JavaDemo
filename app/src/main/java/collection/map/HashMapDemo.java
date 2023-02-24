package collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Archana Kumari
 * @Date: 11-02-2023
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ARCHANA",1);
        map.put("Archana",2);
        System.out.println(map);
        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}
