import java.io.File;

import model.Bank;

public class BankTest {

    public static void main(String[] args) {
        Bank bank = new Bank("OTP");

        File file = new File("new_accounts.csv");
        bank.readAccountsFromFile(file);

        System.out.println(bank);
        bank.writeAccountsToFile();
    }

}