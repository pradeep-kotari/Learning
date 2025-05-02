package com.kotari;

public sealed interface Account permits
    CheckingAccount,
    SavingsAccount{
}
