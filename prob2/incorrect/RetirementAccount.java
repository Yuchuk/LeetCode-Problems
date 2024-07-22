package prob2.incorrect;

public class RetirementAccount {
    Employee id;
    int accountNumber;
    double balance;

    public RetirementAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    public double withdraw(double amount){
        balance = balance - amount;
        return balance;
    }
}
