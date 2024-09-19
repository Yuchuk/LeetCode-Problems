package DailyProblems;
import java.util.Arrays;
import java.util.PriorityQueue;

public class sortEvenOdd {
    public static int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> evenNumbersQueue = new PriorityQueue<>((a, b) -> a - b);
        PriorityQueue<Integer> oddNumbersQueue = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenNumbersQueue.offer(nums[i]);
            } else {
                oddNumbersQueue.offer(nums[i]);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j % 2 == 0) {
                nums[j] = evenNumbersQueue.poll();
            } else {
                nums[j] = oddNumbersQueue.poll();
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {4,1,2,3};
        int[] result = sortEvenOdd(nums);
        System.out.println("Sort Even and Odd Indices Independently: "+ Arrays.toString(result));
    }
}
