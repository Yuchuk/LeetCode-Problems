package DailyProblems;

public class addDigits {
    public static int addDigits(int num) {
        int sum = 0;
        int lastDigit = -1;

        while (num > 0) {
            lastDigit = num % 10;
            num = num / 10;
            sum += lastDigit;

            if (num == 0 && sum < 10) {
                return sum;
            } else if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int num = 38;
        int result = addDigits(num);
        System.out.println("Add digits of num:" + result);
    }
}
