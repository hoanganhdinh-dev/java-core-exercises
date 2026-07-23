package week3;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number.");
            scanner.close();
            return;
        }
        int i = 1;
        int evenCount = 0;
        while (i <= number) {
            if (i % 2 == 0) {
                evenCount++;
            }
            i++;
        }
        System.out.printf("Even numbers: %d%n", evenCount);
        scanner.close();
    }
}
