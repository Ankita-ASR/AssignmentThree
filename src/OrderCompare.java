import java.util.Scanner;
public class OrderCompare {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number with space: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            scanner.close();
            if (num1 < num2 && num2 < num3) {
                System.out.println("Increasing");
            }
            else if (num1 > num2 && num2 > num3) {
                System.out.println("Decreasing");
            }
            else {
                System.out.println("Neither");
            }
        }
    }

