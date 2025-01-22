import java.util.Scanner;

public class L2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers (a, b, c):");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double ans1 = a + b * c;
        double ans2 = a * b + c;
        double ans3 = c + a / b;
        double ans4 = a % b + c;
        System.out.printf("The results of Int Operations are %.2f, %.2f, %.2f and %.2f%n", ans1, ans2, ans3, ans4);
        sc.close();
    }
}
