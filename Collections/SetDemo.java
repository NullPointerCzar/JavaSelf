package Collections;

import java.util.*;

/**
 * [2] SETS (The "Unique" Group)
 * Purpose: To ensure no two items are exactly the same.
 */
public class SetDemo {
  public static void main(String[] args) {
    // HASHSET -> [UNORDERED] The fastest. Items go in randomly.
    Set<String> hashSet = new HashSet<>();
    hashSet.add("Zebra");
    hashSet.add("Apple");
    hashSet.add("Mango");
    hashSet.add("Apple"); // Duplicate ignored
    System.out.println("--- HashSet (Random Order) ---");
    System.out.println(hashSet);
    System.out.println();

    // LINKEDHASHSET -> [INSERTION ORDER] Remembers what you added first.
    Set<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("Zebra");
    linkedHashSet.add("Apple");
    linkedHashSet.add("Mango");
    System.out.println("--- LinkedHashSet (Insertion Order) ---");
    System.out.println(linkedHashSet);
    System.out.println();

    // TREESET -> [SORTED ORDER] Automatically puts everything in A-Z/1-9 order.
    Set<String> treeSet = new TreeSet<>();
    treeSet.add("Zebra");
    treeSet.add("Apple");
    treeSet.add("Mango");
    System.out.println("--- TreeSet (Sorted Order) ---");
    System.out.println(treeSet);
  }
}
