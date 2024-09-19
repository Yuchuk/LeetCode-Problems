package DailyProblems;
import java.util.PriorityQueue;

public class KthLargest {
    private int k;
    private PriorityQueue<Integer> minQueue;

    public KthLargest(int k, int[] nums) {
        this.minQueue = new PriorityQueue<>(k);
        this.k = k;

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minQueue.offer(val);

        if (minQueue.size() > k) {
            minQueue.poll();
        }

        return minQueue.peek();
    }

    public static void main(String[] args){
        //["KthLargest","add","add","add","add","add"]
        KthLargest KthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        KthLargest.add(3);
        KthLargest.add(5);
        KthLargest.add(10);
        KthLargest.add(9);
        KthLargest.add(4);
        //System.out.println("Kth Largest Element in a Stream:"+KthLargest.add(10));
    }
}


