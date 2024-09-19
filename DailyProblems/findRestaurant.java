package DailyProblems;
import java.util.*;

public class findRestaurant {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);

        List<String> res = new ArrayList<>();

        int minsum = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = j + map.get(list2[j]);
                if (sum < minsum) {
                    minsum = sum;
                    res.clear();
                    res.add(list2[j]);
                } else if (sum == minsum)
                    res.add(list2[j]);
            }
        }
        String[] result = res.toArray(new String[res.size()]);
        return result;
    }
    /*A common string with the least index sum is a common string such that
    if it appeared at list1[i] and list2[j] then i + j should be the minimum
    value among all the other common strings.
     */
    public static void main(String[] args){
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        String[] result = findRestaurant(list1, list2);
        System.out.print("A common string with the least index sum is: ");
        for (String o: result){
            System.out.print(o+" ");
        }
    }
}
