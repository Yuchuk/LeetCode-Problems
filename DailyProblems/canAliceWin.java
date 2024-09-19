package DailyProblems;

public class canAliceWin {
    public static boolean canAliceWin(int[] nums) {
        int sumSingleDigit = 0;
        int sumDoubleDigit = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                sumSingleDigit += nums[i];
            } else {
                sumDoubleDigit += nums[i];
            }
        }

        if (sumSingleDigit == sumDoubleDigit) return false;
        else return true;
    }
/*Alice and Bob are playing a game.
In the game, Alice can choose either all single-digit numbers or
all double-digit numbers from nums, and the rest of the numbers
are given to Bob. Alice wins if the sum of her numbers is strictly
greater than the sum of Bob's numbers.
Return true if Alice can win this game, otherwise, return false.
 */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 14};
        System.out.println("Can Alise win this game: " + canAliceWin(nums));
    }
}
