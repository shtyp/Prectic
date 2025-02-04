package org.college.practice2.task8primer;

class BankBalanceVisitor implements BankAccountVisitor {
    public String visitBankAccount(BankAccount account) {
        return "Balance check: " + account;
    }
}
