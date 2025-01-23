import java.util.Scanner;
public class L1Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer for the month.");
            return;
        }
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer for the day.");
            return;
        }
        int day = scanner.nextInt();
        if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        scanner.close();
    }
}

