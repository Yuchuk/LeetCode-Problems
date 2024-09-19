package DailyProblems;

public class thirdMax {
    public static int thirdMax(int[] nums) {

        Integer max1 = null, max2 = null, max3 = null;

        for (int i = 0; i < nums.length; i++) {
            if (max1 == null || nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] == max1) {

            } else {

                if (max2 == null || nums[i] > max2) {
                    max3 = max2;
                    max2 = nums[i];
                } else if (nums[i] == max2) {

                } else {
                    if (max3 == null || nums[i] > max3) {
                        max3 = nums[i];
                    }
                }
            }
        }
        if (max3 != null) {
            return max3;
        } else {
            return max1;
        }

    }
    /*Given an integer array nums, return the third distinct maximum number in this array.
     If the third maximum does not exist, return the maximum number.
     */
    public static void main(String[] args){
        int[] nums = {2,2,3,1};
        int result = thirdMax(nums);
        System.out.println("Third Maximum Number: "+ result);
    }
}
