package week4;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_SEATS = 20;
        int availableSeats = TOTAL_SEATS;
        int choice;
        do {
            System.out.println("========= CINEMA MENU =========");
            System.out.println("1. Check Available Seats");
            System.out.println("2. Book Tickets");
            System.out.println("3. Cancel Tickets");
            System.out.println("4. Exit");
            System.out.println("===============================");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Available seats: " + availableSeats);
                    break;
                case 2: {
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    if (quantity > 0) {
                        if (quantity <= availableSeats) {
                            availableSeats -= quantity;
                            System.out.println("Booking successful.");
                            System.out.println("Available seats: " + availableSeats);
                        } else {
                            System.out.println("Not enough seats.");
                        }
                    } else {
                        System.out.println("Invalid quantity.");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter cancel quantity: ");
                    int cancelQuantity = scanner.nextInt();
                    if (cancelQuantity > 0) {
                        if (cancelQuantity <= (TOTAL_SEATS - availableSeats)) {
                            availableSeats += cancelQuantity;
                            System.out.println("Cancellation successful.");
                            System.out.println("Available seats: " + availableSeats);
                        } else {
                            System.out.println("You haven't booked that many tickets.");
                        }
                    } else {
                        System.out.println("Invalid quantity.");
                    }
                    break;
                }
                case 4:
                    System.out.println("Thank you for using our booking system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
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
 *   ├── TOTAL_SEATS = 20
 *   │
 *   ├── availableSeats = TOTAL_SEATS
 *   │
 *   ├── do
 *   │      │
 *   │      ├── Display Cinema Menu
 *   │      │
 *   │      ├── User chooses an option
 *   │      │
 *   │      ├── Choice == 1 ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Display available seats
 *   │      │
 *   │      ├── Choice == 2 ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Enter booking quantity
 *   │      │       │
 *   │      │   quantity > 0 ?
 *   │      │       │
 *   │      │      No
 *   │      │       │
 *   │      │   Invalid quantity.
 *   │      │
 *   │      │      Yes
 *   │      │       │
 *   │      │   quantity <= availableSeats ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   availableSeats -= quantity
 *   │      │       │
 *   │      │   Booking successful.
 *   │      │       │
 *   │      │   Display available seats
 *   │      │
 *   │      │      No
 *   │      │       │
 *   │      │   Not enough seats.
 *   │      │
 *   │      ├── Choice == 3 ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Enter cancel quantity
 *   │      │       │
 *   │      │   cancelQuantity > 0 ?
 *   │      │       │
 *   │      │      No
 *   │      │       │
 *   │      │   Invalid quantity.
 *   │      │
 *   │      │      Yes
 *   │      │       │
 *   │      │   cancelQuantity <= bookedSeats ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   availableSeats += cancelQuantity
 *   │      │       │
 *   │      │   Cancellation successful.
 *   │      │       │
 *   │      │   Display available seats
 *   │      │
 *   │      │      No
 *   │      │       │
 *   │      │   You haven't booked that many tickets.
 *   │      │
 *   │      ├── Choice == 4 ?
 *   │      │       │
 *   │      │      Yes
 *   │      │       │
 *   │      │   Thank you for using our booking system.
 *   │      │
 *   │      └── Otherwise
 *   │              │
 *   │          Invalid choice.
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
 *
 * Note:
 * bookedSeats = TOTAL_SEATS - availableSeats
 */
/* ========================================
 * PURPOSE
 * ========================================
 *
 * - Practice do-while loops.
 * - Practice switch-case menu handling.
 * - Manage cinema seat booking.
 * - Validate ticket booking and cancellation.
 *
 * ----------------------------------------
 * BEST PRACTICES
 * ----------------------------------------
 *
 * - Use constants for fixed values.
 * - Validate all user input before processing.
 * - Keep variables inside the smallest possible scope.
 * - Update seat count immediately after each successful transaction.
 * - Close Scanner before exiting the program.
 *
 * ----------------------------------------
 * FUTURE IMPROVEMENTS
 * ----------------------------------------
 *
 * - Display booked seats.
 * - Support multiple movie sessions.
 * - Allow users to choose seat numbers.
 * - Store booking history.
 * - Generate booking receipts.
 *
 * ----------------------------------------
 * KEY TAKEAWAYS
 * ----------------------------------------
 *
 * ✓ Use do-while for menu-driven programs.
 * ✓ Validate input before updating data.
 * ✓ Business logic should prevent overbooking.
 * ✓ Business logic should prevent cancelling more tickets than booked.
 * ✓ Keep variables inside the smallest possible scope.
 *
 * ----------------------------------------
 * BUGS FOUND
 * ----------------------------------------
 *
 * Version 1
 *
 * ✗ Case 3 compared cancel quantity with availableSeats.
 * → Fixed:
 * Compare with booked seats (TOTAL_SEATS - availableSeats).
 *
 * ✗ Missing validation for cancel quantity <= 0.
 * → Added input validation.
 *
 * ✗ Missing available seats display after booking.
 * → Display updated seat count after successful booking.
 *
 * ✗ Missing available seats display after cancellation.
 * → Display updated seat count after successful cancellation.
 *
 * ✗ Variable names mixed Vietnamese and English.
 * → Use consistent English variable names.
 */
