package com.company;
/* Task 3: create a class "BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows the user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows the user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another

 */

public class BankAccount {
    private double balance;

    public BankAccount() {

    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("There is not enough funds.");
    }

    public void printBalance() {
        System.out.println("Your Balance is " + balance);
    }

    public void transferTo(BankAccount bankAccount, double amount) {
        if (balance >= amount) {
            if (amount <= 5000) {
                balance -= amount;
                bankAccount.balance += amount;
            } else {
                System.out.println("Transaction canceled.You are trying to transfer " +
                        amount + " units,but only " + balance + " are available");
            }
        }
    }


}

