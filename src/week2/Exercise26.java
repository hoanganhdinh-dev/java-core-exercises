package week2;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        System.out.println("===== UNIT CONVERTER =====");
        System.out.println("1. km -> m");
        System.out.println("2. m -> cm");
        System.out.println("3. kg -> g");
        System.out.println("4. g -> mg");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice (1-4): ");
        int choice = scanner.nextInt();
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        if (value < 0) {
            System.out.println("Invalid value.");
            scanner.close();
            return;
        }
        switch (choice) {
            case 1:
                double meterValue = value * 1000;
                System.out.printf("Result: %.2f m%n", meterValue);
                break;
            case 2:
                double centimeterValue = value * 100;
                System.out.printf("Result: %.2f cm%n", centimeterValue);
                break;
            case 3:
                double gramValue = value * 1000;
                System.out.printf("Result: %.2f g%n", gramValue);
                break;
            case 4:
                double milligramValue = value * 1000;
                System.out.printf("Result: %.2f mg%n", milligramValue);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
}
