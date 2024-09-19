package DailyProblems;
public class restoreString {
    public static String restoreString(String s, int[] indices) {
        char[] shuffledString = new char[indices.length];
        int tempIndex = 0;

        for (int i = 0; i < indices.length; i++) {
            tempIndex = indices[i];
            shuffledString[tempIndex] = s.charAt(i);
        }

        StringBuilder shuffledStringResult = new StringBuilder();

        for (int j = 0; j < shuffledString.length; j++) {
            shuffledStringResult.append(shuffledString[j]);
        }

        return shuffledStringResult.toString();
    }
    /*You are given a string s and an integer array indices of the same length.
    The string s will be shuffled such that the character at the ith position
    moves to indices[i] in the shuffled string.
     */
    public static void main(String[] args){
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String result = restoreString(s, indices);
        System.out.println("Shuffle String: "+ result);
    }
}
