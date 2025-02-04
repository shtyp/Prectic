package org.college.practice2.task8primer;

class BankAccountInspector implements BankAccountVisitor {
    public String visitBankAccount(BankAccount account) {
        return "Inspecting bank account: " + account;
    }
}
