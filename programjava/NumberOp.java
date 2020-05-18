package programjava;
import java.util.*;

class NumberOp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four digit number: ");
        int num = scanner.nextInt();
        scanner.close();
        if(num >999 && num < 10000){
            int first = num / 1000;
            num = (int) num % 1000;
            int second = num / 100;
            num = (int) num % 100;
            int third = num / 10;
            num = (int) num % 10;
            int fourth = num;
            if(first + fourth == second + third){
                System.out.println("Sum of first and fourth and sum of second and third is same");
            }
            else{
                System.out.println("Sum of first and fourth and sum of second and third is not same");
            }
        }else{
            System.out.println("Enter number greather than 999 and less than 10000");
        }       
    }
}