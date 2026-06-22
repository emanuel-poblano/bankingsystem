import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(Account account) {

        accounts.add(account);

        System.out.println(
                "Account created successfully."
        );
    }

    public void displayAccounts() {

        if (accounts.isEmpty()) {

            System.out.println("No accounts found.");

            return;
        }

        for (Account account : accounts) {

            account.displayAccount();
        }
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {

            if (account.getAccountNumber()
                    == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {

            account.deposit(amount);

            System.out.println("Deposit Successful.");

        } else {

            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {

            account.withdraw(amount);

            System.out.println("Withdraw Successful.");

        } else {

            System.out.println("Account not found.");

        }

    }
}