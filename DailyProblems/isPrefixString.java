package DailyProblems;

public class isPrefixString {
    public static boolean isPrefixString(String s, String[] words) {
        String checker = "";

        for (int i = 0; i < words.length; i++) {
            checker += words[i];
            if (checker.equals(s)) {
                return true;
            }
        }

        return false;
    }

    /*Given a string s and an array of strings words, determine whether s is a prefix string of words.
A string s is a prefix string of words if s can be made by concatenating the first k strings in words
for some positive k no larger than words.length.
Return true if s is a prefix string of words, or false otherwise.
     */
    public static void main(String[] args){
        String s = "iloveleetcode";
        String[] words ={"i","love","leetcode","apples"};
        System.out.println("String Is a Prefix of Array: "+isPrefixString(s, words));

    }
}
