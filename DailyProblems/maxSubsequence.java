package DailyProblems;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

public class maxSubsequence {
    public static int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> minQueueByValue = new PriorityQueue<>();
        int[] result = new int[k];
        Integer count = 1;
        Map<Integer, Integer> maxNums = new HashMap<>();
        int resultIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            minQueueByValue.offer(nums[i]);
            if (minQueueByValue.size() > k) {
                minQueueByValue.poll();
            }
        }

        while (!minQueueByValue.isEmpty()) {
            if (!maxNums.containsKey(minQueueByValue.peek())) {
                maxNums.put(minQueueByValue.poll(), 1);
            } else {
                count = maxNums.get(minQueueByValue.peek());
                maxNums.put(minQueueByValue.poll(), ++count);
            }

        }

        for (int j = 0; j < nums.length; j++) {
            if (resultIndex < k && maxNums.containsKey(nums[j])) {
                count = maxNums.get(nums[j]);
                if (count >= 1) {
                    result[resultIndex] = nums[j];
                    resultIndex++;
                    maxNums.put(nums[j], --count);
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-1,-2,-1,3,4};
        int k = 3;
        int[] result = maxSubsequence(nums, k);
    }
}
