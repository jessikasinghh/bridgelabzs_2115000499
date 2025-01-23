import java.util.Scanner;

public class L1Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        if (isFirstSmallest) {
            System.out.println("Yes, the first number is the smallest.");
        } else {
            System.out.println("No, the first number is not the smallest.");
        }

        scanner.close();
    }
}
