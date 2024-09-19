package DailyProblems;
import java.util.Stack;

public class clearDigits {
    public static String clearDigits(String s) {
        Stack<Character> letterStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                letterStack.push(s.charAt(i));
            } else {
                letterStack.pop();
            }
        }

        Character[] letterArray = new Character[letterStack.size()];

        for (int j = letterStack.size() - 1; j >= 0; j--) {
            letterArray[j] = letterStack.peek();
            letterStack.pop();
        }

        String result = "";

        for (int k = 0; k < letterArray.length; k++) {
            result += letterArray[k];
        }

        return result;
    }
/*You are given a string s.
Your task is to remove all digits by doing this operation repeatedly:
Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.
 */
    public static void main(String[] args){
        String s = "owe3er122k";
        String result = clearDigits(s);
        System.out.println("Clear Digits:"+result);
    }
}
