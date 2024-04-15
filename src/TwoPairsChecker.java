import java.util.Scanner;
public class TwoPairsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter the fourth integer: ");
        int num4 = scanner.nextInt();
        scanner.close();
        if ((num1 == num2 && num3 == num4) ||
                (num1 == num3 && num2 == num4) ||
                (num1 == num4 && num2 == num3)) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }
    }
}
