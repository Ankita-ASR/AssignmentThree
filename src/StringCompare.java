
import java.util.Scanner;
public class StringCompare {
    public static  void main(String [] args){
 Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String inputString = scanner.nextLine();
                scanner.close();
                if (inputString.length() > 0) {
                    char firstLetter = inputString.charAt(0);
                    char lastLetter = inputString.charAt(inputString.length() - 1);
                    if (Character.toLowerCase(firstLetter) == Character.toLowerCase(lastLetter)) {
                        System.out.println("First and last letter same");
                    } else {
                        System.out.println("First and last letter different");
                    }
                } else {
                    System.out.println("The input string is empty.");
                }
            }
        }

