import java.util.Scanner;

public class ReadInteger {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input an integer : ");
        int num = scanner.nextInt();
        if(num==0){
            System.out.println("Zero ");
        }
        if(num<0){
            System.out.println("Negative ");
        }
        if(num>0){
            System.out.println("Positive ");
        }
    }
}
