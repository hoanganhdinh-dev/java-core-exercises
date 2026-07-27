package week4;

import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int INITIAL_BALANCE = 5_000_000;
        int balance = INITIAL_BALANCE;
        int choice;
        do {
            System.out.println("========= ATM MENU =========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("============================");
            System.out.print("Choose(1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Current balance: %,d VND%n", balance);
                    break;
                case 2: {
                    System.out.print("Enter deposit amount: ");
                    int amount = scanner.nextInt();
                    if (amount <= 0) {
                        System.out.println("Invalid amount.");
                    } else {
                        balance += amount;
                        System.out.println("Deposit successful.");
                        System.out.printf("Current balance: %,d VND%n", balance);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter withdraw amount: ");
                    int amount = scanner.nextInt();
                    if (amount <= 0) {
                        System.out.println("Invalid amount.");
                    } else {
                        if (amount <= balance) {
                            balance -= amount;
                            System.out.println("Withdraw successful.");
                            System.out.printf("Current balance: %,d VND%n", balance);
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                    }
                    break;
                }
                case 4:
                    System.out.println("Thank you for using our ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
/*
 * ========================================
 * PROGRAM FLOW
 * ========================================
 *
 * Start
 *   │
 *   ├── INITIAL_BALANCE = 5,000,000
 *   │
 *   ├── balance = INITIAL_BALANCE
 *   │
 *   ├── do
 *   │      │
 *   │      ├── Display ATM Menu
 *   │      │
 *   │      ├── User chooses an option
 *   │      │
 *   │      ├── Choice == 1 ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Display current balance
 *   │      │
 *   │      ├── Choice == 2 ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Enter deposit amount
 *   │      │       │
 *   │      │   amount > 0 ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   balance += amount
 *   │      │       │
 *   │      │   Deposit successful
 *   │      │
 *   │      │      No
 *   │      │       │
 *   │      │   Invalid amount
 *   │      │
 *   │      ├── Choice == 3 ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Enter withdraw amount
 *   │      │       │
 *   │      │   amount > 0 ?
 *   │      │       │
 *   │      │      No
 *   │      │       │
 *   │      │   Invalid amount
 *   │      │
 *   │      │      Yes
 *   │      │       │
 *   │      │   amount <= balance ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   balance -= amount
 *   │      │       │
 *   │      │   Withdraw successful
 *   │      │
 *   │      │      No
 *   │      │       │
 *   │      │   Insufficient balance
 *   │      │
 *   │      ├── Choice == 4 ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Thank you for using our ATM.
 *   │      │
 *   │      └── Otherwise
 *   │              │
 *   │          Invalid choice
 *   │
 *   └── choice != 4 ?
 *          │
 *         Yes
 *          │
 *      Repeat loop
 *          │
 *         No
 *          │
 *         End
 *
 * ========================================
 */
/* ========================================
 * PURPOSE
 * ========================================
 *
 * - Practice do-while loops.
 * - Practice switch-case menu handling.
 * - Update and manage account balance.
 * - Validate user input before processing transactions.
 *
 * ----------------------------------------
 * BEST PRACTICES
 * ----------------------------------------
 *
 * - Use constants for fixed values.
 * - Validate all user input.
 * - Keep variables inside the smallest possible scope.
 * - Close Scanner before exiting the program.
 *
 * ----------------------------------------
 * FUTURE IMPROVEMENTS
 * ----------------------------------------
 *
 * - Add transfer money feature.
 * - Add transaction history.
 * - Format currency output.
 * - Require PIN authentication before accessing the ATM.
 *
 * ----------------------------------------
 * KEY TAKEAWAYS
 * ----------------------------------------
 *
 * ✓ do-while is suitable for menu-driven programs.
 * ✓ switch-case makes menu handling clearer.
 * ✓ Validate data before updating balance.
 * ✓ Keep variables in the smallest possible scope.
 * ✓ Update balance immediately after each successful transaction.
 */
