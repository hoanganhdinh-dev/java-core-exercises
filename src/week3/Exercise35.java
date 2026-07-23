package week3;

import java.util.Scanner;

public class Exercise35 {
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
        long result = 1;
        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.printf("Factorial = %d%n", result);
        scanner.close();
    }
}
