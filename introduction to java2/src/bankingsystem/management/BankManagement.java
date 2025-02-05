package bankingsystem.management;

import bankingsystem.factory.AccountFactory;
import bankingsystem.service.Account;

import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("<------------------Welcome to our Bank----------------->");
            System.out.print("Enter account type:");
            String accountType = sc.nextLine();

            Account account = AccountFactory.createAccount(accountType);
            account.accountType();
            account.interestRate();
        }
//        sc.close();
    }
}
