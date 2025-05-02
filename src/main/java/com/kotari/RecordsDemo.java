package com.kotari;

import java.util.Map;

public class RecordsDemo {
    public static void main(String[] args) {
        // Creating a record instance
        SavingsAccount account = new SavingsAccount(123456789L, "Savings", 1000.00);

        Map<Account, SavingsAccount> accountMap = Map.of(
                account, account
        );

        // Accessing record fields
        System.out.println("Account ID: " + account.accountId());
        System.out.println("Bank Name: " + account.bankName());
        System.out.println("Balance: " + account.balance());

        // Records automatically implement toString(), equals(), and hashCode()
        System.out.println(account);
    }
}
