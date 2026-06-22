import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank();

        boolean running = true;

        while (running) {

            System.out.println();

            System.out.println("===== BANKING SYSTEM =====");

            System.out.println("1. Create Account");

            System.out.println("2. View Accounts");

            System.out.println("3. Deposit");

            System.out.println("4. Withdraw");

            System.out.println("5. Exit");

            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print(
                            "Account Number: "
                    );

                    int accountNumber =
                            scanner.nextInt();

                    scanner.nextLine();

                    System.out.print(
                            "Account Holder: "
                    );

                    String accountHolder =
                            scanner.nextLine();

                    Account account =
                            new Account(
                                    accountNumber,
                                    accountHolder
                            );

                    bank.createAccount(account);

                    break;

                case 2:

                    bank.displayAccounts();

                    break;

                case 3:

                    System.out.println("Account Numbers: ");

                    int depositAccount = scanner.nextInt();

                    System.out.println("Amount: ");

                    double depositAmount = scanner.nextDouble();

                    bank.deposit(depositAccount, depositAmount);

                    break;

                case 4:

                    System.out.println("Account Number: ");

                    int withdrawAccount = scanner.nextInt();

                    System.out.println("Amount: ");

                    double withdrawAmount = scanner.nextDouble();

                    bank.withdraw(withdrawAccount, withdrawAmount);

                    break;

                case 5:

                    running = false;

                    break;
            }
        }

        scanner.close();
    }
}