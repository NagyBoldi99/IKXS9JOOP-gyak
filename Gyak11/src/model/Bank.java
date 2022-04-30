package model;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<BankAccount> bankAccounts = new ArrayList<>();
    private String name;

    public Bank(String name) {
        this.name = name;
        File file = new File(name + ".bin");
        if (file.exists()) {
            readAccountsFromBinary(file);
        }
    }

    public void addAccount(long accountNumber) throws AccountNumberAlreadyInUseException {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber() == accountNumber) {
                throw new AccountNumberAlreadyInUseException();
            }
        }
        this.bankAccounts.add(new BankAccount(accountNumber));
    }

    public void addAccount(long accountNumber, int initialAmount) throws AccountNumberAlreadyInUseException {
        addAccount(accountNumber);
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(initialAmount);
                return;
            }
        }
    }

    public int deposit(long accountNumber, int amount) throws NoSuchAccountException {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                return account.getBalance();
            }
        }
        throw new NoSuchAccountException(accountNumber);
    }

    public int withdraw(long accountNumber, int amount) throws NoSuchAccountException, InsufficientFundsException {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                return account.getBalance();
            }
        }
        throw new NoSuchAccountException(accountNumber);
    }

    public int getBalance(long accountNumber) throws NoSuchAccountException {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account.getBalance();
            }
        }
        throw new NoSuchAccountException(accountNumber);
    }

    public void writeAccountsToFile() {
        File file = new File(name + ".csv");
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (BankAccount account : bankAccounts) {
                fileWriter.write(account.getAccountNumber() + ";" + account.getBalance() + "\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readAccountsFromFile(File file) {
        try (FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitLine = line.split(";");
                long accountNumber = Long.parseLong(splitLine[0]);
                int balance = Integer.parseInt(splitLine[1]);
                this.addAccount(accountNumber, balance);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AccountNumberAlreadyInUseException e) {
            e.printStackTrace();
        }
    }

    public void writeAccountsToBinary() {
        File file = new File(name + ".bin");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            for (BankAccount a : bankAccounts) {
                objectOutputStream.writeObject(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readAccountsFromBinary(File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Object o;
            while ((o = objectInputStream.readObject()) != null) {
                if (o instanceof BankAccount) {
                    BankAccount account = (BankAccount) o;
                    addAccount(account.getAccountNumber(), account.getBalance());
                }
            }
        } catch (EOFException exc) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (AccountNumberAlreadyInUseException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void sortAccounts() {
        bankAccounts.sort((a, b) -> Long.compare(a.getAccountNumber(), b.getAccountNumber()));
    }

    @Override
    public String toString() {
        sortAccounts();
        return "Bank [" + "name=" + name + " ,bankAccounts=" + bankAccounts + "]";
    }
	
}
