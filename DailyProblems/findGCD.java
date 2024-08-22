package DailyProblems;

import java.util.Arrays;

public class findGCD {
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int maxNumber = nums[nums.length - 1];
        int minNumber = nums[0];
        int posibleDivisor = 0;
        return gcd(maxNumber, minNumber);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    /*The greatest common divisor of two numbers is the largest positive
    integer that evenly divides both numbers.
     */
    public static void main(String[] args){
        int[] nums ={2,5,6,9,10};
        int result = findGCD(nums);
        System.out.println("greatest common divisor: "+ result);
    }
}
