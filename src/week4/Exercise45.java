package week4;

import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean hasInput = false;
        int choice;
        do {
            System.out.println("===== NUMBER MANAGEMENT =====");
            System.out.println("1. Enter an integer");
            System.out.println("2. Check even or odd");
            System.out.println("3. Check prime number");
            System.out.println("4. Calculate the sum from 1 to n");
            System.out.println("5. Exit");
            System.out.println("=============================");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter an integer: ");
                    number = scanner.nextInt();
                    hasInput = true;
                    break;
                case 2:
                    if (hasInput) {
                        if (number % 2 == 0) {
                            System.out.printf("%d is an even number.%n", number);
                        } else {
                            System.out.printf("%d is an odd number.%n", number);
                        }
                    } else {
                        System.out.println("Please enter a number first.");
                    }
                    break;
                case 3:
                    if (hasInput) {
                        if (number <= 1) {
                            System.out.println(number + " is not a prime number.");
                        } else {
                            int i = 2;
                            boolean isPrime = true;
                            while (i < number) {
                                if (number % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                                i++;
                            }
                            if (isPrime) {
                                System.out.println(number + " is a prime number.");
                            } else {
                                System.out.println(number + " is not a prime number.");
                            }
                        }
                    } else {
                        System.out.println("Please enter a number first.");
                    }
                    break;
                case 4:
                    if (hasInput) {
                        if (number <= 0) {
                            System.out.println("Invalid input.");
                        } else {
                            int j = 1;
                            int totalSum = 0;
                            while (j <= number) {
                                totalSum += j;
                                j++;
                            }
                            System.out.printf("The sum from 1 to %d is %d.%n", number, totalSum);
                        }
                    } else {
                        System.out.println("Please enter a number first.");
                    }
                    break;
                case 5:
                    System.out.println("Program terminated.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 5);
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
 *   ├── Display menu
 *   │
 *   ├── User selects an option
 *   │
 *   ├── switch(choice)
 *   │      │
 *   │      ├── Case 1
 *   │      │      ├── Input number
 *   │      │      └── hasInput = true
 *   │      │
 *   │      ├── Case 2
 *   │      │      ├── Check hasInput
 *   │      │      ├── Even
 *   │      │      └── Odd
 *   │      │
 *   │      ├── Case 3
 *   │      │      ├── Check hasInput
 *   │      │      ├── Check number <= 1
 *   │      │      └── Check prime
 *   │      │
 *   │      ├── Case 4
 *   │      │      ├── Check hasInput
 *   │      │      ├── Check number > 0
 *   │      │      └── Calculate sum
 *   │      │
 *   │      ├── Case 5
 *   │      │      └── Exit
 *   │      │
 *   │      └── Default
 *   │             └── Invalid choice
 *   │
 *   └── choice != 5 ?
 *          │
 *         Yes
 *          │
 *      Repeat menu
 *          │
 *         No
 *          │
 *         End
 *
 * ========================================
 */
/*
 * ========================================
 * EXERCISE 45 - LESSONS LEARNED
 * ========================================
 *
 * PURPOSE
 * - Practice menu-driven programming using do-while and switch-case.
 * - Apply while loops to solve different problems.
 * - Manage program state using a boolean variable.
 *
 * ----------------------------------------
 *
 * BUG HISTORY
 *
 * 1. Scanner
 * Mistake:
 * - Created Scanner inside the do-while loop.
 *
 * Why:
 * - A new Scanner object was created on every iteration.
 *
 * Solution:
 * - Create Scanner only once before the loop.
 * - Close Scanner before the program exits.
 *
 * Lesson:
 * - Reuse resources instead of creating them repeatedly.
 *
 * ----------------------------------------
 *
 * 2. Boolean Comparison
 * Mistake:
 * - Used:
 *     if (hasInput = true)
 *
 * Why:
 * - '=' assigns a value instead of comparing it.
 * - The condition always becomes true.
 *
 * Solution:
 * - Use:
 *     if (hasInput)
 * or
 *     if (hasInput == true)
 *
 * Lesson:
 * - '=' is assignment.
 * - '==' is comparison.
 * - Prefer:
 *     if (hasInput)
 *
 * ----------------------------------------
 *
 * 3. Prime Number
 * Mistake:
 * - Used:
 *     while (i <= number)
 *
 * Why:
 * - When i == number:
 *     number % number == 0
 * - Every prime number became non-prime.
 *
 * Solution:
 * - Use:
 *     while (i < number)
 *
 * Lesson:
 * - Always think carefully about loop boundaries.
 *
 * ----------------------------------------
 *
 * 4. Missing else
 * Mistake:
 * - Printed the error message but forgot the else block.
 *
 * Why:
 * - The program continued executing after reporting an error.
 *
 * Solution:
 * - Put the normal logic inside the else block.
 *
 * Lesson:
 * - Invalid conditions should stop the normal execution flow.
 *
 * ----------------------------------------
 *
 * BEST PRACTICES
 *
 * - Create Scanner only once.
 * - Close Scanner before exiting the program.
 * - Use meaningful output messages.
 * - Use:
 *     if (hasInput)
 *   instead of:
 *     if (hasInput == true)
 * - Always add a default case in switch statements.
 *
 * ----------------------------------------
 *
 * Future Improvements
 *
 * - Learn Guard Clause.
 * - Refactor this exercise using methods.
 * - Optimize prime checking using Math.sqrt(number).
 *
 * ----------------------------------------
 *
 * KEY TAKEAWAYS
 *
 * ✓ Create Scanner only once.
 * ✓ Think carefully about loop boundaries.
 * ✓ '=' assigns, '==' compares.
 * ✓ Invalid input should stop the normal flow.
 * ✓ Write code first, then improve its quality.
 *
 * ========================================
 */
