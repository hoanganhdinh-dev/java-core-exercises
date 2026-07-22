package week1;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        double celsius = scanner.nextDouble();
        if (celsius < -273.15) {
            System.out.println("Invalid temperature.");
            System.out.println("Temperature cannot be below absolute zero.");
            scanner.close();
            return;
        }
        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("%-12s: %.2f °C%n", "Celsius", celsius);
        System.out.printf("%-12s: %.2f °F%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s: %.2f K%n", "Kelvin", kelvin);
        scanner.close();
    }
}
