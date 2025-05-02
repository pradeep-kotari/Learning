package com.kotari;

public record SavingsAccount (long accountId, String bankName, double balance) implements Account {

    public SavingsAccount {
        if (accountId <= 0) {
            throw new IllegalArgumentException("Account ID must be positive");
        }
        if (bankName == null || bankName.isEmpty()) {
            throw new IllegalArgumentException("Bank name cannot be null or empty");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
    }

    @Override
    public String toString() {
        return String.format("SavingsAccount(accountId=%d, bankName='%s', balance=%.2f)", accountId, bankName, balance);
    }


}
