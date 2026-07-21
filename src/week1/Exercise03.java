package week1;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        if (secondNumber == 0) {
            System.out.println("Division by zero is not allowed.");
            scanner.close();
            return;
        }
        System.out.printf("Sum = %d%n", firstNumber + secondNumber);
        System.out.printf("Difference = %d%n", firstNumber - secondNumber);
        System.out.printf("Product = %d%n", firstNumber * secondNumber);
        System.out.printf("Quotient = %d%n", firstNumber / secondNumber);
        System.out.printf("Remainder = %d%n", firstNumber % secondNumber);
        scanner.close();
    }
}
