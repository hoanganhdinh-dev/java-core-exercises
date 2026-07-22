package week1;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score: ");
        double score = scanner.nextDouble();
        if (score < 0 || score > 10) {
            System.out.println("Invalid score .");
            System.out.println("Score must be between 0 and 10.");
            scanner.close();
            return;
        }
        System.out.printf("Score: %.2f%n", score);
        if (score >= 9.0) {
            System.out.println("Grade: Excellent");
        } else if (score >= 8.0) {
            System.out.println("Grade: Very Good");
        } else if (score >= 6.5) {
            System.out.println("Grade: Good");
        } else if (score >= 5.0) {
            System.out.println("Grade: Average");
        } else {
            System.out.println("Grade: Fail");
        }
        scanner.close();
    }
}