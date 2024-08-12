package DailyProblems;

public class findKthPositive {
    public static int findKthPositive(int[] arr, int k) {
        int counter = 1;
        int missingNumber = 1;
        int i = 0;

        while (counter <= k) {
            if (i < arr.length && arr[i] == missingNumber) {
                i++;
                missingNumber++;
            } else {
                if (counter == k) {
                    return missingNumber;
                } else {
                    counter++;
                    missingNumber++;
                }
            }
        }
        return missingNumber;
    }
    /*Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.
     */
    public static void main(String[] args){
        int[] arr = {2,3,4,8,12};
        int k = 7;
        int result = findKthPositive(arr, k);
        System.out.println("Kth Missing Positive Number: "+ result);
    }
}
