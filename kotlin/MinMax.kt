import java.util.Scanner;

fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`);
        print("Enter first number >");
        val first = scanner.nextInt();
        print("Enter second number >");
        val second = scanner.nextInt();
        if(first > second){
            System.out.println("Maximum Number "+ first);
            System.out.println("Minumum number "+ second);
        }else{
            System.out.println("Maximum Number "+ second);
            System.out.println("Minumum number "+ first);
        }
}