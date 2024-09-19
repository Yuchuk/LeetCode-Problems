package DailyProblems;

public class prefixCount {
    public static int prefixCount(String[] words, String pref) {
        int counter = 0;
        String temp = "";
        int firstLetterIndex = 0;
        int lastLetterIndex = 0;

        for (int i = 0; i < words.length; i++) {
            temp = words[i];
            lastLetterIndex = pref.length();
            if (lastLetterIndex <= temp.length() && temp.substring(0, lastLetterIndex).equals(pref)) {
                counter++;
            }
        }
        return counter;

    }
    /*You are given an array of strings words and a string pref.
    Return the number of strings in words that contain pref as a prefix.
    A prefix of a string s is any leading contiguous substring of s.
     */
    public static void main(String[] args){
        String[] words = {"pay","pattention","practice","attend","atu"};
        String pref = "at";
        int result = prefixCount(words, pref);
        System.out.println("Counting Words With a Given Prefix: "+result);
    }
}
