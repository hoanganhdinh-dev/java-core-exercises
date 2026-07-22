package week2;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        System.out.println("===== MENU =====");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Orange Juice");
        System.out.println("4. Water");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose Coffee.");
                break;
            case 2:
                System.out.println("You chose Tea.");
                break;
            case 3:
                System.out.println("You chose Orange Juice.");
                break;
            case 4:
                System.out.println("You chose Water.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
}
