package Collections;

import java.util.*;

/**
 * [1] LISTS (The "Ordered" Group)
 * Purpose: To keep elements in a specific order. Allows duplicates.
 */
public class ListDemo {
  public static void main(String[] args) {
    // ARRAYLIST -> [FAST SEARCH] Uses an array behind the scenes. Best for reading
    // data by index.
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Java");
    arrayList.add("Python");
    arrayList.add("Java"); // Duplicates allowed

    System.out.println("--- ArrayList ---");
    System.out.println("Fast access by index (0): " + arrayList.get(0));
    System.out.println("Full list: " + arrayList);
    System.out.println();

    // LINKEDLIST -> [FAST MODIFICATION] Uses nodes. Best if you are constantly
    // adding/removing items from the middle.
    List<String> linkedList = new LinkedList<>();
    linkedList.add("Fast");
    linkedList.add("Insertion");
    linkedList.add(1, "Middle"); // Adding in the middle is efficient

    System.out.println("--- LinkedList ---");
    System.out.println("List after mid-insertion: " + linkedList);
  }
}
