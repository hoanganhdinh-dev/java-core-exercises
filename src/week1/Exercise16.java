package week1;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Invalid age.");
            scanner.close();
            return;
        }
        if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
        scanner.close();
    }
}
