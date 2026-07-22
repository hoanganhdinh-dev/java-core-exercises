package week1;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (secondNumber == 0) {
            System.out.println("Cannot divide by zero.");
            scanner.close();
            return;
        }
        if (firstNumber % secondNumber == 0) {
            System.out.printf("%d is a multiple of %d.%n", firstNumber, secondNumber);
        } else {
            System.out.printf("%d is not a multiple of %d.%n", firstNumber, secondNumber);
        }
        scanner.close();
    }
}
