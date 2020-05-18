import java.util.*
fun main(args: Array<String>) {
    val scanner : Scanner = Scanner(System.`in`)
    print("Enter number: >")
    val num : Int = scanner.nextInt();
    scanner.close();
    if(num % 2 == 0){
        println("Even number");
    
    }
    else println("Odd number");
}