package week1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side A: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter side B: ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter side C: ");
        double sideC = scanner.nextDouble();
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Invalid side lengths.");
            scanner.close();
            return;
        }
        if ((sideA + sideB) <= sideC
                || (sideA + sideC) <= sideB
                || (sideB + sideC) <= sideA) {
            System.out.println("Invalid triangle.");
            scanner.close();
            return;
        }
        if (sideA == sideB && sideB == sideC) {
            System.out.println("Triangle type: Equilateral");
        } else if (sideA == sideB || sideC == sideB || sideA == sideC) {
            System.out.println("Triangle type: Isosceles");
        } else {
            System.out.println("Triangle type: Scalene");
        }
        scanner.close();
    }
}
