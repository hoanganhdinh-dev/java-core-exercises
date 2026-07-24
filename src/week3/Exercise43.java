package week3;

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        if (numberOfStudents <= 0) {
            System.out.println("Invalid number of students.");
            scanner.close();
            return;
        }
        int currentStudent = 1;
        double totalScore = 0;
        final double MAX_SCORE = 10;
        final double EXCELLENT_SCORE = 8;
        double highestScore = 0;
        double lowestScore = MAX_SCORE;
        int countExcellentStudents = 0;
        while (currentStudent <= numberOfStudents) {
            System.out.print("Student " + currentStudent + " score: ");
            double score = scanner.nextDouble();
            if (score < 0 || score > MAX_SCORE) {
                System.out.println("Invalid score.");
            } else {
                totalScore += score;
                if (score > highestScore) {
                    highestScore = score;
                }
                if (score < lowestScore) {
                    lowestScore = score;
                }
                if (score >= EXCELLENT_SCORE) {
                    countExcellentStudents++;
                }
                currentStudent++;
            }
        }
        double averageScore = totalScore / numberOfStudents;
        System.out.printf("Average score: %.2f%n", averageScore);
        System.out.printf("Highest score: %.2f%n", highestScore);
        System.out.printf("Lowest score: %.2f%n", lowestScore);
        System.out.println("Students with score >= " + EXCELLENT_SCORE + ": " + countExcellentStudents);
        scanner.close();
    }
}
