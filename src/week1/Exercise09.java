package week1;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        int coefficientA = scanner.nextInt();
        System.out.print("Enter constant b: ");
        int constantB = scanner.nextInt();

        if (coefficientA != 0) {
            double x = (double) -constantB / coefficientA;
            System.out.printf("x = %.2f%n", x);
        } else if (constantB != 0) {
            System.out.println("No solution.");
        } else {
            System.out.println("Infinite solutions.");
        }
        scanner.close();
    }
}
