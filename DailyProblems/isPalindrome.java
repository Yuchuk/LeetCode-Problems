package DailyProblems;
public class isPalindrome {
    public static boolean isPalindromeS(String s) {

        String newS = s.replaceAll("\\W", "").toLowerCase().trim();
        newS = newS.replaceAll("_", "");
        int i = 0;
        int j = newS.length() - 1;

        while (i < j) {
            if (newS.charAt(i) != newS.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        if (isPalindromeS("ab_a")) {
            System.out.println("S is palindrome");
        } else {
            System.out.println("S is not palindrome");
        }
    }
}
