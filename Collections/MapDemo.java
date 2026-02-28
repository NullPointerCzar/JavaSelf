package Collections;

import java.util.*;

/**
 * [3] MAPS (The "Pair" Group)
 * Purpose: Stores Key-Value pairs (like a dictionary). Keys MUST be unique.
 */
public class MapDemo {
  public static void main(String[] args) {
    // HASHMAP -> [FASTEST] Keys are stored randomly.
    Map<String, String> hashMap = new HashMap<>();
    hashMap.put("Z", "Zebra");
    hashMap.put("A", "Apple");
    hashMap.put("M", "Mango");
    System.out.println("--- HashMap (Unordered) ---");
    System.out.println(hashMap.keySet());
    System.out.println();

    // TREEMAP -> [SORTED KEYS] Keys are kept in sorted order.
    Map<String, String> treeMap = new TreeMap<>();
    treeMap.put("Z", "Zebra");
    treeMap.put("A", "Apple");
    treeMap.put("M", "Mango");
    System.out.println("--- TreeMap (Sorted Keys) ---");
    System.out.println(treeMap.keySet());
    System.out.println();

    // LINKEDHASHMAP -> [ORDERED KEYS] Keys stay in the order you added them.
    Map<String, String> linkedMap = new LinkedHashMap<>();
    linkedMap.put("Z", "Zebra");
    linkedMap.put("A", "Apple");
    linkedMap.put("M", "Mango");
    System.out.println("--- LinkedHashMap (Insertion Order) ---");
    System.out.println(linkedMap.keySet());
  }
}
