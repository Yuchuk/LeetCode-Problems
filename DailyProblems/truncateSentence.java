package DailyProblems;

public class truncateSentence {
    public static String truncateSentence(String s, int k) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                counter++;
            }
            if (counter == k) {
                return s.substring(0, i);
            }
        }
        return s;
    }
/*You are given a sentence s and an integer k.
 You want to truncate s such that it contains only the first k words.
 Return s after truncating it.
 */
    public static void main(String[] args){
        String s = "Hello how are you Contestant";
        int k = 4;
        String result = truncateSentence(s, k);
        System.out.println("Truncated Sentence: "+ result);
    }
}
