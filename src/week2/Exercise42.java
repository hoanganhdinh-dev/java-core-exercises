package week2;

import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        if (numberOfEmployees <= 0) {
            System.out.println("Invalid number.");
            scanner.close();
            return;
        }
        int currentEmployee = 1;
        int highestBonus = 0;
        int lowestBonus = Integer.MAX_VALUE;
        int totalBonus = 0;
        int countBonusAboveThreshold = 0;
        final int BONUS_THRESHOLD = 5_000_000;
        while (currentEmployee <= numberOfEmployees) {
            System.out.print("Employee " + currentEmployee + " bonus: ");
            int bonus = scanner.nextInt();
            if (bonus < 0) {
                System.out.println("Invalid bonus.");
            } else {
                if (bonus > highestBonus) {
                    highestBonus = bonus;
                }
                if (bonus < lowestBonus) {
                    lowestBonus = bonus;
                }
                if (bonus >= BONUS_THRESHOLD) {
                    countBonusAboveThreshold++;
                }
                totalBonus += bonus;
                currentEmployee++;
            }
        }
        double averageBonus = (double) totalBonus / numberOfEmployees;
        System.out.println("Highest bonus: " + highestBonus);
        System.out.println("Lowest bonus: " + lowestBonus);
        System.out.printf("Average bonus: %.2f%n", averageBonus);
        System.out.println("Employees with bonus >= " + BONUS_THRESHOLD + ": " + countBonusAboveThreshold);
    }
}
