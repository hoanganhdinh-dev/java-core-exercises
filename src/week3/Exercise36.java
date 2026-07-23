package week3;

import java.util.Scanner;

public class Exercise36 {
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
        int passCount = 0;
        int failCount = 0;
        while (currentStudent <= totalStudents) {
            System.out.print("Student " + currentStudent + " score: ");
            int score = scanner.nextInt();
            if (score < 0 || score > 10) {
                System.out.println("Invalid score.");
            } else {
                currentStudent++;
                if (score >= 5) {
                    System.out.println("Pass");
                    passCount++;
                } else {
                    System.out.println("Fail");
                    failCount++;
                }
            }
        }
        System.out.println("Pass: " + passCount);
        System.out.println("Fail: " + failCount);
        scanner.close();
    }
}
