package week2;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        System.out.println("===== ATM =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice (1-3): ");
        int choice = scanner.nextInt();
        final int CURRENT_BALANCE = 1_000_000;
        switch (choice) {
            case 1:
                System.out.printf("Current balance: %d VND%n", CURRENT_BALANCE);
                break;
            case 2:
                System.out.print("Enter deposit: ");
                int deposit = scanner.nextInt();
                if (deposit <= 0) {
                    System.out.println("Invalid deposit amount.");
                    scanner.close();
                    return;
                }
                int newBalance = CURRENT_BALANCE + deposit;
                System.out.printf("New balance: %d VND%n", newBalance);
                break;
            case 3:
                System.out.print("Enter withdraw: ");
                int withdraw = scanner.nextInt();
                if (withdraw <= 0) {
                    System.out.println("Invalid withdrawal amount.");
                    scanner.close();
                    return;
                }
                if (withdraw <= CURRENT_BALANCE) {
                    int remainingBalance = CURRENT_BALANCE - withdraw;
                    System.out.println("Withdraw successful.");
                    System.out.printf("Remaining balance: %d VND%n", remainingBalance);
                } else {
                    System.out.println("Insufficient balance.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
}
