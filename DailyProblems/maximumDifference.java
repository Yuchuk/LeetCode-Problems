package DailyProblems;

public class maximumDifference {
    public static int maximumDifference(int[] nums) {
        int maxDiff = nums[1] - nums[0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] > maxDiff) {
                    maxDiff = nums[j] - nums[i];
                }
            }
        }
        if (maxDiff > 0) return maxDiff;
        else return -1;
    }
    /*Given a 0-indexed integer array nums of size n,
    find the maximum difference between nums[i] and nums[j]
    (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
    Return the maximum difference. If no such i and j exists, return -1.
     */
    public static void main(String[] args){
        int[] nums = {7,1,5,4};
        int result = maximumDifference(nums);
        System.out.println("Maximum difference: "+result);
    }
}
