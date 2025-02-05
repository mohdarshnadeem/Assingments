package bankingsystem.concrete;

import bankingsystem.service.Account;

public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("For bussiness and traders");
    }

    @Override
    public void interestRate() {
        System.out.println("No interest");
    }
}
