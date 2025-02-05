package bankingsystem.factory;

import bankingsystem.concrete.CurrentAccount;
import bankingsystem.concrete.SavingAccount;
import bankingsystem.service.Account;

public class AccountFactory {
    public static Account createAccount(String type){
        if(type.equalsIgnoreCase("Saving")){
            return new SavingAccount();
        } else if (type.equalsIgnoreCase("Current")) {
            return new CurrentAccount();
        } else {
            throw new IllegalArgumentException("Invalid account type");
        }
    }
}
