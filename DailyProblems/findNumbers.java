package DailyProblems;

public class findNumbers {
    public static int findNumbers(int[] nums) {
        int result = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                counter++;
            }

            if (counter % 2 == 0) {
                result++;
                counter = 0;
            } else {
                counter = 0;
            }
        }

        return result;
    }
/*Given an array nums of integers, return how many of them contain an even number of digits.
 */
    public static void main(String[] args){
        int[] nums = {555,901,482,1771,12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println("How many even number of digits are there? "+ result);
    }
}
