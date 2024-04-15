import java.util.Scanner;
public class OrderChecker {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the integer with space: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            scanner.close();
            if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
                System.out.println("in order");
            } else {
                System.out.println("not in order");
            }
        }
    }
