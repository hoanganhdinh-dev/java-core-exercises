package week2;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Month has 31 days.");
                break;
            case 4, 6, 9, 11:
                System.out.println("Month has 30 days.");
                break;
            case 2:
                System.out.println("Month has 28 days.");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        scanner.close();
    }
}
