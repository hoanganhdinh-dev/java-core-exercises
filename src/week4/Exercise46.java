package week4;

import java.util.Scanner;

/*
 * ========================================
 * Exercise 46 — Number Guessing Game
 * ========================================
 *
 * Description:
 * Create a guessing game where the user tries
 * to guess a secret number.
 *
 * Rules:
 * - User enters guesses until correct.
 * - Count the number of attempts.
 *
 * Concepts:
 * - Scanner
 * - do-while loop
 * - if-else statement
 * - Constants
 */

public class Exercise46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_NUMBER = 27;
        int attempts = 0;
        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < SECRET_NUMBER) {
                System.out.println("Too low! Try again.");
            } else if (guess > SECRET_NUMBER) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.printf(
                        "Congratulations! You guessed the number in %d attempts.%n",
                        attempts
                );
            }
        } while (guess != SECRET_NUMBER);
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
 *   ├── SECRET_NUMBER = 27
 *   │
 *   ├── attempts = 0
 *   │
 *   ├── do
 *   │      │
 *   │      ├── User enters a guess
 *   │      │
 *   │      ├── attempts++
 *   │      │
 *   │      ├── guess < SECRET_NUMBER ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Too low! Try again.
 *   │      │
 *   │      ├── guess > SECRET_NUMBER ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Too high! Try again.
 *   │      │
 *   │      └── Otherwise
 *   │              │
 *   │      Congratulations!
 *   │
 *   └── guess != SECRET_NUMBER ?
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
/*PURPOSE

- Practice do-while loops.
- Compare user input with a target value.
- Count the number of attempts.
----------------------------------------
BEST PRACTICES

- Use meaningful variable names.
- Close Scanner before exiting.
- Use do-while when the loop must execute at least once.
----------------------------------------
FUTURE IMPROVEMENTS

- Generate a random secret number.
- Add a maximum number of attempts.
- Allow the user to play again.
----------------------------------------
KEY TAKEAWAYS

✓ do-while executes at least once.
✓ Count attempts inside the loop.
✓ Stop when the correct number is guessed.*/
