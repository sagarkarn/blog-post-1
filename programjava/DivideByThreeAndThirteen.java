package programjava;
import java.util.Scanner;

public class DivideByThreeAndThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();
        if(num % 3 == 0 && num % 13 == 0){
            System.out.println("number is divisible by 3 and thirteen");
        }
        else{
            System.out.println("number is not divisible by 3 and thirteen");
        }
        
    }
}