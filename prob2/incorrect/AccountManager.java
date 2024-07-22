package prob2.incorrect;

import java.util.List;

public class AccountManager {
    public static void main(String []args){
        //TODO Create employees with account
        Employee employee = new Employee(1, "Chuka");
        CheckingAccount checkingAccounts = new CheckingAccount(123, 500);
        SavingsAccount savingAccounts = new SavingsAccount(124, 1000);
        RetirementAccount retirementAccounts = new RetirementAccount(125, 2000);
        employee.addCheckingAccount(checkingAccounts);
        employee.addSavingAccount(savingAccounts);
        employee.addRetirementAccount(retirementAccounts);
        //TODO Call computeAccountBalanceSum function
        computeAccountBalanceSum();
    }
    public static double computeAccountBalanceSum(List<Employee> employeeList) {

        double sum = 0;
        for(Employee employee : employeeList){
            for(CheckingAccount account: employee.getCheckingAccounts()){
                sum += account.getBalance();
            }
            for(SavingsAccount account: employee.getSavingAccounts()){
                sum += account.getBalance();
            }
            for(RetirementAccount account: employee.getRetirementAccounts()){
                sum += account.getBalance();
            }
        }
        return sum;
    }
}
