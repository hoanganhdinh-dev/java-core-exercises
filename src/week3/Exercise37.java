package week3;

import java.util.Scanner;

public class Exercise37 {
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
        double sum = 0;
        while (currentStudent <= totalStudents) {
            System.out.print("Student " + currentStudent + " score: ");
            double score = scanner.nextDouble();
            if (score < 0 || score > 10) {
                System.out.println("Invalid score.");
            } else {
                sum += score;
                currentStudent++;
            }
        }
        double average = sum / totalStudents;
        System.out.printf("Average score: %.2f%n", average);
        scanner.close();
    }
}
