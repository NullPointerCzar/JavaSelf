package Collections;

import java.util.*;

/**
 * [6] GOLDEN RULE FOR CUSTOM OBJECTS
 * If you put your own Classes into a HashSet or HashMap:
 * - YOU MUST OVERRIDE .equals()
 * - YOU MUST OVERRIDE .hashCode()
 */
class Item {
  String name;
  int id;

  Item(String name, int id) {
    this.name = name;
    this.id = id;
  }

  // Defining what "same" means: items are same if IDs match
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Item item = (Item) o;
    return id == item.id;
  }

  // Helps Java efficiently store/find the object
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return name + " (ID: " + id + ")";
  }
}

public class CustomObjectDemo {
  public static void main(String[] args) {
    Set<Item> inventory = new HashSet<>();

    inventory.add(new Item("Laptop", 101));
    inventory.add(new Item("Phone", 102));
    inventory.add(new Item("Laptop", 101)); // Duplicate ID - will be ignored!

    System.out.println("--- Custom Objects in HashSet ---");
    System.out.println("Inventory size (should be 2): " + inventory.size());
    for (Item item : inventory) {
      System.out.println(item);
    }
  }
}
