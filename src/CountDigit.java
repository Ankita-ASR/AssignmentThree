/*Write a program that reads an integer and prints how many digits the number has, by
checking whether the number is ≥ 10, ≥ 100, and so on. (Assume that all integers are
less than ten billion.) If the number is negative, first multiply it with –1.*/
import java.util.*;
public class CountDigit {
    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);
       int digitCount =0;
        int num= scanner.nextInt();
        if (num < 0) {
            num *= -1; // Multiply by -1 to make it positive
        }

        // Special case for handling 0
        if (num == 0) {
            digitCount = 1;
        } else {
            int temp=num;
            while (temp!= 0) {
                temp /= 10;
                digitCount++;
            }
        }
        System.out.printf("number of digit : %d" ,digitCount);
    }
}
