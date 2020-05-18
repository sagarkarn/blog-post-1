package programjava;
import java.util.Scanner;
class CheckEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();
        if(num % 2 == 0){
            System.out.println("Even number");
        
        }
        else System.out.println("Odd number");
    }
}