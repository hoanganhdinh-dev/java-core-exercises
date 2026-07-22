package week1;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both 3 and 5.");
        } else if (number % 3 == 0) {
            System.out.println("Divisible by 3 only.");
        } else if (number % 5 == 0) {
            System.out.println("Divisible by 5 only.");
        } else {
            System.out.println("Not divisible by 3 or 5.");
        }
        scanner.close();
    }
}
