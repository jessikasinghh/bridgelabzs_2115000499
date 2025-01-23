import java.util.*;

public class L2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            System.out.println("The quotient is " + quotient + " and remainder is " + remainder +
                    " of the two numbers " + number1 + " and " + number2);
        }

        sc.close();
    }
}
