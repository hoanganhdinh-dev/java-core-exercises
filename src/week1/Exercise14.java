package week1;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.printf("%d is an even number.%n", number);
        } else {
            System.out.printf("%d is an odd number.%n", number);
        }
        scanner.close();
    }
}
