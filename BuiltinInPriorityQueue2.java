package builtininpriorityqueue2;
 import java.util.PriorityQueue;
 public class BuiltinInPriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        // Add data to PriorityQueue.
        queue.add(1);
        queue.add(100);
        queue.add(0);
        queue.add(1000);
        System.out.println(queue);
        // Loop over and display contents of PriorityQueue.
        for (int element : queue) {
            System.out.println(element);
        }
        // Use peek.
        // ... The element that is sorted first is returned.
        // ... The queue is not changed.
        int peeked = queue.peek();
        System.out.println("peeked element " +peeked);
        // Poll all elements in the PriorityQueue.
         while (!queue.isEmpty()) {
            // Get polled element and print it.
            int polled = queue.poll();
            System.out.println(polled);
        }
    }
 }