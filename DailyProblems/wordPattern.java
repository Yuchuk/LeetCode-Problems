package DailyProblems;

import java.util.HashMap;
import java.util.Map;

public class wordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, Integer> patternHashMap = new HashMap<>();
        Map<String, Integer> sHashMap = new HashMap<>();
        String[] sArray = s.split(" ");

        if (pattern.length() != sArray.length) return false;

        for (int i = 0; i < sArray.length; i++) {
            if (!patternHashMap.containsKey(pattern.charAt(i)) && !sHashMap.containsKey(sArray[i])) {
                patternHashMap.put(pattern.charAt(i), i);
                sHashMap.put(sArray[i], i);
            } else if (patternHashMap.containsKey(pattern.charAt(i)) && sHashMap.containsKey(sArray[i])) {
                if (!patternHashMap.get(pattern.charAt(i)).equals(sHashMap.get(sArray[i]))) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
    /*Given a pattern and a string s, find if s follows the same pattern.
    Here follow means a full match, such that there is a bijection
    between a letter in pattern and a non-empty word in s
     */
    public static void main(String [] args){
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        System.out.println("Word Pattern:"+result);
    }
}
