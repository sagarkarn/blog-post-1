import java.util.*
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Enter number: >")
    val num : Int= scanner.nextInt()
    
    if(num % 3 == 0 && num % 13 == 0){
        println("number is divisible")
    }
    else{
        println("number is not divisible")
    }
}