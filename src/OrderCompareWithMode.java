import java.util.Scanner;
public class OrderCompareWithMode {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose mode:");
            System.out.println("1. Strict");
            System.out.println("2. Lenient");
            System.out.print("Enter your choice (1 or 2): ");
            int modeChoice = scanner.nextInt();
            System.out.print("Enter the number with space: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            scanner.close();
            if (modeChoice == 1) { // Strict mode
                if (num1 < num2 && num2 < num3) {
                    System.out.println("Increasing");
                } else if (num1 > num2 && num2 > num3) {
                    System.out.println("Decreasing");
                } else {
                    System.out.println("Neither");
                }
            } else if (modeChoice == 2) { // Lenient mode
                if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
                    System.out.println("Increasing");
                } else if ((num1 >= num2 && num2 >= num3) || (num1 <= num2 && num2 <= num3)) {
                    System.out.println("Decreasing");
                } else {
                    System.out.println("Neither");
                }
            } else {
                System.out.println("Invalid mode choice. Please choose either 1 or 2.");
            }
        }
    }
