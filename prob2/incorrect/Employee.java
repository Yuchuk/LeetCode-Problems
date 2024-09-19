package prob2.incorrect;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    Integer id;
    String name;
    List<CheckingAccount> checkingAccounts;
    List<SavingsAccount> savingAccounts;
    List<RetirementAccount> retirementAccounts;

    public Employee(Integer id, String name){
        this.id = id;
        this.name = name;
        checkingAccounts = new ArrayList<>();
        savingAccounts = new ArrayList<>();
        retirementAccounts = new ArrayList<>();
    }
    public void addCheckingAccount(CheckingAccount checkingAccount){
        checkingAccounts.add(checkingAccount);
    }

    public void addSavingAccount(SavingsAccount savingAccount){
        savingAccounts.add(savingAccount);
    }

    public void addRetirementAccount(RetirementAccount retirementAccount){
        retirementAccounts.add(retirementAccount);
    }
    public static double computeAccountBalanceSum(List<Employee> employeeList){
        double sum = 0;

        return sum;
    }

    public List<CheckingAccount> getCheckingAccounts(){
        return checkingAccounts;
    }
    public void setCheckingAccounts(List<CheckingAccount> checkingAccounts){
        this.checkingAccounts = checkingAccounts;
    }
    public List<SavingsAccount> getSavingAccounts(){
        return savingAccounts;
    }
    public List<RetirementAccount> getRetirementAccounts(){
        return retirementAccounts;
    }

}