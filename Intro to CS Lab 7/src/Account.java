//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************

import java.util.Random;
import java.lang.Math;

public class Account
{
    private double balance;
    private String name;
    private long acctNum;

    //-------------------------------------------------
    //Constructors
    //-------------------------------------------------
    // initializes balance, owner, and account number
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    // initializes balance and owner, generates random account number
    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
        acctNum = generateRandNumber();
    }
    // initializes owner, initializes balance as 0, and generates random account number
    public Account(String owner) {
        balance = 0;
        name = owner;
        acctNum = generateRandNumber();
    }

    //-------------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //-------------------------------------------------
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }
    // Overloaded withdraw method including a deducting fee
    public void withdraw(double amount, double fee) {
        if (balance >= (amount + fee))
            balance -= (amount + fee);
        else
            System.out.println("Insufficient funds (including fee)");
    }
    //-------------------------------------------------
    // Adds deposit amount to balance.
    //-------------------------------------------------
    public void deposit(double amount) {
        balance += amount;
    }
    //-------------------------------------------------
    // Returns balance.
    //-------------------------------------------------
    public double getBalance() {
        return balance;
    }
    //-------------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //-------------------------------------------------
    public String toString() {
        return "Name: " + name +
                "\nAccount Number: " + acctNum +
                "\nBalance: " + balance;
    }
    // Generates a random account number
    private long generateRandNumber()
    {
        Random rand = new Random();
        return Math.abs(rand.nextLong());
    }
}