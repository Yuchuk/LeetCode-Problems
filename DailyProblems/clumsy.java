package DailyProblems;
import java.util.Stack;

public class clumsy {
    public static int clumsy(int n) {
        Stack<Integer> clumsyStack = new Stack<>();
        int operation = 0;
        int clumsyResult = 0;

        clumsyStack.push(n);
        for (int i = n - 1; i > 0; --i) {
            if (operation == 0) {
                clumsyStack.push(clumsyStack.pop() * i);
            } else if (operation == 1) {
                clumsyStack.push(clumsyStack.pop() / i);
            } else if (operation == 2) {
                clumsyStack.push(i);
            } else {
                clumsyStack.push(-i);
            }
            operation = (operation + 1) % 4;
        }
        while (!clumsyStack.isEmpty()) {
            clumsyResult += clumsyStack.pop();
        }
        return clumsyResult;
    }
    public static void main(String[] args){
        int n = 10;
        int result = clumsy(n);
        System.out.println("Clumsy factorial of "+ n + " is: "+result);
    }
}
