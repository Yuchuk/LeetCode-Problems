package DailyProblems;

public class arrayStringsAreEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordOneStringBuilder = new StringBuilder();
        StringBuilder wordTwoStringBuilder = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            wordOneStringBuilder.append(word1[i]);
        }
        for (int j = 0; j < word2.length; j++) {
            wordTwoStringBuilder.append(word2[j]);
        }

        String word1s = wordOneStringBuilder.toString();
        String word2s = wordTwoStringBuilder.toString();

        if (word1s.compareTo(word2s) == 0) return true;
        else return false;
    }
    public static void main(String[] args){
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println("Represent the same string: " + arrayStringsAreEqual(word1, word2));
    }
}
