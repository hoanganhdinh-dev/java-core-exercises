package week1;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.printf("The largest number is: %d%n", firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.printf("The largest number is: %d%n", secondNumber);
        } else {
            System.out.println("Both numbers are equal.");
        }
        scanner.close();
    }
}
