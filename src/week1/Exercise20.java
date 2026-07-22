package week1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Invalid age.");
            scanner.close();
            return;
        }
        if (age <= 5) {
            System.out.println("Ticket price: Free");
        } else if (age <= 17) {
            System.out.println("Ticket price: 50000 VND");
        } else if (age <= 59) {
            System.out.println("Ticket price: 100000 VND");
        } else {
            System.out.println("Ticket price: 70000 VND");
        }
        scanner.close();
    }
}
