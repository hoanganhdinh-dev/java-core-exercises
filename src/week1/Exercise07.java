package week1;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Invalid input.");
            System.out.println("Weight and height must be greater than 0.");
            scanner.close();
            return;
        }
        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        scanner.close();
    }
}
