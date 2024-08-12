package DailyProblems;

public class findMiddleIndex {
    public static int findMiddleIndex(int[] nums) {
        int sumNums = 0;
        int sumLeft = 0;
        int sumRight = 0;

        for (int num : nums) {
            sumNums += num;
        }

        for (int i = 0; i < nums.length; i++) {
            sumRight = sumNums - sumLeft - nums[i];
            if (sumRight == sumLeft) {
                return i;
            }
            sumLeft += nums[i];
        }

        return -1;
    }
    /*A middleIndex is an index where nums[0] + nums[1] + ...
    + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] +
    ... + nums[nums.length-1].
    Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
     */
    public static void main(String[] args){
        int[] nums = {2,3,-1,8,4};
        System.out.println("Middle Index in Array: "+ findMiddleIndex(nums));
    }
}
