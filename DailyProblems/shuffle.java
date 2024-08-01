package DailyProblems;

public class shuffle {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int indexResult = 0;

        for (int i = 0; i < n; i++) {
            result[indexResult] = nums[i];
            indexResult++;
            result[indexResult] = nums[i + n];
            indexResult++;
        }
        return result;
    }
/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
    public static void main(String[] args){
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] result = shuffle(nums, n);
        System.out.print("Shuffle the Array: ");
        System.out.print("{");
        for(int i = 0; i < result.length; i++){
            System.out.print(i+" ");
        }
        System.out.print("}");
    }
}
