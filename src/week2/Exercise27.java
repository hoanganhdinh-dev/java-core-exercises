package week2;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        System.out.println("===== Electricity Bill =====");
        System.out.println("1. Level 1");
        System.out.println("2. Level 2");
        System.out.println("3. Level 3");
        final int FIRST_LEVEL_PRICE = 1800;
        final int SECOND_LEVEL_PRICE = 2000;
        final int THIRD_LEVEL_PRICE = 2500;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice (1-3): ");
        int choice = scanner.nextInt();
        System.out.print("Enter kWh: ");
        int kWh = scanner.nextInt();
        if (kWh < 0) {
            System.out.println("Invalid kWh.");
            scanner.close();
            return;
        }
        switch (choice) {
            case 1:
                int totalFirstLevelPrice = kWh * FIRST_LEVEL_PRICE;
                System.out.printf("Total: %d VND%n", totalFirstLevelPrice);
                break;
            case 2:
                int totalSecondLevelPrice = kWh * SECOND_LEVEL_PRICE;
                System.out.printf("Total: %d VND%n", totalSecondLevelPrice);
                break;
            case 3:
                int totalThirdLevelPrice = kWh * THIRD_LEVEL_PRICE;
                System.out.printf("Total: %d VND%n", totalThirdLevelPrice);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
}
