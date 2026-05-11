import java.util.*;
public class p1day10 {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>()
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);

        System.out.println("Min-Heap peek());
        minHeap.poll();
        System.out.println("Min-Heap peek());
