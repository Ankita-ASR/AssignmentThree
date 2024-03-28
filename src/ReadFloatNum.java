import java.util.Scanner;

public class ReadFloatNum {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input an floating number : ");
       double num = scanner.nextDouble();
       if(num<1) {
           System.out.println("small");
       }
        if(num<1) {
            System.out.println("small");
        }
        if(num>1000000) {
            System.out.println("large");
        }
        if(num==0){
            System.out.println("Zero ");
        }
        else if(num<0){
            System.out.println("Negative ");
        }
       else if(num>0){
            System.out.println("Positive ");
        }
    }
}
