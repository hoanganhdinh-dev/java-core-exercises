package week1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double FIRST_LEVEL_PRICE = 1678;
        final double SECOND_LEVEL_PRICE = 1734;
        final double THIRD_LEVEL_PRICE = 2014;
        final double FOURTH_LEVEL_PRICE = 2536;
        System.out.print("Enter electricity usage (kWh): ");
        int electricityUsage = scanner.nextInt();
        if (electricityUsage < 0) {
            System.out.println("Invalid input.");
            scanner.close();
            return;
        }
        double pricePerKWh;
        if (electricityUsage <= 50) {
            pricePerKWh = FIRST_LEVEL_PRICE;
        } else if (electricityUsage <= 100) {
            pricePerKWh = SECOND_LEVEL_PRICE;
        } else if (electricityUsage <= 200) {
            pricePerKWh = THIRD_LEVEL_PRICE;
        } else {
            pricePerKWh = FOURTH_LEVEL_PRICE;
        }
        double electricityBill = electricityUsage * pricePerKWh;
        System.out.printf("Electricity bill: %.2f VND%n", electricityBill);
        scanner.close();
    }
}
