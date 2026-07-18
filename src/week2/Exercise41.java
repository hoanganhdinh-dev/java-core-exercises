package week2;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of households: ");
        int numberOfHouseholds = scanner.nextInt();

        if (numberOfHouseholds <= 0) {
            System.out.println("Invalid number.");
            scanner.close();
            return;
        }
        int currentHousehold = 1;
        final int PRICE_LEVEL_1 = 1800;
        final int PRICE_LEVEL_2 = 2300;
        final int PRICE_LEVEL_3 = 3000;
        int bill = 0;
        int sumBill = 0;
        int highestBill = 0;
        int countBillOver200K = 0;
        final int billOver200K = 200000;
        while (currentHousehold <= numberOfHouseholds) {
            System.out.print("Household " + currentHousehold + " electricity: ");
            int kWH = scanner.nextInt();
            if (kWH < 0) {
                System.out.println("Invalid kwh.");
            } else {
                if (kWH <= 50) {
                    bill = kWH * PRICE_LEVEL_1;
                } else if (kWH <= 100) {
                    bill = kWH * PRICE_LEVEL_2;
                } else {
                    bill = kWH * PRICE_LEVEL_3;
                }
                sumBill += bill;
                if (highestBill < bill) {
                    highestBill = bill;
                }
                if (bill > billOver200K) {
                    countBillOver200K++;
                }
                currentHousehold++;
            }
        }
        double average = (double) (sumBill) / numberOfHouseholds;
        System.out.printf("Average bill: %.2f%n", average);
        System.out.printf("Highest bill: %d VND%n", highestBill);
        System.out.println("Households over 200000 VND: " + countBillOver200K);
        scanner.close();
    }
}

