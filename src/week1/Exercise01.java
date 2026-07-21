package week1;

public class Exercise01 {
    public static void main(String[] args) {
        String fullName = "Nguyễn Văn A";
        int age = 25;
        double height = 1.7;
        boolean graduated = true;
        
        System.out.printf("%-11s: %s%n", "Full name", fullName);
        System.out.printf("%-11s: %d%n", "Age", age);
        System.out.printf("%-11s: %.1f%n", "Height", height);
        System.out.printf("%-11s: %b%n", "Graduated", graduated);
    }
}