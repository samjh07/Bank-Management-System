package main;

import java.util.Scanner;
import model.Account;
import service.BankService;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private BankService bankService = new BankService();

    public void start() {

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("   BANK MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Search Account");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Delete Account");
            System.out.println("7. Check Balance");
            System.out.println("8. Transfer Money");
            System.out.println("9. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice : ");

            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    searchAccount();
                    break;

                case 5:
                    bankService.displayAllAccounts();
                    break;

                case 6:
                    deleteAccount();
                    break;

                case 7:
                    checkBalance();
                    break;

                case 8:
                    transferMoney();
                    break;

                case 9:
                    System.out.println("\nThank you for using Bank Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 9);

        sc.close();
    }

    private void createAccount() {
        try {
            sc.nextLine(); // clear leftover newline

            System.out.print("Enter Holder Name: ");
            String holderName = sc.nextLine();

            System.out.print("Enter Account Type (Savings/Current): ");
            String accountType = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Initial Deposit: ");
            double initialDeposit = sc.nextDouble();

            Account account = bankService.createAccount(holderName, accountType, mobile, email, initialDeposit);

            System.out.println("\nAccount Created Successfully!");
            System.out.println(account);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void depositMoney() {
        try {
            System.out.print("Enter Account Number: ");
            sc.nextLine();
            String accNum = sc.nextLine();

            System.out.print("Enter Amount to Deposit: ");
            double amount = sc.nextDouble();

            boolean success = bankService.deposit(accNum, amount);

            if (success) {
                System.out.println("Deposit Successful.");
            } else {
                System.out.println("Account not found!");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void withdrawMoney() {
        try {
            System.out.print("Enter Account Number: ");
            sc.nextLine();
            String accNum = sc.nextLine();

            System.out.print("Enter Amount to Withdraw: ");
            double amount = sc.nextDouble();

            boolean success = bankService.withdraw(accNum, amount);

            if (success) {
                System.out.println("Withdrawal Successful.");
            } else {
                System.out.println("Account not found!");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void searchAccount() {
        System.out.print("Enter Account Number: ");
        sc.nextLine();
        String accNum = sc.nextLine();

        bankService.findAccount(accNum)
                .ifPresentOrElse(
                        account -> System.out.println(account),
                        () -> System.out.println("Account not found!")
                );
    }

    private void deleteAccount() {
        System.out.print("Enter Account Number: ");
        sc.nextLine();
        String accNum = sc.nextLine();

        boolean success = bankService.deleteAccount(accNum);

        if (success) {
            System.out.println("Account Deleted Successfully.");
        } else {
            System.out.println("Account not found!");
        }
    }

    private void checkBalance() {
        System.out.print("Enter Account Number: ");
        sc.nextLine();
        String accNum = sc.nextLine();

        bankService.findAccount(accNum)
                .ifPresentOrElse(
                        account -> System.out.println("Balance: ₹" + account.getBalance()),
                        () -> System.out.println("Account not found!")
                );
    }

    private void transferMoney() {
        try {
            System.out.print("Enter Sender Account Number: ");
            sc.nextLine();
            String sender = sc.nextLine();

            System.out.print("Enter Receiver Account Number: ");
            String receiver = sc.nextLine();

            System.out.print("Enter Amount to Transfer: ");
            double amount = sc.nextDouble();

            boolean success = bankService.transferMoney(sender, receiver, amount);

            if (success) {
                System.out.println("Transfer Successful.");
            } else {
                System.out.println("One or both accounts not found!");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
