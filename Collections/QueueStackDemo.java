package Collections;

import java.util.*;

/**
 * [4] QUEUES & STACKS (The "System" Group)
 */
public class QueueStackDemo {
  public static void main(String[] args) {
    // PRIORITYQUEUE -> Smallest (or highest priority) items come out first.
    Queue<Integer> pq = new PriorityQueue<>();
    pq.add(100);
    pq.add(10);
    pq.add(50);
    System.out.println("--- PriorityQueue ---");
    System.out.println("Polling smallest first: " + pq.poll()); // 10
    System.out.println();

    // ARRAYDEQUE -> The modern way to build a STACK (Last-In-First-Out).
    // Use .push() to add and .pop() to remove.
    Deque<String> stack = new ArrayDeque<>();
    stack.push("First");
    stack.push("Second");
    stack.push("Third");
    System.out.println("--- Stack (ArrayDeque) ---");
    System.out.println("Pop (Last in is first out): " + stack.pop()); // Third
  }
}
