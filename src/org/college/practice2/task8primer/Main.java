package org.college.practice2.task8primer;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("USA", "California", "Los Angeles", "Main St", "10", "90001");
        User user = new User("John", "Doe", LocalDateTime.of(1990, 5, 15, 0, 0), address);
        Administrator admin = new Administrator("Finance", LocalDateTime.of(2015, 3, 10, 0, 0));
        BankAccount account = new BankAccount(user, admin, 5000.00, 200.00, BankAccountType.PREMIUM);

        BankAccountVisitor inspector = new BankAccountInspector();
        System.out.println(account.accept(inspector));

        BankAccountVisitor balanceChecker = new BankBalanceVisitor();
        System.out.println(account.accept(balanceChecker));
    }
}
