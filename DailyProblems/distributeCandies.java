package DailyProblems;
import java.util.HashSet;
import java.util.Set;

public class distributeCandies {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> candyHash = new HashSet<>();
        int maxCount = candyType.length / 2;

        for (int i = 0; i < candyType.length; i++) {
            if (!candyHash.contains(candyType[i])) {
                candyHash.add(candyType[i]);
            }
        }

        if (candyHash.size() < maxCount) {
            return candyHash.size();
        } else {
            return maxCount;
        }
    }
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        int result = distributeCandies(candyType);
        System.out.println("Maximum number of different types of candies she can eat: "+result);
    }
}
