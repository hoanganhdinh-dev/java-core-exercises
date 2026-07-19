package week2;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of households: ");
        int numberOfHouseholds = scanner.nextInt();

        if (numberOfHouseholds <= 0) {
            System.out.println("Invalid number of households.");
            scanner.close();
            return;
        }
        int currentHousehold = 1;
        final int PRICE_TIER_1 = 1800;
        final int PRICE_TIER_2 = 2300;
        final int PRICE_TIER_3 = 3000;
        int bill;
        int totalBill = 0;
        int highestBill = 0;
        int countBillsAboveThreshold = 0;
        final int ELECTRICITY_BILL_THRESHOLD = 200_000;
        while (currentHousehold <= numberOfHouseholds) {
            System.out.print("Household " + currentHousehold + " electricity usage: ");
            int electricityUsage = scanner.nextInt();
            if (electricityUsage < 0) {
                System.out.println("Invalid electricity usage.");
            } else {
                if (electricityUsage <= 50) {
                    bill = electricityUsage * PRICE_TIER_1;
                } else if (electricityUsage <= 100) {
                    bill = electricityUsage * PRICE_TIER_2;
                } else {
                    bill = electricityUsage * PRICE_TIER_3;
                }
                totalBill += bill;
                if (bill > highestBill) {
                    highestBill = bill;
                }
                if (bill > ELECTRICITY_BILL_THRESHOLD) {
                    countBillsAboveThreshold++;
                }
                currentHousehold++;
            }
        }
        double averageBill = (double) (totalBill) / numberOfHouseholds;
        System.out.printf("Average bill: %.2f%n", averageBill);
        System.out.printf("Highest bill: %d VND%n", highestBill);
        System.out.println("Households above " + ELECTRICITY_BILL_THRESHOLD + " VND: " + countBillsAboveThreshold);
        scanner.close();
    }
}

