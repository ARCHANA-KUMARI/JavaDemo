package collection.map;

import java.util.List;

/**
 * @Author: Archana Kumari
 * @Date: 10-04-2023
 */
public class HashMapDriver {
    public static void main(String args[]) {
        MyHashMap<String, Integer> hashMap = new MyHashMap();
        System.out.println("IsEmpty() method test:" + hashMap.isEmpty());

        hashMap.put("Bihar", 5000);
        hashMap.put("Kerala", 15000);
        hashMap.put("Karnataka", 500);
        hashMap.put("UP", 55000);
        hashMap.put("Maharastra", 3000);

        List<String> keyList = hashMap.getKeySet();
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Contains method test:" + hashMap.contains("Bihar"));
        System.out.println("!Contains method test:" + hashMap.contains("India"));
        System.out.println("!IsEmpty() method test:" + hashMap.isEmpty());
        System.out.println("get() method test:" + hashMap.get("Bihar"));
        System.out.println("!get() method test:" + hashMap.get("India"));
        System.out.println("Remove() method test:" + hashMap.remove("Bihar"));
        System.out.println("!Remove() method test:" + hashMap.remove("India"));
    }
}
