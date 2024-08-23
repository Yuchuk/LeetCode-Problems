package DailyProblems;

public class findNonMinOrMax {
    public static int findNonMinOrMax(int[] nums) {
        Integer maxInteger = null;
        Integer minInteger = null;
        Integer midInteger = null;

        for (int i = 0; i < nums.length; i++) {
            if (maxInteger == null || maxInteger < nums[i]) {
                minInteger = midInteger;
                midInteger = maxInteger;
                maxInteger = nums[i];
            } else if (midInteger == null || midInteger < nums[i]) {
                minInteger = midInteger;
                midInteger = nums[i];
            } else if (minInteger == null || minInteger < nums[i]) {
                minInteger = nums[i];
            }
        }
        if (minInteger != null && maxInteger != null)
            return midInteger;
        else
            return -1;
    }
    /*Given an integer array nums containing distinct positive integers,
    find and return any number from the array that is neither the minimum
    nor the maximum value in the array, or -1 if there is no such number.
     */
    public static void main(String[] args){
        int[] nums = {10,27,3};
        int result = findNonMinOrMax(nums);
        System.out.println("Neither Minimum nor Maximum: "+ result);
    }
}
