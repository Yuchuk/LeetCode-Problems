package Lab.src;

import java.sql.SQLOutput;

public class MergeSort {

    public static int [] MergeSort(int[] s){
        if(s.length > 1){
            int n = s.length;
            int[]  s1 = new int[n/2];
            int[]  s2 = new int[n - s1.length];
            partition(s, s1, s2);

            MergeSort(s1);
            MergeSort(s2);

            merge(s, s1, s2);
        }

        return s;
    }

    private static void partition(int[] s, int[] s1, int[] s2){

        for(int i = 0; i < s.length; i++) {
            if (i < s1.length) {
                s1[i] = s[i];
            } else {
                s2[i - s1.length] = s[i];
            }
        }
    }

    private static void merge(int[] s, int[] s1, int[] s2){
        int n = s.length;

        for(int j = 0, s1I = 0, s2I = 0; j < n; j++){
            if(s2I >= s2.length){
                s[j] = s1[s1I];
                s1I++;
            } else if(s1I >= s1.length){
                s[j] = s2[s2I];
                s2I++;
            } else {
                if(s1[s1I] < s2[s2I]){
                    s[j] = s1[s1I];
                    s1I++;
                }
                else {

                    s[j] = s2[s2I];
                    s2I++;
                }

            }

        }

    }


}
