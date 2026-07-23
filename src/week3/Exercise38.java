package week3;

import java.util.Scanner;

public class Exercise38 {
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
        double maxScore = 0;
        int countMaxScore = 0;
        while (currentStudent <= totalStudents) {
            System.out.print("Student " + currentStudent + " score: ");
            double score = scanner.nextDouble();
            if (score < 0 || score > 10) {
                System.out.println("Invalid score.");
            } else {
                if (maxScore < score) {
                    maxScore = score;
                    countMaxScore = 1;
                } else if (maxScore == score) {
                    countMaxScore++;
                }
                currentStudent++;
            }
        }
        System.out.printf("Highest score: %.2f%n", maxScore);
        System.out.println("Students with highest score: " + countMaxScore);
        scanner.close();
    }
}
