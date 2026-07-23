package week3;

import java.util.Scanner;

public class Exercise32 {
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
        int sum = 0;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.printf("Sum = %d%n", sum);
        scanner.close();
    }
}
