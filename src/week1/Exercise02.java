package week1;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.printf("Hello, %s!%n", fullName);
        System.out.printf("You are %d years old.%n", age);
        scanner.close();
    }
}
