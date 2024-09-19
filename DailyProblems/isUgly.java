package DailyProblems;

public class isUgly {
    public static boolean isUgly(int n) {
        while (n > 1) {
            if (n % 5 == 0) n = n / 5;
            else if (n % 3 == 0) n = n / 3;
            else if (n % 2 == 0) n = n / 2;
            else break;
        }
        return n == 1;
    }

    public static void main(String[] args){
        int n = 14;
        boolean result = isUgly(n);
        System.out.println("An ugly number is a prime factors are limited to 2, 3, and 5: "+ "number "+n + " is " +result);
    }
}

