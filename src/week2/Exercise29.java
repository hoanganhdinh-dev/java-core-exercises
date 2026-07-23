package week2;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        System.out.println("===== MENU =====");
        System.out.println("1. Calculate Average");
        System.out.println("2. Check Pass/Fail");
        System.out.println("3. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score math: ");
        double mathScore = scanner.nextDouble();
        System.out.print("Enter score literature: ");
        double literatureScore = scanner.nextDouble();
        if (mathScore < 0 || mathScore > 10
                || literatureScore < 0 || literatureScore > 10) {
            System.out.println("Invalid score.");
            scanner.close();
            return;
        }
        System.out.print("Choice (1-3): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                double average = (mathScore + literatureScore) / 2.0;
                System.out.printf("Average: %.2f%n", average);
                break;
            case 2:
                boolean pass = mathScore >= 5 && literatureScore >= 5;
                if (pass) {
                    System.out.println("Pass");
                } else {
                    System.out.println("Fail");
                }
                break;
            case 3:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
}
