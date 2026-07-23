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
        double highestScore = Double.NEGATIVE_INFINITY;
        double lowestScore = Double.MAX_VALUE;
        final double MAX_SCORE = 10;
        final double PASSING_SCORE = 8;
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
                if (score >= PASSING_SCORE) {
                    countExcellentStudents++;
                }
                currentStudent++;
            }
        }
        double averageScore = totalScore / numberOfStudents;
        System.out.printf("Average score: %.2f%n", averageScore);
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);
        System.out.println("Students with score >= " + PASSING_SCORE + ": " + countExcellentStudents);
        scanner.close();
    }
}
