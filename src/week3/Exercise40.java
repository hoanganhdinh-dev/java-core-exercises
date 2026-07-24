package week3;

import java.util.Scanner;

public class Exercise40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberStudents = scanner.nextInt();
        if (numberStudents <= 0) {
            System.out.println("Invalid number.");
            scanner.close();
            return;
        }
        int currentStudent = 1;
        int countExcellent = 0;
        int countGood = 0;
        int countAverage = 0;
        int countWeak = 0;
        while (currentStudent <= numberStudents) {
            System.out.print("Student " + currentStudent + " score: ");
            double score = scanner.nextDouble();
            if (score < 0 || score > 10) {
                System.out.println("Invalid score.");
            } else {
                if (score >= 8) {
                    countExcellent++;
                } else if (score >= 6.5) {
                    countGood++;
                } else if (score >= 5) {
                    countAverage++;
                } else {
                    countWeak++;
                }
                currentStudent++;
            }
        }
        System.out.println("Excellent: " + countExcellent);
        System.out.println("Good: " + countGood);
        System.out.println("Average: " + countAverage);
        System.out.println("Weak: " + countWeak);
        scanner.close();
    }
}
