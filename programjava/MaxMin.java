package programjava;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number >");
        int first = scanner.nextInt();
        System.out.print("Enter second number >");
        int second = scanner.nextInt();
        scanner.close();
        if(first > second){
            System.out.println("Maximum Number "+ first);
            System.out.println("Minumum number "+ second);
        }else{
            System.out.println("Maximum Number "+ second);
            System.out.println("Minumum number "+ first);
        }
     }
}