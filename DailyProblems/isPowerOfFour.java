package DailyProblems;

public class isPowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }

    public static void main(String[] args){
        int n = 16;
        boolean result = isPowerOfFour(n);
        System.out.println(n + " is a power of 4 or not: "+ result);
    }
}
