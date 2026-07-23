package week3;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        if (seconds <= 0) {
            System.out.println("Invalid number.");
            scanner.close();
            return;
        }
        while (seconds > 0) {
            System.out.println(seconds);
            seconds--;
        }
        System.out.println("Time's up!");
        scanner.close();
    }
}
