package week4;

import java.util.Scanner;

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
            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                System.out.println("Login successful.");
                loginSuccess = true;
            } else {
                System.out.println("Invalid username or password.");
                attempts++;
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
 *   │      ├── username.equals(CORRECT_USERNAME)
 *   │      │       &&
 *   │      │   password.equals(CORRECT_PASSWORD) ?
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
 *   │
 *   └── !loginSuccess && attempts < MAX_ATTEMPTS ?
 *          │
 *         Yes
 *          │
 *      Repeat loop
 *          │
 *         No
 *          │
 *      !loginSuccess ?
 *          │
 *      ├── Yes
 *      │      │
 *      │   Account locked
 *      │
 *      └── No
 *             │
 *            End
 *
 * ========================================
 */
/* ========================================
 * PURPOSE
 * ========================================
 *
 * - Practice do-while loops.
 * - Practice login validation using username and password.
 * - Limit the number of login attempts.
 * - Lock the account after exceeding the maximum attempts.
 *
 * ----------------------------------------
 * BEST PRACTICES
 * ----------------------------------------
 *
 * - Use constants for fixed values.
 * - Use String.equals() to compare strings.
 * - Use a boolean flag to control the loop.
 * - Validate user credentials before granting access.
 * - Close Scanner before exiting the program.
 *
 * ----------------------------------------
 * FUTURE IMPROVEMENTS
 * ----------------------------------------
 *
 * - Hide password input.
 * - Store user accounts in a database.
 * - Add PIN or OTP verification.
 * - Allow users to reset forgotten passwords.
 * - Display the number of remaining login attempts.
 *
 * ----------------------------------------
 * KEY TAKEAWAYS
 * ----------------------------------------
 *
 * ✓ do-while executes at least once.
 * ✓ Use String.equals() instead of == for string comparison.
 * ✓ Use a boolean flag to control loop termination.
 * ✓ Limit login attempts to improve security.
 * ✓ Separate business logic from loop conditions.
 *
 * ----------------------------------------
 * BUGS FOUND
 * ----------------------------------------
 *
 * Version 1
 *
 * ✗ loginSuccess initialized to true.
 * → Fixed: initialize it to false.
 *
 * ✗ Variable name typo:
 * loginSuccuess
 * → Fixed:
 * loginSuccess
 *
 * ✗ Used return to exit the program immediately.
 * → Fixed by using a boolean flag to control the loop.
 *
 * ✗ Loop condition:
 * while (attempts < MAX_ATTEMPTS)
 * → Fixed:
 * while (!loginSuccess && attempts < MAX_ATTEMPTS)
 *
 * ✗ "Account locked." could execute after the loop.
 * → Fixed:
 * if (!loginSuccess) {
 *     System.out.println("Account locked.");
 * }
 */
