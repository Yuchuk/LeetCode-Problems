package DailyProblems;

public class numIdenticalPairs {
    public static int numIdenticalPairs(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }

        return counter;
    }
    /*Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     */
    public static void main(String[] args){
        int[] nums= {1,2,3,1,1,3};
        int result = numIdenticalPairs(nums);
        System.out.println("Number of Good Pairs: "+ result);
    }
}
