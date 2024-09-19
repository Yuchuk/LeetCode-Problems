package DailyProblems;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;;

public class uniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numbersHash = new HashMap<>();
        Set<Integer> numbersSet = new HashSet<>();
        int value = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (numbersHash.containsKey(arr[i])) {
                value = numbersHash.get(arr[i]);
                value++;
                numbersHash.put(arr[i], value);
            } else {
                numbersHash.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numbersHash.entrySet()) {
            if (!numbersSet.add(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean result = uniqueOccurrences(arr);
        System.out.println("Here is result: "+ result);
    }
}

