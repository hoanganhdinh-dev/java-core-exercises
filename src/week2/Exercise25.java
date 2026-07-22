package week2;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        System.out.println("===== TICKET MENU =====");
        System.out.println("1. Child");
        System.out.println("2. Adult");
        System.out.println("3. Senior");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice (1-3): ");
        int ticketType = scanner.nextInt();
        switch (ticketType) {
            case 1:
                System.out.println("Ticket price: 50000 VND");
                break;
            case 2:
                System.out.println("Ticket price: 100000 VND");
                break;
            case 3:
                System.out.println("Ticket price: 70000 VND");
                break;
            default:
                System.out.println("Invalid ticket type.");
                break;
        }
        scanner.close();
    }
}
