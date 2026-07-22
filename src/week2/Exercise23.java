package week2;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        switch (operator) {
            case '+':
                int sum = firstNumber + secondNumber;
                System.out.printf("Result: %d%n", sum);
                break;
            case '-':
                int difference = firstNumber - secondNumber;
                System.out.printf("Result: %d%n", difference);
                break;
            case '*':
                int product = firstNumber * secondNumber;
                System.out.printf("Result: %d%n", product);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                    scanner.close();
                    return;
                }
                double quotient = (double) firstNumber / secondNumber;
                System.out.printf("Result: %.2f%n", quotient);
                break;
            case '%':
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                    scanner.close();
                    return;
                }
                int mod = firstNumber % secondNumber;
                System.out.printf("Result: %d%n", mod);
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
        scanner.close();
    }
}
