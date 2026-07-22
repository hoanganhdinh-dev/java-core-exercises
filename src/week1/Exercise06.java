package week1;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        if (length <= 0 || width <= 0) {
            System.out.println("Invalid dimensions.");
            System.out.println("Length and width must be greater than 0.");
            scanner.close();
            return;
        }
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.printf("%-12s: %.2f%n", "Length", length);
        System.out.printf("%-12s: %.2f%n", "Width", width);
        System.out.printf("%-12s: %.2f%n", "Area", area);
        System.out.printf("%-12s: %.2f%n", "Perimeter", perimeter);
        scanner.close();
    }
}
