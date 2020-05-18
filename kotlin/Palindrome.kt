import java.util.*
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Enter number: ")
    var num = scanner.nextInt()
    scanner.close()
    var r : Int
    var sum : Int= 0
    val temp = num
    while(num > 0){
        r = num % 10
        sum = (sum * 10) + r
        num = num/10
    }
    if(temp == sum){
        println("Palindrome number")
    }
    else{
        println("not palindrome number")
    }
}