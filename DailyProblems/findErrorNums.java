package DailyProblems;
import java.util.HashSet;
import java.util.Set;

public class findErrorNums {

    public static int[] findErrorNumbers(int[] nums) {
        Set<Integer> numberSet = new HashSet<>();

        int repeatNumber = -1;
        int missingNumber = 1;
        int n = nums.length;
        int origSum = (n * (n + 1)) / 2;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (numberSet.contains(nums[i])) {
                repeatNumber = nums[i];
            } else {
                numberSet.add(nums[i]);
            }
        }
        missingNumber = repeatNumber + (origSum - sum);
        return new int[]{repeatNumber, missingNumber};
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 6, 5};
        int[] result = findErrorNumbers(nums);
        System.out.println("repeatNumber: " + result[0] +" "+ "missingNumber: " + result[1]);
    }
}

