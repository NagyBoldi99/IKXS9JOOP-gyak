package model;

import java.io.Serializable;

public class BankAccount implements Serializable{

	private static final long serialVersionUID = 3113204636110503365L;
    private long accountNumber;
    private int balance;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0; // nem kotelezo
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        } else {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "\n\tBankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }
}
