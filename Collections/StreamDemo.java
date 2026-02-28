package Collections;

import java.util.*;
import java.util.stream.Collectors;

/**
 * [5] THE MODERN WAY: STREAMS
 */
public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    System.out.println("--- Stream API ---");

    // Task: Filter even numbers, double them, and put in a new list
    List<Integer> result = numbers.stream()
        .filter(n -> n % 2 == 0) // Filter even
        .map(n -> n * 2) // Double
        .collect(Collectors.toList());

    System.out.println("Original: " + numbers);
    System.out.println("Processed (Even -> Doubled): " + result);
  }
}
