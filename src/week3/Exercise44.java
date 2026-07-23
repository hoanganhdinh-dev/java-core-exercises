package week3;

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        if (numberOfEmployees <= 0) {
            System.out.println("Invalid number of employees.");
            scanner.close();
            return;
        }
        int currentEmployee = 1;
        int totalSalary = 0;
        int highestSalary = 0;
        int lowestSalary = Integer.MAX_VALUE;
        final int SALARY_THRESHOLD = 10_000_000;
        int countSalaryAboveThreshold = 0;
        while (currentEmployee <= numberOfEmployees) {
            System.out.print("Employee " + currentEmployee + " salary: ");
            int salary = scanner.nextInt();
            if (salary < 0) {
                System.out.println("Invalid salary.");
            } else {
                if (salary > highestSalary) {
                    highestSalary = salary;
                }
                if (salary < lowestSalary) {
                    lowestSalary = salary;
                }
                if (salary >= SALARY_THRESHOLD) {
                    countSalaryAboveThreshold++;
                }
                totalSalary += salary;
                currentEmployee++;
            }
        }
        double averageSalary = (double) totalSalary / numberOfEmployees;
        System.out.printf("Total salary: %d%n", totalSalary);
        System.out.printf("Average salary: %.2f%n", averageSalary);
        System.out.printf("Highest salary: %d%n", highestSalary);
        System.out.printf("Lowest salary: %d%n", lowestSalary);
        System.out.println("Employees with salary >= " + SALARY_THRESHOLD + ": " + countSalaryAboveThreshold);
        scanner.close();
    }
}
