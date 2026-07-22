package week1;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year.");
            scanner.close();
            return;
        }
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year.");
        }
        scanner.close();
    }
}
