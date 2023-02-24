package collection.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Archana Kumari
 * @Date: 22-02-2023
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "Geeks");
        map.put(2, "For");
        map.put(1, "Geeks");
        map.put(1, "Geeks");
        System.out.println("TreeMap:" + map);
        System.out.println("TreeMap size:" + map.size());
    }
}
