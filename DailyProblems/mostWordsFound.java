package DailyProblems;

public class mostWordsFound {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        int subLength = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] sub = sentences[i].split(" ");
            subLength = sub.length;
            max = Math.max(max, subLength);
        }
        return max;
    }
    /*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
     You are given an array of strings sentences, where each sentences[i] represents a single sentence.
     */
    public static void main(String[] args){
        String[] sentences = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
        int result = mostWordsFound(sentences);
        System.out.println("Maximum Number of Words Found in Sentences: "+ result);
    }
}
