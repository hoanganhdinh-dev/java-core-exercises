package week2;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        System.out.println("===== MINI BANK =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice (1-5): ");
        int choice = scanner.nextInt();
        final int CURRENT_BALANCE = 1_000_000;
        switch (choice) {
            case 1:
                System.out.printf("Current balance: %d VND%n", CURRENT_BALANCE);
                break;
            case 2:
                System.out.print("Deposit: ");
                int deposit = scanner.nextInt();
                if (deposit > 0) {
                    int newBalance = deposit + CURRENT_BALANCE;
                    System.out.println("Deposit successful.");
                    System.out.printf("Remaining balance: %d VND%n", newBalance);
                } else {
                    System.out.println("Invalid amount.");
                }
                break;
            case 3:
                System.out.print("Withdraw: ");
                int withdraw = scanner.nextInt();
                if (withdraw <= 0) {
                    System.out.println("Invalid amount.");
                } else if (withdraw > CURRENT_BALANCE) {
                    System.out.println("Insufficient balance.");
                } else {
                    int newBalance = CURRENT_BALANCE - withdraw;
                    System.out.println("Withdraw successful.");
                    System.out.printf("Remaining balance: %d VND%n", newBalance);
                }
                break;
            case 4:
                System.out.print("Transfer: ");
                int transfer = scanner.nextInt();
                if (transfer <= 0) {
                    System.out.println("Invalid amount.");
                } else if (transfer > CURRENT_BALANCE) {
                    System.out.println("Insufficient balance.");
                } else {
                    int newBalance = CURRENT_BALANCE - transfer;
                    System.out.println("Transfer successful.");
                    System.out.printf("Remaining balance: %d VND%n", newBalance);
                }
                break;
            case 5:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
}
