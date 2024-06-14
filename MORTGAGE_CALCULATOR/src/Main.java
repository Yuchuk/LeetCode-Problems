import java.text.NumberFormat;
import java.util.Scanner;

        public class Main {
            public Main() {
            }

            public static void main(String[] args) {
                byte MONTHS_IN_YEAR = 12;
                byte PERCENT = 100;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Mortgage name:");
                String name = scanner.nextLine().toLowerCase();

                while(true) {
                    System.out.print("Principal:");
                    int principal = scanner.nextInt();
                    if (1000 <= principal && principal <= 1000000) {
                        while(true) {
                            System.out.print("Annual Interest Rate:");
                            float annualInterestRate = scanner.nextFloat();
                            if (annualInterestRate >= 0 && annualInterestRate <= 30) {
                                float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;

                                while(true) {
                                    System.out.print("Period:");
                                    byte years = scanner.nextByte();
                                    int numberOfPayments = years * 12;
                                    if (1 <= years && 30 >= years) {
                                        double mortgage = (double)principal * (double)monthlyInterestRate * Math.pow((double)(1 + monthlyInterestRate), (double)numberOfPayments) / (Math.pow((double)(1 + monthlyInterestRate), (double)numberOfPayments) - 1);
                                        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
                                        System.out.println("Your " + name + "'s mortgage is: " + mortgageFormatted);
                                        return;
                                    }

                                    System.out.println("Please enter 1-30");
                                }
                            }

                            System.out.println("Please enter 0-30");
                        }
                    }

                    System.out.println("Please enter $1k - $1M");
                }
            }
        }