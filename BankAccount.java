package com.example;

public class BankAccount {
	    protected String accountNumber;
	    protected double balance;

	    public BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited " + amount + ". New balance: " + balance);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
	        } else {
	            System.out.println("Insufficient funds or invalid amount.");
	        }
	    }

	    public static void main(String[] args) {
	        SavingsAccount savings = new SavingsAccount("SA123", 1000, 0.03);
	        CurrentAccount current = new CurrentAccount("CA456", 500, 500);

	        savings.deposit(200);
	        savings.addInterest();
	        savings.withdraw(300);
	        System.out.println("Savings Account Balance: " + savings.balance);

	        current.deposit(500);
	        current.withdraw(1200);
	        System.out.println("Current Account Balance: " + current.balance);
	    }
	}

	class SavingsAccount extends BankAccount {
	    private double interestRate;

	    public SavingsAccount(String accountNumber, double balance, double interestRate) {
	        super(accountNumber, balance);
	        this.interestRate = interestRate;
	    }

	    public void addInterest() {
	        double interest = balance * interestRate;
	        balance += interest;
	        System.out.println("Interest added: " + interest + ". New balance: " + balance);
	    }
	}

	class CurrentAccount extends BankAccount {
	    private double overdraftLimit;

	    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
	        super(accountNumber, balance);
	        this.overdraftLimit = overdraftLimit;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance + overdraftLimit) {
	            balance -= amount;
	            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
	        } else {
	            System.out.println("Exceeded overdraft limit or invalid amount.");
	        }
	    }
	}
