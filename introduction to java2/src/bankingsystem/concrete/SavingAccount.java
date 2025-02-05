package bankingsystem.concrete;

import bankingsystem.service.Account;

public class SavingAccount implements Account {

    @Override
    public void accountType() {
        System.out.println("For general users");
    }

    @Override
    public void interestRate() {
        System.out.println("Interest rate 7%");
    }
}
