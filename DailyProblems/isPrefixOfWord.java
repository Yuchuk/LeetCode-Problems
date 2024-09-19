package DailyProblems;

public class isPrefixOfWord {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String tempS = "";
        int lastIndexOfS = searchWord.length();
        String[] arrayOfSentence = sentence.split(" ");

        for (int i = 0; i < arrayOfSentence.length; i++) {
            tempS = arrayOfSentence[i];
            if (tempS.length() >= searchWord.length() && tempS.substring(0, lastIndexOfS).equals(searchWord)) {
                return ++i;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        String sentence = "this problem is an easy problem";
        String searchWord = "pro";
        int result = isPrefixOfWord(sentence, searchWord);
        System.out.println("Check If a Word Occurs As a Prefix of Any Word in a Sentence: "+result);
    }
}
