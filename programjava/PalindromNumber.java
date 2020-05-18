package programjava;
import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();
        int r,sum = 0, temp;
        temp = num;
        while(num > 0){
            r = num % 10;
            sum = (sum * 10) + r;
            num = num/10;
        }
        if(temp == sum){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("not palindrome number");
        }
    }
}