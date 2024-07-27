package DailyProblems;
import java.util.*;

public class relativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> counterHash = new HashMap();
        Set arr2set = new HashSet();
        int[] result = new int[arr1.length];
        int counter = 0;
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (!counterHash.containsKey(arr1[i])) {
                counterHash.put(arr1[i], 1);
            } else {
                counter = counterHash.get(arr1[i]);
                counterHash.put(arr1[i], ++counter);
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            counter = counterHash.get(arr2[j]);

            while (counter > 0) {
                result[k] = arr2[j];
                k++;
                counter--;
            }
        }

        for (int l = 0; l < arr2.length; l++) {
            arr2set.add(arr2[l]);
        }

        Arrays.sort(arr1);
        for (int m = 0; m < arr1.length; m++) {
            if (!arr2set.contains(arr1[m])) {
                result[k] = arr1[m];
                k++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr1 ={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 ={2,1,4,3,9,6};
        int[] result = relativeSortArray(arr1, arr2);
        /* Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
        Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order
         */
        System.out.print("Relative Sort Array: "+"[");
        for (int i: result){
            System.out.print(i+" ");
        }
        System.out.println("]");
    }
}
