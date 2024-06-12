import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public class Main {
            public static void main(String[] args) {
                final byte MONTHS_IN_YEAR = 12;
                final byte PERCENT = 100;

                int principal;
                float annualInterestRate;
                float monthlyInterestRate;
                double mortgage;

                Scanner scanner = new Scanner(System.in);

                System.out.print("Mortgage name:");
                String name = scanner.nextLine().toLowerCase();

                while(true){
                    System.out.print("Principal:");
                    principal = scanner.nextInt();
                    if(1_000 <= principal && principal <= 1_000_000){
                        break;
                    }
                    else{
                        System.out.println("Please enter $1k - $1M");
                    }
                }

                while(true){
                    System.out.print("Annual Interest Rate:");
                    annualInterestRate = scanner.nextFloat();
                    if(annualInterestRate >= 0 && annualInterestRate <= 30){
                        monthlyInterestRate = annualInterestRate/MONTHS_IN_YEAR/PERCENT;
                        break;
                    }
                    else{
                        System.out.println("Please enter 0-30");
                    }
                }

                while(true){
                    System.out.print("Period:");
                    byte years = scanner.nextByte();
                    int numberOfPayments = years *MONTHS_IN_YEAR;
                    if(1 <= years && 30 >= years){
                        mortgage = principal * (monthlyInterestRate * Math.pow(1+monthlyInterestRate, numberOfPayments))/(Math.pow(1+monthlyInterestRate, numberOfPayments)-1);
                        break;
                    }
                    else{
                        System.out.println("Please enter 1-30");
                    }
                }

                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.println("Your " + name + "'s " + "mortgage is: " + mortgageFormatted);
            }
        }