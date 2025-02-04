package org.college.practice2.task8primer;

class BankAccount {
    private User client;
    private Administrator admin;
    private double currentBalance;
    private double blockedBalance;
    private BankAccountType type;

    public BankAccount(User client, Administrator admin, double currentBalance, double blockedBalance, BankAccountType type) {
        this.client = client;
        this.admin = admin;
        this.currentBalance = currentBalance;
        this.blockedBalance = blockedBalance;
        this.type = type;
    }

    public String accept(BankAccountVisitor visitor) {
        return visitor.visitBankAccount(this);
    }
}
