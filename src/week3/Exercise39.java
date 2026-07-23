package week3;

import java.util.Scanner;

public class Exercise39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int totalStudents = scanner.nextInt();
        if (totalStudents <= 0) {
            System.out.println("Invalid number.");
            scanner.close();
            return;
        }
        int currentStudent = 1;
        int excellentCount = 0;
        int passCount = 0;
        int failCount = 0;
        double sum = 0;
        while (currentStudent <= totalStudents) {
            System.out.print("Student " + currentStudent + " score: ");
            double score = scanner.nextDouble();
            if (score < 0 || score > 10) {
                System.out.println("Invalid score.");
            } else {
                if (score >= 8) {
                    excellentCount++;
                    passCount++;
                } else if (score >= 5) {
                    passCount++;
                } else {
                    failCount++;
                }
                sum += score;
                currentStudent++;
            }
        }
        double average = sum / totalStudents;
        System.out.printf("Average score: %.2f%n", average);
        System.out.println("Excellent students: " + excellentCount);
        System.out.println("Pass students: " + passCount);
        System.out.println("Fail students: " + failCount);
        scanner.close();
    }
}
