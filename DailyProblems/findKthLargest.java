package DailyProblems;
import java.util.PriorityQueue;

public class findKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> resultPQ = new PriorityQueue<>((a, b) -> a - b);

        for (int i = 0; i < nums.length; i++) {
            resultPQ.offer(nums[i]);
            if (resultPQ.size() > k) {
                resultPQ.poll();
            }
        }
        return resultPQ.peek();
    }
    /*Given an integer array nums and an integer k,
    return the kth largest element in the array.
    Note that it is the kth largest element in the sorted order,
    not the kth distinct element.
     */
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int result = findKthLargest(nums, k);
        System.out.println("Kth Largest Element in an Array: "+ result);
    }
}
