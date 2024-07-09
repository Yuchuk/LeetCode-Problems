import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int minInt = Integer.MAX_VALUE;
    static int averageSum = -1;
    static int row = 0;
    static int col = 0;

    static int min(int [] arrayOfInts) {
        for (int arrayOfInt : arrayOfInts) {
            minInt = Math.min(minInt, arrayOfInt);
        }
        return minInt;
    }

    static int averageOfArray(int [] arrayOfInts){
        for (int arrayOfInt : arrayOfInts) {
            averageSum += arrayOfInt;
        }
        return averageSum / arrayOfInts.length;
    }

    static String convertCharacterText(String text){
        StringBuilder result = new StringBuilder(text);
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                result.setCharAt(i, Character.toLowerCase(result.charAt(i)));
            } else if (ch >= 'a' && ch <= 'z') {
                result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

        // 1. outputs the minimum of an array of ints
        min(arrayOfInts);
        System.out.println("Min element of array: " + minInt);

        // 2. average of the numbers in the array
        averageOfArray(arrayOfInts);
        System.out.println("Average of Array: " + averageOfArray(arrayOfInts));

        // 3.prints out the sentence with all uppercase letters changed to lowercase and all lowercase letters changed to uppercase
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert your text:");
        String text = scanner.nextLine();
        convertCharacterText(text);
        System.out.println("Converted letter: "+convertCharacterText(text));

        // 4.
        for(int i = 0; i < 5; ++i){
            for(int j = 0; j <= i; ++j){
                System.out.printf("%-3s","*");
            }
            System.out.println();
        }



    }
    }