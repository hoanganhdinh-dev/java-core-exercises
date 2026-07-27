package week4;

import java.util.Scanner;

/*
 * ========================================
 * Exercise 48 — Login Authentication System
 * ========================================
 *
 * Description:
 * Create a simple login system that allows
 * users to enter username and password.
 *
 * Rules:
 * - Maximum 3 login attempts.
 * - Lock account after failed attempts.
 *
 * Concepts:
 * - Scanner
 * - do-while loop
 * - boolean flag
 * - String comparison
 * - Constants
 */

public class Exercise48 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String CORRECT_USERNAME = "admin";
        final String CORRECT_PASSWORD = "123456";
        final int MAX_ATTEMPTS = 3;

        int attempts = 0;
        boolean loginSuccess = false;

        do {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(CORRECT_USERNAME)
                    && password.equals(CORRECT_PASSWORD)) {

                System.out.println("Login successful.");
                loginSuccess = true;

            } else {

                System.out.println("Invalid username or password.");
                attempts++;

                System.out.println("Remaining attempts: "
                        + (MAX_ATTEMPTS - attempts));
            }

        } while (!loginSuccess && attempts < MAX_ATTEMPTS);


        if (!loginSuccess) {
            System.out.println("Account locked.");
        }

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
 *   ├── CORRECT_USERNAME = "admin"
 *   │
 *   ├── CORRECT_PASSWORD = "123456"
 *   │
 *   ├── MAX_ATTEMPTS = 3
 *   │
 *   ├── attempts = 0
 *   │
 *   ├── loginSuccess = false
 *   │
 *   ├── do
 *   │      │
 *   │      ├── Enter username
 *   │      │
 *   │      ├── Enter password
 *   │      │
 *   │      ├── Validate username and password
 *   │      │
 *   │      ├── Correct?
 *   │      │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Login successful
 *   │      │       │
 *   │      │   loginSuccess = true
 *   │      │
 *   │      │      No
 *   │      │       │
 *   │      │   Invalid username or password
 *   │      │       │
 *   │      │   attempts++
 *   │      │
 *   │      │   Display remaining attempts
 *   │
 *   └── !loginSuccess && attempts < MAX_ATTEMPTS?
 *          │
 *         Yes
 *          │
 *      Repeat login
 *          │
 *         No
 *          │
 *      !loginSuccess?
 *          │
 *      ├── Yes
 *      │      │
 *      │   Account locked
 *      │
 *      └── No
 *             │
 *            End
 *
 */


/*
 * ========================================
 * PURPOSE
 * ========================================
 *
 * - Practice do-while loops.
 * - Practice login validation.
 * - Practice username and password checking.
 * - Limit login attempts.
 * - Handle account locking logic.
 *
 *
 * ========================================
 * BEST PRACTICES
 * ========================================
 *
 * - Use constants for fixed values.
 * - Use String.equals() for String comparison.
 * - Use boolean flag to control program state.
 * - Close Scanner after finishing input.
 * - Keep loop conditions clear and readable.
 *
 *
 * ========================================
 * FUTURE IMPROVEMENTS
 * ========================================
 *
 * - Hide password input.
 * - Store users in a database.
 * - Add PIN or OTP verification.
 * - Allow password reset.
 * - Create separate login methods.
 *
 *
 * ========================================
 * KEY TAKEAWAYS
 * ========================================
 *
 * ✓ do-while executes at least once.
 * ✓ String comparison uses equals().
 * ✓ boolean helps control loop termination.
 * ✓ Constants make code easier to maintain.
 * ✓ Login attempts should be limited for security.
 *
 *
 * ========================================
 * BUGS FOUND
 * ========================================
 *
 * Version 1
 *
 * ✗ loginSuccess initialized incorrectly.
 * → Fixed:
 *   loginSuccess = false
 *
 *
 * ✗ Variable name typo:
 *   loginSuccuess
 *
 * → Fixed:
 *   loginSuccess
 *
 *
 * ✗ Used return to exit program.
 *
 * → Fixed:
 *   Use boolean flag to control loop.
 *
 *
 * ✗ Loop condition:
 *
 *   while (attempts < MAX_ATTEMPTS)
 *
 * → Fixed:
 *
 *   while (!loginSuccess && attempts < MAX_ATTEMPTS)
 *
 *
 * ✗ "Account locked." displayed incorrectly.
 *
 * → Fixed:
 *
 *   if (!loginSuccess) {
 *       System.out.println("Account locked.");
 *   }
 *
 */